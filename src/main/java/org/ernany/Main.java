package org.ernany;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { /*
        String path = "C:\\Users\\julio\\Documents\\out.txt";
        String[] lines = new String[]{"Olá", "Fodase", "Teste"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (int i = 0; i < lines.length; i++) {
               bw.write(lines[i]);
               bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } */

        Scanner sc = new Scanner(System.in);
        System.out.println("path: ");
        String strPath = sc.nextLine();
        int i = 1;
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        File[] files = path.listFiles(File::isFile);

        System.out.println("FOLDERS: ");

        for(File f : folders){
            System.out.println("#" + (i) + " " + f);
            i++;
        }

        i = 1;

        System.out.println("FILES: ");



        for(File f : files){
            System.out.println("#" + (i) + " " + f);
            i++;
        }

        System.out.println(path);


    }
}