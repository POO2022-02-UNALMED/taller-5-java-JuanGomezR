package zooAnimales;
import gestion.*;
import java.util.*;
public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado=new ArrayList<>();
    public static int caballos=0;
    public static int leones=0;
    private boolean pelaje;
    private int patas;
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.pelaje=pelaje;
        this.patas=patas;
        Mamifero.listado.add(this);
    }
    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        this.pelaje=pelaje;
        this.patas=patas;
        Mamifero.listado.add(this);
    }
    public Mamifero(){
        Mamifero.listado.add(this);
    }
    public static int cantidadMamiferos(){
        return Mamifero.listado.size();
    }
    public static void crearCaballo(String nombre, int edad, String genero){
        new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos+=1;
    }
    public static void crearLeon(String nombre, int edad, String genero){
        new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones+=1;
    }
    public boolean isPelaje(){
        return this.pelaje;
    }
    public String getPatas(){
        return this.patas;
    }
}