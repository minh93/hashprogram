/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author PhamDucMinh
 */
public interface HashInterface extends Remote{
    public String checkSumGen(String source, String mode) throws RemoteException;
}
