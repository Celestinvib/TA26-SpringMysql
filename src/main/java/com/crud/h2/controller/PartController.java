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

import com.crud.h2.dto.Part;
import com.crud.h2.service.PartServiceImpl;

@RestController
@RequestMapping("/api")
public class PartController {

	@Autowired
	PartServiceImpl partServiceImpl;
	
	@GetMapping("/piezas")
	public List<Part> listParts(){
		
		return partServiceImpl.listParts();
	}
	
	@PostMapping("/piezas")
	public Part savePart(@RequestBody Part part) {
		
		return partServiceImpl.savePart(part);
	}
	
	@GetMapping("/piezas/{id}")
	public Part partXID(@PathVariable(name="id") int id) {
		
		Part part_xid= new Part();
		
		part_xid= partServiceImpl.partXID(id);
		
		System.out.println("Piezas XID: "+part_xid);
		
		return part_xid;
	}
	
	@PutMapping("/piezas/{id}")
	public Part updatePart(@PathVariable(name="id")int id,@RequestBody Part part) {
		
		Part partSelected= new Part();
		Part partUpdated = new Part();
		
		partSelected= partServiceImpl.partXID(id);
		
		partSelected.setCode(part.getCode());
		partSelected.setName(part.getName());
	
		partUpdated = partServiceImpl.updatePart(partSelected);
		
		System.out.println("La parte actualizada es: "+ partUpdated);
		
		return partUpdated;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void deletePart(@PathVariable(name="id")int id) {
		partServiceImpl.deletePart(id);
	}	
}
