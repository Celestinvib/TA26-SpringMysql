package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Part;

public interface IPartDAO  extends JpaRepository<Part, Integer>{

}
