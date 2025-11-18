package LinkedList;

public class MyLinkedLIst {
    ListNode head;

    public void addLast(int val){
        ListNode newNode = new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
