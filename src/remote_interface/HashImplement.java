package remote_interface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import server.Checksum;

/**
 *
 * @author PhamDucMinh
 */
public class HashImplement extends UnicastRemoteObject implements HashInterface{

    public HashImplement() throws RemoteException{
        super();
    }    
    
    @Override
    public String checkSumGen(String source, String mode) {
        return Checksum.checksumGen(source, mode, true);
    }
    
}
