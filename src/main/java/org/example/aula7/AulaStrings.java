package org.example.aula7;

public class AulaStrings {
    public static void main(String[] args) {
        String nome = "Ana Beatriz Oliveira";

        System.out.println(nome.length());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.charAt(0));
        System.out.println(nome.equals("ana beatriz oliveira"));
        System.out.println(nome.equalsIgnoreCase("ana beatriz oliveira"));
        System.out.println(nome.contains("Beatriz"));
        System.out.println(nome.substring(1, 4));
        System.out.println(nome.replace("Beatriz","Gabriela"));
        System.out.println("  oi  ".trim());
    }
}
