import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter regex number");
        int p = sc.nextInt();
        String []regex = new String[p];
        for(int i=0; i<regex.length ; i++){
            System.out.println("enter regular expression");
            //System.out.println(i);
            regex[i]= sc.next(); 
            //Pattern r = Pattern.compile(regex);
        }
        System.out.println("enter a Number");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<arr.length ;i++){
            System. out.println("enter string"); 
            arr[i] = sc.next();
        }
        // 2
        /*ab*c*d
         a*b(cd)+e?f
         3
         acccd
         abbbbbcccc
         bcdcdef*/
        int k = 0;
        for(int j=0; j<arr.length; j++){
             //for(int k = 0; k<regex.length;k++){
                Pattern r = Pattern.compile(regex[k]);
                Matcher m = r.matcher(arr[j]);
                if(m.find()){
                    System.out.println(" yes" + " " +(k+1));
                    //break;
                }
                else{
                    System.out.println( "No" + " " +0);
                    k++;
                }
            //}
               
        }
    }
}




