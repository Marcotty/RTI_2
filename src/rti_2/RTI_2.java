/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rti_2;

import rti_2.client.Connexion;

/**
 *
 * @author fredm
 */
public class RTI_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connexion connect = new Connexion();
        connect.setLocation(200, 200);
        connect.setVisible(true);
    }
    
}