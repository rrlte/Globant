/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic.Classes;

import App.UserRegistration;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARIAN
 */
public class Transaction extends DigitalWallet {

    List<BuyOrder> listaDeOrdenesDeVenta = new ArrayList<>();

    List<SaleOrder> listaDeOrdenesDeCompra = SaleOrder.ordenesDeVenta;

    public void ejecutarCompra(String a, double b, double c, String email) {
        BuyOrder ordenDeVenta = new BuyOrder(a, b, c);
        listaDeOrdenesDeVenta.add(ordenDeVenta);
        CriptoActivos datos = new CriptoActivos();
        List<Double> valores = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        if (a.equals("BTC")) {
            double valorDouble = (double) datos.valorBitcoin;
            if (c >= valorDouble) {
                VendorsAndBuyers idxVendedores = Transaction.encontrarVendedores(listaDeOrdenesDeCompra, b, 0, valores, indices);
                List<Double> cantidades = idxVendedores.getCantidades();
                List<Integer> indicesLista = idxVendedores.getIndices();
                BigDecimal sumaDeCriptos = cantidades.stream()
                                      .map(BigDecimal::valueOf)
                                      .reduce(BigDecimal.ZERO, BigDecimal::add);
                if (cantidades.size()>=1 && indicesLista.size()>=1) {
                    DigitalWallet walletComprador = UserRegistration.getWallets().get(email);
                    walletComprador.depositoDeBTC(sumaDeCriptos);
                    walletComprador.restarDinero(BigDecimal.valueOf(c));
                    for (int i:indicesLista){
                        User userDeVenta = (User)listaDeOrdenesDeCompra.get(i);
                        DigitalWallet walletVendedor = UserRegistration.getWallets().get(userDeVenta.getEmail());
                        walletVendedor.restarBitcoin(userDeVenta.BTC);
                        walletVendedor.depositoDeDinero(BigDecimal.valueOf(((SaleOrder)userDeVenta).getPrecioMin()));
                    }
                    System.out.println("Actividad concretada");
                } else {
                    System.out.println("No hay vendores suficientes para la venta");
                }
            } else {
                System.out.println("Su precio es menor al mercado");
            }
        } else {
            double valorDouble = (double) datos.valorEthereum;
            if (c >= valorDouble) {
                VendorsAndBuyers idxVendedores = Transaction.encontrarVendedores(listaDeOrdenesDeCompra, b, 0, valores, indices);
                List<Double> cantidades = idxVendedores.getCantidades();
                List<Integer> indicesLista = idxVendedores.getIndices();
                BigDecimal sumaDeCriptos = cantidades.stream()
                                      .map(BigDecimal::valueOf)
                                      .reduce(BigDecimal.ZERO, BigDecimal::add);
                if (cantidades.size()>=1 && indicesLista.size()>=1) {
                    DigitalWallet walletComprador = UserRegistration.getWallets().get(email);
                    //sumar cripto
                    walletComprador.depositoDeETH(sumaDeCriptos);
                    //restar dinero
                    walletComprador.restarDinero(BigDecimal.valueOf(c));
                    for (int i:indicesLista){
                        User userDeVenta = (User)listaDeOrdenesDeCompra.get(i);
                        DigitalWallet walletVendedor = UserRegistration.getWallets().get(userDeVenta.getEmail());
                        //restar cripto
                        walletVendedor.restarEthereum(userDeVenta.ETH);
                        //sumar dinero
                        walletVendedor.depositoDeDinero(BigDecimal.valueOf(((SaleOrder)userDeVenta).getPrecioMin()));
                    }
                    System.out.println("Actividad concretada");
                } else {
                    System.out.println("No hay vendores suficientes para la venta");
                }
            } else {
                System.out.println("Su precio es menor al mercado");
            }
        }

    }

    public static VendorsAndBuyers encontrarVendedores(List<SaleOrder> numeros, double objetivo, int indice, List<Double> resultado, List<Integer> indices) {
        if (objetivo == 0) {
            return new VendorsAndBuyers(new ArrayList<>(resultado), new ArrayList<>(indices));
        }

        if (objetivo < 0 || indice >= numeros.size()) {
            return null;
        }

        resultado.add(numeros.get(indice).cantidad);
        indices.add(indice);

        VendorsAndBuyers res = encontrarVendedores(numeros, objetivo - numeros.get(indice).cantidad, indice + 1, resultado, indices);
        if (res != null) {
            return res;
        }

        resultado.remove(resultado.size() - 1);
        indices.remove(indices.size() - 1);

        return encontrarVendedores(numeros, objetivo, indice + 1, resultado, indices);
    }

}