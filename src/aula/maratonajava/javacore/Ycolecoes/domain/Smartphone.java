package aula.maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; //comparação com null
        if (this == obj) return true; //reflexiva
        if (this.getClass() != obj.getClass()) return false; //garante que sao da mesma classe

        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMarca() {
        return marca;
    }
}
