package LinkedList;

public class firstQues {
    public  int itrSearch(int key);
    Node temp = head;
    int i =0;

    while(temp != null) {
        if(temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;


    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(2,3);

        ll.print();

        System.out.println(ll.itrSearch(3));
    }
    
}
