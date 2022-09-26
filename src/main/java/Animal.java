package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;
public class Animal{
    static int totalAnimales=0;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zona zona;
    public Animal (String nombre, int edad, String habitat, String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        totalAnimales+=1;
    } 
    public Animal (String nombre, int edad, String habitat, String genero, Zona zona){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        totalAnimales+=1;
    } 
    public Animal(){
        totalAnimales+=1;
    }
    public String movimiento(){
        return "desplazarse";
    }
    public static String totalPorTipo(){
        String totalTipo="Mamiferos: "+ Mamifero.cantidadMamiferos()+ "\n"+"Aves: "+ Ave.cantidadAves()+"\n"+"Reptiles: "+ Reptil.cantidadReptiles()+ "\n"+ "Peces: "+ Pez.cantidadPeces()+ "\n"+ "Anfibios: "+ Anfibio.cantidadAnfibios();
        return totalTipo;
    }
    public String toString(){
        if (zona==none){
            String retorno=("Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad+ ", habito en "+ this.habitat+ " y mi genero es "+ this.genero);
            return retorno;
        }
        else{
            String retorno=("Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad+ ", habito en "+ this.habitat+ " y mi genero es "+ this.genero+ ", la zona en la que me ubico es "+ this.zona+ ", en el "+ this.zona.zoo);
            return retorno;
        }
    }
    public int getTotalAnimales(){
        return totalAnimales;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public String getGenero(){
        return this.genero;
    }
    public Zona getZona(){
        return this.zona;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setZona(Zona zona){
        this.zona=zona;
    }
}