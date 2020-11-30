package abstraction;

/**
 * @author Sibongile Mailula
 */

public class Car implements Available {

    public void checkAvailability(String name) {

        if (CarName.MASERATI.name().equalsIgnoreCase(name))
            System.out.println("Maserati is available");
        else if (CarName.PORSCHE.name().equalsIgnoreCase(name))
            System.out.println("Porsche is available");
        else
            System.out.println(name + " is not available");
    }
}
