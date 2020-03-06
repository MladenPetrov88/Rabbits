package Rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    String name;
    int capacity;
    List<Rabbit> data;

    public Cage (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add (Rabbit rabbit) {
        if (this.data.size() < this.capacity) {
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit (String name) {
        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean removeSpecies (String species) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getSpecies().equals(species)) {
                this.data.remove(i);
                i--;
                return true;
            }
        }
        return false;
    }

    public Rabbit sellRabbit (String name) {
            Rabbit rabbit = null;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.get(i).setAvailabe(false);
                rabbit = this.data.get(i);
            }
        }
        return rabbit;
    }

    public List<Rabbit> sellRabbitBySpecies(String species) {

        List<Rabbit> rabbits = new ArrayList<>();

        for (int i = 0; i < this.data.size(); i++) {

            if (this.data.get(i).getSpecies().equals(species)) {

                this.data.get(i).setAvailabe(false);
                rabbits.add(this.data.get(i));

            }
        }
        return rabbits;
    }

    public int count () {
        return this.data.size();
    }

    public String report() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Rabbits available at %s:", this.name)).append(System.lineSeparator());

        this.data.forEach(e -> {
            if (e.isAvailabe()) {
                builder.append(e.toString()).append(System.lineSeparator());
            }
        });

        return builder.toString().trim();
    }

}
