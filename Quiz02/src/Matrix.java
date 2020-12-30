class Matrix {
    public int[][] m;

    Matrix(String matrixAsString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String[] a = matrixAsString.split("\n", -1);
        String[][] b =new String[a.length][a[0].split(" ", -1).length];
        int count =0;


        for (String s : a){
            b[count]=s.split(" ", -1);
            count++;
        }

//        for (int i=0; i<b[i].length; i++){
//            b[i]=a[i].split(" ", -1);
//        }

        int[][] matrix = new int[b.length][b[0].length];
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                matrix[i][j]=Integer.parseInt(b[i][j]);
            }
        }
        m = matrix;
    }

    int[] getRow(int rowNumber) {
        return m[rowNumber-1];
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getColumn(int columnNumber) {
        int[] col=new int[m.length];
        for (int i=0;i<m.length;i++){
            col[i]=m[i][columnNumber-1];
        }
        return col;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}