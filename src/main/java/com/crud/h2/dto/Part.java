package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="parts")
public class Part {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private int id;
	
	private int code;

	private String name;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "part")
    private List<SuppliersParts> supplierParts;

	/**Constructors */
    
	public Part() {
		
	}

	

	/**
	 * @param id
	 * @param code
	 * @param name
	 */
	public Part(int id, int code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}



	/**Getters y Setters*/
	
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the supplierParts
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "SupplierParts")
	public List<SuppliersParts> getSupplierParts() {
		return supplierParts;
	}

	/**
	 * @param supplierParts the supplierParts to set
	 */
	public void setSupplierParts(List<SuppliersParts> supplierParts) {
		this.supplierParts = supplierParts;
	}
	
	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "Pieza [id=" + id + ", code=" + code +", nombre=" + name + "]";
	}
	

}
