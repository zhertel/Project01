package com.hertel.project01;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Main {

    static Scanner input = new Scanner(System.in);
    static List<String> tasks = new LinkedList<>();

    static void displayChoices() {
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
    }

    static void addTask() {
        System.out.print("Describe the task you want to add: ");
        String task = input.nextLine();
        task = input.nextLine();
        if (tasks.indexOf(task)==-1) {
            tasks.add(task);
        } else {
            System.out.println("That task already exists.");
        }
    }

    static void removeTask() {
        System.out.print("Enter the number of the task to remove: ");
        int taskNum = input.nextInt();
        //taskNum = input.nextInt();
        int index = taskNum-1;
        tasks.remove(index);
    }

    static void updateTask() {
        System.out.print("Enter the number of the task to change: ");
        int taskNum = input.nextInt();
        int index = taskNum-1;
        System.out.print("Describe what you want to change the task to: ");
        String task = input.nextLine();
        task = input.nextLine();

        tasks.set(index, task);
    }

    static void listTasks() {
        for (String task:tasks) {
            int index = tasks.indexOf(task);
            System.out.println((index + 1) + ". " + task);
        }
    }

    public static void main(String[] args) {
        int choice = 1;
	    while (choice != 0) {
	        displayChoices();
	        choice = input.nextInt();
	        switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    listTasks();
                    break;
                case 0:
                    break;
                default:
                    System.out.println(choice + " is not an option.");
            }

        }
    }
}
