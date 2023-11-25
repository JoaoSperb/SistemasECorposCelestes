public abstract class CorposCelestes {
    private String nome;
    private double massa;
    private double diametro;
    private String composicao;

    public CorposCelestes(String nome,double massa,double diametro,String composicao){
        this.nome= nome ;
        this.massa = massa;
        this.diametro = diametro;
        this.composicao = composicao;
    }

    public String getNome() {
        return nome;
    }

    public double getMassa() {
        return massa;
    }

    public double getDiametro() {
        return diametro;
    }

}
