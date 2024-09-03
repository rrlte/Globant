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
    
    BigDecimal efectivo = new BigDecimal("0");
    BigDecimal BTC = new BigDecimal("0");
    BigDecimal ETH = new BigDecimal("0");
    
    public void depositoDeDinero(BigDecimal valor){
        efectivo = efectivo.add(valor);
    }
    
    public void depositoDeBTC(BigDecimal valor){
        BTC = BTC.add(valor);
    }
    
    public void depositoDeETH(BigDecimal valor){
        ETH = ETH.add(valor);
    }
    
    public void restarDinero(BigDecimal cantidad) {
        if (cantidad.compareTo(efectivo) <= 0) {
            efectivo = efectivo.subtract(cantidad);
        } else {
            throw new IllegalArgumentException("Fondos insuficientes en efectivo.");
        }
    }
    
    public void restarBitcoin(BigDecimal cantidad) {
        if (cantidad.compareTo(BTC) <= 0) {
            BTC = BTC.subtract(cantidad);
        } else {
            throw new IllegalArgumentException("Fondos insuficientes en Bitcoin.");
        }
    }
    
    public void restarEthereum(BigDecimal cantidad) {
        if (cantidad.compareTo(ETH) <= 0) {
            ETH = ETH.subtract(cantidad);
        } else {
            throw new IllegalArgumentException("Fondos insuficientes en Ethereum.");
        }
    }
    
    public void mostrarActivos() {
        System.out.println("Efectivo: $" + efectivo);
        System.out.println("BTC: " + BTC.toPlainString() + " BTC");
        System.out.println("ETH: " + ETH.toPlainString() + " ETH");
    }

    public BigDecimal getEfectivo() {
        return efectivo;
    }
    
    public void dineroActual(){     
        System.out.println("Este es tu dinero en efectivo actual: $" + efectivo);
    }
    
}
