package entities;

public class Grade extends Phylum {

    private String grade;

    public Grade(String kingdom, String phylum, String grade) {
        super(kingdom, phylum);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Classe " + grade + "\n";
    }
}
