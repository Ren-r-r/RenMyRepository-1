package com.ryz.MyBatis.Mapper;
/**
 * empӳ��ӿ�
 * @author Administrator
 *
 */

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ryz.MyBatis.entity.emp;

public interface empMapper {

	//��ѯ�ķ���
	public emp getemp(int empno);
	
	//����empno,ename��ѯ����Ա��
	public emp getempandname(@Param("empno")int empno,@Param("ename")String ename);
	
	//��ѯ����Ա��
	public List<emp> getallemp();
	
	//���ݵ�ַģ����ѯ
	public List<emp> getemplike(String Address);
	
	//���Ա��
	public int insertemp(emp emp);
	
	//ɾ��Ա��
	public int deleteemp(Integer empno);
	
	//�޸�Ա��
	public int updateemp(emp emp);
	
	//ģ����ѯ(��̬sql)
	public List<emp> likeemp(emp emp);
	
	//�޸�(��̬sql)
	public Boolean updaemp(emp emp);
	
	//choose����һ���������涼����(��̬sql)
	public List<emp> choose(emp emp);
	
	//foreach(��̬sql)
	public List<emp> foremp(@Param("list")List<Integer> list);
	
	//�������Ա��(��һ��д��)
	public int inerempBath(@Param("emps")List<emp> emps);
	
	//�������Ա��(�ڶ���д��)
	public int inerempBaths(@Param("emps")List<emp> emps);
	
	//ʹ��sql����ҳ
	@Select("select * from emp limit #{page},#{pagesize}")
	public List<emp> listpage(Map<String,Integer> pager);
}
