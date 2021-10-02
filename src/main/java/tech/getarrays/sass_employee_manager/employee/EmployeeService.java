package tech.getarrays.sass_employee_manager.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.sass_employee_manager.exception.UserNotFoundException;
import tech.getarrays.sass_employee_manager.manager.Manager;
import tech.getarrays.sass_employee_manager.manager.ManagerRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ManagerRepository managerRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, ManagerRepository managerRepository) {
        this.employeeRepository = employeeRepository;
        this.managerRepository = managerRepository;
    }

    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    public List<Employee> getEmployeesForManager(Long id) {
        return this.employeeRepository.getEmployeesForManager(id);
    }

    @Transactional
    public Employee add(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public  Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id:" + id+ " was not found"));
    }
    @Transactional
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }

}
