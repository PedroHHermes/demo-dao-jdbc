package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
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

        System.out.println();
        System.out.println("== Test 2: Seller FindByDepartment ==");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj: list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("== Test 3: Seller FindAll ==");
        list = sellerDao.findAll();
        for (Seller obj: list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("== Test 4: Seller Insert ==");
        Seller newseller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.00, department);
        sellerDao.insert(newseller);
        System.out.println("Inserted! New ID = " + newseller.getId());

        System.out.println();
        System.out.println("== Test 5: Seller Update ==");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println();
        System.out.println("== Test 6: Seller Delete ==");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}
