package gestion;
public class Zoologico{
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;
    Zoologico(String nombre, String ubicacion){
        this.nombre= nombre;
        this.ubicacion=ubicacion;
    }
    Zoologico(String nombre, String ubicacion, Zona zonas){
        this.nombre= nombre;
        this.ubicacion=ubicacion;
        this.zonas=zonas;
    }
    Zoologico(){
    }
    public void agregarZonas(Zona zona){
        this.zonas.append(zona);
    }
    public int cantidadTotalAnimales(){
        total=0;
        for (i in zonas){
            total+=i.cantidadAnimales;
        }
        return total;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public Zona[] getZonas(){
        return this.zonas;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
    public void setZonas(Zona[] zonas){
        this.zonas=zonas;
    }
}