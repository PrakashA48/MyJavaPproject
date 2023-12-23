package com.tech.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SalaryDemo {

	public static void main(String[] args) {
			List<Employee> list = new ArrayList<Employee>();
			list.add(new Employee(1, "Arun", 31, "31/07/2017",20000.00));
			list.add(new Employee(2, "Mahesh", 25, "02/07/2018",40000.00));
			list.add(new Employee(3, "Prakash", 24, "31/07/2021",50000.00));
			list.add(new Employee(4, "Varun", 26, "12/05/2015",90000.00));
			list.add(new Employee(5, "Dawan", 23, "31/07/2019",50000.00));
			
			Optional<Double> sal = list.stream()
			.map(e->e.getSalary())
				.sorted(Comparator.reverseOrder())
					.skip(1).findFirst();
			System.out.println("salary : "+sal.get());

			


	}

}
