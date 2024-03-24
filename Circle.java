public class Circle extends Shape{
    private Point centerPoint;
    private Point circumPoint;


    public Circle(String color,Point centerPoint,Point circumPoint){
        super(color,"Circle");
        setCenterPoint(centerPoint);
        setCircumPoint(circumPoint);
    }
    public Circle(String color,Point centerPoint, Point circumPoint,String type){
        super(color,type);
        setCenterPoint(centerPoint);
        setCircumPoint(circumPoint);
    }

    private void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    private void setCircumPoint(Point circlePoint){
        this.circumPoint = circlePoint;
    }

    public Point getCircumPoint() {
        return circumPoint;
    }

    public double getRadius(){
        return Math.sqrt(Math.pow(circumPoint.x - centerPoint.x, 2) + 
        Math.pow(circumPoint.y - centerPoint.y, 2));
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public String toString(){
        return super.toString()+"\nShape Area " + getArea();
    }

}
