package pessoa;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa() {
        return "O nome da pessoa é: " + nome + ", a sua idade é: " + idade + " e o seu cpf é: " + cpf + ".";
    }
}
