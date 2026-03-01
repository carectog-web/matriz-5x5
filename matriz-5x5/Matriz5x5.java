import java.util.Scanner;

public class Matriz5x5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear matriz 5x5
        int[][] matriz = new int[5][5];

        // Ingreso de datos
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Ingrese un número para [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz ingresada:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        teclado.close();
    }
}
