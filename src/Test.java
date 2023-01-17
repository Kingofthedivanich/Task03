public class Test {
    public double xTest;
    public double yTest;
    public SimpleColor ansTest;

    public Test(double xTest, double yTest, SimpleColor ansTest) {
        this.xTest = xTest;
        this.yTest = yTest;
        this.ansTest = ansTest;
    }

    public void isCorrectAnswer(){
        System.out.println(xTest+" "+yTest);
        if(PointColor.getColor(xTest, yTest) == ansTest){
            System.out.println("\t Correct!");
        } else{
            System.out.println("\t False!");
        }
    }
}
