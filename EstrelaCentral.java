public class EstrelaCentral extends CorposCelestes{
    private double temperatura;
    private TipoDeEstrela tipo; //

    public EstrelaCentral(String nome,double massa,double diametro,String composicao,double temperatura,TipoDeEstrela tipo){
        super(nome, massa, diametro,composicao);
        this.temperatura = temperatura;
        this.tipo = tipo;
    }


}
