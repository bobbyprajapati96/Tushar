package practice;
public class AddMatrices {
    public static void main(String[] args) {
        int [][] mat1={
                {1,2,3},
                {4,5,6}
        };
        int [][] mat2={
                {7,8,9},
                {10,11,12}
        };
        int [][] result={
                {0,0,0},
                {0,0,0}
        };
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++)
            {
                result[i][j]=mat1[i][j]+mat2[i][j];
            }

        }
//        for(int i=0;i<result.length;i++){
//            for(int j=0;j<result[i].length;j++){
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
        for(int[] inner:result){
            for(int a:inner){
                System.out.print(a+" ");
            }
            System.out.println("");
        }
    }
}
