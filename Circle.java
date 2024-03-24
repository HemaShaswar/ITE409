public class Circle extends Shape{
    private double radius;

    public Circle(String color,Point[] corners,double radius){
        super(color,corners,"Circle");
        setRadius(radius);   
    }
    public Circle(String color,Point[] corners,double radius,String type){
        super(color,corners,type);
        setRadius(radius);   
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

}
