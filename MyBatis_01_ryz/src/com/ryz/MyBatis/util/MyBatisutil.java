package com.ryz.MyBatis.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ������(����session)
 * @author Administrator
 *
 */
public class MyBatisutil {

	SqlSessionFactory factory=null;
	
	//1.��������˽�л�
	private MyBatisutil () {
		try {
			factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MyBatis-conf.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//2.����˽��,ʵ��������
	private static MyBatisutil instance=new MyBatisutil();
	
	//3.��¶һ����������,�����˵���
	public static SqlSession opensession() {
		return instance.factory.openSession();
	}
	
}
