package PraticasHerancaInterfacePolimorfismo.IdentificandoEstudantes;

public class MainEstudante {
    static void main(String[] args) {

        Aluno aluno1 = new Aluno("Fernanda ", "regular");
        Aluno aluno2 = new Bolsista("Lucas ", "bolsista");

        aluno1.exibeInformacoes();
        aluno2.exibeInformacoes();


    }
}
