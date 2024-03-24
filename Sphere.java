public class Sphere extends Circle{
    
    public Sphere(String color, Point centerPoint, Point circumPoint,double radius){
        super(color,centerPoint, circumPoint,"Sphere");
    }

    public Sphere(String color, Point centerPoint,Point circumPoint,String type){
        super(color,centerPoint,circumPoint,type);
    }

    @Override
    public double getRadius(){
        Point center = getCenterPoint();
        Point surface = getCircumPoint();
        return Math.sqrt(
            Math.pow(surface.x - center.x, 2) + Math.pow(surface.y - center.y, 2) + Math.pow(surface.z - center.z, 2));

    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    public double getVolume(){
        return ((4.0 / 3) * Math.PI * Math.pow(this.getRadius(), 3)); // Volume of a sphere
    }
}
 