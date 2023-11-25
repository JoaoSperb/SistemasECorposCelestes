public enum TipoDeEstrela {
    ANÃ_VERMELHA("Anã Vermelha"),
    ANÃ_BRANCA("Anã Branca"),
    ANÃ_AMARELA("Anã Amarela"),
    GIGANTE_VERMELHA("Gigante Vermelha"),
    SUPERGIGANTE_VERMELHA("Supergigante Vermelha"),
    ESTRELA_DE_NEUTRON("Estrela de Neutron"),
    GIGANTE_AZUL("Gigante Azul");

    private String nome;

    TipoDeEstrela(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}