package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPartDAO;
import com.crud.h2.dto.Part;
@Service
public class PartServiceImpl implements IPartService{
	//We use the methods of the IPartDAO interface, it is as if we were instantiating.
	@Autowired
	IPartDAO iPartDAO;

	@Override
	public List<Part> listParts() {
		
		return iPartDAO.findAll();
	}

	@Override
	public Part savePart(Part part) {
		
		return iPartDAO.save(part);
	}

	@Override
	public Part partXID(int id) {
		
		return iPartDAO.findById(id).get();
	}

	@Override
	public Part updatePart(Part part) {
		
		return iPartDAO.save(part);
	}

	@Override
	public void deletePart(int id) {
		
		iPartDAO.deleteById(id);
	}
}
