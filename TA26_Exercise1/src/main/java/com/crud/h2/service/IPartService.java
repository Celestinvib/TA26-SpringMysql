package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Part;

public interface IPartService {
	//CRUD methods
	public List<Part> listParts(); //List All 
	
	public Part savePart(Part part);//Save a new part "CREATE"
	
	public Part partXID(int id); //Read data from a part "READ"
			
	public Part updatePart(Part part); //Update part data "UPDATE"
	
	public void deletePart(int id);// Delete a part via id "DELETE"
}
