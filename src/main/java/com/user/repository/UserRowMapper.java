package com.user.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.user.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rn) throws SQLException {
		// TODO Auto-generated method stub
		User us= new User();
		us.setUser_id(rs.getString("USER_ID"));
		us.setEmail(rs.getString("EMAIL"));
		us.setPassword(rs.getString("PASSWORD"));
		return us;
	}

}
