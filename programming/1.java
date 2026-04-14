class Pattern 
{
    public static void main(String[] args){
        int n = 5;
        for(int i = n; i >=1;i--){
            for(int j = i; j <=n; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=n*2-1; k++){
                System.out.print(i+"  ");
       
            }
            System.out.println();
        }
    }
}