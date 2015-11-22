package ru.itqdevelopment.exercise;

public class Calc {
    private double liters;
    private double kilometers;
    private double consumption;


    public String calculating() {
        if (liters == 0.0 || kilometers == 0.0 || liters < 0 || kilometers < 0) return "?";
        else {
            double val;
            val = (int) ((liters / kilometers) * 10);
            val /= 10;
            return "~" + String.valueOf(val);
        }
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers / 100;
    }
}
