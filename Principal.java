package publicacion;
import java.util.*;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int ctrlpub = 0, opc;
      //Se podrá realizar un ArrayList de tipo Object?Si se puede pero no supe como hacerlo
      //Pregunta de reflexión y de calificación
        while(!salir){
           System.out.println("------M E N U------");
           System.out.println("Dar de alta");
           System.out.println("Mostrar");
           System.out.println("Salir");
           System.out.println("Escribe una de las opciones");
           opc = sc.nextInt();
           switch(opc){
               case 1:
                   System.out.println("Dar de Alta");
                   Object publicaciones [] = new Object[10]; //reservamos espacio
                 //Damos de alta constante, para ejemplificar
                 //Revista
                   Revista revista = new Revista();
                   publicaciones[ctrlpub] = revista;
                   ctrlpub++;
                  //Libro
                   Libro libro = new Libro();
                   publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
                   ctrlpub++;
                  //periodico
                   Periodico periodico = new Periodico();
                   publicaciones [ctrlpub] = periodico;
                   ctrlpub++;
                   
              
                   System.out.println("Mostrar");
                   for(int i = 0; i < ctrlpub; i ++ )
                   {
                      System.out.println("  " + publicaciones [i].getClass());
                       if(publicaciones[i] instanceof Revista)
                       {
                            Revista rev1 = new Revista();
                            rev1 = (Revista)publicaciones[i];
                             System.out.println("----REVISTA----");
                             System.out.println("ISSN " + rev1.getISSN());
                             System.out.println("TITULO " + rev1.getTitulo());
                             System.out.println("NUMERO " + rev1.getNumero());
                             System.out.println("NUMERO DE PAGINAS " + rev1.getNumpag());
                             System.out.println("AÑO " + rev1.getAnio());
                             System.out.println("PRECIO " + rev1.getPrecio());
                         
                       }
                       else if (publicaciones [i] instanceof Libro )
                           {
                              Libro lib = new Libro();
                              lib = (Libro)publicaciones[i];
                              System.out.println("---LIBRO---");
                              System.out.println("ISBN " + lib.getISBN());
                              System.out.println("TITULO " + lib.getTitulo());
                              System.out.println("EDICION " + lib.getEdicion());
                              System.out.println("AUTOR " + lib.getAutor());
                              System.out.println("NUMERO DE PAGINAS " + lib.getNumpag());
                              System.out.println("PRECIO " + lib.getPrecio());
                           }
                            else if (publicaciones [i] instanceof Periodico )
                                 {
                                    Periodico peri = new Periodico();
                                    peri = (Periodico)publicaciones[i];
                                    System.out.println("---PERIODICO---");
                                    System.out.println("ISSN " + peri.getISSN());
                                    System.out.println("TITULO " + peri.getTitulo());
                                    System.out.println("AÑO " + peri.getAnio());
                                    System.out.println("NUMERO " + peri.getNumero());
                                    System.out.println("NUMERO DE PAGINAS " + peri.getNumpag());
                                    System.out.println("PRECIO " + peri.getPrecio());
                                 }
                   }
                   break;
               case 3:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
       }
                
     }
   }