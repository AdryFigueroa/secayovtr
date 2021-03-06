package Secayovtr;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
	private int id;
	private String nombre;
	private String tipo;
	private float precio;
	
	public Producto() {
		
	}
	
	public Producto(int id,String nombre,String tipo,float precio) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo; // tipo de producto hogar  movil
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public static final int OPCION_MENU_CREAR   = 1;
    public static final int OPCION_MENU_VER     = 2;
    public static final int OPCION_MENU_AGREGAR = 3;
    public static final int OPCION_MENU_PAGAR   = 4;
    public static final int OPCION_MENU_SALIR   = 5;
    
    public static ArrayList<Producto> productos = new ArrayList<>();
    
    public static void main(String[] args) {
        int opcionMenu;
        do {
            opcionMenu = menu();
            
            switch ( opcionMenu ) {
                case OPCION_MENU_CREAR:
                    crearProducto();
                    break;
                case OPCION_MENU_VER:
                    verProductos();
                    break;
                //case OPCION_MENU_AGREGAR:
                   // agregarProducto();
                   // break;
                //case OPCION_MENU_PAGAR:
                  //  pagarProducto()
                   // break;                
            }
            
        } while( opcionMenu != OPCION_MENU_SALIR );
        
        System.out.printf("Ha escogido la opción %d %n", opcionMenu);
    }
    
    private static int menu() {
        System.out.println("MENÚ\n=====");
        System.out.println("1. Crear producto");
        System.out.println("2. Ver productos");
        System.out.println("3. Agregar producto al carro");
        System.out.println("4. Pagar");
        System.out.println("5. Salir");
        System.out.println("\nPor favor escoja una opción:");
        try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextInt();
		}
    }
    
    private static void crearProducto() {
        System.out.println("\n\nCREAR PRODUCTO\n================\n\n");
        System.out.println("Ingrese el nombre de su producto:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio de su producto:");
        int precio = scanner.nextInt();
        System.out.println("Creando producto....");
        Producto productoNuevo = new Producto();
        productos.add(productoNuevo);
        verProductos();
    }
    
    private static void verProductos() {
        System.out.println("\n\nPRODUCTOS\n==============\n");
        int i = 1;
        for(Producto producto: productos ) {
            System.out.printf("%d.-%s $%d %n", i, producto.nombre, producto.precio, producto.tipo);
            i++;
        }
        System.out.println("\n\n");
    }
    
}

