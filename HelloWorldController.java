package demo.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Employee;
//import demo.service.crud;

//@CrossOrigin(origins = "http://localhost:4200")
//@RestController

//public class HelloWorldController {
//	@Autowired
//	crud cRud;
//	 @RequestMapping("/")
//	 
//	 public List<Employee> empyloyees=new ArrayList<>();
//	 List<Employee> home() {
//		 
////		 List<Em> tempEmployees = new ArrayList<>();
////		 res.add("hello");
////		 res.add("world");
//			Employee emp1 = new Employee();
//			emp1.setName("emp1");
//			emp1.setDesignation("manager");
//			emp1.setempId(1);
//			emp1.setSalary(100000);
//		
//            Employee emp2 = new Employee();
//			emp2.setName("emp2");
//			emp2.setDesignation("developer");
//			emp2.setempId(2);
//			emp2.setSalary(300000);
//
//			Employee emp3 = new Employee();
//			emp3.setName("emp3");
//			emp3.setDesignation("developer2");
//			emp3.setempId(3);
//			emp3.setSalary(399000);
//			
//			Employee emp4 = new Employee();
//			emp4.setName("emp4");
//			emp4.setDesignation("tester");
//			emp4.setempId(4);
//			emp4.setSalary(400000);
//			
////			
//			 cRud.addEmployee(emp1);
//             cRud.addEmployee(emp2);
//			 cRud.addEmployee(emp3);
//			 cRud.addEmployee(emp4);
//
//		return cRud.emplist;
//		}
//	 @DeleteMapping(path = { "/{id}" })
//	  public Employee deleteEmp(@PathVariable("empId")int empId) {
//		  Employee deletedEmp = null;
//		  for(Employee x:emplist) {
//			  if(empId==x.getempId()) {
//				  emplist.remove(x);
//				  deletedEmp=x;
//				  break;
//			  }
//		  }
//		  return deletedEmp;
//	  }
	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping({ "/employees" })
	public class HelloWorldController {

		private List<Employee> employees = createList();

		@GetMapping(produces = "application/json")
		public List<Employee> firstPage() {
			return employees;
		}

		@DeleteMapping(path = { "/{id}" })
		public Employee delete(@PathVariable("id") String id) {
			Employee deletedEmp = null;
			for (Employee emp : employees) {
				if (emp.getEmpId().equals(id)||emp.getEmpId()==null) {
					employees.remove(emp);
					deletedEmp = emp;
					break;
				}
			}
			return deletedEmp;
		}

		@PostMapping
		public Employee create(@RequestBody Employee user) {
			employees.add(user);
			System.out.println(employees);
			return user;
		}

		private static List<Employee> createList() {
			List<Employee> tempEmployees = new ArrayList<>();
			Employee emp1 = new Employee();
			emp1.setName("emp1");
			emp1.setDesignation("manager");
			emp1.setEmpId("1");
			emp1.setSalary(3000);

			Employee emp2 = new Employee();
			emp2.setName("emp2");
			emp2.setDesignation("developer");
			emp2.setEmpId("2");
			emp2.setSalary(30000);
			tempEmployees.add(emp1);
			tempEmployees.add(emp2);
			return tempEmployees;
		}

	}

	 

	