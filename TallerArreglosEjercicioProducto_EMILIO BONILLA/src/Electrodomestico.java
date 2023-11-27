import java.util.Scanner;

public class Electrodomestico extends Producto{
    public Electrodomestico() {
    }
    private int vidaUtil;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtil, String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtil = vidaUtil;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }
    public double intervaloMantenimiento(){
        double intervalo = vidaUtil/5;
        return intervalo;
    }

    @Override
    public void ingresarProducto() {
        super.ingresarProducto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la vida util del producto(Anios):");
        this.vidaUtil = sc.nextInt();
        System.out.println("Ingrese el sitio de fabricacion:");
        this.sitioFabricacion = sc.next();
        System.out.println("Indique la cantidad de voltaje de alimentacion:");
        this.voltajeAlimentacion = sc.nextDouble();
        System.out.println("Ingrese la garantia de producto:");
        this.garantia = sc.next();
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    @Override
    public void imprimirProducto(){
        super.imprimirProducto();
        System.out.println("Vida Util: "+vidaUtil);
        System.out.println("Sitio de fabricacion: "+sitioFabricacion);
        System.out.println("Voltaje de alimentacion: "+voltajeAlimentacion);
        System.out.println("Garantia: "+garantia);
    }
}
