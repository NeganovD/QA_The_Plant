package ru.vsegdada.ThePlants;

public class Rose extends Plants {


    public Rose(String name, String colorPlants, ColorPot colorPot, int height, int waterInDay) {
        super(name, colorPlants, colorPot, height, waterInDay);

    }


    @Override
    public String toString() {
        return "Rose: " + "name= " + getName() + ", "
                +
                ", colorPlants= " + getColorPlants()
                +
                ", colorPot= " + getColorPot()
                +
                ", height= " + getHeight()
                +
                ", waterInDay= " + getWaterInDay()
                +
                " liter(s) in day"
                +
                ";";
    }
}

