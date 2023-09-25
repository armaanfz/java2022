public class Rabbit extends Animal
{
    private String hideColour;

    public Rabbit(String name, int birthYear, String hideColour)
    {
        super(name, birthYear); // calls Animal's constructor
        this.hideColour = hideColour;
    }

    public Rabbit(String name, String hideColour)
    {
        super(name); // calls Animal's constructor
        this.hideColour = hideColour;
    }

    public String getHideColour()
    {
        return hideColour;
    }

    public void setHideColour(String hideColour)
    {
        this.hideColour = hideColour;
    }

    public void talk()
    {
        System.out.println(this.getName() + " talks Squeak squeak");
    }

    public void eat()
    {
        System.out.println(this.getName() + " eats Nibble nibble");
    }

    @Override
    public String toString()
    {
        return super.toString() + " | hide: " + hideColour;
        // this. is optional here as there's no confusion that we're talking
        // about the instance variable/attribute
    }
}
