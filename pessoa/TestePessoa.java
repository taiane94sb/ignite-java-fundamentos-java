package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("12345678912");
        pessoa1.setNome("Taiane");
        pessoa1.setIdade(29);

        System.out.println(pessoa1);
        System.out.println(pessoa1.getCpf());
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("78945612378");
        pessoa2.setNome("Matheus");
        pessoa2.setIdade(25);

        System.out.println(pessoa2);
        System.out.println(pessoa2.getCpf());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.imprimirDadosDaPessoa());

        Professor professor1 = new Professor();
        professor1.setNome("Ana Maria");
        professor1.setIdade(30);
        professor1.setCpf("11111111111");
        professor1.setSalario(6000);
        System.out.println(professor1.imprimirDadosDaPessoa());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ana Clara");
        aluno1.setIdade(1530);
        aluno1.setCpf("22222222222");
        aluno1.setMatricula("123456123456");
        System.out.println(aluno1.imprimirDadosDaPessoa());
    }
}
