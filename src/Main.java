import ejercicio.java.SmartPhone;
import ejercicio.java.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setMemoria_ram(2);
        smartPhone.setMemoria_room(64);
        smartPhone.setTactil(true);
        smartPhone.setEstado(true);
        smartPhone.setDimension_de_pantalla("393x851");
        smartPhone.setCompania("Movistar");
        smartPhone.setNumero_de_telefono("+543624230777");

        System.out.println("Memoria ram: "+smartPhone.getMemoria_ram()+"GB");
        System.out.println("Memoria room: "+smartPhone.getMemoria_room()+"GB");
        System.out.println("Mando: "+smartPhone.mando());
        System.out.println("Estado actual del dispositivo: "+smartPhone.condicion());
        System.out.println("Dimensión en pixeles: "+smartPhone.getDimension_de_pantalla());
        System.out.println("Compañia del dispositivo: "+smartPhone.getCompania());
        System.out.println("Numero de telefono: "+smartPhone.getNumero_de_telefono());


        System.out.println("---------------------------------------------------------");

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.setMemoria_ram(1);
        smartWatch.setMemoria_room(4);
        smartWatch.setTactil(false);
        smartWatch.setEstado(true);
        smartWatch.setDimension_de_pantalla("42x35");
        smartWatch.setConexion(true);

        System.out.println("Memoria ram: "+smartWatch.getMemoria_ram()+"GB");
        System.out.println("Memoria room: "+smartWatch.getMemoria_room()+"GB");
        System.out.println("Mando: "+smartWatch.mando());
        System.out.println("Estado actual del dispositivo: "+smartWatch.condicion());
        System.out.println("Dimensión en pixeles: "+smartWatch.getDimension_de_pantalla());
        System.out.println("Estado de conexión: "+smartWatch.estado_conexion());






    }
}