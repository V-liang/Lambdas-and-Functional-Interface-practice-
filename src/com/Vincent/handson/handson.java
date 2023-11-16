package com.Vincent.handson;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.List;

// Functional interface for filtering
@FunctionalInterface
interface doubleNumber {
	int calc(int z);
}

// class to represent a customer
class Customer {
	private int customerID, age, salary;
	private String name, email;
	
	// Constructor to initialize attributes
	public Customer(int customerID, String name, int age, String email, int salary) {
		this.customerID = customerID;
		this.name = name;
		this.age = age;
		this.email = email;
		this.salary = salary;
	}
	
	// Getter method for salary
	public int getSalary() {
		return salary;
	}
	
	@Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Age: " + age + ", Email: " + email + ", Salary: $" + salary;
    }
}	

public class handson {

	public static void main(String[] args) {
		// Create a list to store customer objects
		List<Customer> customers = new ArrayList<>();
		
		// Add 5 customer objects to the list
		customers.add(new Customer(1, "John Doe", 30, "john@example.com", 60000));
		customers.add(new Customer(2, "Micheal Jordan", 45, "john@example.com", 80000));
		customers.add(new Customer(3, "Keanu Reeves ", 34, "john@example.com", 45000));
		customers.add(new Customer(4, "Jenifer Doe", 23, "john@example.com", 30000));
		customers.add(new Customer(5, "Mike Tyson", 54, "john@example.com", 120000));
		
		//Lambda expression to filter and display
		System.out.println("Customers with salary > $50,000: ");
		customers.stream()
            .filter(customer -> customer.getSalary() > 50000)
            .forEach(customer -> System.out.println(customer));

    }
}
