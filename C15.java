 class Elections {
    private String president;
    private String vicePresident;
    private String technicalSecretary;
    private String culturalSecretary;
    private int presidentVotes;
    private int vicePresidentVotes;
    private int technicalSecretaryVotes;
    private int culturalSecretaryVotes;
    
    public Elections(){}
    
    public void announceElections() {
        System.out.println("Elections announced!");
    }

    public void conductVoting() {
        System.out.println("Voting is underway...");
    }
    
    public void countVotes(String president,String vicePresident,String technicalSectetary,String culturalSecretary,int presidentVotes,
    int vicePresidentVotes, int technicalSecretaryVotes, int culturalSecretaryVotes){
        this.president=president;
        this.vicePresident=vicePresident;
        this.technicalSecretary=technicalSecretary;
        this.culturalSecretary=culturalSecretary;
        this.presidentVotes=presidentVotes;
        this.vicePresidentVotes = vicePresidentVotes;
        this.technicalSecretaryVotes = technicalSecretaryVotes;
        this.culturalSecretaryVotes = culturalSecretaryVotes;
    }
    public void declareResults() {
        System.out.println("\nElection Results:");
        System.out.println("*President*: " + president + " - " + presidentVotes + " votes");
        System.out.println("*Vice President*: " + vicePresident + " - " + vicePresidentVotes + " votes");
        System.out.println("*Cultural Secretary*: " + culturalSecretary + " - " + culturalSecretaryVotes + " votes");
        System.out.println("*Technical Secretary*: " + technicalSecretary + " - " + technicalSecretaryVotes + " votes");
        System.out.println();
        analyzeResults();
    }
    private void analyzeResults() {
        System.out.println("*Observations:*");
        System.out.println("- " + culturalSecretary + " won the Cultural Secretary position by a landslide.");
        System.out.println("- " + president + " won the Presidential election with a significant majority.");
        System.out.println("- " + technicalSecretary + " secured the Technical Secretary position with " + technicalSecretaryVotes + " votes.");
        System.out.println("- " + vicePresident + " received the requaired votes for Vice President.");
    }
}
 class Student{
     private String name;
     private String position;
     public Student(String name,String position){
         this.name=name;
         this.position=position;
     }
     public String getName(){
         return name;
     }
     public String getPostion(){
         return position;
     }
}
public class C15{
    public static void main(String[]args){
        Elections elections = new Elections();
        elections.announceElections();

        Student presidentCandidate = new Student("Anurag R Rao", "President");
        Student vicePresidentCandidate = new Student("Bharath Ashok Devadiga", "Vice President");
        Student technicalSecretaryCandidate = new Student("Ramachandra Udupa", "Technical Secretary");
        Student culturalSecretaryCandidate = new Student("Hithashree", "Cultural Secretary");

        elections.conductVoting();

        elections.countVotes(presidentCandidate.getName(), vicePresidentCandidate.getName(), 
                            technicalSecretaryCandidate.getName(), culturalSecretaryCandidate.getName(), 
                            250, 200, 243, 370);

        elections.declareResults();
    }
}

    
    

    
 


    

