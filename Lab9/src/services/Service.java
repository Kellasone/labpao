package services;

import users.User;

public class Service {
    UserService us = new UserService();
    MeetingsService ms = new MeetingsService();
    LocationService ls = new LocationService();

    public void addUser(User user){
        us.addUser(user);
    }
}
