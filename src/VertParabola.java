public class VertParabola {
    public double x0;
    public double y0;
    public double m;

    public VertParabola(double x0, double y0, double m) {
        this.x0 = x0;
        this.y0 = y0;
        this.m = m;
    }
    public boolean isPointUnderParabola(double x, double y){
        return y < m * Math.pow(x - x0, 2) + y0;
    }
    public boolean isPointAboveParabola(double x, double y){
        return y > m * Math.pow(x - x0, 2) + y0;
    }
}
