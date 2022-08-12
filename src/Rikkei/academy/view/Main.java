package Rikkei.academy.view;

import java.util.Scanner;

public class Main {
   private final Scanner scanner = new Scanner(System.in);

    public Main() {
        System.out.println("MENU");
        System.out.println("1:, Show list Singer");
        System.out.println("2:, Create Singer");
        System.out.println("3:, Updeta Singer");
        System.out.println("4:, Detail Singer");
        System.out.println("5:, Delete Singer");
        System.out.println("6:, Sort Singer");
        System.out.println("7:, Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        SingerView singerView = new SingerView();
        switch (choice){
            case 1:
                singerView.showListSinger();
                break;
            case 2:
                singerView.createSinger();
                break;
            case 3:
                singerView.updetatSinger();
                break;
            case 4:
                singerView.showDetailtSinger();
                break;
            case 5:
                singerView.deleteSinger();
                break;
            case 6:
                singerView.sortSinger();
                break;
            case 7:
                singerView.exit(0);
                break;
            default:
                System.out.println("Invalid choice");

        }
        new Main();

    }

    public static void main(String[] args) { new Main();

    }
}