public class Square extends Shape{
    private double sideLength;
    public Square(String name){
        super(name);
    }
    @Override
    public void input(){
        System.out.print("Enter side length: ");
        sideLength = sc.nextDouble();
        setPerimeter();
        setArea();
    }
    @Override
    public void setPerimeter(){
        perimeter = sideLength*4;
    }
    @Override
    public void setArea(){
        area = Math.pow(sideLength,2);
    }
}
