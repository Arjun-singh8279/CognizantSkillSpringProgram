package JavaFSE.DeepsKilling.Module6_SpringData_JPA_with_SpringBoot_Hibernate.src.main.java.org.example.spring_data_jpa_querymethods.Exercise03.service;

import org.example.spring_data_jpa_querymethods.Exercise03.model.Department;
import org.example.spring_data_jpa_querymethods.Exercise03.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department getDepartment(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }
}