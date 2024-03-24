public class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(String color,point centerPoint,double radius,String type){
        super(color,centerPoint,type);
        setRadius(radius);        
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setArea(){
        this.area = Math.PI * radius * radius;

    }

    public double getArea() {
        return area;
    }

}
