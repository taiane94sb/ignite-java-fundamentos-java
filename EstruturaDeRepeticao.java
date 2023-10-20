public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        
         int dadoDoTipoInt = 10;
         double dadoDoTipoDouble = 3.14;
         float dadoDoTipoFloat = 3.14f;
         long dadoDoTipoLong = 123456789L;
         String dadoDoTipoString = "Taiane";
         boolean dadoDoTipoBoolean = true;
         
        if(dadoDoTipoInt == 10) {
            System.out.println("Entrou no if...");
        } else if(dadoDoTipoInt == 11) {
            System.out.println("Entrou no else if...");
        } else {
            System.out.println("Entrou no else...");
        }

        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("Valor inicial é menor que 3.");
            valorInicial ++;
        }
        System.out.println("Saiu do while...");

        for(int i = 0; i < 4; i++) {
            System.out.println("O valor de i é: " + i);
        }
    }
}
