package com.infinitytp.mybatispra.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.infinitytp.mybatispra.domain.Order;
import com.infinitytp.mybatispra.utils.MybatisUtil;

public class TestdiffFiledName {
	/*@Test
	public void testGetOrderById() {
		
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.OrderMapper.getOrderById";
		
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}*/
	
	/*@Test
	public void testGetOrderById2() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.OrderMapper.selectOrder";
		
		Order order = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(order);
	}*/
	
	@Test
	public void testGetOrderById3() {
		SqlSession sqlSession = MybatisUtil.getSqlSession(true);
		
		String statement = "com.infinitytp.mybatispra.mapping.OrderMapper.selectOrderResultMap";
		
		Order order = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(order);
	}
}
