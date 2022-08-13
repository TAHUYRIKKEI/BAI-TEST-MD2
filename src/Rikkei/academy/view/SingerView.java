package Rikkei.academy.view;

import Rikkei.academy.controller.SingerController;
import Rikkei.academy.model.Singer;

import java.util.Scanner;

public class SingerView {
    Scanner scanner = new Scanner(System.in);
    private final SingerController singerController = new SingerController();

    public void showListSinger() {
        for (Singer singer: singerController.getSingers()){
            System.out.println(singer.getId() + "   " + singer.getName() + " " + singer.getAge());
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }

    }

    public void createSinger() {
        System.out.println("Enter singer id name");
        String name = scanner .nextLine();
        System.out.println("Singer age");
        int age = Integer.parseInt(scanner.nextLine());
        singerController.addSinger(new Singer(singerController.getSingers().size() + 1, name, age));

        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }


    public void updetatSinger() {
        System.out.println("EDIT SINGER");
        System.out.println("Enter singer id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isvalid(id)){
            System.out.println("Id out of range");
            return;
        }
        Singer singer = singerController.findSingerById(id);
        System.out.println("Enter new singer name:");
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        singer.setName(name);
        singer.setAge(age);

        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }
    public void showDetailtSinger() {
        System.out.println("Enter singer id to show:");
        int id = Integer.parseInt(scanner.nextLine());
        Singer singer = singerController.findSingerById(id);
        System.out.println("Id:" + singer.getId() + ",name:" + singer.getName() + ",age" + singer.getAge());

        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }

    }

    public void deleteSinger() {
        System.out.println("Enter singer id delete");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isvalid(id)) {
            System.out.println("Id uot of range");
        }
        System.out.println("Are you sure want to delete (yes/No)?");
        String check = scanner.nextLine();
        if (check.equalsIgnoreCase("yes")) {
            singerController.deleteSinger(id);
        } else if (check.equalsIgnoreCase("no")) {
            System.out.println("Not deleting");
        } else {
            System.out.println("Invalid choice");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }


//    private boolean isvalid(int id) {
//        int size = singerController.getSingers().size();
//        return id >= 0 && id < size;
//    }
    }
    public void sortSinger() {
        singerController.sortSingerList();
        System.out.println("Singer list sorted");
    }


    public void exit(int i) {
    }

    private boolean isvalid(int id) {
        int size = singerController.getSingers().size();
        return id >= 0 && id < size;
    }
}
