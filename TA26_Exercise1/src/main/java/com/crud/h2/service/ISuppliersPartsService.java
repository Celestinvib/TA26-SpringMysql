package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.SuppliersParts;

public interface ISuppliersPartsService {
		//CRUD methods
		public List<SuppliersParts> listSuppliersParts(); //List All 
		
		public SuppliersParts saveSuppliersParts(SuppliersParts supplierParts);//Save a new supplierParts "CREATE"
		
		public SuppliersParts supplierPartsXID(Long id); //Read data from a supplierParts "READ"
				
		public SuppliersParts updateSuppliersParts(SuppliersParts supplierParts); //Update supplierParts data "UPDATE"
		
		public void deleteSuppliersParts(Long id);// Delete a supplierParts via id "DELETE"
}
