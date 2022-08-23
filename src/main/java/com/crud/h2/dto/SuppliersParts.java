package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="suppliers_parts")
public class SuppliersParts {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private int id;
	
	
	@ManyToOne
    @JoinColumn(name = "supplier_id")
    Supplier supplier;
	
	@ManyToOne
    @JoinColumn(name = "part_code")
    Part part;
	
	private int price;
	

	/**Constructors */
	public SuppliersParts() {
		
	}

	/**
	 * @param id
	 * @param supplier
	 * @param part
	 * @param price
	 */
	public SuppliersParts(int id, Supplier supplier, Part part, int price) {
		this.id = id;
		this.supplier = supplier;
		this.part = part;
		this.price = price;
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
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the part
	 */
	public Part getPart() {
		return part;
	}

	/**
	 * @param part the part to set
	 */
	public void setPart(Part part) {
		this.part = part;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SuppliersParts [id=" + id + ", supplier=" + supplier + ", part=" + part + ", price="
				+ price+"]";
	}

}
