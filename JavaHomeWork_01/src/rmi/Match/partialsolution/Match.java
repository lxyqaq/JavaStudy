package rmi.Match.partialsolution;

import java.rmi.*;

interface Match extends Remote {
    public void team1_goal() throws RemoteException;

    public void team2_goal() throws RemoteException;

    public String read_result() throws RemoteException;
}
