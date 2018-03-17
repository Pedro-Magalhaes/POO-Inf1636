public class Vetor {
    // variaveis
    private double x;
    private double y;

    public Vetor() {
        x = 0.0;
        y = 0.0;
    }
    public Vetor(double _x) {
        x = _x;
        y = 0.0;
    }
    public Vetor(double _x, double _y) {
        x = _x;
        y = _y;
    }
    {
        exibe();
    }
    public void soma(Vetor v) {
        x += v.x;
        y += v.y;
    }
    public void exibe() {
        System.out.println("X: "+ x +" Y: " + y);
    }

}
