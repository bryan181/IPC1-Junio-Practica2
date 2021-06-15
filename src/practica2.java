package src;
import java.util.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class practica2{


    public static void main (Strings [] args){
        practica2 t= new practica2();
  
    
    }
    Scanner scanner = new Scanner(System.in);
 

    public MenuPrincipal(){
        boolean salir =false;
        while (!salir){ 

            
            usuario();
            System.out.println("<presione 1> Prestamo de peliculas ");
            System.out.println("<presione 2> Devolver pelicula (si ya rento una)");
            System.out.println("<presione 3> Registrase cliente");
            System.out.println("<presione 4> Registrase pelicula");
            System.out.println("<presione 5> Busacar cliente");
            System.out.println("<presione 6> Listado de clientes");
            System.out.println("<presione 7> Reportes");
            System.out.println("<presione 0> Salir del programa");
            String opcion = nextLine();
            switch (opcion) {
                case "0":
                    salir = true;
                    break;
                case "1":
                    PrestamodePeliculas();
                    break;
                case "2":
                    devolverPelciula();
                    break;
                case "3":
                    registrodeCliente();
                    break;
                case "4":
                    registroPelicula();
                    break;
                case "5":
                    buscarClientes();
                case "6":
                    listadoClientes();
                    break;
                    
                case "7":
                     reportes();
                    break;
                
            }

        }

    }
    public  usuario(){
        String usuario = JOptionPane.showInputDialog("Ingrese el usuario");
        usuario = "memorabilla";
        return;

    }
    public PrestamodePeliculas(int IDpelicula,int IDcliente,int diasPrestada){

        IDpelicula = JOptionPane.showInputDialog("Ingrese el Id de la pelicula ");
        IDcliente = JOptionPane.showInputDialog("Ingrese el Id del cliente ");
        diasPrestada = JOptionPane.showInputDialog("cuantos dias la va a prestar");


        

    }
    public void devolverPelciula(){

    }
    public void registroPeliculas(){

    }
    public void registrodeCliente(){

    }
    public void listadoClientes(){

    }
    public void buscarClientes(){

    }
    public void reportes(){

    }
}

    
