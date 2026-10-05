package org.example.aulaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaArrayList {
    public static void main(String[] args) {
        /*
        .add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .adAll(List.of());
        */

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.addAll(List.of(1, 2, 35, 6, 765, 234, 9));

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.get(2));

        lista.set(0,98);
        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.contains(3));
        System.out.println(lista.indexOf(98));
        System.out.println(lista.isEmpty());
    }
}
