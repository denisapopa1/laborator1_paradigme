public class LitereAlfabet {
    public static void main(String[] args){

        java.lang.String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.length());

        System.out.println(s.substring(0,4));
        System.out.println(s.substring(4,8));
        System.out.println(s.substring(8,14));
        System.out.println(s.substring(14,20));
        System.out.println(s.substring(20,26));

        int[] vector = {12,3,500,1200,50,40,100,250,8};

        int[][] matrix = new int[3][3];

        int contor=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=vector[contor];
                contor++;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
