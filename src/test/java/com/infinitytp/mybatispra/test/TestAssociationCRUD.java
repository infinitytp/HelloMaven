package com.infinitytp.mybatispra.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.infinitytp.mybatispra.domain.Classes;
import com.infinitytp.mybatispra.utils.MybatisUtil;

public class TestAssociationCRUD {
	
	@Test
	public void testGetClass() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.ClassMapper.getClass";
		
		Classes clazz = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(clazz);
	}
	
	@Test
	public void testGetClass2() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.ClassMapper.getClass2";
		
		Classes clazz = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(clazz);
	}
	
	@Test
	public void testGetClass3() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.ClassMapper.getClass3";
		
		Classes clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(clazz);
	}
	
	@Test
	public void testGetClass4() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.ClassMapper.getClass4";
		
		Classes clazz = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(clazz);
		System.out.println(clazz);
		System.out.println(clazz);
	}
}
