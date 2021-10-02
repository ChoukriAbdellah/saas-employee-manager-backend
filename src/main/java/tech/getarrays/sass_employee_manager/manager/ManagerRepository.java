package tech.getarrays.sass_employee_manager.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.sass_employee_manager.employee.Employee;

import java.util.Optional;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
