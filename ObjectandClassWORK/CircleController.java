package ObjectandClassWORK;


public class CircleController {

    public static void main(String[] args) {


        Circle circle1 = new Circle();



        System.out.println("Circle 1 Radius is " + circle1.getRadius());
        //System.out.println("Circle 1 area with radius " + circle1.getRadius() + " is " + circle1.getArea());
        System.out.printf("Circle 1 area with radius %3.2f is %3.2f %n",circle1.getRadius(), circle1.getArea());


        Circle circle2 = new Circle(5.0);
        System.out.printf("Circle 2: Perimeter is %3.2f%n", circle2.getPerimeter());


        System.out.println(circle1.radius);

        circle1.setRadius(6.7);
        int numbOfObject = Circle.numberOfObject;
        System.out.print("Number of Objects: " + Circle.numberOfObject);

    }

}
