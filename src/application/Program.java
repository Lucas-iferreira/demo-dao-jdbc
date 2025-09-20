package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);

        Seller seller = new Seller(1, "Lucas", "lucas@gmail.com", new Date(), 1200.00, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
