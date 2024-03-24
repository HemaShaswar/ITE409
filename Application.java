import java.util.Scanner;

public class Application 
{
    public static void main(String... args) {
        
        Shape[] newShapes = new Shape[10];
        for(int i = 0;i<10;i++){
            String shapeType = askUserShapeType();
            String color = askUserColor();

    
            switch (shapeType) {
                case "square":
                    createSquare(color);
                    break;
                case "cube":
                    createCube(color);
                    break;
                case "triangle":
                    createTriangle(color);
                    break;
                case "circle":
                    createCircle(color);
                    break;
                case "sphere":
                    createSphere(color);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid Shape Entered, try again: ");
                    askUserShapeType();
                    break;
            }

        }
        
    }

    public static String askUserShapeType(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Shape Type to Create: ");
        System.out.println("(Square, Cube, Circle, Sphere, Triangle, Or 'Exit')");
        String shapeType = input.nextLine().toLowerCase();
        return shapeType;
    }

    public static Circle createCircle(String color){
        Point centerPoint = askUserPoint();
        Point circumPoint = askUserPoint();

        return new Circle(color, centerPoint, circumPoint);
    }

    public static Sphere createSphere(String color){
        Point centerPoint = askUserPoint();
        Point circumPoint = askUserPoint();

        return new Sphere(color, centerPoint, circumPoint);
    }

    public static Square createSquare(String color){
        Point corner1 = askUserPoint();
        Point corner2 = askUserPoint();

        return new Square(corner1, corner2, color);
    }

    public static Cube createCube(String color){
        Point corner1 = askUserPoint();
        Point corner2 = askUserPoint();

        return new Cube(corner1, corner2, color);
    }

    public static Triangle createTriangle(String color){
        Point corner1 = askUserPoint();
        Point corner2 = askUserPoint();
        Point corner3 = askUserPoint();

        return new Triangle(corner1, corner2, corner3, color);
    }

    public static Point askUserPoint(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Point Intiger Coordinates: ");
        System.out.println("Point.X Intiger Value: ");
        int x1 = input.nextInt();
        System.out.println("Point.Y Intiger Value: ");
        int y1 = input.nextInt();
        System.out.println("Point.Z Intiger Value: ");
        int z1 = input.nextInt();

        return new Point(x1, y1, z1);
    }

    public static String askUserColor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Shape Color: ");
        String color = input.nextLine().toLowerCase();
        return color;

    }
    
}
