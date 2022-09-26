package gestion;
import zooAnimales.Animal;
import java.util.*;
public class Zoologico{
    String nombre;
    String ubicacion;
    ArrayList<Zona> zonas=new ArrayList<>();
    Zoologico(String nombre, String ubicacion){
        this.nombre= nombre;
        this.ubicacion=ubicacion;
    }
    Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
        this.nombre= nombre;
        this.ubicacion=ubicacion;
        this.zonas=zonas;
    }
    Zoologico(){
    }
    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        total=0;
        for (i=0;i<zonas.size();i++){
            total+= zonas.get(i).cantidadAnimales();
        }
        return total;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public ArrayList<Zona> getZonas(){
        return this.zonas;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
    public void setZonas(ArrayList<Zona> zonas){
        this.zonas=zonas;
    }
}