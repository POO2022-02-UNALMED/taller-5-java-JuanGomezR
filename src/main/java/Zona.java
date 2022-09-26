package gestion;
import zooAnimales.Animal;
public class Zona{
    String nombre;
    Zoologico zoo;
    Animal animales=new Animal[20];
    Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;
    }
    Zona(String nombre, Zoologico zoo, Animal[] animales){
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
    public Animal getAnimales(){
        return this.animales;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setZoo(Zoologico zoo){
        this.zoo=zoo;
    }
    public void setAnimales(Animal[] animales){
        this.animales=animales;
    }
}