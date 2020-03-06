package Rabbits;

public class Rabbit {
    String name;
    String species;
    boolean availabe;

    public Rabbit (String name, String species) {
        this.name = name;
        this.species = species;
        this.availabe = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailabe() {
        return this.availabe;
    }

    public void setAvailabe(boolean availabe) {
        this.availabe = availabe;
    }

    @Override
    public String toString() {
        return String.format("Rabbit %s: %s",species, name);
    }
}
