package ObjectandClassWORK;


public class CircleTester {
    public static void main(String[] args) {


        Circle2 circle1 = new Circle2();

        //double area = circle1.getArea();

        System.out.println("Circle 1 Radius is " + circle1.getRadius());
        //System.out.println("Circle 1 area with radius " + circle1.getRadius() + " is " + circle1.getArea());
        System.out.printf("Circle 1 area with radius %3.2f is %3.2f %n",circle1.getRadius(), circle1.getArea());


        Circle2 circle2 = new Circle2(5.0);
        System.out.printf("Circle 2: Perimeter is %3.2f%n", circle2.getPerimeter());

        //int numOfObject = Circle.getNumberOfObject();
        int numOfObjectbyObject = circle1.getNumberOfObject();
        //System.out.println(numOfObject);
        System.out.println(numOfObjectbyObject);

    }

}

class Circle2 {
    //data field

    public double radius = 1.0;
    public  int numberOfObject = 0;

    //behavior part
    //constructor
    public Circle2()
    {
        //no-arg
        numberOfObject++;
    }

    public Circle2(double newRadius)
    {
        this.radius = newRadius;
        numberOfObject++;
    }

    public  int getNumberOfObject() {
        return numberOfObject;
    }

    public  void setNumberOfObject(int numberOfObject) {
        this.numberOfObject = numberOfObject;
    }

    public double getArea()
    {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter()
    {
        return this.radius * 2 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}


