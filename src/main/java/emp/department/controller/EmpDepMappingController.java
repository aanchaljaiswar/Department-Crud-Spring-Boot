package emp.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import emp.department.entities.EmpDepMapping;
import emp.department.service.EmpDepMappingService;

import java.util.List;

@RestController
//@RequestMapping("/api/empdepmapping")
public class EmpDepMappingController {
    @Autowired
    private EmpDepMappingService empDepMappingService;
    
    @PostMapping("/addmap")
    public EmpDepMapping createEmpDepMapping(@RequestBody EmpDepMapping empDepMapping) {
        return empDepMappingService.saveEmpDepMapping(empDepMapping);
    }
    
    @PostMapping("/allmap")
    public List<EmpDepMapping> addMultipleEmpDepMappings(@RequestBody List<EmpDepMapping> empDepMappings) {
        return empDepMappingService.addMultipleEmpDepMappings(empDepMappings);
    }
        
    @GetMapping("/getmap")
    public List<EmpDepMapping> getAllEmpDepMappings() {
        return empDepMappingService.getAllEmpDepMappings();
    }

    @GetMapping("/getmap/{id}")
    public EmpDepMapping getEmpDepMappingById(@PathVariable int id) {
        return empDepMappingService.getEmpDepMappingById(id);
    }
    
   
    
}

