import java.security.SecureRandom;

abstract class Shape
{
    private int shapeId; //unique
    private String color;
    private point[] corners;
    private String type;

    public Shape(String color, String type){
        initializeId();
        setColor(color);
        setType(type);
    }

    public Shape(String color, point[] corners, String type){
        initializeId();
        setColor(color);
        setCorners(corners);
        setType(type);
    }

    private void setCorners(point[] corners){
        this.corners = corners;
    }

    public point[] getCorners(){
        return this.corners;
    }

    public int getId(){
        return this.shapeId;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    private void initializeId(){
        // make it unique//
        SecureRandom random = new SecureRandom();
        shapeId = 1000 +random.nextInt(10000);
    }

    public abstract void setArea();

    public void print(){
      // check if share has volume aka sphere and cube  
    }
}

