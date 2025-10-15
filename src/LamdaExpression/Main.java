package LamdaExpression;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    static void main() {
//        Exercice1
//       Function<String, Integer> longueur = s -> s.length();
//       String chaine = "JavaLambda";
//        System.out.println("La longueur du chaine est " + longueur.apply(chaine));

//        Exercice2
        List<String> noms = Arrays.asList("Khadija", "Hiba", "Mohammed");
        Consumer<String> afficher = nom -> System.out.println(nom);
//        for(String nom : noms) {
//            afficher.accept(nom);
//        }
        noms.forEach(afficher);
    }
}

