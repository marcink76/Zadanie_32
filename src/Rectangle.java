public class Rectangle extends Square{
    private double rectHeight = 0;

    public Rectangle() {
        super();
        this.rectHeight = rectHeight;
    }

    public double getRectHeight() {
        return rectHeight;
    }

    public void setRectHeight(double rectHeight) {
        this.rectHeight = rectHeight;
    }

    public double calcArea(double width, double height){
        double area = width * height;
        return area;
    }
}
