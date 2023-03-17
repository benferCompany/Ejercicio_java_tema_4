package ejercicio.java;

public class SmartWatch extends SmartDevice{

    boolean conexion;
    public String estado_conexion(){
        if(conexion){
            return "El dipositivo esta conectar a un telefono";
        }else{
            return "El dispositivo no esta vinculado.";
        }
    }


    public boolean isConexion() {
        return conexion;
    }

    public void setConexion(boolean conexion) {
        this.conexion = conexion;
    }

    public SmartWatch(String dimension_de_pantalla, boolean tactil, boolean estado, int memoria_ram, int memoria_room, boolean conexion) {
        super(dimension_de_pantalla, tactil, estado, memoria_ram, memoria_room);
        this.conexion = conexion;
    }

    public SmartWatch() {
       super();
    }
}
