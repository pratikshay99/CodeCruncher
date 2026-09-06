package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    // constructor injection - preferred over field @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        Employee saved = repository.save(emp);
        return mapToDTO(saved);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee emp = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));
        return mapToDTO(emp);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
      /*  return repository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    */
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee emp : repository.findAll()) {
            employeeDTOs.add(mapToDTO(emp));
        }

        return employeeDTOs;
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO dto) {
        Employee emp = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return mapToDTO(repository.save(emp));
    }

    @Override
    public void deleteEmployee(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found: " + id);
        }
        repository.deleteById(id);
    }

    private EmployeeDTO mapToDTO(Employee emp) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(emp.getId());
        dto.setName(emp.getName());
        dto.setDepartment(emp.getDepartment());
        dto.setSalary(emp.getSalary());
        return dto;
    }
}
/**
 @Override:
 What happens if you remove @Override
 Nothing breaks — as long as your method signature is correct. Java doesn't need @Override to know that getEmployeeById implements the interface method. It works purely by matching the method name + parameters + return type.
 So this compiles and runs fine without it too:

 So then why use it at all? (this is the real reason)
 @Override protects you from typos and mistakes. Without it, if you make a small mistake in the method signature, Java will silently treat it as a brand new method instead of an implementation — and your code will compile, but it'll be wrong.

 Interview line:
 "@Override is just a compiler check, not a runtime requirement — the code would still work without it if the signature is correct.
 I use it because it catches mistakes early, like typos in method names or wrong parameter types —
 the compiler immediately flags it at that exact line, instead of giving a vague error somewhere else in the class."
 *
 */