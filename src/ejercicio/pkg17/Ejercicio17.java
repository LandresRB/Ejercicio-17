
package ejercicio.pkg17;

import java.util.Scanner;


public class Ejercicio17 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String dia="";
        
        System.out.println("Ingrese que día quiere consultar");
        dia=sc.next();
        
        
        switch (dia){
            case  "lunes":
                System.out.println("Es un día laboral");
                break;
            case "martes":
                System.out.println("Es un dia laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "jueves":
                System.out.println("Es un dia laboral");
                break;
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
                System.out.println("No es un dia laboral");
                break;
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
                
        }
    }
    
}
