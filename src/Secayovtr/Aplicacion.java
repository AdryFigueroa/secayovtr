package Secayovtr;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Aplicacion {

	private static ArrayList<Producto> productos = new ArrayList<Producto>();

	// constantes
	public final static int OPCION_MENU_SALIR = 3;
	public final static int OPCION_MENU_PAGAR = 2;
	public final static int OPCION_MENU_CARRO = 1;


	public static void main(String[] args) {
	int opcionSeleccionada;
	do {
	opcionSeleccionada = menu();
	switch( opcionSeleccionada ) {
	case OPCION_MENU_CARRO:
	verProductos();
	break;
	case OPCION_MENU_PAGAR:
	pagar();
	break;
	}
	} while( opcionSeleccionada != OPCION_MENU_SALIR );


	System.out.printf("Seleccionó la opción %d", opcionSeleccionada);
	}

	private static void verProductos() {
	for(Producto producto : productos ) {
	System.out.printf("Id: %s Producto: %s Precio: %d %n"
	, producto.getId()
	, producto.getNombre()
	, producto.getPrecio()
	, producto.getTipo()
	);
	}
	}
	private static void pagar() {


	}
	private static int menu() {
	System.out.println("MENU PUNTO DE VENTA\n===================\n");
	System.out.println("1. Pagar");
	System.out.println("2. SALIR");

	System.out.println("\nPor favor digite la opción deseada:");
	Scanner scanner = new Scanner( System.in );
	int opcionSeleccionada = scanner.nextInt();
	return opcionSeleccionada;
	}

	
}
