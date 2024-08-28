package Principal;

import Logic.Classes.User;
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
        int numbselect;
        do{
            System.out.println("Menu principal\n 1.Registrarse");
            System.out.println("Nota: Escoge un numero, dependiendo de que actividad deseas realizar: ");
            
            numbselect = Integer.parseInt(sc.next());
            sc.nextLine();
            
            switch (numbselect){
                case 1 -> {
                    System.out.println("Ingresa tu nombre:");
                    String name = sc.next();
                    System.out.println("Ingresa tu correo electronico:");
                    String email = sc.next();
                    System.out.println("Ingresa una contrasenia segura:");
                    String password = sc.next();
                    User user = new User(name,email,password);
                    System.out.println("Este es tu ID de usuario: " + user.retornaId());
                    System.out.println("Acabas de registrarte correctamente");
                    System.out.println("Estas listo para iniciar sesion");
                    break;
                }
            }
            
        } while(numbselect != 4); 
        sc.close(); 
    }
}