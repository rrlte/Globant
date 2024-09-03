package Principal;

import App.UserAuthentication;
import App.UserRegistration;
import Logic.Classes.DigitalWallet;
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
            System.out.println("""
                               Menu Principal:
                               1.Registrarse
                               2.Iniciar sesion
                               3.Salir""");
            System.out.println("Nota: Escoge un numero, dependiendo de que actividad deseas realizar");
            
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
                    DigitalWallet wallet = new DigitalWallet();
                    System.out.println(UserRegistration.userRegister(user, wallet));
                    break;
                }
                case 2 -> {
                    System.out.println("Ingresa tu email:");
                    String email = sc.next();
                    System.out.println("Ingresa su contrasenia:");
                    String password = sc.next();
                    UserAuthentication.verificar(email, password);
                    break;
                }
                
                case 3 ->{
                    System.out.println("Muchas gracias por usar mi aplicacion");
                }
                
                default -> {
                    System.out.println("Escogio una opcion incorrecta, intentelo de nuevo");
                }
            }
            
        } while(numbselect != 3); 
        sc.close(); 
    }
}