public class Square {
    private double squareBase = 0;

    public Square(){
        this.squareBase = squareBase;
    }

    public double getSquareBase() {
        return squareBase;
    }

    public void setSquareBase(double squareBase) {
        this.squareBase = squareBase;
    }
    public double calcArea(double base){
        double area = Math.pow(base,2);
        return area;
    }
}
