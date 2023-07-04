package emp.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emp.department.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

