package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.repository.IUserRepo;

@RestController
@RequestMapping
public class UserController{
	@Autowired
	@Qualifier(value="NJT")
	IUserRepo rep;

	@GetMapping("/user")
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return rep.getAll();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") String id) {
		// TODO Auto-generated method stub
		return rep.getUserById(id);
	}

	@PostMapping("/")
	public int addUser(@RequestBody User us) {
		// TODO Auto-generated method stub
		return rep.addUser(us);
	}

	@PutMapping("/{id}")
	public int updateEmailId(@PathVariable("id") String id,@RequestBody User us) {
		// TODO Auto-generated method stub
		us.setUser_id(id);
		return rep.updateEmailId(us);
	}

	@DeleteMapping("/{id}")
	public int deletUserById(@PathVariable("id") String id,@RequestBody User us) {
		// TODO Auto-generated method stub
		us.setUser_id(id);
		return rep.deletUserById(id);
	}

	@DeleteMapping
	public int deleteAll() {
		// TODO Auto-generated method stub
		return rep.deleteAll();
	}
	

}
