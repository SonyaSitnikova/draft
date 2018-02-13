package net.thumbtack.school.introduction;

public class FirstSteps {

    public int sum (int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int mul (int x, int y) {
        int mul = x*y;
        return mul;
    }

    public int div (int x, int y) {
        int div = x/y;
        return div;
    }

    public int mod (int x, int y) {
        int mod = x%y;
        return mod;
    }

    public boolean isEqual (int x, int y){
        return x==y;
    }

    public boolean isGreater (int x, int y){
        return x>y;
    }

    public boolean isInsideRect (int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return (x>=xLeft && x<=xRight && y>=yTop && y<=yBottom);
    }

    public int sum(int[] array){
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }

    public int mul(int[] array){
        int mul = 1;
        for (int i : array) {
            mul = mul * i;
        }
        if (array.length == 0) mul = 0;
        return mul;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < (min) ){
                min = i;
            }
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public double average(int[] array){
        int sum = 0;
        double average;
        for (int i : array) {
            sum = sum + i;
        }
        if(array.length>0){
            average = (double)sum/(double)array.length;
        } else average = 0;
        return average;
    }

    public boolean isSortedDescendant(int[] array){
        boolean bl = true;
        int n = 0;
        for (int i=1; i<array.length; i++){
            if (array[i] >= array[i-1]){
                n++;
            }
        }

        if (n>0){
            bl = false;
        }
        return bl;
    }

    public int[] cube(int[] array){
        int [] arraycube = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arraycube[i] = array[i]*array[i]*array[i];
        }
        return arraycube;
    }

    public boolean find(int[] array, int value){
        boolean bl = false;
        int n = 0;
        for (int i : array) {
            if (array[i]==value){
                n++;
            }
        }
        if (n>0){
            bl = true;
        }
        return bl;
    }

    public void reverse(int[] array){
        int temp;
        int j = array.length;
        for (int i = 0; i< array.length/2; i++){
            j--;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public boolean isPalindrome(int[] array){
        boolean bl = true;
        int n = 0;
        int j = array.length-1;
        for (int i = 0; i< array.length/2; i++){
            if(array[i]==array[j]){
                n=0;
            }else n++;
            j--;
        }
        if (n>0){
            bl = false;
        }
        return bl;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for (int i[] : matrix) {
            for (int j : i){
                sum = sum + j;
            }
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i[] : matrix) {
            for (int j : i){
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int diagonalMax = Integer.MIN_VALUE;
        for (int i=0; i<matrix.length; i++){
            if (matrix[i][i] > diagonalMax){
                diagonalMax = matrix[i][i];
            }
        }
        return diagonalMax;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean bl = true;
        int n = 0;
        for (int []i : matrix) {
            if (!isSortedDescendant(i)){
                n++;
            }
        }
        if (n>0){
            bl = false;
        }
        return bl;
    }

}
