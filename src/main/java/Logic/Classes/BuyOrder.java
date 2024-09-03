/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARIAN
 */
public class BuyOrder {
    
    String criptomoneda;
    double cantidad;
    double precioMax;
    public static List<BuyOrder> ordenesDeCompra = new ArrayList<>();

    public BuyOrder(String criptomoneda, double cantidad, double precioMax) {
        this.criptomoneda = criptomoneda;
        this.cantidad = cantidad;
        this.precioMax = precioMax;
        ordenesDeCompra.add(this);
    } 

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecioMax() {
        return precioMax;
    }

    public String getCriptomoneda() {
        return criptomoneda;
    }

    public static List<BuyOrder> getOrdenesDeCompra() {
        return ordenesDeCompra;
    }

}
