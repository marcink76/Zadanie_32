public class ShapeCalculator {
    public static void rectArea(Rectangle rectangle){
        double restSquare = rectangle.getRectHeight() * rectangle.getRectWidth();
        ShowResult.showResult(restSquare, "Pole prostokąta");
    }

    public static void rectPerimeter(Rectangle rectangle){
        double perimeter = (rectangle.getRectHeight() * 2 + rectangle.getRectWidth() * 2 );
        ShowResult.showResult(perimeter,"Obwód prostokąta");
    }

    public static void squareArea(Square square){
        double squareArea = Math.pow(square.getSquareBase(), 2);
        ShowResult.showResult(squareArea, "Pole kwadratu");
    }

    public static void squarePerimeter(Square square){
        double squarePerimeter = square.getSquareBase() * 4;
        ShowResult.showResult(squarePerimeter, "Obwód kwadratu");
    }

    public static void circleArea(Circle circle){
        double circleArea = Math.PI * Math.pow(circle.getRadius(), 2);
        ShowResult.showResult(circleArea,"Pole koła");
    }

    public static void circlePerimeter(Circle circle){
        double circlePerimeter = 2 * Math.PI * circle.getRadius();
        ShowResult.showResult(circlePerimeter, "Obwód koła");
    }

    public  static void triangleArea(Triangle triangle){
        double triangleArea = triangle.getTriangleBase() * triangle.getTriangleBase() / 2;
        ShowResult.showResult(triangleArea, "Pole trójkata");
    }

    public static void trianglePerimeter(Triangle triangle){
        double triangleHypotenuse = Math.sqrt(Math.pow(triangle.getTriangleBase(), 2) + Math.pow(triangle
                .getTriangleHeight(), 2));
        double trianglePerimeter = triangleHypotenuse + triangle.getTriangleBase() + triangle.getTriangleHeight();
        ShowResult.showResult(trianglePerimeter,"Obwod trojkata");
    }

}
