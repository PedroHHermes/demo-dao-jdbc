package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("== Test 1: Seller FindByID ==");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        sc.close();
    }
}
