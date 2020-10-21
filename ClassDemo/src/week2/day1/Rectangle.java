package week2.day1;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;
    private double perimeter;
    private double area;

    public void Perimeter() {
        perimeter = (length + width) * 2;
        System.out.println("周长：" + perimeter);
    }

    public void Area() {
        area = length * width;
        System.out.println("面积：" + area);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("请输入宽：");
        rectangle.setWidth(input.nextDouble());
        System.out.println("请输入长：");
        rectangle.setLength(input.nextDouble());
        rectangle.Perimeter();
        rectangle.Area();
    }
}
