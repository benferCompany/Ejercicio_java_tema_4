package ejercicio.java;

public class SmartPhone extends SmartDevice{

    String numero_de_telefono;
    String compania;


    public String getNumero_de_telefono() {
        return numero_de_telefono;
    }

    public void setNumero_de_telefono(String numero_de_telefono) {
        this.numero_de_telefono = numero_de_telefono;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public SmartPhone(String dimension_de_pantalla, boolean tactil, boolean estado, int memoria_ram, int memoria_room, String numero_de_telefono, String compania) {
        super(dimension_de_pantalla, tactil, estado, memoria_ram, memoria_room);
        this.numero_de_telefono = numero_de_telefono;
        this.compania = compania;
    }

    public SmartPhone() {
        super();
    }
}
