package guru.springframework.controllers;

import gruru.springframework.entities.User;
import guru.springframework.domain.UserCommand;

public class UserController {
    User saverUser(UserCommand command) {
        return new User();
    }
}
