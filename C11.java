class Human{
    public void job(){
        System.out.println("Working professional");
    }
}
class Teacher extends Human{
    public void job(){
        System.out.println("Teacher");
    }
}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");
    }
}
public class C11 {
    public static void main(String[] args){
        Human amar=new Human();
        Teacher babu=new Teacher();
        Doctor chandra=new Doctor();
        Human dinesh=new Doctor();
        amar.job();
        babu.job();
        chandra.job();
        dinesh.job();
    }
    
}