public class Xpto {
    private static int contInst = 0;
    public Xpto() {
        ++contInst;
    }
    public int getQtdInst() {
        return contInst;
    }
}
