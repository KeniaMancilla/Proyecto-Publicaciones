package publicacion;
import java.util.*;
public abstract class Publicacion {
    Scanner sc = new Scanner (System.in);
    private String titulo;
    private int numpag;
    private double precio;
     
    public String getTitulo(){
     System.out.println("Ingrese el Titulo");
     titulo=sc.nextLine();
     return titulo;
    }
    
    public void setTitulo(String tit){
        titulo = tit;
    }
    public int getNumpag(){
     System.out.println("Ingrese el numero de paginas");
     numpag=sc.nextInt();
     return numpag;
    }
    
    public void setNumpag(int np){
        numpag = np;
    }
    
    public double getPrecio(){
     System.out.println("Ingrese el Precio");
     precio=sc.nextDouble();
     return precio;
    }
    
    public void setPrecio(double pre){
        precio = pre;
    }
    
}