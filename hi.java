
import java.util.Arrays;
import java.util.Scanner;

public class hi{
    public static void main(String args[]){
    Scanner w = new Scanner(System.in);
    int size = w.nextInt();
    int myarray[]=new int[size]; //5  
   System.out.println("Enter elements of array");
   for(int i=0;i< size;i++)  //++i,i++,i--,--i, i--=i=i-1            
   {
    myarray[i]=w.nextInt();
 }
   System.out.println("Elements of the array are"+Arrays.toString(myarray));
}
}

















//    public static void main(String args[]) {
//       System.out.println("Enter the required size of the array :: ");
//       Scanner s = new Scanner(System.in);
//       Scanner st = new Scanner(System.in);
//       int size = s.nextInt();
//       int le   = st.nextInt();
      
//       int myArray[] = new int [size];
//       String[] arr=new String[le];
//       System.out.println("Enter the elements of the array one by one ");
//       for(int i=0; i<size; i++) {
//          myArray[i] = s.nextInt();
//       }
//       System.out.println("Contents of the array are: "+Arrays.toString(myArray));

//       System.out.println("Enter the names of customer");
//       for(int j=0;j<le; j++){
//         arr[j]=s.nextLine();
//       }
//       System.out.println("Contents of the array are: "+Arrays.toString(arr));    
   
//     }