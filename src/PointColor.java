public class PointColor {
    public static final Line L1 = new Line(-3, 2, 0.25);
    public static final HorisontalParabola H1 = new HorisontalParabola(2 , -3,-1);

    public static final VertParabola V1 = new VertParabola(0, 0, -0.5);

    public static final VertParabola V2 = new VertParabola(3, 0, 0.125);

    public static final VertParabola V3 = new VertParabola(6, 4, 0.25);
    public static SimpleColor getColor(double x, double y){

        if (H1.isPointInParabola(x, y) && V1.isPointUnderParabola(x, y) ){
            return SimpleColor.YELLOW;
        }
        else if (H1.isPointInParabola(x, y) && V1.isPointAboveParabola(x, y) ){
            return SimpleColor.GREY;
        }
        else if (!H1.isPointInParabola(x, y) && V1.isPointUnderParabola(x, y) ){
            return SimpleColor.BLUE;
        }
        else if (!H1.isPointInParabola(x, y) && V1.isPointAboveParabola(x, y) && x < 2 && y < 2 ){
            return SimpleColor.BLUE;
        }
        else if (V2.isPointUnderParabola(x, y) && !L1.isPointUnderLine(x, y) && !H1.isPointInParabola(x, y) && x < 0){
            return SimpleColor.GREEN;
        }
        else if (V2.isPointAboveParabola(x, y) && !L1.isPointUnderLine(x, y) && V3.isPointUnderParabola(x, y) && x < 6){
            return SimpleColor.BLUE;
        }
        else if (V2.isPointAboveParabola(x, y) && !L1.isPointUnderLine(x, y) && V3.isPointUnderParabola(x, y) && x > 6){
            return SimpleColor.WHITE;
        }
        else if (V2.isPointUnderParabola(x, y) && !L1.isPointUnderLine(x, y) && !H1.isPointInParabola(x, y) && x < 0){
            return SimpleColor.BLUE;
        }
        else if (V2.isPointAboveParabola(x, y) && L1.isPointUnderLine(x, y) && V3.isPointUnderParabola(x, y)){
            return SimpleColor.WHITE;
        }
        else if (!L1.isPointUnderLine(x, y) && !V3.isPointUnderParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        else if (L1.isPointUnderLine(x, y) && !V3.isPointUnderParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.GREY;
    }
}
