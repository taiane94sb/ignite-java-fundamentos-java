import java.util.HashSet;
import java.util.Set;

public class ColecoesHashSet {
    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();
        System.out.println(numeros);
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros);

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        numeros.remove(1);
        System.out.println(numeros);
        System.out.println(numeros.contains(2));
    }
}
