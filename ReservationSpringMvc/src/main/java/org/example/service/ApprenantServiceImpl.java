//package org.example.service;
//
//import org.example.dao.ApprenantDao;
//import org.example.model.Apprenant;
//import org.example.repository.ApprenantRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service("ApprenantService")
//
//public class ApprenantServiceImpl implements ApprenantService {
//	
//	
//	  @Autowired
//	    private ApprenantDao apprenantDao;
//	  
//	  @Autowired
//	    private ApprenantRepository apprenantRepository;
//
//	  
//	  
//
//	public ApprenantDao getApprenantDao() {
//		return apprenantDao;
//	}
//
//	public void setApprenantDao(ApprenantDao apprenantDao) {
//		this.apprenantDao = apprenantDao;
//	}
//
//	public ApprenantRepository getApprenantRepository() {
//		return apprenantRepository;
//	}
//
//	public void setApprenantRepository(ApprenantRepository apprenantRepository) {
//		this.apprenantRepository = apprenantRepository;
//	}
//
////	@Override
////	public  validateApprenant(String email, String password) {
////		Apprenant  apprenant = getApprenantRepository().getApprenantDetailsByEmailAndPassword(email, password);
////		return ;
////	}
//
//	public boolean validateApprenant(String email, String password) {
//		Apprenant  apprenant = getApprenantRepository().getApprenantDetailsByEmailAndPassword(email, password);
//		return false;
//		
//	}
//	@Override
//	public boolean registerApprenant(Apprenant apprenant) {
//		return false;
//	}
//
//	
//
//	
//	
////	@Override
////	public boolean validateApprenant(String email, String password) {
////		Apprenant apprenant = getApprenantRepository().getApprenantDetailsByEmailAndPassword(email, password);
////	        return apprenant;
////	}
//
////	@Override
////	public boolean registerApprenant(Apprenant apprenant) {
////		boolean isRegister = false;
////		boolean saveApprenant = getApprenantDao().creatApprenant(apprenant);
////		return false;
////		if(saveApprenant) 
////			 isRegister=true;
////		return isRegister;
////
////	}
//
//}
