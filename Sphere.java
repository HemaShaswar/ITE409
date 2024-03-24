public class Sphere extends Circle{
    private double volume;
    private double height;

    public Sphere(String color, point center,int radius, String type, double height) 
    {
        super(color,center,radius,type);
        setHeight(height);
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void calculateVolume(){
        this.setArea();
        this.volume = this.getArea() * this.height;
    }
}
 