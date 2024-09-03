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
public class User extends DigitalWallet{
    String name;
    String email;
    String password;
    String id = retornaId();

    public User(String email) {
        this.email = email;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String retornaId(){  
        UUID randomId = UUID.randomUUID();     
        String userId = randomId.toString();
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

}
