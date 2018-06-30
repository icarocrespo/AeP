package atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
// Método bolha com ArrayList
    Scanner x = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList();
    int op;
    Integer q = null;
    
    lista.add(81);
    lista.add(18);
    lista.add(36);
    lista.add(54);
    lista.add(9);
    lista.add(72);
    lista.add(27);
    lista.add(45);
    lista.add(63);
    lista.add(90);
    
        System.out.print("Lista = {");
        for (int i = 0; i < 10; i++) {
            System.out.print(lista.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println("Para ordenar a lista acima, digite:\n 1 - Crescente.\n 2 - Decrescente.");
        op = x.nextInt();

        switch (op) {
            case 1: {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (lista.get(i) < lista.get(j)) {
                            q = lista.get(i);
                            lista.set(i, lista.get(j));
                            lista.set(j, q);
                        }
                    }
                }
                break;
            }
            case 2: {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (lista.get(i) > lista.get(j)) {
                            q = lista.get(i);
                            lista.set(i, lista.get(j));
                            lista.set(j, q);
                        }
                    }
                }
                break;
            }
            default: {
                System.out.println("Opção inválida.");
                break;
            }
        }
        System.out.println("Seu vetor ficou da seguinte maneira:");
        System.out.print("Lista = {");
        for (int i = 0; i < 10; i++) {
            System.out.print(lista.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

// Método bolha com vetor

//Scanner x = new Scanner(System.in);
//        int vetor[] = {81, 18, 36, 54, 9, 72, 27, 45, 63, 90};
//        int op, q;
//
//        System.out.print("Vetor = {");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(vetor[i]);
//            if (i < 9) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("}");
//        System.out.println("Para ordenar o vetor acima, digite:\n 1 - Crescente.\n 2 - Decrescente.");
//        op = x.nextInt();
//
//        switch (op) {
//            case 1: {
//                for (int i = 0; i < 10; i++) {
//                    for (int j = 0; j < 10; j++) {
//                        if (vetor[i] < vetor[j]) {
//                            q = vetor[i];
//                            vetor[i] = vetor[j];
//                            vetor[j] = q;
//                        }
//                    }
//                }
//                break;
//            }
//            case 2: {
//                for (int i = 0; i < 10; i++) {
//                    for (int j = 0; j < 10; j++) {
//                        if (vetor[i] > vetor[j]) {
//                            q = vetor[i];
//                            vetor[i] = vetor[j];
//                            vetor[j] = q;
//                        }
//                    }
//                }
//                break;
//            }
//            default: {
//                System.out.println("Opção inválida.");
//                break;
//            }
//        }
//        System.out.println("Seu vetor ficou da seguinte maneira:");
//        System.out.print("Vetor = {");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(vetor[i]);
//            if (i < 9) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("}");