package model;

import java.time.LocalDate;

public class Running extends Activity {
    private double distance; // in kilometers
    private double averageSpeed; // in km/h

    public Running(String type, LocalDate date, double distance, double averageSpeed) {
        super(type, date);
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    public String toString() {
        return "Running{" +
                "type='" + getType() + '\'' +
                ", date=" + getDate() +
                ", distance=" + distance +
                " km, averageSpeed=" + averageSpeed +
                " km/h}";
    }
}
