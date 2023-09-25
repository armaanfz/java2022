public class ZebraTest
{
    public static void main(String[] args)
    {
        Zebra nevensHorse = new Zebra("Stripey", 2012, "Savannah");
        System.out.println(nevensHorse);
        System.out.println(nevensHorse.getName() + " was born on " + nevensHorse.getBirthYear());
        nevensHorse.setHabitat("Grasslands");
        System.out.println(nevensHorse.getHabitat() );
        nevensHorse.talk();
        nevensHorse.eat();
    }
}
