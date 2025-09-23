package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Programm {
    public static void main(String[] args) {
        System.out.println("=== 1: findById Department");
        DepartmentDao depdao = DaoFactory.createDepartmentDao();
        Department dep = depdao.findById(2);
        System.out.println(dep);
    }
}
