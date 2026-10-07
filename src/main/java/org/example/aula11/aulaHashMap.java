package org.example.aula11;

import java.util.HashMap;

public class aulaHashMap {
    public static void main(String[] args) {
        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */
        // Dicionário do Java!
        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane", "ane@gmail.com");
        emails.put("Paloma", "paloma@gmail.com");

        System.out.println(emails.get("Ane"));
        System.out.println(emails.get("olá"));
        System.out.println(emails.getOrDefault("olá,", "posição inválida."));
        System.out.println(emails.keySet());
        System.out.println(emails.values());
        System.out.println(emails.containsKey("Paloma"));

    }
}
