package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        char grade = 'F';
        switch (grade) {

            case 'A':
                System.out.println("Mükemmel: Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel: Geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Ortalama ile.Geçtiniz");
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");


        }
    }
}