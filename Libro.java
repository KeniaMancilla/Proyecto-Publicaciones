package publicacion;
import java.util.*;
public class Libro extends Publicacion
{
    Scanner sc = new Scanner (System.in);
    private String ISBN;
    private String edicion;
    private String autor;
       
    public String getISBN(){
     System.out.println("Ingrese el ISBN del Libro");
     ISBN=sc.nextLine();
     return ISBN;
    }
    
    public void setISBN(String isbn){
       ISBN = isbn;
    }
    
    public String getEdicion(){
     System.out.println("Ingrese el la edicion del Libro");
     edicion=sc.nextLine();   
     return edicion;
    }
    
    public void setEdicion(String ed){
        edicion = ed;
    }
    
     public String getAutor(){
     System.out.println("Ingrese el nombre del autor del Libro");
     autor=sc.nextLine();
     return autor;
    }
    
    public void setAutor(String au){
        autor = au;
    }

}