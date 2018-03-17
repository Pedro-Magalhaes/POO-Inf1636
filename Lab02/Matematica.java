public class Matematica {

    public static double Pi (int n) {
        double somatorio = 0;
        int sinal = 1;
        for (int i = 1; i <= n; i++) {
            somatorio += 1.0/ (i*2-1) * sinal;
            sinal *= -1;
        }
        return 4*somatorio;
    }

}
