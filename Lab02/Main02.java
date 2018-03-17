public class Main02 {
    public static void main(String[] args) {
        Xpto a[] = new Xpto[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Xpto();
            System.out.println("quantidade de objetos criados: " + a[i].getQtdInst());
        }

        System.out.println(Matematica.Pi(150));
    }
}
