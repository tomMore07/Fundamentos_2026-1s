package productos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = new ArrayList();
		
		ProductoPerecedero productoP1 = new ProductoPerecedero(1033, "Alimento", 15.50, 1 );
		ProductoPerecedero productoP2 = new ProductoPerecedero(1048, "Lacteo", 20.30, 2 );
		ProductoPerecedero productoP3 = new ProductoPerecedero(1067, "Alimento", 10.50, 3 );
		
		ProductoNoPerecedero productoNP1 = new ProductoNoPerecedero(1033, "Alimento", 15.50, 'A' );
		ProductoNoPerecedero productoNP2 = new ProductoNoPerecedero(1033, "Lacteo", 11.20, 'B' );
		ProductoNoPerecedero productoNP3 = new ProductoNoPerecedero(1033, "Lacteo", 18.70, 'C' );
		
		listaProductos.add(productoP1);
		listaProductos.add(productoP2);
		listaProductos.add(productoP3);
		
		listaProductos.add(productoNP1);
		listaProductos.add(productoNP2);
		listaProductos.add(productoNP3);
		
		// Recorrer la lista e imprimir cada producto
		for (Producto producto : listaProductos) {
		    System.out.println(producto.toString() + " Precio de venta: " + producto.precioVenta());
		}
		
	}

}
