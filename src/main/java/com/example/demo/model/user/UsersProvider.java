package com.example.demo.model.user;

import java.util.ArrayList;

public class UsersProvider {

    private static ArrayList<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("Zuzana", "password1"));
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static User getUserById(Integer id) {
        for (User u: users) {
            if (u.getId() == id)
                return u;
        }
        return null;
    }

    public static void addUser(User user) {
        users.add(user);
    }
}
