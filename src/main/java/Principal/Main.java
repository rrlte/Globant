package Principal;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ARIAN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de intercambio Cripto!!!");
        System.out.println("Empecemos creandote una cuenta");
        System.out.println("Dinos tu nombre:");
        String name = sc.nextLine();
        System.out.println("Dinos tu email:");
        String email = sc.nextLine();
        // Represento la "ñ" con los caracteres "ni"
        System.out.println("Dinos una contrasenia:");
        String password = sc.nextLine();
        System.out.println("Felicidades acabas de registrarte!!!");
        // Aqui abajo va el id personal
        System.out.println("Este es tu nuevo ID personal");
        
        
        sc.close();
    }
}
