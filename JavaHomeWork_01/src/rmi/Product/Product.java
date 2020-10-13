package rmi.Product;

import java.rmi.*;

interface Product extends Remote {
    public String getDescription() throws RemoteException;
}