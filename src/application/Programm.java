package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Programm {
    public static void main(String[] args) {
        System.out.println("=== 1: findById Department");
        DepartmentDao depdao = DaoFactory.createDepartmentDao();
        Department dep = depdao.findById(2);
        System.out.println(dep);

        System.out.println();
        System.out.println("===2: FindAll Department");
        List<Department> list = depdao.findAll();

        for (Department d : list) {
            System.out.println(d);
        }

//        System.out.println();
//        System.out.println("===3: insert Department");
//        depdao.insert(new Department(null, "Shirt"));
//        System.out.println("Department completed! ");

//        System.out.println();
//        System.out.println("===4: update Department");
//        dep = depdao.findById(5);
//        dep.setName("Shirts");
//        depdao.update(dep);
//        System.out.println("Department updated!! ");

        System.out.println();
        System.out.println("=== TEST 6: delete seller ");
        depdao.deleteById(5);
        System.out.println(" Delete completed! ");
    }
}
