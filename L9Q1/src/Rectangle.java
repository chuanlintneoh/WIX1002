public class Rectangle extends Shape{
    private double[] sideLength = new double[2];
    public Rectangle(String name){
        super(name);
    }
    @Override
    public void input(){
        System.out.print("Enter side length 1: ");
        sideLength[0] = sc.nextDouble();
        System.out.print("Enter side length 2: ");
        sideLength[1] = sc.nextDouble();
        setPerimeter();
        setArea();
    }
    @Override
    public void setPerimeter(){
        perimeter = sideLength[0]*2 + sideLength[1]*2;
    }
    @Override
    public void setArea(){
        area = sideLength[0]*sideLength[1];
    }
}
