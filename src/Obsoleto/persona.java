
package Obsoleto;

import java.io.BufferedReader;
import java.io.PrintWriter;


public class persona {
    
    private String Direccion;
    private long    Telefono;
    private String TotalAlcobas;
    private String AreaTotal;
    private String Estado;
    private String Type;
    private double    ValorVenta;
    private double ValorCompra;
    private double  ValorArriendo;
    
    public persona(){}

    public persona(String Direccion, long Telefono, String TotalAlcobas, String AreaTotal, String Estado, String Type, double ValorVenta, double ValorCompra, double ValorArriendo) {
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.TotalAlcobas = TotalAlcobas;
        this.AreaTotal = AreaTotal;
        this.Estado = Estado;
        this.Type = Type;
        this.ValorVenta = ValorVenta;
        this.ValorCompra = ValorCompra;
        this.ValorArriendo = ValorArriendo;
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

    public String getTotalAlcobas() {
        return TotalAlcobas;
    }

    public void setTotalAlcobas(String TotalAlcobas) {
        this.TotalAlcobas = TotalAlcobas;
    }

    public String getAreaTotal() {
        return AreaTotal;
    }

    public void setAreaTotal(String AreaTotal) {
        this.AreaTotal = AreaTotal;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getValorVenta() {
        return ValorVenta;
    }

    public void setValorVenta(double ValorVenta) {
        this.ValorVenta = ValorVenta;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public double getValorArriendo() {
        return ValorArriendo;
    }

    public void setValorArriendo(double ValorArriendo) {
        this.ValorArriendo = ValorArriendo;
    }
   
    

    

    void guardar(PrintWriter Escribe) {
        Escribe.println(Direccion);
        Escribe.println(Telefono);
        Escribe.println(TotalAlcobas);
        Escribe.println(AreaTotal);
        Escribe.println(Estado);
        Escribe.println(Type);
        Escribe.println(ValorVenta);
        Escribe.println(ValorCompra);
        Escribe.println(ValorArriendo);
        
    }

    public persona cargar(BufferedReader Almacen) {
        String Dir,TAlc, AreaT, Est, Type ;
        long Tel;
        double Vent,Arri,Comp;
        
        try {
            Dir   = Almacen.readLine();
            Tel   = Long.parseLong(Almacen.readLine());
            TAlc  = Almacen.readLine();
            AreaT = Almacen.readLine();
            Est   = Almacen.readLine();
            Type  = Almacen.readLine();
            Vent  = Double.parseDouble(Almacen.readLine());
            Arri  = Double.parseDouble(Almacen.readLine());
            Comp  = Double.parseDouble(Almacen.readLine());
            return new persona (Dir,Tel,TAlc,AreaT,Est,Type,Vent,Arri,Comp);    
        } catch (Exception e){
            return null;
        }
    }

    

    
    
    
}
