/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacompras;

/**
 *
 * @author CETECOM
 */
public class Carrito {
    private String productos;
    private Double total;

    public Carrito(String productos, Double total) {
        this.productos = productos;
        this.total = total;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}
