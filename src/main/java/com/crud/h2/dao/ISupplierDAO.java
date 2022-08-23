package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Supplier;


public interface ISupplierDAO extends JpaRepository<Supplier, Integer> {

}
