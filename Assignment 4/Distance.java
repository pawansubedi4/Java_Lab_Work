import java.util.Scanner;
class TwoPoint {
    double x, y;
    void Getvalue(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
public class Distance {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        TwoPoint d1 = new TwoPoint();
        TwoPoint d2 = new TwoPoint();
        TwoPoint md = new TwoPoint();
        System.out.println("Enter x, y values of point 1:");
        double x = sn.nextDouble();
        double y = sn.nextDouble();
        d1.Getvalue(x, y);
        System.out.println("Enter x, y values of point 2:");
        x = sn.nextDouble();
        y = sn.nextDouble();
        d2.Getvalue(x, y);
        double d = Math.sqrt(Math.pow(d2.x - d1.x, 2) + Math.pow(d2.y - d1.y, 2));
        System.out.println("The distance is " + d);
        md.Getvalue((d1.x + d2.x) / 2, (d1.y + d2.y) / 2);
        System.out.println("The midpoint is x = " + md.x + ", y = " + md.y);
    }
}
