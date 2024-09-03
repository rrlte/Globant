/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic.Classes;

import java.util.List;

/**
 *
 * @author arian
 */
public class VendorsAndBuyers {
    
    private List<Double> cantidades;
    private List<Integer> indices;

    public VendorsAndBuyers(List<Double> cantidades, List<Integer> indices) {
        this.cantidades = cantidades;
        this.indices = indices;
    }

    public List<Double> getCantidades() {
        return cantidades;
    }

    public List<Integer> getIndices() {
        return indices;
    }
    
}
