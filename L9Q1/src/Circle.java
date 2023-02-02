public class Circle extends Shape{
    private double diameter;
    public Circle(String name){
        super(name);
    }
    @Override
    public void input(){
        System.out.print("Enter diameter: ");
        diameter = sc.nextDouble();
        setPerimeter();
        setArea();
    }
    @Override
    public void setPerimeter(){
        perimeter = Math.PI * diameter;
    }
    @Override
    public void setArea(){
        area = Math.PI * Math.pow((diameter/2),2);
    }
    @Override
    public void display(){
        System.out.printf("Class: %s\n",getClass().getName());
        System.out.printf("Name: %s\n",name);
        System.out.printf("Circumference: %.2f\n",perimeter);
        System.out.printf("Area: %.2f\n",area);
    }
}
