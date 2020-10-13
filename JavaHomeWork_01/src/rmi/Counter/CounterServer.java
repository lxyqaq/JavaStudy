package rmi.Counter;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.Scanner;


class CounterServer {
    public static void main(String[] args) throws Exception {

        LocateRegistry.createRegistry(1099);
        System.out.println("java RMI registry created.");
        CounterImpl c = new CounterImpl(0);

        Naming.rebind("toaster", c);

    }
}
