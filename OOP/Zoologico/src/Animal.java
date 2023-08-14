public class Animal
{
    // attributes/fields/instance variables
    private String name;
    private int birthYear;
    // private = data hiding

    // (custom) constructor method
    public Animal(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    // overloading the constructor
    public Animal(String name)
    {
        this.name = name;
        birthYear = 0;
    }

    // accessor method aka "getters"
    public String getName()
    {
        return this.name;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    // mutator/modifier methods
    public void setName(String name)
    {
        this.name = name;
    }

    /*
    public void setBirthYear(int year)
    {
        this.birthYear = year;
    }
    */
}
