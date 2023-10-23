public class ExcecoesChecked {

    // public static void main(String[] args) throws Exception {
    //     // checked exceptions
    //     // unchecked exceptions
    //     int numero = 10;
    //     if (numero < 100) {
    //         throw new Exception("O número é menor que 100");
    //     }
    // }

    // public static void main(String[] args) throws Exception {
    //     validarNumero();
    // }

    public static void main(String[] args) {
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("Deu erro...");
            e.printStackTrace();
        }
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
