package zooAnimales;
import gestion.*;
import java.util.*;
public class Pez extends Animal{
    private static ArrayList<Pez> listado=new ArrayList<>();
    public static int salmones=0;
    public static int bacalaos=0;
    private String colorEscamas;
    private int cantidadAletas;
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        Pez.listado.add(this);
    }
    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        Pez.listado.add(this);
    }
    public Pez(){
        Pez.listado.add(this);
    }
    public static int cantidadPeces(){
        return Pez.listado.size();
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez pez= new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones+=1;
        return pez;
    }
    public static void crearBacalao(String nombre, int edad, String genero){
        Pez pez= new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos+=1;
        return pez;
    }
    public String movimiento(){
        return "nadar";
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
}