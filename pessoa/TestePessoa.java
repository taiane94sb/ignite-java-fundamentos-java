package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "12345678912";
        pessoa1.nome = "Taiane";
        pessoa1.idade = 29;

        System.out.println(pessoa1);
        System.out.println(pessoa1.cpf);
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "78945612378";
        pessoa2.nome = "Matheus";
        pessoa2.idade = 25;

        System.out.println(pessoa2);
        System.out.println(pessoa2.cpf);
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}
