/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cscountdown;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lbren
 */
public class GestioneClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            String msgletto = cli.Leggi();
            System.out.println(msgletto);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestioneClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
