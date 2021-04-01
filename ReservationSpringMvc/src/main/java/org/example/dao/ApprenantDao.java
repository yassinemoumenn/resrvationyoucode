package org.example.dao;

import java.util.List;

import org.example.model.Apprenant;
import org.example.model.Roles;


public interface ApprenantDao {
	

    
    
    public void creatApprenant(Apprenant apprenant );
    public Apprenant getApprenant(Long id);
    public List<Apprenant> getAllApprenant();
    public void dropApprenant(long id);
    public Apprenant updateApprenant(Apprenant apprenant);
    public Roles getRoleById(long id);

    
}
