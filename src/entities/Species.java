package entities;

public class Species extends Genre {

    private String species;

    public Species(String kingdom, String phylum, String grade, String order, String family, String genre, String species) {
        super(kingdom, phylum, grade, order, family, genre);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Espécie " + species + "\n";
    }
}
