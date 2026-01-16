public class Palindrome {
    
        // TODO: Read the string
        // TODO: Convert to lower case (to handle 'Malayalam' correctly)
        // TODO: Check if the string is the same reversed
        // TODO: Print "1" if palindrome, "0" if not
        public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             String a=sc.nextLine();
             String rev="";
             int n=a.length();
             for(int i=n-1;i>=0;i--){
                   rev=rev+a.charAt(i);  
             }   
             if(a.equalsIgnoreCase(rev)){
                   System.out.print(1);
             }
             else{
                System.out.print(0);
             }
        }
    
}
