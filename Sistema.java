import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sistema {
    private String nome;
    private ArrayList<Planeta> planetas;
    private ArrayList<Estrela> estrelas;

    public Sistema(String nome){
        this.nome = nome;
        planetas = new ArrayList<>();
        estrelas = new ArrayList<>();
    }

    public void addPlaneta(Planeta planeta){
        planetas.add(planeta);
    }

    public void addEstrela(Estrela estrela){
        estrelas.add(estrela);
    }



}
