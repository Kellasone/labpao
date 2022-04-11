package meetings;

import users.Dog;
import users.Patient;

public class Meeting {
    private Patient human;
    private Dog fluffyFriend;

    private int day;
    private int hour;

    @Override
    public String toString() {
        return "Meeting{" +
                "human=" + human +
                ", fluffyFriend=" + fluffyFriend +
                ", day=" + day +
                ", hour=" + hour +
                '}';
    }

    public Meeting() {
    }

    public Meeting(Patient human, Dog fluffyFriend, int day, int hour) {
        this.human = human;
        this.fluffyFriend = fluffyFriend;
        this.day = day;
        this.hour = hour;
    }

    public Patient getHuman() {
        return human;
    }

    public void setHuman(Patient human) {
        this.human = human;
    }

    public Dog getFluffyFriend() {
        return fluffyFriend;
    }

    public void setFluffyFriend(Dog fluffyFriend) {
        this.fluffyFriend = fluffyFriend;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
