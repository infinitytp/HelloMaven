package com.infinitytp.mybatispra.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.infinitytp.mybatispra.domain.User;





public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "conf.xml";
		InputStream is = Test1.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = factory.openSession();
		System.out.println("SOg");
		String sql = "com.infinitytp.mybatispra.mapping.UserMapper.getUser";
		User user = session.selectOne(sql,2);
		System.out.println(user);
	}

}
