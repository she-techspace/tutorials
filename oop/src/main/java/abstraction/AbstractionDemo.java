package abstraction;
/**
 * @author Sibongile Mailula
 */
public class AbstractionDemo {

    public static void main(String[] args) {
        Available course = new Course();

        System.out.println("Checking course availability\n");
        course.checkAvailability("Java");
        course.checkAvailability("Python");
        course.checkAvailability("JavaScript");

        System.out.println("\nChecking car availability\n");
        Available car = new Car();
        car.checkAvailability("Maserati");
        car.checkAvailability("BMW");
        car.checkAvailability("Porsche");
    }
}
