package JavaFSE.DeepsKilling.Module6_SpringData_JPA_with_SpringBoot_Hibernate.src.main.java.org.example.spring_data_jpa_querymethods.Exercise04.repository;

import org.example.spring_data_jpa_querymethods.Exercise04.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}