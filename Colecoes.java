import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        
         Map<String, Integer> notas = new HashMap<>();
         System.out.println(notas);

         notas.put("Taiane", 10);
         notas.put("Matheus", 10);
         notas.put("Sueli", 9);
         notas.put("José", 9);

         System.out.println(notas);

         Integer notaTaiane = notas.get("Taiane");
         var notaMatheus = notas.get("Matheus");
         Integer notaSueli = notas.get("Sueli");
         var notaJose = notas.get("José");

         System.out.println(notaTaiane);
         System.out.println(notaMatheus);
         System.out.println(notaSueli);
         System.out.println(notaJose);

         for(Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é: " + key);
            System.out.println("O valor é: " + value);
         }
    }
}
