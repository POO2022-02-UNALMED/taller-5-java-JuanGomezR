package zooAnimales;
import gestion.*;
public class Ave extends Animal{
    private static Ave[] listado;
    public static int halcones=0;
    public static int aguilas=0;
    private String colorPlumas;
    Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }
    Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.Zona=zona;
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }
    Ave(){
        listado.add(this);
    }
    public static int cantidadAves(){
        return listado.size();
    }
    public void crearHalcon(String nombre, int edad, String genero){
        Ave(nombre, edad, "montana", genero, "cafe glorioso");
        halcones+=1;
    }
    public void crearAguila(String nombre, int edad, String genero){
        Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aguilas+=1;
    }
    public String movimiento(){
        return "volar";
    }
}