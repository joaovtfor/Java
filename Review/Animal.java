package Review;

public abstract class Animal {
    String name;
    String species;
    int age;

    public Animal (String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public abstract void mostrarInformacoes();
}

