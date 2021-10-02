package tech.getarrays.sass_employee_manager.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarrays.sass_employee_manager.employee.Employee;
import tech.getarrays.sass_employee_manager.employee.EmployeeService;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/manager")
public class ManagerController {

    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }


    @GetMapping(path = "/all")
    public ResponseEntity<List<Manager>> getManagers(){
        List<Manager> managers = this.managerService.getManagers();
        return new ResponseEntity<>(managers, HttpStatus.OK);
    }


}
