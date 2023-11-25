public class Estrela extends CorposCelestes{
    private double temperatura;
    private TipoDeEstrela tipo; //

    public Estrela(String nome,double massa,double raio,String composicao,double gravidade){
        super(nome, massa, raio,composicao,gravidade);
    }
    public Estrela(String nome,double massa,double raio,String composicao,double gravidade,double temperatura,TipoDeEstrela tipo){
        super(nome, massa, raio,composicao,gravidade);
        this.temperatura = temperatura;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Estrela: "+ super.toString()+
                "sua temperatura é de " + temperatura +
                " graus celsius e seu tipo estelar é " + tipo.getNome();
    }
}
