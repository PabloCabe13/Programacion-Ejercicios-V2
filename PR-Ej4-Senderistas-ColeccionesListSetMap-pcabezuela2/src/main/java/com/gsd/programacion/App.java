package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        GestionSenderismo gs1 = new GestionSenderismo();
        Senderista s1 = new Senderista("Pepe");
        gs1.aniadirMontaña("k2");
        gs1.aniadirSendero("K2", "sendero1");
        gs1.aniadirSendero("K2", "sendero2");
        
        gs1.aniadirSenderista(s1);
        gs1.aniadirSenderista(s1);
     
        gs1.mostrarMontañasySenderos();
        gs1.recorrerSendero("sendero1", s1);
        gs1.mostrarNombreSenderistas();
    }
}
