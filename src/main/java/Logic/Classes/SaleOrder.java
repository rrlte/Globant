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
public class SaleOrder extends User {
    
    String criptomoneda;
    double cantidad;
    double precioMin;
    public static List<SaleOrder> ordenesDeVenta = new ArrayList<>();

    public SaleOrder(String criptomoneda, double cantidad, double precioMin, String email) {
        super(email);
        this.criptomoneda = criptomoneda;
        this.cantidad = cantidad;
        this.precioMin = precioMin;
        ordenesDeVenta.add(this);
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecioMin() {
        return precioMin;
    }

    public String getCriptomoneda() {
        return criptomoneda;
    }

}