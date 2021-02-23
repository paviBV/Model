package com.model;

import com.model.manager.ModelManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModelManager modelManager = new ModelManager();

        Scanner sc = new Scanner(System.in);
        int Choice = 0;
        do {

            System.out.println("Please enter the Option");
            System.out.println("Option 1: Add ");
            System.out.println("Option 2: Display");
            System.out.println("Option 3: Update");
            System.out.println("Option 4: Search");
            System.out.println("Option 5: Delete");
            Choice = sc.nextInt();

            if (Choice == 1) {
                System.out.println("Please enter the Details of the record");
                System.out.println("Please enter the Id");
                int id = sc.nextInt();
                System.out.println("Please enter the Name");
                String name = sc.next();
                System.out.println("Please enter the Size");
                String size = sc.next();
                modelManager.setModel(id, name,size);

            }
            if (Choice == 2) {
                System.out.println("Total record");
                modelManager.getModelList();
            }

            if (Choice == 3) {
                System.out.println("Please enter the Id to update the record");
                System.out.println("Please enter the Id");
                int id = sc.nextInt();
                System.out.println("Please enter the Name");
                String name = sc.next();
                System.out.println("Please enter the Size");
                String size = sc.next();
                modelManager.updateModelList(id, name,size);

            }
            if (Choice == 4) {
                System.out.println("Record you were looking for");
                int id = sc.nextInt();
                modelManager.singleModelList(id);
            }

            if (Choice == 5) {
                System.out.println("Please enter the Id to Delete the record");
                int id = sc.nextInt();
                modelManager.DeleteModelList(id);
                modelManager.getModelList();
            }
        }while (Choice!=6);

    }

}
