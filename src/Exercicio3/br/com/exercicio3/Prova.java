package Exercicio3.br.com.exercicio3;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer conjuntoDeInteiro : conjuntoDeInteiros) {
            soma += conjuntoDeInteiro;
        }
        System.out.println(soma);
        }
}

