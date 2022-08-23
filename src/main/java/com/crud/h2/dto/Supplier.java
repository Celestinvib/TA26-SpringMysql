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
@Table(name="suppliers")
public class Supplier {
	
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private int id;

	private String name;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
    private List<SuppliersParts> supplierParts;

	/**Constructors */
	public Supplier() {
		
	}

	/**
	 * @param id
	 * @param name
	 */
	public Supplier(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**Getters y Setters*/
	
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
		return "Proveedor [id=" + id + ", nombre=" + name + "]";
	}

	
	
	
	

}
