package Chapter9HomeWork;

public class NameTest {
    public static void main(String args[]) {
        Name director = new Name("Megan", 'H', "Hansen");
        Name supervisor = new Name("Peter", "Rabbit");

        //System.out.println(director.getNormalOrder());
        System.out.println(director.getReversedOrder());
        System.out.println(director.getInitials());


       // System.out.println(supervisor.getNormalOrder());
        System.out.println(supervisor.getReversedOrder());
        System.out.println(supervisor.getInitials());

    }
}
