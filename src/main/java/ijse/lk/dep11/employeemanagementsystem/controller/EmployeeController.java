package ijse.lk.dep11.employeemanagementsystem.controller;

import ijse.lk.dep11.employeemanagementsystem.entity.Employee;
import ijse.lk.dep11.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/enroll")
    public ResponseEntity<String> enrollEmployee(@RequestBody Employee employee) {
        Employee enrolledEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok("Employee enrolled successfully with ID: " + enrolledEmployee.getId());
    }
}
