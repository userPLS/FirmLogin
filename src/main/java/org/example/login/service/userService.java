package org.example.login.service;

import org.example.login.pojo.Person;

public interface userService {
    public Person login(String username, String password);
}
