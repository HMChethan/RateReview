package com.rate.demo.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rate.demo.model.ClientEntity;



public interface Clientrepositroy extends JpaRepository<ClientEntity, Integer>  {

}
