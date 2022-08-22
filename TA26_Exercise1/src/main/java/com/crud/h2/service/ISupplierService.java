package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Supplier;

public interface ISupplierService {
	//CRUD methods
	public List<Supplier> listSuppliers(); //List All 
	
	public Supplier saveSupplier(Supplier supplier);//Save a new supplier "CREATE"
	
	public Supplier supplierXID(int id); //Read data from a supplier "READ"
			
	public Supplier updateSupplier(Supplier supplier); //Update supplier data "UPDATE"
	
	public void deleteSupplier(int id);// Delete a supplier via id "DELETE"
}
