package rmi.Product;

import java.rmi.*;
import java.rmi.server.*;

class ProductImpl extends UnicastRemoteObject
        implements Product {
    private String descr;

    public ProductImpl(String d) throws RemoteException {
        descr = d;
    }

    public String getDescription() {
        return "I am a " + descr + ".";
    }
}