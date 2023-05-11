
import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {
    private String provedor;
    private double price;

    public Product(String id, double price) {
        this.provedor = id;
        this.price = price;
    }

    public Product() {

    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Metodos

    public void calcularPrecioPublico() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        double precioUnitario = 0;
        double precioPublico = 0;
        System.out.println("Menu principal");
        System.out.println("1.- SYD");
        System.out.println("2.- AUTO TODO");
        System.out.println("3.- MONCADA");
        System.out.println("4.- ACEITES");
        System.out.println("5.- SALIR");
        System.out.print("Proveedor o producto: ");
        provedor = sc.nextLine();
        switch (provedor) {
            case "SYD", "syd", "Syd", "1" -> {
                System.out.println("Precio unitario: ");
                precioUnitario = sc.nextDouble();
                precioPublico = precioUnitario * 0.9 * 0.95 * 1.16 * 0.95 * 0.95 * 1.35;
                System.out.println("Precio publico: $" + df.format(precioPublico));
            }
            case "AUTO TODO", "auto todo", "Auto Todo", "2" -> {
                System.out.println("Mrcancia de AUTO TODO");
                System.out.println("Seleccione el tipo de mercancia: ");
                System.out.println("1.- Precio bajo \n2.- Precio medio \n3.- Precio alto");
                String tipoMercancia = sc.nextLine();
                switch (tipoMercancia) {
                    case "3" -> { // precio alto
                        System.out.println("= MERCANCIA DE PRECIO ALTO =");
                        System.out.println("Precio unitario: ");
                        precioUnitario = sc.nextDouble();
                        precioPublico = precioUnitario * 1.16 * 0.93 * 1.21;
                        System.out.println("Precio publico: $" + df.format(precioPublico));
                    }
                    case "2" -> { // precio medio
                        System.out.println("= MERCANICA DE PRECIO MEDIO =");
                        System.out.println("Precio unitario: ");
                        precioUnitario = sc.nextDouble();
                        precioPublico = precioUnitario * 1.16 * 0.93 * 1.35;
                        System.out.println("Precio publico: $" + df.format(precioPublico));
                    }
                    case "1" -> { // precio bajo
                        System.out.println("= MERCANICA DE PRECIO BAJO = ");
                        System.out.println("Precio unitario: ");
                        precioUnitario = sc.nextDouble();
                        precioPublico = precioUnitario * 1.16 * 0.93 * 1.40;
                        System.out.println("Precio publico: $" + df.format(precioPublico));
                    }
                    default -> System.out.println("Tipo de mercancia no valido");
                }
            }
            case "MONCADA", "moncada", "Moncada", "3" -> {
                System.out.println("Precio unitario: ");
                precioUnitario = sc.nextDouble();
                precioPublico = precioUnitario * 1.16 * 1.20;
                System.out.println("Precio publico: $" + precioPublico);
            }
            case "ACEITES", "aceites", "Aceites", "4" -> {
                System.out.println("Precio unitario: ");
                precioUnitario = sc.nextDouble();
                precioPublico = (precioUnitario * 1.16) + 20;
                System.out.println("Precio publico: $" + precioPublico);
            }
            default -> System.out.println("Proveedor no valido");
        }

    }
}
