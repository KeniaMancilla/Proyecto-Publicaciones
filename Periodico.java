package publicacion;
import java.util.*;
public class Periodico extends Publicacion implements Periodicidad
{
    Scanner sc = new Scanner (System.in);
    private String ISSN;
    private int numero;
    private int anio;
    
    public String getISSN(){
     System.out.println("Ingrese el ISSN del periodico");
     ISSN=sc.nextLine();
     return ISSN;
    }
    
    public void setISSN(String issn){
        ISSN = issn;
    }
    
    public int getNumero(){
     System.out.println("Ingrese el numero del periodico");
     numero=sc.nextInt();
     return numero;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
     public int getAnio(){
     System.out.println("Ingrese el año del periodico");
     anio=sc.nextInt();
     return anio;
    }
    
    public void setAnio(int year){
        anio = year;
    }
    
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }