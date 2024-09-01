/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic.Classes;

import java.math.BigDecimal;

/**
 *
 * @author ARIAN
 */
public class DigitalWallet {
    
    double efectivo = 0;
    BigDecimal BTC = new BigDecimal("0");
    BigDecimal ETH = new BigDecimal("0");
    
    public void depositoDeDinero(int valor){
        efectivo = efectivo + valor;
    }
    
    public void mostrarActivos() {
        System.out.println("Efectivo: $" + efectivo);
        System.out.println("BTC: " + BTC.toPlainString() + " BTC");
        System.out.println("ETH: " + ETH.toPlainString() + " ETH");
    }
    
    public void dineroActual(){     
        System.out.println("Este es tu dinero en efectivo actual: $" + efectivo);
    }
    
    // Crear una funcion que muestre todas tus criptos
    
}
