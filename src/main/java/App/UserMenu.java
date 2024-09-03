/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author ARIAN
 */
import Logic.Classes.CriptoActivos;
import Logic.Classes.DigitalWallet;
import Logic.Classes.Transaction;
import java.math.BigDecimal;
import java.util.Scanner;

public class UserMenu extends UserRegistration{
    
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
                               6.Ver historial de transacciones
                               7.Salir de la cuenta""");
            System.out.println("Nota: Escoge un numero, dependiendo de que actividad deseas realizar");
            
            numbselect = Integer.parseInt(sc.next());
            sc.nextLine();
            
            switch (numbselect){
                case 1 -> {
                    System.out.println("Cuanto dinero quieres depositar");
                    BigDecimal cantidad = new BigDecimal(sc.next());          
                    wallet.depositoDeDinero(cantidad);
                    wallet.dineroActual();
                    break;
                }
                case 2 -> {
                    wallet.mostrarActivos();
                    break;
                }
                
                case 3 -> {
                    System.out.println("Ingrese el tipo de Criptomoneda que desea comprar:");
                    System.out.println("Nota: Escriba 'Bitcoin' o 'Ethereum'");
                    String criptomoneda = sc.next();
                    System.out.println("Que cantidad desea comprar:");
                    String valor = sc.next();
                    BigDecimal cantidad = new BigDecimal(valor);
                    CriptoActivos compra = new CriptoActivos();
                    compra.comprarCripto(criptomoneda, cantidad, wallet.getEfectivo(),wallet);
                    break;
                }
                
                case 4 -> {
                    System.out.println("Ingrese el tipo de Criptomoneda que desea comprar:");
                    System.out.println("Nota: Escriba 'BTC' o 'ETH'");
                    String criptomoneda = sc.next();
                    System.out.println("Ingrese la cantidad que desea comprar:");
                    double cantidad = Double.parseDouble(sc.next());
                    System.out.println("Ingrese el precio maximo que esta dispuesto a pagar:");
                    double precioMax = Double.parseDouble(sc.next());
                    Transaction transaccion = new Transaction();
                    transaccion.ejecutarCompra(criptomoneda, cantidad, precioMax, email);
                    break;
                }
                
                case 5 -> {
                    System.out.println("Ingrese el tipo de Criptomoneda que desea vender:");
                    System.out.println("Nota: Escriba 'BTC' o 'ETH'");
                    String criptomoneda = sc.next();
                    System.out.println("Ingrese la cantidad que desea vender:");
                    double cantidad = Double.parseDouble(sc.next());
                    System.out.println("Ingrese el precio minimo que esta dispuesto a vender:");
                    double precioMin = Double.parseDouble(sc.next());
                    Transaction transaccion = new Transaction();
                    transaccion.ejecutarCompra(criptomoneda, cantidad, precioMin, email);
                    break;
                }
                
                case 6 ->{
                    System.out.println("Vista de todos los recibos");
                    break;
                }
                
                case 7 ->{
                    System.out.println("Vuelva pronto!!!");
                    break;
                }
                
                default -> {
                    System.out.println("Escogio una opcion incorrecta, intentelo de nuevo");
                }
            }
            
        } while(numbselect != 7);
    }  
}