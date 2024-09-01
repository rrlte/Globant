/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Logic.Classes.User;

/**
 *
 * @author arian
 */
public class UserAuthentication {
    
    public static void verificar(String email, String password) {
        User user = UserRegistration.getUsers().get(email);
        if (user != null && user.getPassword().equals(password)) {
            UserMenu.menuDeInicio(email); 
        }else{
            System.out.println("Credenciales incorrectas, intente nuevamente");
        }   
    }
}
