package com.ashokit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.pojo.Product;

@Repository
public interface ContactReository extends CrudRepository<Product,Integer> {

}
