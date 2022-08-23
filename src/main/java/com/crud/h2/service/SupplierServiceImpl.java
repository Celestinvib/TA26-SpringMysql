package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISupplierDAO;
import com.crud.h2.dto.Supplier;
@Service
public class SupplierServiceImpl implements ISupplierService{
	//We use the methods of the ISupplierDAO interface, it is as if we were instantiating.
	@Autowired
	ISupplierDAO iSupplierDAO;

	@Override
	public List<Supplier> listSuppliers() {
		
		return iSupplierDAO.findAll();
	}

	@Override
	public Supplier saveSupplier(Supplier supplier) {
		
		return iSupplierDAO.save(supplier);
	}

	@Override
	public Supplier supplierXID(int id) {
		
		return iSupplierDAO.findById(id).get();
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		
		return iSupplierDAO.save(supplier);
	}

	@Override
	public void deleteSupplier(int id) {
		
		iSupplierDAO.deleteById(id);
	}
}
