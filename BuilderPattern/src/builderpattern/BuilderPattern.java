/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import java.util.Arrays;

/**
 *
 * @author Sebastian Echeverry & Esneyder Solarte
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user = User.builder("01", "Paco", "Jose").familyName("De Miguel").phone(3136).adult()
                        .profession("Estudiante").build();
        
        
        User2 user2 = User2.builder().id("02").nick("Pepe").name("Juan").age(21).build();
        
        
        UserErroneo userE = new UserErroneo("02", "Paco", "Jose", "De Miguel", 20, 31255, "Estudiante", Arrays.asList("Ing. Sistemas"));
        
        
        System.out.println("Usuario Solucion Normal");
        System.out.println(user.toString());
        System.out.println("");
        System.out.println("Usuario Solucion Avanzada");
        System.out.println(user2.toString());
        
       
        
    }
    
}
