package com.Peacsoft;

import com.Peacsoft.Cansol.Cansol;
import com.Peacsoft.service.CityService;
import com.Peacsoft.service.CountryService;
import com.Peacsoft.service.PresidentService;
import com.Peacsoft.service.serviceImpl.CityServiceImpl;
import com.Peacsoft.service.serviceImpl.CountryServiceImpl;
import com.Peacsoft.service.serviceImpl.PrecidentServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static CityService CityDataBase = new CityServiceImpl();
    static CountryService CountrydataBase = new CountryServiceImpl();
    static PresidentService president = new PrecidentServiceImpl();
    static Cansol cansol = new Cansol();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

        while (true){
            try {
                 cansol.printConsol();
                int number = scanner.nextInt();
                if (number < 0 || number > 7){
                    throw new Exception("you give wrong number"
                    );
                }
                switch (number) {
                    case 1 -> {
                        System.out.println(CityDataBase.getAllCity());
                    }
                    case 2 -> {
                        int findById = scanner.nextInt();
                        CityDataBase.findById(findById);
                    }
                    case 3 -> {
                        int deleteById = scanner.nextInt();
                        CityDataBase.deleteByIdCity(deleteById);
                    }
                    case 4 ->{
                        System.out.println(CountrydataBase.getAllCountry());
                    }
                    case 5 ->{
                        int findByCountry = scanner.nextInt();
                        CountrydataBase.findByIdCountry(findByCountry);
                    }
                    case 6 ->{
                        int deleteByCountry = scanner.nextInt();
                        CountrydataBase.deleteByIdCountry(deleteByCountry);
                    }
                    case 7 ->{
                        System.out.println(president.getAllPresident());
                    }
                    default -> System.out.println("not found your number");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
