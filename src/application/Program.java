package application;

import model.entities.Department;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"Books");

        Seller seller =new Seller(21,"Lucas", "Lucas", new Date(), 3000.0, obj);
        System.out.println(seller);
        System.out.println(obj);
    }
}
