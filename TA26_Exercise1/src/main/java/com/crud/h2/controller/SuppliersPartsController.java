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

import com.crud.h2.dto.SuppliersParts;
import com.crud.h2.service.SuppliersPartsServiceImpl;

@RestController
@RequestMapping("/api")
public class SuppliersPartsController {

	@Autowired
	SuppliersPartsServiceImpl suppliersPartsServiceImpl;
	
	@GetMapping("/suministros")
	public List<SuppliersParts> listSuppliers(){
		
		return suppliersPartsServiceImpl.listSuppliersParts();
	}
	
	@PostMapping("/suministros")
	public SuppliersParts saveSupplierParts(@RequestBody SuppliersParts supplierParts) {
		
		return suppliersPartsServiceImpl.saveSuppliersParts(supplierParts);
	}
	
	@GetMapping("/suministros/{id}")
	public SuppliersParts supplierXID(@PathVariable(name="id") int id) {
		
		SuppliersParts supplierParts_xid= new SuppliersParts();
		
		supplierParts_xid= suppliersPartsServiceImpl.supplierPartsXID(id);
		
		System.out.println("ProveedorPiezas (Suministra) XID: "+supplierParts_xid);
		
		return supplierParts_xid;
	}
	
	@PutMapping("/suministros/{id}")
	public SuppliersParts updateSupplier(@PathVariable(name="id")int id,@RequestBody SuppliersParts supplierParts) {
		
		SuppliersParts supplierPartsSelected= new SuppliersParts();
		SuppliersParts supplierPartsUpdated = new SuppliersParts();
		
		supplierPartsSelected= suppliersPartsServiceImpl.supplierPartsXID(id);
		
		supplierPartsSelected.setSupplier(supplierParts.getSupplier());
		supplierPartsSelected.setPart(supplierParts.getPart());
		supplierPartsSelected.setPrice(supplierParts.getPrice());
	
		supplierPartsUpdated = suppliersPartsServiceImpl.updateSuppliersParts(supplierPartsSelected);
		
		System.out.println("El ProveedorPiezas (Suministra) actualizado es: "+ supplierPartsUpdated);
		
		return supplierPartsUpdated;
	}
	
	@DeleteMapping("/suministros/{id}")
	public void deleteSupplier(@PathVariable(name="id")int id) {
		suppliersPartsServiceImpl.deleteSuppliersParts(id);
	}	
}
