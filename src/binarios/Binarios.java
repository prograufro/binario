/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;
import java.util.*; 
/**
 *
 * @author Felipe Jara
 */
public class Binarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int decimal = 0, resultado,resto;
        int seguir;
       
         int matriz[][]= new int[1][8];
       
        
      do{  
          
          
          
          
          try{
              
        do{
        System.out.println("ingrese un numero decimal entre 0-255");
        decimal = leer.nextInt();
       }while(decimal>=256 || decimal<0);
        break;
        
        
          } catch(InputMismatchException in) {
           System.out.println("por vafor ingrese un numero ");
          }
         
          
       //resultado = (decimal / 2);
       
        
        int c=7, cont=0;
       do{
         cont++;
       resultado = decimal / 2;
       resto = decimal % 2;
       decimal=resultado;
       matriz[0][c]=resto;
       c--;
       
        }while(resultado !=1 && c>=0 && cont!=8);
       
       matriz[0][c]=1;
       
       for( c=0; c<=7;c++){
                
                System.out.print(matriz[0][c]+"\t");
                
            } 
               System.out.println();  
      do{ 
       System.out.println("¿desea ingrear otro numero? 1=si  2=no");
      
       seguir = leer.nextInt();
       
       if(seguir==2){
                 System.out.println("Gracias por usar este programa");
                 System.out.println();
                     }
       
         if(seguir>2 || seguir<1){
             
             System.out.println("ingrese una opcion valida");
             
             
             
             }
             
            
         
             
      }while(seguir>2 || seguir<1);
           
           
       
      }while(seguir==1);
            
               
                
            
            
           
           
       }
                
    }
    

