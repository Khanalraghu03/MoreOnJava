package ObjectandClassWORK;

import java.util.Scanner;
import javafx.geometry.Point2D;
public class TesterPoint2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the point1 values: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Please enter the point2 values: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D firstTwoPoints = new Point2D(x1,y1);
        Point2D secondTwoPoints = new Point2D(x2,y2);

        System.out.println("The first two points are: " + firstTwoPoints.toString());
        System.out.println("The second two points are: " + secondTwoPoints);

        System.out.println("The distance between first two points and second two points are: " +
                firstTwoPoints.distance(secondTwoPoints));
    }
}
