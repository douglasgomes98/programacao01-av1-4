package entities;

public class Kingdom {

    private String kingdom;

    public Kingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String showDescription() {
        return "Reino " + kingdom + "\n";
    }

}
