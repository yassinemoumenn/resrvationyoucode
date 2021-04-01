package org.example.repository;

import java.sql.SQLException;

import org.example.model.Roles;
import org.example.model.Users;

public interface UserRepository {

    public boolean validate(String email,  String password)throws SQLException, ClassNotFoundException;

    public Roles getByRole(Long id)throws SQLException, ClassNotFoundException ;
    public Users getByEmail(String email) ;
    

}
