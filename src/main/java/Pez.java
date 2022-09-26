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
    public void crearSalmon(String nombre, int edad, String genero){
        new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones+=1;
    }
    public void crearBacalao(String nombre, int edad, String genero){
        new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos+=1;
    }
    public String movimiento(){
        return "nadar";
    }
}