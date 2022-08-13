package Rikkei.academy.view;

import Rikkei.academy.controller.SingerController;
import Rikkei.academy.controller.SongController;

import java.util.Scanner;

public class SongView {
private final Scanner scanner = new Scanner(System.in);
private final SongController songController = new SongController();
private final SingerController singerController = new SingerController();



public void menu(){
    System.out.println("SONG MENU");
    System.out.println("1. Show List Song");
    System.out.println("2. Create Song");
    System.out.println("3. Update Song");
    System.out.println("4. Delete Song");
    System.out.println("5. Song Charts");
    System.out.println("6. Exit");
    int choice = Integer.parseInt(scanner.nextLine());
    switch (choice) {
        case 1:
            this.showListSong();
            break;
        case 2:
            this.createSong();
            break;
        case 3:
            this.updateSong();
            break;
        case 4:
            this.deleteSong();
            break;
        case 5:
            this.chartsView();
            break;
        case 6:
            new Main();
            break;
        default:
            System.out.println("Invalid choice");
    }
    new SongView().menu();

}

    private void chartsView() {
    }

    private void deleteSong() {
    }

    private void updateSong() {
    }

    private void createSong() {
    }

    private void showListSong() {
    }

}

