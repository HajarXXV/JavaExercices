package exercice2;

import java.util.Scanner;

public class Main {

    public static boolean verifierTexte(String s, Verificateur v) { return v.tester(s); }

    public static void main(String[] args) {
        Verificateur vide = s -> s.isEmpty();
        Verificateur longueur = s -> s.length() > 5;
        Verificateur containA = s -> s.contains("a");
        Verificateur startsWithB =  s -> s.toLowerCase().startsWith("b");

        Scanner input = new Scanner(System.in);
        System.out.println("Entrer une chaine de caractére: ");
        String chaine =  input.nextLine();

        if(verifierTexte(chaine, vide)) System.out.println("la chaine est vide.");
        if(verifierTexte(chaine, longueur)) System.out.println("la longueur du chaine est supérieur a 5.");
        if(verifierTexte(chaine, containA)) System.out.println("la chaine contient 'a'.");
        if(verifierTexte(chaine, startsWithB)) System.out.println("la chaine commence par b.");
    }
}