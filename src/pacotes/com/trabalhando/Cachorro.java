package pacotes.com.trabalhando;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro (String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (o " + raca + ") diz: Au Au!");
    }

    public void abanarRabo() {
        System.out.println(getNome() + " está abanando o rabo alegremente.");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
