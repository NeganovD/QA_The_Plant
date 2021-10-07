package ru.vsegdada.ThePlants;

public class Tulips extends Plants {

    public Tulips(String name, String colorPlants, ColorPot colorPot, int height, int waterInDay) {
        super(name, colorPlants, colorPot, height, waterInDay);

    }


    @Override
    public String toString() {
        return "Tulips: " + "name= " + getName() + ", "
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

