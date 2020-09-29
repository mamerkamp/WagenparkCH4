package model;

import out.Auto;
import out.Vestiging;

import java.util.ArrayList;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class WagenparkLauncher {


    public static void main(String[] args) {


        Vestiging goumere = new Vestiging("Goumere", "Albert Mol");

//        ArrayList<Auto> autos = new ArrayList<>();
//        autos.add(new Auto("Toyota", "Prius", 2015, 63234, "GG-111-K"));
//        autos.add(new Auto("Dacia", "Logan MPV", 2017, 46367, "KS-567-W"));
//        autos.add(new Auto("Tesla", "Model S 100D", 2019, 12646, "TR-264-X"));

        Auto dacia = new Auto("Dacia", "Logan MPV", 2017, 46367, "KS-567-W");
        Auto toyota = new Auto("Toyota", "Prius", 2015, 63234, "GG-111-K");

        goumere.voegAutoToe(dacia);
        goumere.voegAutoToe(toyota);
        System.out.println(goumere);



    }
}
