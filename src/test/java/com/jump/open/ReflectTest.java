package com.jump.open;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jump.dao.HonorMapper;
import com.jump.pojo.Honor;


public class ReflectTest {


	@Test
	public void MyReflect() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		HonorMapper honorMapper = context.getBean(HonorMapper.class);
		
		List<Honor> list = getObjectList(honorMapper,Honor.class);
		for (Honor object : list) {
			System.out.println(object.getHonorTitle());
		}
			
	}
	
	private List getObjectList(Object mapper,Class clazz) throws Exception{
		
		String name = clazz.getSimpleName();
		
		//手动拼凑Example名字
		String exampleName = "com.jump.pojo."+name+"Example";
				
		//new 出一个Example对象
		Object example = Class.forName(exampleName).newInstance();
		//拿到criteria
		Method method = example.getClass().getMethod("createCriteria");
		Object criteria = method.invoke(example);
		
		String front = "and"+name+"FrontEqualTo";
		//拿到设置条件对象
		Method setFront = criteria.getClass().getMethod(front, Integer.class);
		//设置条件
		setFront.invoke(criteria, 1);
		
		//拿到查询方法
		Method selectByExample = mapper.getClass().getMethod("selectByExample", Class.forName(exampleName));
		List object = (List)selectByExample.invoke(mapper, example);
		
		return object;
	}
}
