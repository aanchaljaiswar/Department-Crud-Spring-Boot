package emp.department.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;

import emp.department.entities.Department;
import emp.department.entities.EmpDepMapping;
import emp.department.entities.EmployeeDto;
import emp.department.repository.DepartmentRepository;
import emp.department.repository.EmpDepMappingRepository;

@Service
public class EmployeeService {
    
    private final EmpDepMappingRepository empDepMappingRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmpDepMappingRepository empDepMappingRepository, DepartmentRepository departmentRepository) {
        this.empDepMappingRepository = empDepMappingRepository;
        this.departmentRepository = departmentRepository;
    }

    public EmpDepMapping assignEmployeeToDepartment(EmpDepMapping empDepMapping) {
        return empDepMappingRepository.save(empDepMapping);
    }

    public List<EmployeeDto> listEmployeesWithDepartments() {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        List<EmpDepMapping> empDepMappings = empDepMappingRepository.findAll();

        for (EmpDepMapping empDepMapping : empDepMappings) {
            int empId = empDepMapping.getEmpId();
            int deptId = empDepMapping.getDeptId();
            Department department = departmentRepository.findById(deptId).orElse(null);

            if (department != null) {
                EmployeeDto employeeDto = new EmployeeDto(empId, department.getId(), department.getName());
                employeeDtos.add(employeeDto);
            }
        }

        return employeeDtos;
    }
    
    
    public EmployeeDto getEmployeeById(int id) {
        EmpDepMapping empDepMapping = empDepMappingRepository.findByEmpId(id);

        if (empDepMapping != null) {
            int empId = empDepMapping.getEmpId();
            int deptId = empDepMapping.getDeptId();
            Department department = departmentRepository.findById(deptId).orElse(null);

            if (department != null) {
                return new EmployeeDto(empId, deptId, department.getName());
            }
        }

        return null;
    }



    
}

