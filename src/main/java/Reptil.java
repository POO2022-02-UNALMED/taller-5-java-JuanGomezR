package zooAnimales;
import gestion.*;
import java.util.*;
public class Reptil extends Animal{
    private static ArrayList<Reptil> listado=new ArrayList<>();
    public static int iguanas=0;
    public static int serpientes=0;
    private String colorEscamas;
    private int largoCola;
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        Reptil.listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        Reptil.listado.add(this);
    }
    public Reptil(){
        Reptil.listado.add(this);
    }
    public static int cantidadReptiles(){
        return Reptil.listado.size();
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil reptil= new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas+=1;
        return reptil;
    }
    public static void crearSerpiente(String nombre, int edad, String genero){
        Reptil reptil= new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes+=1;
        return reptil;
    }
    public String movimiento(){
        return "reptar";
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public int getLargoCola(){
        return this.largoCola;
    }
}