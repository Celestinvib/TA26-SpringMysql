package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Supplier;
import com.crud.h2.service.SupplierServiceImpl;

@RestController
@RequestMapping("/api")
public class SupplierController {

	@Autowired
	SupplierServiceImpl supplierServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Supplier> listSuppliers(){
		
		return supplierServiceImpl.listSuppliers();
	}
	
	@PostMapping("/proveedores")
	public Supplier saveSupplier(@RequestBody Supplier supplier) {
		
		return supplierServiceImpl.saveSupplier(supplier);
	}
	
	@GetMapping("/proveedores/{id}")
	public Supplier supplierXID(@PathVariable(name="id") int id) {
		
		Supplier supplier_xid= new Supplier();
		
		supplier_xid= supplierServiceImpl.supplierXID(id);
		
		System.out.println("Proveedor XID: "+supplier_xid);
		
		return supplier_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Supplier updateSupplier(@PathVariable(name="id")int id,@RequestBody Supplier supplier) {
		
		Supplier supplierSelected= new Supplier();
		Supplier supplierUpdated = new Supplier();
		
		supplierSelected= supplierServiceImpl.supplierXID(id);
		
		supplierSelected.setName(supplier.getName());
	
		supplierUpdated = supplierServiceImpl.updateSupplier(supplierSelected);
		
		System.out.println("El proveedor actualizado es: "+ supplierUpdated);
		
		return supplierUpdated;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void deleteSupplier(@PathVariable(name="id")int id) {
		supplierServiceImpl.deleteSupplier(id);
	}	
	
}
