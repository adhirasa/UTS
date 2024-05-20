/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;

import java.util.Scanner;

/**
 *
 * @author A-16
 */
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh Adhi Rasa Permana Jayaningrat, NIM 23201122");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMasukkan nama Anda: ");
        String nama = scanner.nextLine();

        int jenisKelamin = 0;
        while (jenisKelamin != 1 && jenisKelamin != 2) {
            System.out.println("\nPilih jenis kelamin:");
            System.out.println("1. Laki-laki");
            System.out.println("2. Perempuan");
            System.out.println("Pilihan Anda (1/2): ");
            jenisKelamin = scanner.nextInt();
            scanner.nextLine();

            if (jenisKelamin != 1 && jenisKelamin != 2) {
                System.out.println("Pilihan tidak valid!. \nHarap masukkan 1 atau 2.");
            }
        }
        
        String panggilan = "";
        if (jenisKelamin == 1) 
        {
            panggilan = "Mas";
        } 
        else if (jenisKelamin == 2)
        {
            panggilan = "Mbak";
        }
        
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Selamat Datang " + panggilan + " " + nama);
        System.out.println("Kalkulator");

        while (true) {

            System.out.println("Masukkan bilangan 1: ");
            double bilangan1 = scanner.nextDouble();

            System.out.println("Masukkan bilangan 2: ");
            double bilangan2 = scanner.nextDouble();

            System.out.println("Pilih operator (+, -, *, /): ");
            String operator = scanner.next();
            
            System.out.println(bilangan1 + " " + operator + " " + bilangan2);

            double hasil;
            switch (operator) {
                case "+":
                    hasil = bilangan1 + bilangan2;
                    break;
                case "-":
                    hasil = bilangan1 - bilangan2;
                    break;
                case "*":
                    hasil = bilangan1 * bilangan2;
                    break;
                case "/":
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Pembagian dengan nol tidak diizinkan.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                    continue;
            }

            System.out.println("Hasil: " + hasil);
            System.out.println("Ingin melanjutkan? (y/n): ");
            String lanjut = scanner.next();
            if (!lanjut.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
