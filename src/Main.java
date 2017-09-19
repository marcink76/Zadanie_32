public class Main {
    public static void main(String[] args){
        //Pole i obwód prostokąta
        Rectangle rectangle = new Rectangle();
        rectangle.setRectHeight(100.0);
        rectangle.setRectWidth(50.0);
        ShapeCalculator.rectArea(rectangle);
        ShapeCalculator.rectPerimeter(rectangle);

        //Pole i obwód kwadratu
        Square square = new Square();
        square.setSquareBase(10);
        ShapeCalculator.squareArea(square);
        ShapeCalculator.squarePerimeter(square);

        //Pole i obwód koła
        Circle circle = new Circle();
        circle.setRadius(10.0);
        ShapeCalculator.circleArea(circle);
        ShapeCalculator.circlePerimeter(circle);

        //Pole i obwód trójkąta prostokątnego
        Triangle triangle = new Triangle();
        triangle.setTriangleBase(10);
        triangle.setTriangleHeight(10);
        ShapeCalculator.triangleArea(triangle);
        ShapeCalculator.trianglePerimeter(triangle); // zakładam, że to jest trójkąt prostokątny ;)


    }
}
