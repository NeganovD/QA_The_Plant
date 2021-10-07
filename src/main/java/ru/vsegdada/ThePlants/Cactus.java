package ru.vsegdada.ThePlants;

public class Cactus extends Plants {


    public Cactus(String name, String colorPlants, ColorPot colorPot, int height, int waterInDay) {
        super(name, colorPlants, colorPot, height, waterInDay);

    }


    @Override
    public String toString() {
        return "Cactus: " + "name= " + getName() + ", "
                +
                ", colorPlants= " + getColorPlants()
                +
                ", colorPot= " + getColorPot()
                +
                ", height=" + getHeight()
                +
                ", waterInDay= " + getWaterInDay()
                +
                " liter(s) in day"
                +
                ";";
    }
}
