package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISuppliersPartsDAO;
import com.crud.h2.dto.SuppliersParts;
@Service
public class SuppliersPartsServiceImpl implements ISuppliersPartsService {
	//We use the methods of the ISuppliersPartsDAO interface, it is as if we were instantiating.
	@Autowired
	ISuppliersPartsDAO iSuppliersPartsDAO;

	@Override
	public List<SuppliersParts> listSuppliersParts() {
		
		return iSuppliersPartsDAO.findAll();
	}

	@Override
	public SuppliersParts saveSuppliersParts(SuppliersParts supplierParts) {
		
		return iSuppliersPartsDAO.save(supplierParts);
	}

	@Override
	public SuppliersParts supplierPartsXID(Long id) {
		
		return iSuppliersPartsDAO.findById(id).get();
	}

	@Override
	public SuppliersParts updateSuppliersParts(SuppliersParts supplierParts) {
		
		return iSuppliersPartsDAO.save(supplierParts);
	}

	@Override
	public void deleteSuppliersParts(Long id) {
		
		iSuppliersPartsDAO.deleteById(id);
	}

}
