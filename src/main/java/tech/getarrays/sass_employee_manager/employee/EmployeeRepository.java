package tech.getarrays.sass_employee_manager.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends
        JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

    @Query("select e from Employee e where e.manager.id = :id")
    List<Employee> getEmployeesForManager(@Param("id") Long id);
}
