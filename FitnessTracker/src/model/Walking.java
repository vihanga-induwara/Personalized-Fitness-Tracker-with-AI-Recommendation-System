package model;

import java.time.LocalDate;

public class Walking extends Activity {
    private int duration; // in minutes
    private double caloriesBurned; // in calories

    public Walking(String type, LocalDate date, int duration, double caloriesBurned) {
        super(type, date);
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    @Override
    public String toString() {
        return "Walking{" +
                "type='" + getType() + '\'' +
                ", date=" + getDate() +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}
