package com.user.queries;

public class QueryBuilder {
		public static final String GET_ALL = "SELECT * FROM USER";
		public static final String INSERT = "INSERT INTO USER(USER-ID, EMAIL,PASSWORD) VALUES(?,?,?)";
		public static final String GET_USER_BY_ID = "SELECT * FROM USER  WHERE USER_ID = ?";
		public static final String DELETE_USER_BY_ID = "DELETE FROM USER  WHERE USER_ID= ?";
		public static final String DELETE_ALL = "DELETE FROM USER";
		public static final String UPDATE_EMAIL_BY_ID = "UPDATE USER SET EMAIL = ? WHERE USER_ID = ?";

		public static final String NJ_GET_ALL = "SELECT * FROM CUSTOMER";
		public static final String NJ_INSERT = "INSERT INTO CUSTOMER(CUST_ID, NAME, CITY, DEPARTMENT) VALUES(:id,:name,:city,:dept)";
		public static final String NJ_GET_USER_BY_ID = "SELECT * FROM USER  WHERE USER_ID = ?";
		public static final String NJ_DELETE_USER_BY_ID = "DELETE FROM USER  WHERE USER_ID= ?";
		public static final String NJ_DELETE_ALL = "DELETE FROM USER";
		public static final String NJ_UPDATE_USER_BY_ID = "UPDATE USER SET EMAIL = ? WHERE USER_ID = ?";
	}
