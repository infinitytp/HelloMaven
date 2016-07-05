package com.infinitytp.mybatispra.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.infinitytp.mybatispra.domain.User;
import com.infinitytp.mybatispra.mapping.UserMapperI;
import com.infinitytp.mybatispra.utils.MybatisUtil;

public class TestCRUDByAnnotationMapper {
	
	/*@Test
	public void testAdd() {
		
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		User user = new User();
		
		user.setName("zz");
		user.setAge(24);
		
		int add = mapper.add(user);
		sqlSession.close();
		System.out.println(add);
	}*/
	
	/*@Test
	public void updateUser() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		User user = new User();
		user.setId(5);
		user.setName("ty");
		user.setAge(34);
		
		int updatenum = mapper.updateUser(user);
		sqlSession.close();
		System.out.println(updatenum);
	}*/
	
	/*@Test
	public void testDelete() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		int result = mapper.delete(5);
		sqlSession.close();
		System.out.println(result);
	}*/
	
	@Test
	public void testGetALl() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		
		List<User> list = mapper.getAllUsers();
		sqlSession.close();
		System.out.println(list);
	}
	
	
}
