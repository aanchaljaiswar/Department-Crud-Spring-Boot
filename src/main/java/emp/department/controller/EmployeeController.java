package emp.department.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*; 
import emp.department.entities.EmpDepMapping;
import emp.department.entities.EmployeeDto;
import emp.department.service.EmployeeService;

@RestController 
 //@RequestMapping("/api") 
public class EmployeeController {
private final EmployeeService employeeService;
 
 	public EmployeeController(EmployeeService employeeService) {
 		this.employeeService = employeeService; 
 		}

 	@PostMapping("/employee/assignDepartment") public EmpDepMapping
 		assignEmployeeToDepartment(@RequestBody EmpDepMapping empDepMapping) { 
 		return employeeService.assignEmployeeToDepartment(empDepMapping);
 		}
  
 	@GetMapping("/employees") public List<EmployeeDto>
 		listEmployeesWithDepartments() { 
 		return employeeService.listEmployeesWithDepartments();
 		}

 	@GetMapping("/employees/{id}")
 	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable int id) {
 	    EmployeeDto employeeDto = employeeService.getEmployeeById(id);

 	    if (employeeDto != null) {
 	        return ResponseEntity.ok(employeeDto);
 	    }

 	    return ResponseEntity.notFound().build();
 	}

 }
