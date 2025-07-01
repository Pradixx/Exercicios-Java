import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as linhas: ");
        int l = sc.nextInt();
        System.out.print("Digite as colunas: ");
        int c = sc.nextInt();
        int [][] matriz = new int[l][c];

        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Numero que deseja pesquisar: ");
        int x = sc.nextInt();

        System.out.println();

        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == x){
                    System.out.println("Posição: " + i + ", " + j);
                    if ( j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if ( i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}