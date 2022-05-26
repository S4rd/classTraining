/**
 * created by Ilker Korkmaz.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {
        String tempModel;
        double tempPrice;
        String tempResponse;
        boolean tempDumperCheck;
        Scanner myScannerTool = new Scanner(System.in);
        SecureRandom myRandomNumberGeneratorTool = new SecureRandom();

        Vehicle baseClassReference = new Vehicle("BMW", 170000.0);
        baseClassReference.output();

        System.out.println();

        Truck derivedClassReference = new Truck();
        System.out.print("Enter the model of the truck: ");
        tempModel=myScannerTool.nextLine();
        derivedClassReference.setModel(tempModel);
        System.out.print("Enter the price of the truck: ");
        tempPrice=Double.parseDouble(myScannerTool.nextLine()); // the line is parsed to extract the double value in
        derivedClassReference.setPrice(tempPrice);
        System.out.print("Has this truck got a dumper? (Enter \"yes\" or any key otherwise): ");
        tempResponse=myScannerTool.nextLine();
        if (tempResponse.equals("yes"))  // OR:   tempDumperCheck = tempResponse.equals("yes");
            tempDumperCheck = true;
        else
            tempDumperCheck = false;
        derivedClassReference.setHasDumper(tempDumperCheck);
        derivedClassReference.output();

        System.out.println();

        Vehicle anotherBaseClassRef = new Truck("Ford", 20000.0, false);
        anotherBaseClassRef.output();

        System.out.println();

        Vehicle[] vArray = new Vehicle[5];
        for (int i = 0; i < vArray.length; i++) {
            System.out.print("Enter the model of the vehicle: ");
            tempModel=myScannerTool.nextLine();
            System.out.print("Enter the price of the vehicle: ");
            tempPrice=Double.parseDouble(myScannerTool.nextLine()); // the line is parsed to extract the double value in
            vArray[i] = new Vehicle(tempModel, tempPrice);
        }

        System.out.println("The information of the vehicles:");
        for (int i = 0; i < vArray.length; i++) {
            vArray[i].output();
        }

        System.out.println();

        ArrayList<Truck> tArrayList = new ArrayList<Truck>();
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter the model of the truck: ");
            tempModel=myScannerTool.nextLine();
            System.out.print("Enter the price of the truck: ");
            tempPrice=Double.parseDouble(myScannerTool.nextLine()); // the line is parsed to extract the double value in
            System.out.print("Has this truck got a dumper? (Enter \"yes\" or any key otherwise): ");
            tempResponse=myScannerTool.nextLine();
            if (tempResponse.equals("yes"))
                tempDumperCheck = true;
            else
                tempDumperCheck = false;
            tArrayList.add(new Truck(tempModel, tempPrice, tempDumperCheck));
        }

        System.out.println("The information of the trucks:");
        for (int i = 0; i < tArrayList.size(); i++) {
            tArrayList.get(i).output();
        }

        System.out.println();

        Vehicle[] vAnotherArray = new Vehicle[5];
        for (int i = 0; i < vAnotherArray.length; i++) {
            System.out.print("Enter the model of the truck: ");
            tempModel=myScannerTool.nextLine();
            System.out.print("Enter the price of the truck: ");
            tempPrice=Double.parseDouble(myScannerTool.nextLine()); // the line is parsed to extract the double value in
            System.out.print("Has this truck got a dumper? (Enter \"yes\" or any key otherwise): ");
            tempResponse=myScannerTool.nextLine();
            tempDumperCheck = tempResponse.equals("yes");
            vAnotherArray[i] = new Truck(tempModel, tempPrice, tempDumperCheck);
        }

        System.out.println("The information of the vehicles:");
        for (Vehicle itemReference : vAnotherArray) {
            itemReference.output();
        }

        System.out.println();


        ArrayList<Vehicle> anotherArrayList = new ArrayList<Vehicle>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Attempt#" + (i+1));
            System.out.println();
            if(myRandomNumberGeneratorTool.nextInt(4) == 0) {
                System.out.print("Enter the model of the vehicle: ");
                tempModel=myScannerTool.nextLine();
                System.out.print("Enter the price of the vehicle: ");
                tempPrice=Double.parseDouble(myScannerTool.nextLine()); // the line is parsed to extract the double value in
                anotherArrayList.add(new Vehicle(tempModel, tempPrice));
            }
            else if(myRandomNumberGeneratorTool.nextInt(4) == 1) {
                System.out.print("Enter the model of the truck: ");
                tempModel=myScannerTool.nextLine();
                System.out.print("Enter the price of the truck: ");
                tempPrice=Double.parseDouble(myScannerTool.nextLine()); // the line is parsed to extract the double value in
                System.out.print("Has this truck got a dumper? (Enter \"yes\" or any key otherwise): ");
                tempResponse=myScannerTool.nextLine();
                tempDumperCheck = tempResponse.equals("yes");
                anotherArrayList.add(new Truck(tempModel, tempPrice, tempDumperCheck));
            }
            else if(myRandomNumberGeneratorTool.nextInt(4) == 2) {
                System.out.println("A vehicle is created using default values for its data members.");
                anotherArrayList.add(new Vehicle());
            }
            else {
                System.out.println("A truck is created using default values for its data members.");
                anotherArrayList.add(new Truck());
            }
        }

        for (Vehicle itemReference : anotherArrayList) {
            itemReference.output();
        }
    } // end of method main
} // end of class Test