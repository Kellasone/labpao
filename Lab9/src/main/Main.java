package main;

import services.Service;
import users.User;

public class Main {

        public static void main(String[] args) {
                Service service = new Service();

                service.addUser(new User());

        }

}
