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

            // Ejecutar según la opción elegida
            switch (opcion) {
                case 1:
                    calcularSin(br);
                    break;
                case 2:
                    calcularCos(br);
                    break;
                case 3:
                    calcularTan(br);
                    break;
                case 4:
                    calcularArcSin(br);
                    break;
                case 5:
                    calcularArcCos(br);
                    break;
                case 6:
                    calcularArcTan(br);
                    break;
                case 7:
                    calcularSinh(br);
                    break;
                case 8:
                    calcularCosh(br);
                    break;
                case 9:
                    calcularTanh(br);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Adios :)");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }

            System.out.println(); 
        }

        
    }

    private static void calcularSin(BufferedReader br) {
        System.out.print("Ingresa el angulo α en radianes: ");
        String linea;
        double alpha;
        try {
            linea = br.readLine();
            alpha = Double.parseDouble(linea.trim());
        } catch (IOException e) {
            System.out.println("Error al leer. Regresando al menu");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            return;
        }
        double resultado = Math.sin(alpha);
        System.out.printf("sin(%.6f) = %.6f%n", alpha, resultado);
    }

    private static void calcularCos(BufferedReader br) {
        System.out.print("Ingresa el angulo α en radianes: ");
        String linea;
        double alpha;
        try {
            linea = br.readLine();
            alpha = Double.parseDouble(linea.trim());
        } catch (IOException e) {
            System.out.println("Error al leer. Regresando al menu.");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            return;
        }
        double resultado = Math.cos(alpha);
        System.out.printf("cos(%.6f) = %.6f%n", alpha, resultado);
    }

    private static void calcularTan(BufferedReader br) {
        System.out.print("Ingresa el angulo α en radianes: ");
        String linea;
        double alpha;
        try {
            linea = br.readLine();
            alpha = Double.parseDouble(linea.trim());
        } catch (IOException e) {
            System.out.println("Error al leer. Regresando al menu");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            return;
        }
        double resultado = Math.tan(alpha);
        System.out.printf("tan(%.6f) = %.6f%n", alpha, resultado);
    }

    private static void calcularArcSin(BufferedReader br) {
        System.out.print("Ingresa un valor entre -1 y 1: ");
        String linea;
        double valor;
        try {
            linea = br.readLine();
            valor = Double.parseDouble(linea.trim());
        } catch (IOException e) {
            System.out.println("Error al leer. Regresando al menu.");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            return;
        }
        if (valor < -1 || valor > 1) {
            System.out.println("Valor fuera de rango. Debe estar entre -1 y 1.");
        } else {
            double resultado = Math.asin(valor);
            System.out.printf("arcsin(%.6f) = %.6f radianes%n", valor, resultado);
        }
    }

    private static void calcularArcCos(BufferedReader br) {
        System.out.print("Ingresa un valor entre -1 y 1: ");
        String linea;
        double valor;
        try {
            linea = br.readLine();
            valor = Double.parseDouble(linea.trim());
        } catch (IOException e) {
            System.out.println("Error al leer. Regresando al menu");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            return;
        }
        if (valor < -1 || valor > 1) {
            System.out.println("Valor fuera de rango. Debe estar entre -1 y 1.");
        } else {
            double resultado = Math.acos(valor);
            System.out.printf("arccos(%.6f) = %.6f radianes%n", valor, resultado);
        }
    }

    private static void calcularArcTan(BufferedReader br) {
        System.out.print("Ingresa el valor α: ");
        String linea;
        double valor;
        try {
            linea = br.readLine();
            valor = Double.parseDouble(linea.trim());
        } catch (IOException e) {
            System.out.println("Error al leer. Regresando al menu");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            return;
        }
        double resultado = Math.atan(valor);
        System.out.printf("arctan(%.6f) = %.6f radianes%n", valor, resultado);
    }
