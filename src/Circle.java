public class Circle {
    private double radius;

    public Circle (){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcPerimeter(double radius){
        double perimeter = Math.PI * radius * 2;
        return perimeter;
    }
}
