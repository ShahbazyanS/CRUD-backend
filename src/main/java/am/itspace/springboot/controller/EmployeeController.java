package am.itspace.springboot.controller;

import am.itspace.springboot.model.Employee;
import am.itspace.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmloyee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
