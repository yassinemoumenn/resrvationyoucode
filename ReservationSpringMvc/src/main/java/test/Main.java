package test;

import com.reservation.dao.RoleDao;
import com.reservation.dao.RoleDaoImpl;
import com.reservation.dao.UserDao;
import com.reservation.dao.UserDaoImpl;
import com.reservation.model.Role;
import com.reservation.model.User;

public class Main {

	
		 public static void main(String[] args) {
		       // UserDao doaDao = new UserDaoImpl();
		     //   RoleDao dao=new RoleDaoImpl();
		        //Role role = new Role();
		        //role.setIdRole(1L);
		     //   Role r=dao.getRoleById(1L);
		    
		   //     doaDao.updateUser(new User("h@g", "Yassine", "moumen", "jhhhj",r));
		        		
			 UserDao user = new UserDaoImpl();
		        User user1 = user.getUserById(1L);
		        System.out.println(user1.toString());
		    }

	}

