package emp.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emp.department.entities.Department;
import emp.department.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    
    public List<Department> addMultipleDepartments(List<Department> departments) {
        return departmentRepository.saveAll(departments);
    }
    
    public Department getDepartmentsById(int id) {
    	return departmentRepository.findById(id).orElse(null);
     
    }

}