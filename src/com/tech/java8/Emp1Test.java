package com.tech.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp1Test {

	public static void main(String[] args) {
//		List<Employee1> list = Stream.of(
//				new Employee1(1 , "Sumit", "Dev" , 5000.00),
//				new Employee1(2 , "Praveen", "Dev" , 7000.00),
//				new Employee1(3 , "Vivek", "QA" , 3000.00),
//				new Employee1(c))
//				.collect(Collectors.toList());
		
		List<Employee1> list = new ArrayList<Employee1>();
				list.add(new Employee1(1 , "Sumit", "Dev" , 5000.00)); 
				list.add(new Employee1 (2 , "Praveen", "Dev" , 7000.00)); 
				list.add(new Employee1(3 , "Vivek", "QA" , 3000.00)); 
				list.add(new Employee1(4 , "Pranav", "QA" , 4000.00)); 
				
				Comparator<Employee1> comparingBySalary = Comparator.comparing(Employee1::getSalary);
				
				Map<String, Optional<Employee1>> empsal = list.stream().collect(Collectors.groupingBy(Employee1::getDept,
						Collectors.reducing(BinaryOperator.maxBy(comparingBySalary))));
				System.out.println("max salary-->"+empsal);
				
		
//		Comparator<Employee1> comparingBysalary = Comparator.comparing(Employee1::getSalary);
//	 Map<String, Optional<Employee1>> empmap =list.stream()
//		 .collect(Collectors.groupingBy(Employee1::getDept,
//				 Collectors.reducing(BinaryOperator.maxBy(comparingBysalary))));
//	 System.out.println(empmap);
		
//		Comparator<Employee1> comparingBysalary = Comparator.comparing(Employee1::getSalary);
//		 Map<String, Optional<Employee1>> empmap =list.stream()
//			 .collect(Collectors.groupingBy(Employee1::getDept,
//					 Collectors.reducing(BinaryOperator.minBy(comparingBysalary))));
//		 System.out.println(empmap);
//	}

}
}
