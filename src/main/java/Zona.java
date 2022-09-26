package gestion;
import zooAnimales.Animal;
import java.util.*;
public class Zona{
    String nombre;
    public Zoologico zoo;
    ArrayList<Animal> animales=new ArrayList<>();
    Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;
    }
    Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales){
        this.nombre=nombre;
        this.zoo=zoo;
        this.animales=animales;
    }
    Zona(){
    }
    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
    }
    public String getNombre(){
        return this.nombre;
    }
    public Zoologico getZoo(){
        return this.zoo;
    }
    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setZoo(Zoologico zoo){
        this.zoo=zoo;
    }
    public void setAnimales(ArrayList<Animal> animales){
        this.animales=animales;
    }
}