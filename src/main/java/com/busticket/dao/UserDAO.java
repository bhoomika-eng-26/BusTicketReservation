package com.busticket.dao;

import java.util.List;
import com.busticket.model.User;

public interface UserDAO {

    boolean addUser(User user);

    User loginUser(String email, String password);

    User getUserById(int userId);

    List<User> getAllUsers();

    boolean updateUser(User user);

    boolean deleteUser(int userId);
}