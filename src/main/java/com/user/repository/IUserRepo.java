package com.user.repository;

import java.util.List;

import com.user.model.User;

public interface IUserRepo {
	public List<User> getAll();

	public User getUserById(String id);

	public int addUser(User us);

	public int updateEmailId(User us);

	public int deletUserById(String id);

	public int deleteAll();

}
