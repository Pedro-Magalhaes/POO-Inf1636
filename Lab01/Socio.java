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

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Setters
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * @param dtNasc the dtNasc to set
     */
    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    // Getters
    /**
     * @return the matricula
     */
    public String getMatric() {
        String digito = Integer.toString(matricula % 10);
        return Integer.toString(matricula / 10) + "-" + digito;
    }
    /**
     * @return the dtNasc
     */
    public String getDtNasc() {
        return dtNasc;
    }
    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    
}