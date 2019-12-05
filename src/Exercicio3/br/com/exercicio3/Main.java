package Exercicio3.br.com.exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> provas = new HashSet<>();

        provas.add(14);
        provas.add(5);
        provas.add(9);
        provas.add(7);
        provas.add(10);

        Prova prova = new Prova();
        prova.somaTotal(provas);


    }
}
