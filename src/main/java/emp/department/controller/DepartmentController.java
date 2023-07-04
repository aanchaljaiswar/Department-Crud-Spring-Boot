package emp.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import emp.department.entities.Department;
import emp.department.service.DepartmentService;

import java.util.List;

@RestController
//@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    
    @PostMapping("/adddep")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    
    @PostMapping("/alldep")
    public List<Department> addMultipleDepartments(@RequestBody List<Department> departments) {
        return departmentService.addMultipleDepartments(departments);
    }
    
    @GetMapping("/getdep")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
    
    @GetMapping("/getdep/{id}")
    public Department getDepartmentsById(@PathVariable int id) {
    	return departmentService.getDepartmentsById(id);
    }
    
    
}

