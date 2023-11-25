import java.util.ArrayList;

public class Planeta extends CorposCelestes{
    private ArrayList<Lua> luas;
    private double distanciaDoSol; // em milhoes de km
    private double rotacaoNoEixo; // em dias
    private double rotacaoNoSol; //em dias

    public Planeta(String nome,double massa,double raio,String composicao,double gravidade){
        super(nome, massa, raio,composicao,gravidade);
    }

    public Planeta(String nome,double massa,double raio,String composicao,double gravidade,double rotacaoNoEixo,double rotacaoNoSol){
        super(nome, massa, raio,composicao,gravidade);
        this.rotacaoNoEixo = rotacaoNoEixo;
        this.rotacaoNoSol = rotacaoNoSol;
        luas = new ArrayList<>();
    }

    public void addLua(Lua l){
        luas.add(l);
    }
    //public ArrayList<Lua> getLuas(){
        //    return luas;
        //}
    // implementar corretamente essa classe.


    @Override
    public String toString() {
        return "Planeta " + super.toString() + ", ele fica a "+ distanciaDoSol
                + " quilometros da sua estrela, leva " + rotacaoNoEixo + " horas para completar" +
                " uma volta no seu eixo e " + rotacaoNoSol + " dias terrestres para dar uma volta completa ao redor da sua estrela.";
    }
}
