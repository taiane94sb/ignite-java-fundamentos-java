import pessoa.Pessoa;

public class ExcecoesUnchecked {

    public static void main(String[] args) {
        Pessoa p = null;
        p.getCpf(); // java.lang.NullPointerException
    }
}
