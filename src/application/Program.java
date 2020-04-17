package application;

import entities.Species;

public class Program {

    public static void main(String[] args) {

        Species species = new Species("Aimalia", "Chordata", "Mammalia", "Primata", "Hominidae", "Homo", "Homo sapiens");

        System.out.println(species.showDescription());
    }
}
