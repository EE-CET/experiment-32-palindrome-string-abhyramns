import java.util.Scanner;
public class Palindrome {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                s=s.toLowerCase();
                int n=s.length();
                for(int i=0;i<n/2;i++){
                        if(s.charAt(i)!=s.charAt(n-i-1)){
                                System.out.println(0);
                                return;
                        }
                }
                System.out.println(1);
                sc.close();
        }
}

