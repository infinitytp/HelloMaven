package com.infinitytp.mvcmybatis;


public interface UserDaoImp {
	
	public UserVO selectUser(UserVO uservo);
	public int insertUser(UserVO uservo);
	public int updaqteUser(UserVO uservo);
	public int deleteUserById(int user_id);
}
