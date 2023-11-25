public class App {
    public static void main(String[] args) {
        Estrela estrela1 = new Estrela("Sol",1.98*(Math.pow(10,30)),70000,"Hidrogênio e hélio",
                254,5500,TipoDeEstrela.ANÃ_AMARELA);
        Planeta planeta1 = new Planeta("Terra",6*(Math.pow(10,24)),6371,"Rochas e metais",
                9.8,24,365);
        Lua lua1 = new Lua("Lua",7.34*(Math.pow(10,22)),1737,"Rochas e metais",1.60,
                planeta1,28);


        System.out.println(estrela1.toString());

        System.out.println(planeta1.toString());

        System.out.println(lua1.toString());
    }
}
