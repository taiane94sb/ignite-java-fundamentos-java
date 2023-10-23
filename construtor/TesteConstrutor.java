package construtor;

public class TesteConstrutor {

    public static void main(String[] args) {
        Construtor construtor1 = new Construtor(1);
        System.out.println(construtor1.getNumero());

        Construtor construtor2 = new Construtor(2, "construtor com texto");
        System.out.println(construtor2.getNumero());
    }
}
