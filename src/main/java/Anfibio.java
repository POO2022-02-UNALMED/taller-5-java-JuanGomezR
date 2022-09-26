package zooAnimales;
import gestion.*;
import java.util.*;
public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado=new ArrayList<>();
    public static int salamandras=0;
    public static int ranas=0;
    private String colorPiel;
    private boolean venenoso;
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        Anfibio.listado.add(this);
    }
    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        Anfibio.listado.add(this);
    }
    public Anfibio(){
        Anfibio.listado.add(this);
    }
    public static int cantidadAnfibios(){
        return Anfibio.listado.size();
    }
    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio anfibio= new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas+=1;
        return anfibio;
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio anfibio= new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras+=1;
        return anfibio;
    }
    public String movimiento(){
        return "saltar";
    }
    public String getColorPiel(){
        return this.colorPiel;
    }
    public boolean isVenenoso(){
        return this.venenoso;
    }
}