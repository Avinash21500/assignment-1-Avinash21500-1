package mList;

import Node.Node;
import Person.Person;

public class MyList {
    private Node head;
    public MyList(){
        head=null;
    }
    public Node getHead(){
        return head;
    }

    public void insert(Person p){
        Node node=new Node(p);
        if(head==null){
            head=node;
        }
        else {
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void printList(){
        System.out.println("---Here are all your contacts---");
        System.out.println("-------- * -------- * -------- * --------");
        Node temp=head;
        while(temp!=null){
            Person e=temp.getData();
            System.out.println("First Name: "+e.getFname());
            System.out.println("Last Name: "+e.getLname());
            System.out.print("Contact Number(s): ");
            int[] no=e.getConNumber();
            for (int i = 0; i <no.length; i++) {
                if(no[i]!=0) {
                    System.out.print(no[i]);
                    if(no[i+1]!=0){
                        System.out.print(", ");
                    }
                }
            }
            System.out.println();
            if(e.getEmail()!=null) {
                System.out.println("Email address: " + e.getEmail());
            }
            System.out.println("-------- * -------- * -------- * --------");
            temp=temp.getNext();

        }
    }

    public boolean search(String fname) {
        boolean response = false;
        //traversing the linked list and will check each node for given data
        // assigning head to temp
        Node temp = head;
        while (temp != null) {
            // checking for data at each node
            Person temp1=temp.getData();
            if (temp1.getFname().equals(fname)){
                response = true;
                System.out.println("1 match found!");
                System.out.println("-------- * -------- * -------- * --------");
                System.out.println("First Name: "+temp1.getFname());
                System.out.println("Last Name: "+temp1.getLname());
                System.out.print("Contact Number(s): ");
                int[] no=temp1.getConNumber();
                for (int i = 0; i <no.length; i++) {
                    if(no[i]!=0) {
                        System.out.print(no[i]);
                        if(no[i+1]!=0){
                            System.out.print(", ");
                        }
                    }
                }
                System.out.println();
                if(temp1.getEmail()!=null) {
                    System.out.println("Email address: " + temp1.getEmail());
                }
                temp=temp.getNext();
                System.out.println("-------- * -------- * -------- * --------");
                response=true;
                break;
            }
            // updating temp
            temp = temp.getNext();

        }
        return response;
    }

    /*public void delete(String delfname){
        Node temp=head;
        while(temp!=null){
            Node tempy=temp.getNext();
            Person temp1=tempy.getData();
            if(temp1.getFname().equals(delfname)){
                tempy=tempy.getNext();
                temp.setNext(tempy);
                System.out.println(delfname+"'s contact deleted from list!");
            }
            temp=temp.getNext();
        }

    }*/

}
