package ru.vsegdada;

import ru.vsegdada.ThePlants.*;

public class Application {
    public static void main(String[] args) {


        Plants Cactus = new Cactus("Cactus", "green", ColorPot.BLACK, 3, 1);
        System.out.println(Cactus);

        Plants Rose = new Rose("Rose", "red", ColorPot.WHITE, 50, 1);
        System.out.println(Rose);

        Plants Tulips = new Tulips("Tulips","Yellow",ColorPot.BLUE,24,2);
        System.out.println(Tulips);



    }
}



