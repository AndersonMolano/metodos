package intro;
import java.util.Scanner;
public class Movie {

     Scanner lectura=new Scanner(System.in);

    String Movie;
    public String name;
    public int duration;
    String category;
    public String director;
    String CategoriaN;
    
   

       
       
       
       public void addMovie(){
          System.out.println("Escriba el nombre de la pelicula");
          name=lectura.nextLine();
       }
        public void changeCategory() {
           System.out.println("Escriba cual es la categoria: "); 
           category=lectura.nextLine();
           System.out.println("Escriba la nueva categoria");
            CategoriaN= lectura.nextLine();
            
        }public void changeDuration() {
         System.out.println("Escriba cual es la duración "); 
         category=lectura.nextLine();
        
     }
        
        public int duplicarEdad (int e) {
            duration=e;
            int duplicar= e + 15;
         return duplicar;
        }
    }
        
          
        



    

