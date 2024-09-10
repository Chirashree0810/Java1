public class C3{
    public static void main(String[] args){
       String s1="ObjectOrientedProgramming";
       int n=s1.length();
              System.out.println("Right diamond pattern");
       for(int i=1;i<=n;i++){
           System.out.println(s1.substring(0,i));//Increasing part

       }
	for(int i=n-1;i>=1;i--){
           System.out.println(s1.substring(0,i));//Decreasing part
       }
  }
}