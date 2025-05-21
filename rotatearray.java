import java.util.Scanner;
public class rotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimention of array: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original array is: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        rotateanarray(a,b,r1,c1);
        reverseArray(b,r1,c1);
    }
    public static void rotateanarray(int a[][],int b[][],int r1,int c1) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("B array is: ");
        for (int k = 0; k < r1; k++) {
            for (int l = 0; l < c1; l++) {
                System.out.print(b[k][l]+" ");
            }
            System.out.println();
        }

    }
    public static void reverseArray(int b[][],int r1,int c1){
        int i=0;
        int j=b.length-1;
        while (i<j){
            int temp[]=b[i];
            b[i]=b[j];
            b[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < r1; k++) {
            for (int l = 0; l < c1; l++) {
                System.out.print(b[k][l]+" ");
            }
            System.out.println();
        }
    }
    }

