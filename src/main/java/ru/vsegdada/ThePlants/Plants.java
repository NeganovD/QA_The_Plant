package ru.vsegdada.ThePlants;

public abstract class Plants {
    private final String name;
    private final String colorPlants;
    private final ColorPot colorPot;
    private int height;
    private int waterInDay;


    public Plants(String name, String colorPlants, ColorPot colorPot, int height, int waterInDay) {
        this.name = name;
        this.colorPlants = colorPlants;
        this.colorPot = colorPot;
        this.height = height;
        this.waterInDay = waterInDay;

    }


    public String getName() {
        return name;
    }

    public String getColorPlants() {
        return colorPlants;
    }

    public ColorPot getColorPot() {
        return colorPot;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWaterInDay() {
        return waterInDay;
    }

    public void setWaterInDay(int waterInDay) {
        this.waterInDay = waterInDay;
    }

    @Override
    public String toString() {
        return "Plants:" + "name= " + name
                +
                ", colorPot= " + colorPot
                +
                ", height= " + height + "cm"
                +
                ", waterInDay= " + waterInDay + " liter(s) in day"
                +
                ";";
    }

}