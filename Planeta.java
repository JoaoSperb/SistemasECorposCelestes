import java.util.ArrayList;

public class Planeta extends CorposCelestes{
    private ArrayList<Lua> luas;
    private double distanciaDoSol; // em milhoes de km
    private double rotacaoNoEixo; // em dias
    private double rotacaoNoSol; //em dias


    public Planeta(String nome,double massa,double diametro,String composicao,double rotacaoNoEixo,double rotacaoNoSol){
        super(nome, massa, diametro,composicao);
        this.rotacaoNoEixo = rotacaoNoEixo;
        this.rotacaoNoSol = rotacaoNoSol;
        luas = new ArrayList<>();
    }

    public void addLua(Lua l){
        luas.add(l);
    }
    public ArrayList<Lua> getLuas(){
        return luas;
    }
}
