package OOP.Basic;

import java.util.Scanner;

public class OOP_B06_Lop_HCN {
    private double width;
    private double height;
    private String color;

    OOP_B06_Lop_HCN() {
    }

    OOP_B06_Lop_HCN(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void standarColor() {
        String formatColor = this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
        setColor(formatColor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B06_Lop_HCN a = new OOP_B06_Lop_HCN(sc.nextDouble(), sc.nextDouble(), sc.nextLine());
        a.standarColor();
        System.out.printf("%.0f %.0f %s", a.findPerimeter(), a.findArea(), a.color);
    }
}
