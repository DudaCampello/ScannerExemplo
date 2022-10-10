package com.youtube;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String str;

        System.out.println("Entre com seu nome: ");
        str = texto.nextLine();
        System.out.println("Bem-vindo(a) " + str);

        System.out.println("Digite um nr: ");
        int numero = texto.nextInt();
        System.out.println("O nr digitado foi: " + numero);

        texto.close();
    }
}