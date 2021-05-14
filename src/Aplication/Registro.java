/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Usuario
 */
public class Registro {
    
    private String Direccion;
    private long Telefono;
    private String Alcobas;
    private String Area;
    private double Compra;
    private String Estado;
    private String Transaccion;
    

    public Registro(String Direccion, long Telefono, String Alcobas, String Area, double Compra, String Estado, String Transaccion) {
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Alcobas = Alcobas;
        this.Area = Area;
        this.Compra = Compra;
        this.Estado = Estado;
        this.Transaccion = Transaccion;
    }

    public Registro() {
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getAlcobas() {
        return Alcobas;
    }

    public void setAlcobas(String Alcobas) {
        this.Alcobas = Alcobas;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public double getCompra() {
        return Compra;
    }

    public void setCompra(double Compra) {
        this.Compra = Compra;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstdo(String Estado) {
        this.Estado = Estado;
    }

    public String getTransaccion() {
        return Transaccion;
    }

    public void setTransaccion(String Transaccion) {
        this.Transaccion = Transaccion;
    }

    

    void guardar(PrintWriter Escribe) {
        Escribe.println(Direccion);
        Escribe.println(Telefono);
        Escribe.println(Alcobas);
        Escribe.println(Area);
        Escribe.println(Compra);
        Escribe.println(Estado);
        Escribe.println(Transaccion);
    }

    
    

    public Registro cargar(BufferedReader Almacen) {
        String Dir, Alc, Are, Est,Trans;
        long Tel;
        double Comp;
        
        try {
            Dir   = Almacen.readLine();
            Tel   = Long.parseLong(Almacen.readLine());
            Alc   = Almacen.readLine();
            Are   = Almacen.readLine();
            Comp  = Double.parseDouble(Almacen.readLine());
            Est   = Almacen.readLine();
            Trans = Almacen.readLine();
            return new Registro (Dir,Tel,Alc,Are,Comp,Est,Trans);
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    
}
