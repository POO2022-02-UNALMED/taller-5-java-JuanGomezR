package zooAnimales;
import gestion.*;
import java.util.*;
public class Ave extends Animal{
    private static ArrayList<Ave> listado=new ArrayList<>();
    public static int halcones=0;
    public static int aguilas=0;
    private String colorPlumas;
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPlumas=colorPlumas;
        Ave.listado.add(this);
    }
    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        this.colorPlumas=colorPlumas;
        Ave.listado.add(this);
    }
    public Ave(){
        Ave.listado.add(this);
    }
    public static int cantidadAves(){
        return Ave.listado.size();
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave ave= new Ave(nombre, edad, "montana", genero, "cafe glorioso");
        halcones+=1;
        return ave;
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave ave= new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aguilas+=1;
        return Ave
    }
    public String movimiento(){
        return "volar";
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
}