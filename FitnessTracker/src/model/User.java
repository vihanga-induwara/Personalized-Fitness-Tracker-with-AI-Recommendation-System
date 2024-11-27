package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private int age;
    private double weight;
    private double height;
    private List<Activity> activities;

    public User(int id, String name, int age, double weight, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activities = new ArrayList<>();
    }

    public void createAddActivity(String type, LocalDate date, int duration, double caloriesBurned) {
        activities.add(new Walking(type, date, duration, caloriesBurned));
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", activities=" + activities +
                '}';
    }
}
