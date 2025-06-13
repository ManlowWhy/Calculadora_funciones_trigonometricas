package calculador_trigonometrico;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculador_trigonometrico {

    public static void main(String[] args) {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;

        while (!salir) {
            // Mostrar menú
            System.out.println(" Calculadora Trigonometrica ");
            System.out.println("1. sin(α)");
            System.out.println("2. cos(α)");
            System.out.println("3. tan(α)");
            System.out.println("4. arcsin(α)");
            System.out.println("5. arccos(α)");
            System.out.println("6. arctan(α)");
            System.out.println("7. sinh(α)");
            System.out.println("8. cosh(α)");
            System.out.println("9. tanh(α)");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            String lineaOpcion;
            int opcion = -1;
            try {
                
                lineaOpcion = br.readLine();
                
                opcion = Integer.parseInt(lineaOpcion.trim());
            } catch (IOException e) {
                System.out.println("Error de lectura. Intentalo de nuevo.");
                continue; 
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un numero valido (0–9).");
                System.out.println();
                continue; 
            }
