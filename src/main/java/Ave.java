package zooAnimales;
import gestion.*;
import java.util.*;
public class Ave extends Animal{
    private static ArrayList<Ave> listado=new ArrayList<>();
    public static int halcones=0;
    public static int aguilas=0;
    private String colorPlumas;
    Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPlumas=colorPlumas;
        Ave.listado.append(this);
    }
    Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.Zona=zona;
        this.colorPlumas=colorPlumas;
        Ave.listado.append(this);
    }
    Ave(){
        Ave.listado.append(this);
    }
    public int cantidadAves(){
        return Ave.listado.size();
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