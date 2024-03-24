
public class Application 
{
    public static void main(String... args) 
    {
        System.out.println("Please provide the coordinates of the shape, the color, and the type: ");

        

        System.out.println();

        Point a = new Point(100, 3);
        Point b = new Point(4, 37);
        Point c = new Point(70, 5);

        Triangle triangle = new Triangle(a,b,c,"red","triangle");
        
        System.out.println(triangle.toString());


        Point d = new Point(100, 3);
        Point e = new Point(4, 37);
       

        Cube cube = new Cube(a,b,"red","cube");
        
        System.out.println(cube.toString());




        System.out.println();

        Point f = new Point(10, 4);
        Point g = new Point(37, 70);
        Square square = new Square(f,g,"green","square");
        System.out.println(square.toString());

        System.out.println();

        Point h = new Point(10, 4, 80);
        Point i = new Point(37, 70, 90);

        Circle c1 = new Circle("red", h, i);
        System.out.println(c1.toString());

        System.out.println();

        Sphere s1 = new Sphere("white", h, i);
        System.out.println(s1.toString());
    }
}
