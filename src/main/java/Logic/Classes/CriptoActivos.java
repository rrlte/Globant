/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic.Classes;

import Logic.Interfaces.CriptoSymbol;
import java.math.BigDecimal;

/**
 *
 * @author ARIAN
 */
public class CriptoActivos implements CriptoSymbol {

    int valorBitcoin = 58544;
    int valorEthereum = 2488;
    BigDecimal BTC = new BigDecimal("120");
    BigDecimal ETH = new BigDecimal("600");

    public void comprarCripto(String cripto, BigDecimal cantidad, BigDecimal efectivo, DigitalWallet wallet) {
        BigDecimal valorDeCompra;
        switch (cripto) {
            case "Bitcoin" -> {
                valorDeCompra = cantidad.multiply(BigDecimal.valueOf(valorBitcoin));
                if (efectivo.compareTo(valorDeCompra) >= 0) {
                    BTC = BTC.subtract(cantidad);
                    wallet.depositoDeBTC(cantidad);
                    wallet.restarDinero(valorDeCompra);
                } else {
                    System.out.println("No tiene los fondos suficientes");
                }
            }
            case "Ethereum" -> {
                valorDeCompra = cantidad.multiply(BigDecimal.valueOf(valorEthereum));
                if (efectivo.compareTo(valorDeCompra) >= 0) {
                    ETH = ETH.subtract(cantidad);
                    wallet.depositoDeBTC(cantidad);
                    wallet.restarDinero(valorDeCompra);
                } else {
                    System.out.println("No tiene los fondos suficientes");
                }
            }
        }
    }

    @Override
    public String simbolo() {
        return "simbolo";
    }

    // Encontrar una forma de representar cada cripto con un abreviado
    // Crear un identificador unico para cada cripto
    //La memoria de reconocer el valor de cada cripto en todo momento
}
