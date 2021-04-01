package org.example.dao;

import java.util.List;

import org.example.model.NbrPlace;

public interface NbrPlaceDao {
//	
//	public  void createPlace(NbrPlace nbrPlace);
//    public NbrPlace getUserById(long id);
//    public List<NbrPlace> getAllPlace();
//    public void dropPlace(long id);
//    public NbrPlace updatePlace(NbrPlace nbrPlace);
	
	
	public void create(NbrPlace nbrPlace);

    public List<NbrPlace> getAll();

    public void remove(long id);

    public NbrPlace getById(long id);

    public NbrPlace update(NbrPlace nbrPlace);

}
