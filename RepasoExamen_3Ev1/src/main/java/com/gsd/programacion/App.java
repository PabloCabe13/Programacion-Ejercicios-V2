package com.gsd.programacion;

public class App {
    public static void main(String[] args) {
    	EmpresaMovilidad empresa = new EmpresaMovilidad();
    	
    	CocheElectrico cocheElectrico = new CocheElectrico("9743NGB", 11000, EstadoVehiculo.DISPONIBLE);
    	PatineteElectrico patineteElectrico = new PatineteElectrico("12321", 432,  EstadoVehiculo.EN_CARGA);
    	
    	DatosCliente cliente1 = new DatosCliente("54343", "1234");
    	System.out.println(cliente1);
    	
    	empresa.aniadirVehiculo(patineteElectrico);
    	empresa.aniadirVehiculo(cocheElectrico);
    	empresa.aniadirVehiculo(patineteElectrico);
    	
    	empresa.mostrarFlota();
    	
    	System.out.println("\n---- Vehiculo Con Alta Autonomía ----");
    	empresa.buscarVehiculosDeAltaAutonomia(500)
    	       .forEach(v -> System.out.println("- Matricula: " + v.getMatricula() + ", Tipo Carnet: " + v.obtenerTipoCarnet()));
    }
}
