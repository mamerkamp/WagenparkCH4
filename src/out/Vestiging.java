package out;

import java.util.ArrayList;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Vestiging extends Auto{
    private String plaats;
    private String manager;
    private ArrayList<Auto> autos;

    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        autos = new ArrayList<>();
    }

    public void voegAutoToe(Auto auto){
        autos.add(auto);
    }

    @Override
    public String toString() {
        String eenReturn = String.format("Plaats: %s\nManager: %s\n", this.plaats, this.manager);
        for (Auto auto : autos) {
            eenReturn += auto + "\n";

        }
        return eenReturn;
    }
}
