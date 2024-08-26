/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic.Classes;

import java.util.UUID;

/**
 *
 * @author ARIAN
 */
public class User {
    String name;
    String email;
    String password;
    
    public String retornaId(String name){  
        UUID randomId = UUID.randomUUID();     
        String userId = randomId.toString();
        return userId;
    }
}
