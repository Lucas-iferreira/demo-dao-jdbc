package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: Department findById ====");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n==== TEST 2: Department findById ====");
        List<Department> list = departmentDao.findall();
        for(Department d: list){
            System.out.println(d);
        }

        System.out.println("\n==== TEST 3: Department insert ====");
        Department department = new Department(null, "Smartphones");
        departmentDao.insert(department);
        System.out.println("Inserted! New Id: " + department.getId());
    }
}
