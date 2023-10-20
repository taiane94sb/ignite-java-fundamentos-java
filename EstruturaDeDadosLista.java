import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDadosLista {
    public static void main(String[] args) {
        
         List<String> nomes = new ArrayList<>();
         System.out.println(nomes);

         nomes.add("Taiane");
         nomes.add("Matheus");
         nomes.add("Sueli");
         nomes.add("José");

         System.out.println(nomes);
         System.out.println(nomes.get(0));
         System.out.println(nomes.get(1));
         System.out.println(nomes.get(2));
         System.out.println(nomes.get(3));

         for(String nome: nomes) {
            System.out.println("O nome é: " + nome);
         }

         nomes.forEach(nome -> System.out.println("O nome é: " + nome));

         nomes.forEach(System.out::println);
    }
}
