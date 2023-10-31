import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int c=0;
        for(int i=0,j=s.length-1;i<j;i++,j--){
            c++;
            if(c%2==0){
                if(s[i].length()>s[j].length())
                System.out.print(s[i]+" ");
                else if(s[i].length()<s[j].length())
                System.out.print(s[j]+" ");
                else
                System.out.print(s[i]+" "+s[j]+" ");
            }else{
                if(s[i].length()>s[j].length())
                System.out.print(s[j]+" ");
                else if(s[i].length()<s[j].length())
                System.out.print(s[i]+" ");
                else
                System.out.print(s[i]+" "+s[j]+" ");
            }
        }
	  }
}
