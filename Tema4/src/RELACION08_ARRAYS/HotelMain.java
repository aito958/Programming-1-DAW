package RELACION08_ARRAYS;

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            // Crear un hotel con habitaciones de diferentes tipos
	            System.out.println("=== CREANDO HOTEL ===");
	            Hotel hotel = new Hotel("Hotel Paradise", 3, 2, 1);
	            hotel.mostrarEstado();

	            // Pruebas de check-in
	            System.out.println("\n=== PRUEBAS DE CHECK-IN ===");
	            
	            System.out.println("\nCliente 1: Solicita habitación simple");
	            int hab1 = hotel.checkIn("simple");
	            System.out.println("✓ Habitación asignada: " + hab1);
	            hotel.mostrarEstado();

	            System.out.println("\nCliente 2: Solicita habitación doble");
	            int hab2 = hotel.checkIn("doble");
	            System.out.println("✓ Habitación asignada: " + hab2);
	            hotel.mostrarEstado();

	            System.out.println("\nCliente 3: Solicita habitación triple");
	            int hab3 = hotel.checkIn("triple");
	            System.out.println("✓ Habitación asignada: " + hab3);
	            hotel.mostrarEstado();

	            System.out.println("\nCliente 4: Solicita otra habitación simple");
	            int hab4 = hotel.checkIn("simple");
	            System.out.println("✓ Habitación asignada: " + hab4);
	            hotel.mostrarEstado();

	            // Prueba de error: intentar ocupar un tipo que no existe
	            System.out.println("\n=== PRUEBA DE ERROR ===");
	            System.out.println("\nCliente 5: Solicita habitación de tipo 'cuadruple' (inexistente)");
	            try {
	                hotel.checkIn("cuadruple");
	            } catch (Exception e) {
	                System.out.println("✗ Error capturado: " + e.getMessage());
	            }

	            // Pruebas de check-out
	            System.out.println("\n=== PRUEBAS DE CHECK-OUT ===");
	            
	            System.out.println("\nCliente 1 se va - Libera habitación " + hab1);
	            hotel.checkOut(hab1);
	            System.out.println("✓ Habitación liberada correctamente");
	            hotel.mostrarEstado();

	            System.out.println("\nCliente 2 se va - Libera habitación " + hab2);
	            hotel.checkOut(hab2);
	            System.out.println("✓ Habitación liberada correctamente");
	            hotel.mostrarEstado();

	            // Prueba de error: intentar liberar una habitación ya libre
	            System.out.println("\n=== PRUEBA DE ERROR (CHECK-OUT) ===");
	            System.out.println("\nIntentando liberar una habitación que ya estaba libre (hab 1)");
	            try {
	                hotel.checkOut(hab1);
	            } catch (Exception e) {
	                System.out.println("✗ Error capturado: " + e.getMessage());
	            }

	            // Nueva ocupación después de liberación
	            System.out.println("\n=== NUEVA OCUPACIÓN ===");
	            System.out.println("\nCliente 6: Solicita habitación simple (después de liberarse una)");
	            int hab5 = hotel.checkIn("simple");
	            System.out.println("✓ Habitación asignada: " + hab5);
	            hotel.mostrarEstado();

	            // Información de disponibilidad
	            System.out.println("\n=== DISPONIBILIDAD POR TIPO ===");
	            System.out.println("Habitaciones simples libres: " + hotel.contarLibresPorTipo("simple"));
	            System.out.println("Habitaciones dobles libres: " + hotel.contarLibresPorTipo("doble"));
	            System.out.println("Habitaciones triples libres: " + hotel.contarLibresPorTipo("triple"));

	            // Prueba de error: intentar ocupar cuando no hay disponibles
	            System.out.println("\n=== LLENANDO HOTEL ===");
	            System.out.println("\nLlenando todas las habitaciones simples...");
	            while (hotel.contarLibresPorTipo("simple") > 0) {
	                int hab = hotel.checkIn("simple");
	                System.out.println(" Habitación simple " + hab + " ocupada");
	            }

	            System.out.println("\nIntentando ocupar una habitación simple (no debería haber)");
	            try {
	                hotel.checkIn("simple");
	            } catch (Exception e) {
	                System.out.println("Error capturado: " + e.getMessage());
	            }

	            hotel.mostrarEstado();

	        } catch (Exception e) {
	            System.err.println("Error inesperado: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	}


