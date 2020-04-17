package entities;

public class Phylum extends Kingdom {

    private String phylum;

    public Phylum(String kingdom, String phylum) {
        super(kingdom);
        this.phylum = phylum;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Filo " + phylum + "\n";
    }
}
