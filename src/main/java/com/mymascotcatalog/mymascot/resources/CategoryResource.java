package com.mymascotcatalog.mymascot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymascotcatalog.mymascot.entities.Category;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Dog food"));
		list.add(new Category(2L, "Cat food"));
		return ResponseEntity.ok().body(list);
	}
}
