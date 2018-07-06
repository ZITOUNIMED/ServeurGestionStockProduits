package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.ICrudService;

@RestController
@RequestMapping(name="/crud_user")
public class CrudUserController {
	
	@Autowired
	private ICrudService<User, Long> userService;
	
	@GetMapping
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@PostMapping
	public void add(@RequestBody User user) {
		userService.add(user);
	}
	
	@PutMapping
	public void update(@RequestBody User user) {
		userService.update(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}
}
