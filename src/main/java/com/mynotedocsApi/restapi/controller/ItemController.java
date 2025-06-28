package com.mynotedocsApi.restapi.controller;

import java.util.List;

import com.mynotedocsApi.restapi.entity.Item;
import com.mynotedocsApi.restapi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository repo;

	@GetMapping("/item")
	public List<Item> getAllItems(){
        return repo.findAll();
	}

	@GetMapping("/item/{id}")
	public Item getItem(@PathVariable int id) {
        return repo.findById(id).get();
	}
	
	@PostMapping("/item/add")
	public ResponseEntity<Item> createItem(@RequestBody Item item) {
		Item newItem = repo.save(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(newItem);
	}
	
	@PutMapping("/item/update/{id}")
	public Item updateItem(@PathVariable int id) {
	   Item item = repo.findById(id).get();
	   item.setKey("kiki");
	   item.setValue("huhu");
	   repo.save(item);
	   return item;
		
	}
	@DeleteMapping("/item/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void removeItem(@PathVariable int id) {
		Item item = repo.findById(id).get();
		repo.delete(item);
	}

}
