public class C4{
    public static void main(String[] args){
       String s1="ObjectOrientedProgramming";
       int n=s1.length();
              System.out.println("Left diamond pattern");
       for(int i=0;i<n;i++){
          for(int j=0;j<n-i-1;j++){
           System.out.print(" ");
         }
	 for(int j=0;j<=i;j++){
           System.out.print(s1.charAt(j));
       }
	   System.out.println();
      }
	for(int i=n-2;i>=0;i--){
          for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
       }
          for(int j=0;j<=i;j++){
           System.out.print(s1.charAt(j));
       }
	   System.out.println();

       }
   }
}