/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author ARIAN
 */
import Logic.Classes.User;

public class UserAuthentication extends UserRegistration{
    
    public static String verificar(String email, String password) {
        User user = UserRegistration.getUsers().get(email);
        if (user != null && user.getPassword().equals(password)) {
            return "Bien hecho"; // Autenticación exitosa
        }
        return "Tienes un error"; // Autenticación fallida
    }
}

