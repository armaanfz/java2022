// extends <-- inheritance keyword; Zebra is a subclass of Animal
public class Zebra extends Animal
{
    private String habitat; // e.g. grasslands, shrublands, savannahs,
                            // ...plains, mountains, zoos, reserves, park

    public Zebra(String name, int birthYear, String habitat)
    {
        super(name, birthYear); // calls the constructor of the superclass (Animal)
        this.habitat = habitat;
    }

    public String getHabitat()
    {   return habitat;
    }

    public void setHabitat(String habitat)
    {   this.habitat = habitat;
    }

    public void talk()
    {
        System.out.println(getName() + " talks Bray Bray");
    }

    public void eat()
    {
        System.out.println(getName() + " eats Chomp Chomp");
    }

    public String toString()
    {   return super.toString() + " | Habitat: " + habitat;
    }
}
