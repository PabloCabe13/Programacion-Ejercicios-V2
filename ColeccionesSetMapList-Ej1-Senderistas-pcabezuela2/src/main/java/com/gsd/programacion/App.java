package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
        Senderista s1 = new Senderista ("Pepe");
        Senderista s2 = new Senderista ("Pablo");
        
        GestorMontañasySenderismo gs1 = new GestorMontañasySenderismo();
        
        gs1.añadirSenderista(s1);
        gs1.añadirSenderista(s2);
        
        gs1.añadirMontaña("Everest");
        gs1.añadirMontaña("k2");
        
        //Añadir sendero a montaña que no existe
        gs1.añadirSendero("Sendero 1", "MontañaNoExiste");
        //Añadir Sendero a montaña que si existe
        gs1.añadirSendero("Sendero 1", "k2");
        gs1.añadirSendero("Sendero 2", "k2");
        gs1.añadirSendero("Sendero 1", "Everest");
        
        //Recorrer Sendero
        gs1.recorrerSendero(s1, "Sendero 1", "k2");
        
        //Mostras Senderistas
        gs1.mostrarNombreSenderistas();
    }
}
