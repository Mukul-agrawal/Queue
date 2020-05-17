package main;

import defination.MyQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        final Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Press 1 to \"add\" a node at the top.");
            System.out.println("Press 2 to \"Poll\" a node from the top.");
            System.out.println("Press 3 to \"Peek\" at the node at the top.");
            System.out.println("Press 4 to \"remove\" a node from the top.");
            System.out.println("Press 5 to \"element\" at the node at the top.");
            System.out.println("Press 6 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data(int num) of the node to push: ");
                    int data = scanner.nextInt();
                    queue.offer(data);
                    break;
                case 2:
                    int poppedData = queue.poll();
                    break;
                case 3:
                    System.out.println("Top of the node: " + queue.peek());
                    break;
                case 4:
                    int removeData = queue.poll();
                    System.out.println("Remove : " + removeData);
                    break;
                case 5:
                    System.out.println("element of the node: " + queue.element());
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice!");
            }
        }
    }
}

