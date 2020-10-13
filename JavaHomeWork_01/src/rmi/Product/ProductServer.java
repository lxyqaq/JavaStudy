package rmi.Product;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.Scanner;


public class ProductServer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
        }
        System.out.println("Enter Your First Name:");
        String nm = sc.next();
        System.out.println(nm);
        try {
            ProductImpl p1 = new ProductImpl(nm);
            Naming.rebind("toaster", p1);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}