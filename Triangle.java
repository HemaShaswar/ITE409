public class Triangle extends Shape{

    public Triangle(String color, Point center, String type) 
    {
        super(color);
        System.out.println("Please provide the coordinates of the shape");
        
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nShape Position: " + getPosition();
    }

    public void setPosition(double x, double y, double z)
    {
        
    }
    public String getPosition()
    {
        return "a";
    }

}