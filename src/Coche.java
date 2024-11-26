public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    public Coche(String marca,String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void encender() {
        System.out.println("El coche está encendido.");
    }

    public void apagar() {
        System.out.println("El coche se apaga de manera segura.");
    }


    @Override
    public String toString() {
        return "Coche {"+
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
