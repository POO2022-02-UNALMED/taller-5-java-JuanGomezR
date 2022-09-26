package zooAnimales;
import gestion.*;
public class Mamifero extends Animal{
    private static Mamifero[] listado;
    public static int caballos=0;
    public static int leones=0;
    private boolean pelaje;
    private int patas;
    Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.pelaje=pelaje;
        this.patas=patas;
        listado.append(this);
    }
    Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.Zona=zona;
        this.pelaje=pelaje;
        this.patas=patas;
        listado.append(this);
    }
    Mamifero(){
        listado.append(this);
    }
    public int cantidadMamiferos(){
        return listado.lenght();
    }
    public void crearCaballo(String nombre, int edad, String genero){
        Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos+=1;
    }
    public void crearLeon(String nombre, int edad, String genero){
        Mamifero(nombre, edad, "selva", genero, true, 4);
        leones+=1;
    }
}