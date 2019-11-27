package main;

import main.cloth.Cloth;
import main.cloth.Shirt;
import main.cloth.Skirt;
import main.cloth.UpperCloth;
import main.hanger.Hanger;
import main.hanger.HangerPlus;

public class Main {

    public static void main(String[] arg) {
        Wardrobe wardrobe = new Wardrobe(20);
        Cloth cloth = new Shirt("T");
        Cloth skirt = new Skirt("O");
        Hanger simpleHanger = new Hanger();
        Hanger plusHanger = new HangerPlus();

        simpleHanger.setUpperCloth((UpperCloth) cloth);

        wardrobe.addHanger(simpleHanger);
        wardrobe.addHanger(plusHanger);

        System.out.println(wardrobe.isFreeSlot());

    }

}
