package zooAnimales;
public class Anfibio extends Animal{
    private static Reptil[] listado=[];
    public static int salamandras=0;
    public static int ranas=0;
    private String colorPiel;
    private boolean venenoso;
    Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.append(this);
    }
    Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.Zona=zona;
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.append(this);
    }
    Anfibio(){
        listado.append(this);
    }
    public int cantidadAnfibios(){
        return listado.lenght;
    }
    public void crearRana(String nombre, int edad, String genero){
        Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas+=1;
    }
    public void crearSalamandra(String nombre, int edad, String genero){
        Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras+=1;
    }
    public String movimiento(){
        return "saltar";
    }
}