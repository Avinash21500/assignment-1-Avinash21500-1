package Person;

public class Person {
    private String fname;
    private String lname;
    private int[] conNumber;
    private String email;
    private int headC;


    public Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
        email=null;
        conNumber=new int[10];
        headC=0;

    }
    public void setConNumber(int i){
        this.conNumber[headC]=i;
        headC++;
    }

    public int[] getConNumber(){
        return  conNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
