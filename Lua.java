public class Lua extends CorposCelestes{
    private Planeta planeta;
    private double rotacaoNoPlaneta; //em dias


    public Lua(String nome,double massa,double raio,String composicao,double gravidade){
        super(nome, massa, raio,composicao,gravidade);
    }

    public Lua(String nome,double massa,double raio,String composicao,double gravidade,Planeta p,double rotacaoNoPlaneta){
        super(nome, massa, raio,composicao,gravidade);
        this.planeta = p;
        this.rotacaoNoPlaneta = rotacaoNoPlaneta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public void setRotacaoNoPlaneta(double rotacaoNoPlaneta) {
        this.rotacaoNoPlaneta = rotacaoNoPlaneta;
    }

    @Override
    public String toString(){
        return "Lua:"+ super.toString()+ " o planeta a qual " + super.getNome() + " orbita, é " + planeta.getNome() +
                " e ela leva " + rotacaoNoPlaneta + " dias para orbitar seu planeta";
    }
}
