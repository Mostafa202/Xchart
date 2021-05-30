public class TitanicPassenger {

    String pclass;
    String survived;
    String name;
    String sex;
    float age;
    String sibsp;
    String parach;
    String ticket;
    float fare;
    String cabin;
    String embarked;
    String boat;
    String body;
    String home_dist;
    public TitanicPassenger(){

    }
    public TitanicPassenger(String pclass,String survived,String name,String gender,String sibsp,String parach,String ticket,float fare,String cabin,String embarked,String boat,String body,String home_dist){
        this.pclass=pclass;
        this.survived=survived;
        this.name=name;
        this.sex=gender;
        this.sibsp=sibsp;
        this.parach=parach;
        this.ticket=ticket;
        this.fare=fare;
        this.cabin=cabin;
        this.embarked=embarked;
        this.boat=boat;
        this.body=body;
        this.home_dist=home_dist;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getPclass() {
        return pclass;
    }

    public String getParach() {
        return parach;
    }

    public float getFare() {
        return fare;
    }

    public String getCabin() {
        return cabin;
    }

    public String getGender() {
        return sex;
    }

    public String getSibsp() {
        return sibsp;
    }

    public String getSurvived() {
        return survived;
    }

    public String getBoat() {
        return boat;
    }

    public String getEmbarked() {
        return embarked;
    }

    public String getTicket() {
        return ticket;
    }

    public String getBody() {
        return body;
    }

    public String getHome_dist() {
        return home_dist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setParach(String parach) {
        this.parach = parach;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSibsp(String sibsp) {
        this.sibsp = sibsp;
    }

    public void setSurvived(String survived) {
        this.survived = survived;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    public void setHome_dist(String home_dist) {
        this.home_dist = home_dist;
    }
}
