package construtor;

public class Construtor {

    private int numero;
    
    public Construtor(int numero) {
        System.out.println("construtor com 1 parâmetro");
        this.numero = numero;
    }
    
    public Construtor(int numero, String texto) {
        System.out.println("construtor com 2 parâmetros");
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}


