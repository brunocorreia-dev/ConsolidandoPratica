package PraticasHerancaInterfacePolimorfismo.IdentificandoEstudantes;

public class Aluno {
    private String nome;
    private String tipoAluno;

    public Aluno(String nome, String tipoAluno) {
        this.nome = nome;
        this.tipoAluno = tipoAluno;
    }

    void exibeInformacoes (){
        System.out.printf("Nome: %s Tipo Aluno: %s \n", nome, tipoAluno);

    }
}
