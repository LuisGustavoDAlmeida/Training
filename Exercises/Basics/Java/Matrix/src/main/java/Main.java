public class Main {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[5][4];
        matrix[0][0] = 1;
        matrix[1][0] = 2;
        matrix[2][0] = 3;
        matrix[3][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[1][3] = 7;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Integer number = matrix[i][j];
                System.out.println("Linha " + i + "\n coluna " + j + " valor: " + number);
            }
        }
    }
}