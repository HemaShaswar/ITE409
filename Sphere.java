public class Sphere extends Circle{
    
    public Sphere(String color, Point[] corners,double radius) 
    {
        super(color,corners,radius,"Sphere");
    }

    @Override
    public double getArea() {
        return 4 * super.getArea();
    }

    public double getVolume(){
        return (4.0 / 3) * Math.PI * Math.pow(this.getRadius(), 3); // Volume of a sphere
    }
}
 