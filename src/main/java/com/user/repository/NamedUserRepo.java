package com.user.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.queries.QueryBuilder;
import com.user.model.User;

@Repository(value = "NJT")
public class NamedUserRepo implements IUserRepo {
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return template.query(QueryBuilder.GET_ALL, new UserRowMapper());
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.queryForObject(QueryBuilder.NJ_GET_USER_BY_ID, source, new UserRowMapper());
	}

	@Override
	public int addUser(User us) {
		// TODO Auto-generated method stub
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("user_id",us.getUser_id());
		source.addValue("email",us.getEmail());
		source.addValue("password",us.getPassword());
		return template.update(QueryBuilder.NJ_INSERT, source);
	}

	@Override
	public int updateEmailId(User us) {
		// TODO Auto-generated method stub
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("user_id",us.getUser_id()); 
		source.addValue("mail",us.getEmail()); // only city update. got it? //city is a named parameeter in the query
		return template.update(QueryBuilder.NJ_UPDATE_USER_BY_ID, source);
	}

	@Override
	public int deletUserById(String id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id", id);
		return template.update(QueryBuilder.NJ_DELETE_USER_BY_ID, source);
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.NJ_DELETE_ALL, new HashMap<>());
	}

}
