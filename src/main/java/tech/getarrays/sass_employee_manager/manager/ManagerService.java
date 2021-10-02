package tech.getarrays.sass_employee_manager.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService  {

    private final ManagerRepository managerRepository;

    @Autowired
    public ManagerService( ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public List<Manager> getManagers() {
        List<Manager> managers = this.managerRepository.findAll();
        return managers;
    }

}
