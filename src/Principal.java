
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Coleccion de objetos
		Autos auto1 = new Autos(23344, "Nissan", "n45", 450000f);
		Autos auto2 = new Autos(74757, "Toyota", "twe", 300000f);
		Autos auto3 = new Autos(85858, "Chevrolet", "gt56", 20000f);

		// Instancia de clase ---- ya tenemos acceso a todo lo que contenga esta clase
		LogicaMetodos imp = new LogicaMetodos();

		// Guardar
		imp.guardar(auto1);
		imp.guardar(auto2);
		imp.guardar(auto3);

		// Mostrar
		System.out.println(imp.mostrar());

		// Buscar
		Autos autoEn = imp.buscar(1);
		System.out.println("Se encontro " + autoEn);

		// Editar----modelo
		autoEn.setModelo("Corolla ");
		imp.editar(1, autoEn);

		// Mostrar
		System.out.println(imp.mostrar());

		// Eliminar
		imp.eliminar(0);

		// Mostrar
		System.out.println(imp.mostrar());
		System.out.println(imp.tamanoLista());

		// Ejercicio
		// Clase Motos
		// Atributos: placa, marca, precio, color
		// 1 Interface ---- Metodos del crud
		// Clase para implementar la interface
		// Clase con el main(codigo duro)

	}

}
