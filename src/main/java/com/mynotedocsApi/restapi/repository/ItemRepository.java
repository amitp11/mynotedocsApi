package com.mynotedocsApi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mynotedocsApi.restapi.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
