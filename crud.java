package demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import demo.model.*;
@Service 

public class crud {
//	public List<Employee> emplist=new ArrayList<>();
//  public Employee addEmployee(Employee emp) {
//	  emplist.add(emp);
//	  return emp;
//  }
//  @DeleteMapping(path = { "/{id}" })
//  public Employee deleteEmp(@PathVariable("empId")int empId) {
//	  Employee deletedEmp = null;
//	  for(Employee x:emplist) {
//		  if(empId==x.equals(getEmpId())) {
//			  emplist.remove(x);
//			  deletedEmp=x;
//			  break;
//		  }
//	  }
//	  return deletedEmp;
//  }
//  public Employee getEmployee(int empId) {
//	  for(Employee x:emplist) {
//		  if(empId==x.getempId()) {
//			  return x;
//		  }
//		}
//	  return new Employee();
//  }
//  public List<Employee> updateEmployee(int oldempId,Employee employee) {
//	  for(Employee x:emplist) {
//		  if(x.getempId()==oldempId) {
//			  x.setempId(employee.getempId());
//			  x.setName(employee.getName());
//			  x.setDesignation(employee.getDesignation());
//			  x.setSalary(employee.getSalary());
//		  }
//	  }
//	  return emplist;
//  }
}
