package JavaFSE.DeepsKilling.Module7_Spring_Rest_using_SpringBoot3.spring_rest_handson.src.main.java.org.example.employeeresthandson.service;

import org.example.employeeresthandson.dao.EmployeeDao;
import org.example.employeeresthandson.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee getEmployee() {
        return employeeDao.getEmployee();
    }
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }
}