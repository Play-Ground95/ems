package ijse.lk.dep11.employeemanagementsystem.service;

import ijse.lk.dep11.employeemanagementsystem.entity.Employee;
import ijse.lk.dep11.employeemanagementsystem.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
