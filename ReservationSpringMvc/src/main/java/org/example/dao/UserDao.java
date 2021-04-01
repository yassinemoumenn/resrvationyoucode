package org.example.dao;

import org.example.model.Roles;
import org.example.model.Users;

import java.util.List;
public interface UserDao {

	public  void createUser(Users user);
    public Users getUserById(long id);
    public List<Users> getAllUsers();
    public void dropUser(long id);
    public Users updateUser(Users user);
    
    public Roles getRoleById(long id);

}
