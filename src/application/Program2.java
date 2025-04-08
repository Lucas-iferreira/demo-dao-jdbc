package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("==== TEST 1: Department findById ====");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n==== TEST 2: Department findAll ====");
        List<Department> list = departmentDao.findall();
        for(Department d: list){
            System.out.println(d);
        }

//        System.out.println("\n==== TEST 3: Department insert ====");
//        Department newDepartment = new Department(null, "Smartphones");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New Id: " + newDepartment.getId());

//        System.out.println("\n==== TEST 4: Department update ====");
//        department = departmentDao.findById(7);
//        department.setName("Pets");
//        departmentDao.update(department);
//        System.out.println("Update Completed! ");

        System.out.println("\n==== TEST 5: Department delete ====");
        System.out.print("Enter id for delete test:");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");


    }
}
