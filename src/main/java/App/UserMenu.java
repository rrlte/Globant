/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author ARIAN
 */
import Logic.Classes.BuyOrder;
import Logic.Classes.DigitalWallet;
import Logic.Classes.SaleOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMenu extends UserRegistration{
    
    private static Map<String, SaleOrder> ordenesDeCompra = new HashMap<>();
    
    public static void menuDeInicio(String email){
        DigitalWallet wallet = getWallets().get(getUsers().get(email).getId());
        Scanner sc = new Scanner(System.in);
        int numbselect;
        do{
            System.out.println("""
                               Menu principal de Inicio de Sesion
                               1.Depositar dinero
                               2.Ver el saldo de la billetera
                               3.Comprar Criptomonedas
                               4.Realizar una orden de compra
                               5.Realizar una orden de venta
                               6.Ver historial de transacciones""");
            System.out.println("Nota: Escoge un numero, dependiendo de que actividad deseas realizar");
            
            numbselect = Integer.parseInt(sc.next());
            sc.nextLine();
            
            switch (numbselect){
                case 1 -> {
                    System.out.println("Cuanto dinero quieres depositar");
                    int cantidad = Integer.parseInt(sc.next());          
                    wallet.depositoDeDinero(cantidad);
                    wallet.dineroActual();
                    break;
                }
                case 2 -> {
                    wallet.mostrarActivos();
                    break;
                }
                
                case 3 -> {
                    System.out.println("Ingrese el tipo de Criptomoneda que desea comprar");
                    String criptomoneda = sc.next();
                    System.out.println("Que cantidad desea comprar");
                    String cantidad = sc.next();
                    break;
                }
                
                case 4 -> {
                    System.out.println("Ingrese el tipo de Criptomoneda que desea comprar");
                    String criptomoneda = sc.next();
                    System.out.println("Ingrese la cantidad que desea comprar");
                    String cantidad = sc.next();
                    System.out.println("Ingrese el precio maximo que esta dispuesto a pagar");
                    String precioMax = sc.next();
                    SaleOrder ordenDeCompra = new SaleOrder(criptomoneda, cantidad, precioMax);
                    break;
                }
                
                case 5 -> {
                    System.out.println("Ingrese el tipo de Criptomoneda que desea comprar");
                    String criptomoneda = sc.next();
                    System.out.println("Ingrese la cantidad que desea vender");
                    String cantidad = sc.next();
                    System.out.println("Ingrese el precio minimo que esta dispuesto a pagar");
                    String precioMin = sc.next();
                    BuyOrder ordenDeVenta = new BuyOrder(criptomoneda, cantidad, precioMin);
                    break;
                }
                
                default -> {
                    System.out.println("Escogio una opcion incorrecta, intentelo de nuevo");
                }
            }
            
        } while(numbselect != 10);
    }  
}