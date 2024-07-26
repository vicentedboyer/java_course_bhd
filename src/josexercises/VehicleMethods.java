package josexercises;

// Clase Vehiculo
class Vehiculo {
    // Atributos comunes a todos los vehículos
    private String marca;
    private String modelo;
    private int ano;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return ano;
    }

    public void setAño(int año) {
        this.ano = ano;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + ano);
    }
}

// Clase Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    // Atributo único de Moto
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int ano, boolean tieneSidecar) {
        super(marca, modelo, ano);
        this.tieneSidecar = tieneSidecar;
    }

    // Método getter y setter para tieneSidecar
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribir el método mostrarInfo para incluir el atributo único
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

// Clase principal para probar las clases
public class VehicleMethods {
    public static void main(String[] args) {
        // Crear un objeto de tipo Moto
        Moto miMoto = new Moto("Honda", "CB500F", 2020, true);

        // Mostrar la información de la moto
        miMoto.mostrarInfo();
    }
}
