/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Sebastian Echeverry & Esneyder Solarte
 */
public interface UserBuilders {
    
    interface Id {
        Nick id(String id);
    }
    
    interface Nick {
        Name nick(String nick);
    }
    
    interface Name {
        Optionals name(String name);
    }
    
    interface Optionals {
        Optionals familyName(String familyName);
        Optionals age(int age);
        Optionals phone(int phone);
        Optionals profession(String profession);
        Optionals tag(String tag);
        User2 build();
    }
}
