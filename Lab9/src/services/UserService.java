package services;

import users.User;

import java.util.ArrayList;

public class UserService {
    ArrayList<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void addUser(User userToAdd) {
        users.add(userToAdd);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public void deleteUserById(int id) {
        users.removeIf(userInArray -> userInArray.getId() == id);
    }


    public User getUserById(int id){
        for (User userInArray : users) {
            if(userInArray.getId() == id){
                return userInArray;
            }
        }
        return null;
    }

    public User getUserByName(String name){
        for (User userInArray : users) {
            if(userInArray.getName().equalsIgnoreCase(name)){
                return userInArray;
            }
        }
        return null;
    }

    public void ageUp(String name){
        for (User userInArray : users) {
            if(userInArray.getName().equalsIgnoreCase(name)){
                userInArray.setAge(userInArray.getAge()+1);
            }
        }
    }

}
