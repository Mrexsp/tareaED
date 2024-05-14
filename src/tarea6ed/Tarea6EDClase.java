/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author Mrex
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     
    double total;
    if(numProductos>MINPRODUCTOS)
        precioProducto-=5;
            if (numProductos!=0){
            total = precioProducto*0.8;
            printTotal(total);
        }else {
            total = precioProducto*0.95;
            printTotal(total);
        }   

    }
    private static final int MINPRODUCTOS = 3;

    private void printTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}