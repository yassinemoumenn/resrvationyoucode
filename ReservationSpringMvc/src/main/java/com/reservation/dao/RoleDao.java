package com.reservation.dao;

import java.util.List;

import com.reservation.model.Role;

public interface RoleDao {
    public  void addRole(Role role);
    public Role getRoleById(Long id);
    public List<Role> getAllRoles();
    public void deleteRole(Long id);
    public Role updateRole(Role role);
}
