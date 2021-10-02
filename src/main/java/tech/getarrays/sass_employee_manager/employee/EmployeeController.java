package tech.getarrays.sass_employee_manager.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/all")
    public List<Employee> getEmployees() {
        return this.employeeService.getEmployees();
    }

    @GetMapping("/all/{managerId}")
    public ResponseEntity<List<Employee>> getEmployeesForManager(@PathVariable("managerId") Long id){
        List<Employee> employee =  this.employeeService.getEmployeesForManager(id);
        return  new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return  new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.add(employee);
        return  new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }


}
