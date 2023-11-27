import java.util.Scanner;

public class Tecnologia extends Producto{
    public Tecnologia() {
    }
    private double almacenamiento;
    private double RAM;
    private String tipoCarga;
    private String conexionWifi;

    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, double almacenamiento, double RAM, String tipoCarga, String conexionWifi) {
        super(nombre, precio, codigo, cantidad, marca);
        this.almacenamiento = almacenamiento;
        this.RAM = RAM;
        this.tipoCarga = tipoCarga;
        this.conexionWifi = conexionWifi;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getConexionWifi() {
        return conexionWifi;
    }

    public void setConexionWifi(String conexionWifi) {
        this.conexionWifi = conexionWifi;
    }

    @Override
    public void ingresarProducto() {
        super.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el almacenamiento del dispositivo en GB:");
        this.almacenamiento = sc.nextDouble();
        System.out.println("Ingrese la memoria RAM del dispositivo en GB:");
        this.RAM = sc.nextDouble();
        System.out.println("Indique el tipo de carga del dispositivo:");
        this.tipoCarga = sc.next();
        System.out.println("Indique el tipo de conexion a Internet disponible:");
        this.conexionWifi = sc.next();
    }

    @Override
    public void imprimirProducto(){
        super.imprimirProducto();
        System.out.println("Almacenamiento "+almacenamiento+" GB");
        System.out.println("Memoria RAM: "+RAM);
        System.out.println("Tipo de carga: "+tipoCarga);
        System.out.println("Conexion Wifi: "+conexionWifi);
    }
}
