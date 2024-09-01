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
public class CriptoActivo implements CriptoSymbol {
    
    int Bitcoin = 58544;
    int Ethereum = 2488;
    BigDecimal BTC = new BigDecimal("120");
    BigDecimal ETH = new BigDecimal("600");

    
    
    @Override
    public String simbolo() {
        return "simbolo";
    }
    
    // Encontrar una forma de representar cada cripto con un abreviado
    
    // Crear un identificador unico para cada cripto
    
    //La memoria de reconocer el valor de cada cripto en todo momento
    
    
}
