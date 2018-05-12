package ObjectandClassWORK;

public class Circle {
//data field

    public double radius = 1.0;
    public static int numberOfObject = 0;

    //behavior part
    //constructor
    public Circle()
    {
        //no-arg
        numberOfObject++;
    }

    public Circle(double newRadius)
    {
        this.radius = newRadius;
        numberOfObject++;
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

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public static void setNumberOfObject(int numberOfObject) {
        numberOfObject = numberOfObject;
    }


}


