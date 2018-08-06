package com.user.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.user.model.User;
import com.user.queries.QueryBuilder;
@Repository(value="JT")
public class UserRepo implements IUserRepo{
	@Autowired
	JdbcTemplate template;

	public List<User> getAll() {
		// TODO Auto-generated method stub
		RowMapper<User> rm=new UserRowMapper();
		return template.query(QueryBuilder.	GET_ALL,rm);
	}

	
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		RowMapper<User> rm=new UserRowMapper();
		return template.queryForObject(QueryBuilder.GET_USER_BY_ID,new Object[] {id},rm);
	}

	
	public int addUser(User us) {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.INSERT,us.getUser_id(),us.getEmail(),us.getPassword());
	}

	
	public int updateEmailId(User us) {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.UPDATE_EMAIL_BY_ID);
	}

	
	public int deletUserById(String id) {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.DELETE_USER_BY_ID);
	}

	
	public int deleteAll() {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.DELETE_ALL);
	}


	


}
