package com.infinitytp.mvcmybatis;


public class UserService implements UserServiceImp {
	
	private UserDaoImp userDao;
	
	@Override
	public UserVO selectUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return userDao.selectUser(uservo);
	}

	@Override
	public int insertUser(UserVO uservo) {
		// TODO Auto-generated method stub
		
		return userDao.insertUser(uservo);
	}

	@Override
	public int updaqteUser(UserVO uservo) {
		// TODO Auto-generated method stub
		return userDao.updaqteUser(uservo);
	}

	@Override
	public int deleteUserById(int user_id) {
		// TODO Auto-generated method stub
		return userDao.deleteUserById(user_id);
	}

	public UserDaoImp getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImp userDao) {
		this.userDao = userDao;
	}

	

}
