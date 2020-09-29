package out;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Auto {

    private String merk;
    private String model;
    private int jaar;
    private int kilometerstand;
    private String kenteken;

    public Auto(String merk, String model, int jaar, int kilometerstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.jaar = jaar;
        this.kilometerstand = kilometerstand;
        this.kenteken = kenteken;
    }

    public Auto(){

    }

    @Override
    public String toString() {
        return String.format("Merk: %s\nModel: %s\nJaar: %d\nKilometerstand: %d\nKenteken: %s\n", this.merk,
                this.model, this.jaar, this.kilometerstand, this.kenteken);
    }
}
