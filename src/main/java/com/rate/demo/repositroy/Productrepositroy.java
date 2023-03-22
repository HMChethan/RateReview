package com.rate.demo.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rate.demo.model.ProductEntity;


public interface Productrepositroy extends JpaRepository<ProductEntity,Integer>
{
	

}
