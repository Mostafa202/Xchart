import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class titanic {

    public List<TitanicPassenger> getPassengersFromJsonFile() {
        List<TitanicPassenger> allPassengers = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            InputStream input = new FileInputStream("/home/mostafa/Desktop/titanic/titanic_csv.json");
            //Read JSON file
            allPassengers = objectMapper.readValue(input, new TypeReference<List<TitanicPassenger>>(){});
        } catch (JsonMappingException jsonMappingException) {
            jsonMappingException.printStackTrace();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (JsonParseException jsonParseException) {
            jsonParseException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    return  allPassengers;
    }
}
