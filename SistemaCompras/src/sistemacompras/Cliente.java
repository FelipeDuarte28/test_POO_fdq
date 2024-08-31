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
public class Cliente {
    private String idCliente, nombre;
    private Carrito carrito;

    public Cliente(String idCliente, String nombre, Carrito carrito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carrito = carrito;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
}
