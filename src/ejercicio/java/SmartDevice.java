package ejercicio.java;

public class SmartDevice {

    private String dimension_de_pantalla;
    private boolean tactil;
    private boolean estado;
    private int memoria_ram;
    private int memoria_room;

    public String condicion(){
        if(this.estado){
            return "¡Prendido!";
        }else{
            return "¡Apagado!";
        }

    }
    public String mando(){
        if(this.tactil){
            return "Es tactil";
        }else{
            return "No es tactil";
        }
    }



    public String getDimension_de_pantalla() {
        return dimension_de_pantalla;
    }

    public void setDimension_de_pantalla(String dimension_de_pantalla) {
        this.dimension_de_pantalla = dimension_de_pantalla;
    }

    public boolean isTactil() {
        return tactil;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public int getMemoria_room() {
        return memoria_room;
    }

    public void setMemoria_room(int memoria_room) {
        this.memoria_room = memoria_room;
    }

    public SmartDevice(String dimension_de_pantalla, boolean tactil,boolean estado, int memoria_ram, int memoria_room) {
        this.dimension_de_pantalla = dimension_de_pantalla;
        this.tactil = tactil;
        this.estado = estado;
        this.memoria_ram = memoria_ram;
        this.memoria_room = memoria_room;
    }

    public SmartDevice() {

    }


}
