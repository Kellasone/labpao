package locations;

public class Location implements LocationContract{

    private String city;
    private int maxMeetings;

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", maxMeetings=" + maxMeetings +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMaxMeetings() {
        return maxMeetings;
    }

    public void setMaxMeetings(int maxMeetings) {
        this.maxMeetings = maxMeetings;
    }

    public Location() {
    }

    public Location(String city, int maxMeetings) {
        this.city = city;
        this.maxMeetings = maxMeetings;
    }

    @Override
    public String getWeather() {
        return "Weather is lovely here!";
    }
}
