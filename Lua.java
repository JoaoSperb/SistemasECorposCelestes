public class Lua extends CorposCelestes{
    private Planeta planeta;
    private double rotacaoNoPlaneta; //em dias


    public Lua(String nome,double massa,double diametro,String composicao,Planeta p,double rotacaoNoPlaneta){
        super(nome, massa, diametro,composicao);
        this.planeta = p;
        this.rotacaoNoPlaneta = rotacaoNoPlaneta;
    }
}
