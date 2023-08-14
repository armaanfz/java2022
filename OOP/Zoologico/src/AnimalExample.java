public class AnimalExample
{
    public static void main(String[] args)
    {
        // new calls the constructor and instantiates ahMeng
        // the parameters initialise its attributes
        Animal ahMeng = new Animal("Ah Meng", 1990);
        System.out.println(ahMeng);
        System.out.print("Name: " + ahMeng.getName() + "\t\t");
        System.out.println("Birth Year: " + ahMeng.getBirthYear());
        ahMeng.setName("Bob");
        System.out.print("Name: " + ahMeng.getName() + "\t\t");
        System.out.println("Birth Year: " + ahMeng.getBirthYear());
    }
}
