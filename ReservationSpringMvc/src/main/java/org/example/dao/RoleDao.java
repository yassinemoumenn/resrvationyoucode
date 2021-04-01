package org.example.dao;

import java.util.List;

import org.example.model.Roles;

public interface RoleDao {
	
	 public  void addRole(Roles role);
	    public Roles getRoleById(long id);
	    public List<Roles> getAllRoles();
	    public void deleteRole(long id);
	    public Roles updateRole(Roles role);

}
