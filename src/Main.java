public class Main {
    public static void main(String[] args){
        //Pole i obwód prostokąta
        Rectangle rectangle = new Rectangle();
        rectangle.setRectHeight(100.0);
        rectangle.setSquareBase(50.0);
        ShapeCalculator.rectArea(rectangle);
        ShapeCalculator.rectPerimeter(rectangle);

        System.out.println("Metoda z zadania 2.2: " + rectangle.calcArea(10, 20)+ "mm^2"); // zadanie 2.2

        //Pole i obwód kwadratu
        Square square = new Square();
        square.setSquareBase(10);
        ShapeCalculator.squareArea(square);
        ShapeCalculator.squarePerimeter(square);

        System.out.println("Metoda z zadania 2.2: " + square.calcArea(10)+ "mm^2"); // zadanie 2.2

        //Pole i obwód koła
        Circle circle = new Circle();
        circle.setRadius(10.0);
        ShapeCalculator.circleArea(circle);
        ShapeCalculator.circlePerimeter(circle);

        System.out.println("Metoda z zadania 2.2: " + circle.calcPerimeter(25)+ "mm"); // zadanie 2.2

        //Pole i obwód trójkąta prostokątnego
        Triangle triangle = new Triangle();
        triangle.setTriangleBase(10);
        triangle.setTriangleHeight(10);
        ShapeCalculator.triangleArea(triangle);
        ShapeCalculator.trianglePerimeter(triangle); // zakładam, że to jest trójkąt prostokątny ;)

        System.out.println("Metoda z zadania 2.2: " + triangle.calcPerimeter(15)+ "mm"); /* zadanie 2.2 tym razem
         założyłem, iż jest to trójkąt rownoboczny. ;) */


    }
}
