package rmi.Counter;

import java.rmi.*;
import java.rmi.server.*;

class CounterImpl extends UnicastRemoteObject implements Counter {
    public int value;

    public CounterImpl(int v) throws RemoteException {
        value = v;
    }

    public void increment() throws RemoteException {
        this.value++;
    }

    public void decrement() throws RemoteException {
        this.value--;
    }

    public int readValue() throws RemoteException {
        return this.value;
    }
}
