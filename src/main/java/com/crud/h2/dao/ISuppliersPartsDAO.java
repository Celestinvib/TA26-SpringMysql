package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.SuppliersParts;

public interface ISuppliersPartsDAO  extends JpaRepository<SuppliersParts, Integer> {

}
