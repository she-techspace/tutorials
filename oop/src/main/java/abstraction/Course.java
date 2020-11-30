package abstraction;

/**
 * @author Sibongile Mailula
 */

class Course implements Available {

    public void checkAvailability(String name) {

        if (CourseType.JAVA.name().equalsIgnoreCase(name))
            System.out.println("Java courses available");
        else if (CourseType.PYTHON.name().equalsIgnoreCase(name))
            System.out.println("Python courses available");
        else
            System.out.println(name + " courses not available");
    }
}
