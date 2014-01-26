package Algos;

public class BionomialCoefficient {
    BionomialCoefficient() {
    }

    public long getCoefficient(int n, int k) {
        if(n < 0 || k < 0) {
            return -1;
        }

        long[][] matrix = new long[n+1][n+1];

        for(int i=0; i<=n; ++i) {
            matrix[i][0] = 1;
        }

        for(int i=0; i<=n; ++i) {
            matrix[i][i] = 1;
        }

        for(int i=1; i<=n; ++i) {
            for(int j=1; j<i; ++j) {
                matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }

        for(int i=0; i<=n; ++i) {
            for(int j=0; j<=i; ++j) {
                System.out.print(String.format("%5d", matrix[i][j]));
            }
            System.out.println();
        }

        return matrix[n][k];
    }

    public static void main(String[] args) {
        BionomialCoefficient bionomialCoefficient = new BionomialCoefficient();
        System.out.println(bionomialCoefficient.getCoefficient(5, 3));
        System.out.println(bionomialCoefficient.getCoefficient(10, 3));
        System.out.println(bionomialCoefficient.getCoefficient(5, 5));
    }
}
