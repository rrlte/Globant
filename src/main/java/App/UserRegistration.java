/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Logic.Classes.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ARIAN
 */
public class UserRegistration{

    private static Map<String, User> users = new HashMap<>();

    public static Map<String, User> getUsers() {
        return users;
    }

    public static String userRegister(User user) {
        if (users.containsKey(user.getEmail())) {
            return "El email ya esta en uso, intenta con otro";
        }
        users.put(user.getEmail(), user);
        return "Este es tu ID de usuario: " + user.getId() + "\n" +
                "Acabas de registrarte correctamente" + "\n" +
                "Estas listo para iniciar sesion";
    }
}
