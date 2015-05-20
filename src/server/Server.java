package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import remote_interface.HashImplement;

/**
 *
 * @author PhamDucMinh
 */
public class Server {
    public static void main(String[] args) {
        try {
            HashImplement hi = new HashImplement();
            
            Registry listenRegis = LocateRegistry.createRegistry(8888);
            Naming.rebind("rmi://localhost:8888/ServerRMI", hi);
            
            System.out.println("Server running!");
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
