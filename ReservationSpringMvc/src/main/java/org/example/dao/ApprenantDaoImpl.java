package org.example.dao;

import java.util.List;

import org.example.model.Apprenant;
import org.example.model.Roles;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

public class ApprenantDaoImpl  implements ApprenantDao {
       Session session;
	@Override
	public void creatApprenant(Apprenant apprenant) {
		session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(apprenant);
        session.getTransaction().commit();		
	}

	@Override
	public Apprenant getApprenant(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apprenant> getAllApprenant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dropApprenant(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Apprenant updateApprenant(Apprenant apprenant) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	 @Override
		@Transactional
		public Roles getRoleById(long id) {
	        session = HibernateUtil.getSessionFactory().openSession();
		        Roles role = (Roles) session.get(Roles.class, id);
		        return role;
		}

}
