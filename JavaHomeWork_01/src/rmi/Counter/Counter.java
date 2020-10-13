package rmi.Counter;

import java.rmi.*;

interface Counter extends Remote {
    public void increment() throws RemoteException;

    public void decrement() throws RemoteException;

    public int readValue() throws RemoteException;
}
