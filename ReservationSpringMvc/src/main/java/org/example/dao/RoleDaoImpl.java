package org.example.dao;

import java.util.List;

import org.example.model.Roles;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class RoleDaoImpl implements RoleDao {

	   Session session;
	    @Override
	    public void addRole(Roles role) {
	        session =  HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.save(role);
	        session.getTransaction().commit();
	    }

	    @Override
	    public Roles getRoleById(long id) {
	      
	     	Roles role = null;
			Session session = null;
			try {

				session = HibernateUtil.getSessionFactory().openSession();
				role = (Roles) session.get(Roles.class, id);
				System.out.println("Role is !");
			} finally {
				if (session != null) {
					session.close();
				}

			}

			return role;
	    }
	        
	        
	    

	@SuppressWarnings("unchecked")
	@Override
	 public List<Roles> getAllRoles() {
		session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Roles> listRole = session.createQuery("From Roles ").list();
        session.getTransaction().commit();
        return listRole;
    }


	@Override
	public void deleteRole(long id) {
	
         Roles role;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        role = (Roles) session.get(Roles.class, id);
        
        if (role != null){
            session.delete(role);
            session.flush();
            System.out.println("Delete Role");
        }else{
            System.out.println("Role Not Exist");
        }
        session.getTransaction().commit();
    }

	@Override
	public Roles updateRole(Roles role) {
		
	        Roles roleUp;
	        session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        roleUp = (Roles) session.get(Roles.class, role.getIdRole());
	        	       
	        if (roleUp != null){
	        	
	            roleUp.setRoleType(role.getRoleType());
	            System.out.println("Role Updated");
	        }else{
	            System.out.println("Role Not Exist");
	        }
	        session.getTransaction().commit();
	        return roleUp;
	    }

}
