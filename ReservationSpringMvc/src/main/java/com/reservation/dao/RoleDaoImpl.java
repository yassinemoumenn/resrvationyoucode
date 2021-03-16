package com.reservation.dao;

import java.util.List;

import org.hibernate.Session;

import com.reservation.model.Role;
import com.reservationHibernateUtil.HibernateUtil;

public class RoleDaoImpl implements RoleDao {
	 Session session;
	public void addRole(Role role) {
		 session = HibernateUtil.getSession();
	        session.beginTransaction();
	        session.save(role);
	        session.getTransaction().commit();
	}

	public Role getRoleById(Long id) {
		 session = HibernateUtil.getSession();
	        session.beginTransaction();
	        Role role = session.find(Role.class, id);
	        session.getTransaction().commit();
	        return role;	}

	public List<Role> getAllRoles() {
		return null;
	}

	public void deleteRole(Long id) {
		
	}

	public Role updateRole(Role role) {
		return null;
	}



}
