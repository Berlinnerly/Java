import static java.lang.Math.*;

/**
 * @Author: Berlinnerly
 * @Package: PACKAGE_NAME
 * @FileName: Berlin.java
 * @Tools: IntelliJ IDEA
 * @Time: 2021/7/8 22:36
 * @Blog: baigeinanhai.com
 * @Version: 1.0
 * @Description:
 */

interface Stereoscopic {
    double area();

    double volume();

    double perimeter();
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Circle extends Point implements Stereoscopic {
    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI * pow(this.r, 2);
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 2 * PI * this.r;
    }
}

class Cone extends Circle implements Stereoscopic {
    private int h;

    public Cone(int x, int y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }

    public Cone(int x, int y, int r) {
        super(x, y, r);
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        double area_c = sqrt(pow(this.h, 2) + pow(getR(), 2)) * PI * getR();
        double area_d = super.area();
        return area_c + area_d;
    }

    @Override
    public double volume() {
        return super.area() * this.h / 3.0;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
}

class Cylinder extends Circle {
    private int h;

    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }

    public Cylinder(int x, int y, int r) {
        super(x, y, r);
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        return super.area() * 2 + super.perimeter() * this.h;
    }

    @Override
    public double volume() {
        return super.area() * this.h;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
}

class RoundTable extends Cone {
    private Circle circle;

    public RoundTable(int x, int y, int r, int h, Circle circle) {
        super(x, y, r, h);
        this.circle = circle;
    }

    public RoundTable(int x, int y, int r, int h) {
        super(x, y, r, h);
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double area() {
        double l = sqrt(pow(abs(getR() - circle.getR()), 2) + pow(getH(), 2));
        return PI * (pow(getR(), 2) + pow(circle.getR(), 2) + getR() * l + circle.getR() * l);
    }

    @Override
    public double volume() {
        return getH() * PI * (pow(getR(), 2) + pow(circle.getR(), 2) + getR() * circle.getR()) / 3.0;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
}

class TableLamp extends RoundTable {
    private Cylinder cylinder;

    public TableLamp(int x, int y, int r, int h, Circle circle, Cylinder cylinder) {
        super(x, y, r, h, circle);
        this.cylinder = cylinder;
    }

    public TableLamp(int x, int y, int r, int h, Circle circle) {
        super(x, y, r, h, circle);
    }

    public Cylinder getCylinder() {
        return cylinder;
    }

    public void setCylinder(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public double area() {
        double table_lamp_area;
        if (super.getR() <= cylinder.getR()) {
            table_lamp_area = super.area() + cylinder.area() - 2 * super.area();
        } else {
            table_lamp_area = super.area() + cylinder.area() - 2 * cylinder.area();
        }
        return table_lamp_area;
    }

    @Override
    public double volume() {
        return super.volume() + cylinder.volume();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
}

abstract class Tools {
    public static double getArea(Circle circle) {
        return circle.area();
    }

    public static double getVolume(Circle circle) {
        return circle.volume();
    }

    public static double getPerimeter(Circle circle) {
        return circle.perimeter();
    }
}

public class Berlin {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3);
        System.out.printf("circle area: %.2f\n", Tools.getArea(circle));
        System.out.printf("circle perimeter: %.2f\n", Tools.getPerimeter(circle));

        Circle cone = new Cone(1, 2, 3, 4);
        System.out.printf("cone area: %.2f\n", Tools.getArea(cone));
        System.out.printf("cone volume: %.2f\n", Tools.getVolume(cone));

        Circle cylinder = new Cylinder(1, 2, 3, 4);
        System.out.printf("cylinder area: %.2f\n", Tools.getArea(cylinder));
        System.out.printf("cylinder volume: %.2f\n", Tools.getVolume(cylinder));

        Circle roundTable = new RoundTable(1, 2, 3, 4, circle);
        System.out.printf("roundTable area: %.2f\n", Tools.getArea(roundTable));
        System.out.printf("roundTable volume: %.2f\n", Tools.getVolume(roundTable));

        Circle tableLamp = new TableLamp(1, 2, 3, 4, circle, (Cylinder) cylinder);
        System.out.printf("tableLamp area: %.2f\n", Tools.getArea(tableLamp));
        System.out.printf("tableLamp volume: %.2f\n", Tools.getVolume(tableLamp));
    }
}
