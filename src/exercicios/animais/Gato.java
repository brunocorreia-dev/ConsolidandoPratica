package exercicios.animais;

public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (gato de pelo " + corPelo + ") diz: Miau!");
    }

    public void arranharMoveis() {
        System.out.println(getNome() + " começou a arranhar o sofá de novo!");
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

