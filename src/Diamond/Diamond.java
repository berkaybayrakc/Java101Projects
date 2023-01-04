package Diamond;

public class Diamond {
    public static void main(String[] args) {

        int n=5;

        for(int i=0;i<n;i++){
            for (int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k <=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int p=n-1;p >=0 ;p--){
            for(int r=1;r<=(n-p);r++){
                System.out.print(" ");
            }
            for (int s=2*p-1 ; s>=1  ; s--){
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
