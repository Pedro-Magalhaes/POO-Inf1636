/**
 * EX0203
 */
public class Socio {
    private String nome;
    private String endereco;
    private String dtNasc;
    private int matricula;
    
    // construtor
    public Socio(int x) {
        matricula = x;
    }
    
    public String getMatric() {
        String digito = Integer.toString(matricula % 10);
        return Integer.toString(matricula / 10) + "-" + digito;
    }
    
}