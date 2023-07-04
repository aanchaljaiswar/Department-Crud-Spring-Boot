package emp.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emp.department.entities.EmpDepMapping;
import emp.department.repository.EmpDepMappingRepository;
import java.util.List;

@Service
public class EmpDepMappingService {
	
	@Autowired
	private EmpDepMappingRepository empDepMappingRepository;

 
    public EmpDepMapping saveEmpDepMapping(EmpDepMapping empDepMapping) {
        return empDepMappingRepository.save(empDepMapping);
    }
    
    public List<EmpDepMapping> getAllEmpDepMappings() {
        return empDepMappingRepository.findAll();
    }
        
    public List<EmpDepMapping> addMultipleEmpDepMappings(List<EmpDepMapping> empDepMappings) {
            return empDepMappingRepository.saveAll(empDepMappings);
    }

    public EmpDepMapping getEmpDepMappingById(int id) {
        return empDepMappingRepository.findById(id).orElse(null);
    }
 
   
}
   

