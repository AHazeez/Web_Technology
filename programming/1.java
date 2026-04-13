class Pattern 
{
    public static void main(String[] args){
        int n = 10;
        for(int i = 1; i <= n;i=i+2){
            for(int j = i; j <=n-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
       
            }
            System.out.println();
        }
    }
}