public class Rectangle {
    private double rectHeight = 0;
    private double rectWidth = 0;

    public Rectangle(){
        this.rectHeight = rectHeight;
        this.rectWidth = rectWidth;
    }

    public double getRectHeight() {
        return rectHeight;
    }

    public void setRectHeight(double rectHeight) {
        this.rectHeight = rectHeight;
    }

    public double getRectWidth() {
        return rectWidth;
    }

    public void setRectWidth(double rectWidth) {
        this.rectWidth = rectWidth;
    }

    public double calcArea(double width, double height){
        double area = width * height;
        return area;
    }
}
