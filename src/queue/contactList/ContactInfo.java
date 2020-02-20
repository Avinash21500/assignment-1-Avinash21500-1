package queue.contactList;

public class ContactInfo {
    private String[] strinfo;
    private int[] intinfo;

    //constructor
    public ContactInfo(){
        strinfo=new String[5];
        intinfo=new int[6];
    }

    public String[] getStrinfo() {
        return strinfo;
    }

    public void setStrinfo(String[] strinfo) {
        this.strinfo = strinfo;
    }

    public int[] getIntinfo() {
        return intinfo;
    }

    public void setIntinfo(int[] intinfo) {
        this.intinfo = intinfo;
    }
}
