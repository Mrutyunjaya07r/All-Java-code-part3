import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        int totalelement=0;
        int top=0,buttom=r1-1;
        int left=0,right=c1-1;
        System.out.println("Enter the element of array: ");
        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sperial series is: ");
        while (totalelement<r1*c1){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
                totalelement++;
            }
            top++;
            for(int j=top;j<=buttom;j++){
                System.out.print(a[j][right]+" ");
                totalelement++;
            }
            right--;
            for (int k=right;k>=left;k--){
                System.out.print(a[buttom][k]+" ");
                totalelement++;
            }
            buttom--;
            for (int l=buttom;l>=top;l--){
                System.out.print(a[l][left]+" ");
                totalelement++;
            }
            left++;
        }
    }
}
