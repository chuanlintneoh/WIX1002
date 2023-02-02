import java.util.*;
public class Shape {
    protected static Scanner sc = new Scanner(System.in);
    protected String name;
    protected double perimeter;
    protected double area;
    public Shape(String name){
        this.name = name;
    }
    public void input(){
        setPerimeter();
        setArea();
    }
    //mutator methods
    public void setPerimeter(){
        perimeter = 0;
    }
    public void setArea(){
        area = 0;
    }
    //accessor methods
    public String getName(){
        return name;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    public void display(){
        System.out.printf("Class: %s\n",getClass().getName());
        System.out.printf("Name: %s\n",name);
        System.out.printf("Perimeter: %.2f\n",perimeter);
        System.out.printf("Area: %.2f\n",area);
    }
}
