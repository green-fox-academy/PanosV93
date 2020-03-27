public class Matrix {
    public static void main(String[] args) {
        int [][] matrixArray = new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (i==j){
                    matrixArray[i][j]=1;
                }
                else {
                    matrixArray[i][j]=0;
                }
                
            }
            
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println(matrixArray[i][j] + "");
                
            }
            System.out.println();
        }

    }
}
