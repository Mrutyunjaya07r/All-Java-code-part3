import java.util.Scanner;

public class spiralinsert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int b[][]=new int[r1][c1];
        int totalelement=0;
        int top=0,buttom=r1-1;
        int left=0,right=c1-1;
        int count=1;
        System.out.println("Enter the element of array: ");
        System.out.println("The sperial series is: ");
        while (totalelement<r1*c1){
            for(int i=left;i<=right;i++){
                b[top][i]=count;
                count++;
                totalelement++;
            }
            top++;
            for(int j=top;j<=buttom;j++){
                b[j][right]=count;
                count++;
                totalelement++;
            }
            right--;
            for (int k=right;k>=left;k--){
                b[buttom][k]=count;
                count++;
                totalelement++;
            }
            buttom--;
            for (int l=buttom;l>=top;l--){
                b[l][left]=count;
                count++;
                totalelement++;
            }
            left++;
        }
        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
