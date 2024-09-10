import java.util.ArrayList;
import java.util.List;
public class C2{
    public static void main(String[] args){
    List<Integer>list1=new ArrayList<>();
    for(int i=65;i<=90;i++){
    list1.add(i);
}
    List<Integer>list2=new ArrayList<>();
    for(int i=97;i<=112;i++){
    list2.add(i);
}
    List<Character>list3=new ArrayList<>();
    for(char i='A';i<='Z';i++){
    list3.add((char)i);
}
    List<Character>list4=new ArrayList<>();
    for(char i='a';i<='z';i++){
    list4.add((char)i);
}
    System.out.println("List1:"+list1);
    System.out.println("List2:"+list2);
    System.out.println("List3:"+list3);
    System.out.println("List4:"+list4);        
}
}