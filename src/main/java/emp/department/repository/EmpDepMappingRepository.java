package emp.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emp.department.entities.EmpDepMapping;

@Repository
public interface EmpDepMappingRepository extends JpaRepository<EmpDepMapping, Integer> {

	EmpDepMapping findByEmpId(int id);

	
}
