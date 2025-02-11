package com.example;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna tehtaalle nimi:" );
        String factoryName = scanner.nextLine();
        Factory factory = new Factory(factoryName);

        boolean exit = false;

        while(!exit) {
            System.out.println("1) Lisää kone\n2) Listaa kaikki koneet\n0) Lopeta ohjelma");
            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Virheellinen syöte, yritä uudelleen.");
                scanner.next();
                continue;
            }
            switch(choice){
                
                case 1:
                System.out.println("Anna koneen tyyppi: ");
                String machineType = scanner.nextLine();

                System.out.println("Anna koneen malli: ");
                String machineModel = scanner.nextLine();
 
                System.out.println("Anna työntekijän nimi: ");
                String workerName = scanner.nextLine();

                System.out.println("Anna työntekijän ammattinimike: ");
                String workerRole = scanner.nextLine();
                Worker worker = new Worker(workerName, workerRole);
                Machine machine = new Machine(machineType, machineModel, worker);
                factory.addMachine(machine);
                System.out.println("Kone lisätty!");
                break;
                case 2:
                System.out.println("Tehtaasta " + factory.getName() + " löytyy seuraavat koneet:");
                for (Machine m : factory.getMachines()) {
                    System.out.println(m.getMachineDetails());
                    System.out.println();
                }
                break;

                case 0:
                System.out.println("Kiitos ohjelman käytöstä.");
                exit = true;
                break;
            }
            
        }
        scanner.close();
    } 
}
