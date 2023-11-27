import java.util.Scanner;

public class Menu {
    private int opcion, cantidad;

    public Menu() {
    }

    public Menu(int opcion, int cantidad) {
        this.opcion = opcion;
        this.cantidad = cantidad;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void menuProductos(){
        Scanner sc = new Scanner(System.in);
            System.out.println("MENU DE SELECCION DE PRODUCTOS HIPERMERCADOS");
            System.out.println("1. Alimento");
            System.out.println("2. Electrodomestico");
            System.out.println("3. Tecnologia");
            System.out.println("Ingrese la opcion para continuar: ");
            this.opcion = sc.nextInt();
            if (opcion == 1) {
                Alimento a1 = new Alimento();
                a1.ingresarProducto();
                a1.imprimirProducto();
            } else if (opcion == 2) {
                Electrodomestico e1 = new Electrodomestico();
                e1.ingresarProducto();
                e1.imprimirProducto();
            } else if (opcion == 3) {
                Tecnologia t1 = new Tecnologia();
                t1.ingresarProducto();
                t1.imprimirProducto();
            } else {
                System.out.println("Opcion incorrecta");
            }
    }
    public void registroProductos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos a registrar: ");
        this.cantidad= sc.nextInt();
        for(int i=0;i<cantidad;i++) {
            menuProductos();
        }
    }

}
