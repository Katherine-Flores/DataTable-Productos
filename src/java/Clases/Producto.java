/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author kathe
 */
public class Producto {
    /*-------------------------------------- ATRIBUTOS DE CLASE -------------------------------------*/
    
    private int codigo;
    private String nombre;
    private double precio;
    private int existencia;
    private int marca;
    private int categoria;
    
    /*----------------------------------- CONSTRUCTOR POR DEFECTO -----------------------------------*/
    
    public Producto(){
    }
    
    /*---------------------------------- CONSTRUCTOR PERSONALIZADO ----------------------------------*/
    
    public Producto(int codigo, String nombre, double precio, int existencia, int marca, int categoria){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.marca = marca;
        this.categoria = categoria;
    }

    /*-------------------------------------- METODOS GET Y SET --------------------------------------*/
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
}
