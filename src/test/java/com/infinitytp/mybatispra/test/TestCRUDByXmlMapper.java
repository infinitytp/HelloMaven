package com.infinitytp.mybatispra.test;

import java.util.List;

import javax.naming.spi.ResolveResult;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import com.infinitytp.mybatispra.domain.User;
import com.infinitytp.mybatispra.utils.MybatisUtil;

public class TestCRUDByXmlMapper {
	
	/*@Test
	public void testAdd() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		String sql = "com.infinitytp.mybatispra.mapping.UserMapper.addUser";
		
		User user = new User();
		user.setName("ss");
		user.setAge(27);
		int retResult = sqlSession.insert(sql,user);
		sqlSession.close();
		System.out.println(retResult);
	}*/
	
	/*@Test
	public void testUpdate() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		String sql = "com.infinitytp.mybatispra.mapping.UserMapper.updateUser";
		
		User user = new User();
		user.setId(4);
		user.setName("dd");
		user.setAge(26);
		
		int retResult = sqlSession.update(sql,user);
		sqlSession.close();
		System.out.println(retResult);
	}*/
	
	/*@Test
	public void testDelete() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		String sql = "com.infinitytp.mybatispra.mapping.UserMapper.deleteUser";
		
		int retResult = sqlSession.delete(sql, 4);
		sqlSession.close();
		System.out.println(retResult);
	}*/
	
	@Test
	public void testGetAll() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		String sql = "com.infinitytp.mybatispra.mapping.UserMapper.selectAll";
		
		List<User> list = sqlSession.selectList(sql);
		sqlSession.close();
		System.out.println(list);
	}
}
