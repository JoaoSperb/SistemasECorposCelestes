public abstract class CorposCelestes {
    private String nome;
    private double massa;
    private double raio;
    private String composicao;
    private double gravidade; //em m/s2

    public CorposCelestes(String nome,double massa,double raio,String composicao,double gravidade){
        this.nome= nome ;
        this.massa = massa;
        this.raio = raio;
        this.composicao = composicao;
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    public double getMassa() {
        return massa;
    }

    public double getRaio() {
        return raio;
    }

    public String getComposicao() {
        return composicao;
    }

    public double getGravidade() {
        return gravidade;
    }

    @Override
    public String toString() {
        return   nome +
                ", tem " + massa +
                " quilogramas de massa," + raio +
                " quilometros de raio, é composto principalmente por " + composicao +
                ", sua gravidade é de " + gravidade + " metros por segundo, ";
    }
}
