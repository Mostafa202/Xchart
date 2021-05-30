import jdk.internal.jimage.ImageReaderFactory;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import tech.tablesaw.api.ColumnType;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class welcomeMaven {

    public void graphPassengersurvived(List<TitanicPassenger> passengerList) {

        Map<String, Long> result =
                passengerList.stream ().collect (
                        Collectors.groupingBy (TitanicPassenger::getSurvived, Collectors.counting () ) );

        PieChart chart = new PieChartBuilder().width (800).height (600).title(getClass().getSimpleName ()).build ();
        Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120)};
        chart.getStyler ().setSeriesColors (sliceColors);
        chart.addSeries ("Not Survived", result.get ("0"));
        chart.addSeries ("Survived", result.get ("1"));
        new SwingWrapper (chart).displayChart ();
    }

    public void graphPassengergender(List<TitanicPassenger> passengerList) {

        Map<String, Long> result =
                passengerList.stream ().filter(s->s.getSurvived().equals("1")).collect (
                        Collectors.groupingBy (TitanicPassenger::getGender, Collectors.counting () ) );

        PieChart chart = new PieChartBuilder().width (800).height (600).title(getClass().getSimpleName ()).build ();
        Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120)};
        chart.getStyler ().setSeriesColors (sliceColors);
        chart.addSeries ("male", result.get ("male"));
        chart.addSeries ("female", result.get ("female"));
        new SwingWrapper (chart).displayChart ();
    }
    public static void main(String[] args) throws IOException {
        titanic t=new titanic();
        List<TitanicPassenger> passengers=t.getPassengersFromJsonFile();
        new welcomeMaven().graphPassengersurvived(passengers);
        //new welcomeMaven().graphPassengergender(passengers);



    }

}
