package com.hql.app;

import java.util.*;

public class Runner
{
	public static void main(String[] args)
	{
		StudentDao dao=new StudentDao();
		
		StudentDto studentDto=dao.findByName("Kshitij Joshi");
		System.out.println(studentDto);
		
		Object[] objectdata=dao.findAgeAndPercentageByName("Kshitij Joshi");
		System.out.println(Arrays.toString(objectdata));
		
		List<StudentDto> list=dao.findAllByAgeGreaterThan(21);
		for (StudentDto sd : list)
	{
	System.out.println(sd);
	}
		
		float data= (float) dao.findPercentageByName("Kshitij Joshi");
		System.out.println(data);
		
		List<Object[]> list1=dao.findStreamAndPercentageAndNameByAgeLessThan(21);
		for(Object[] objects: list1)
				{
			System.out.println(Arrays.toString(objects));
			}
}
}