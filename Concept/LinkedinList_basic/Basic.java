package LinkedinList_basic;

import java.util.Objects;

public class Basic {
    public static Integer size = 0;

    public static class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
            size++;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(Integer data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void add(Integer data, Integer index) {
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 0; i < index - 1; i++) {
            System.out.println("Run " + i);
            if (temp == null) {
                System.out.println("Index Out of the bound");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

//        for cycle
        tail.next = newNode;

    }

    public Integer removeFirst() {
        if (head == null) {
            System.out.println("No element found to remove");
            return Integer.MIN_VALUE;
        }
        Integer data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public Integer removeLast() {
        if (head == null) {
            System.out.println("No element found to remove");
            return Integer.MAX_VALUE;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        Integer data = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return data;
    }

    public void printLinkedList() {
        Node iter = head;
        System.out.println("--LinkedList started--");

        while (iter != null) {
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
        System.out.println("null");
        System.out.println("--LinkedList ended--");
    }

    public Integer searchElement(Integer number) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (Objects.equals(temp.data, number)) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    private int helper(Node temp, int key) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return 0;
        }

        int idx = helper(temp.next, key);
        if (idx == -1) {
            return -1;
        }
        return ++idx;
    }

    public int recursiveSearch(int element) {
        Node temp = head;
        return helper(temp, element);
    }

    public void reverseList() {
        tail = head;
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
//        current.next = prev;
        head = prev;
    }

    private Node findMiddleNode(){
        Node slowPointer = head;
        Node fastPointer = head;
        while(fastPointer != null && fastPointer.next != null ){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public Boolean checkPalindrome(){
//        Step 1 finding middle node
        Node midNode = findMiddleNode();

//        Step 2 Reverse half linked list
        Node prev = null;
        Node curr = midNode;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while(right != null){
            if (!Objects.equals(right.data, left.data)){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }

    public void removeCycle(){
//        Step 1 detect cycle
        Node slow = head;
        Node fast = head;
        Node meetingPoint = null;
        Boolean isCycle = false;
        while(fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                isCycle = true;
                meetingPoint = slow;
                break;
            }
        }
        if (!isCycle) return;
//        Step 2 detect meeting point
        slow = head;
        Node prev = fast;
        while(!Objects.equals(slow,fast)){
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
//        Step 3 remove the connection
        prev.next = null;
    }

//    public Node mergeSort(Node head){
//        Find Mid
//        Divide the list and call mergesort again
//        Return merge one after merge
//    }

    public static void main(String[] args) {
        Basic ll = new Basic();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.addLast(6);
//        ll.addLast(7);
//        ll.addLast(8);
//        ll.addLast(9);
//        ll.addLast(10);
//        ll.addLast(11);
//        ll.addLast(12);
//        ll.add(5, 5);
//        System.out.println("Size before remove operation : "+size);
//        System.out.println(ll.removeFirst());
//        System.out.println(ll.removeLast());
//        System.out.println("Size after remove operation : "+size);
//        System.out.println("Search element output "+ll.searchElement(11));
//        System.out.println("Search element output (recursive)"+ll.recursiveSearch(11));
//        ll.printLinkedList();
//        ll.reverseList();
//        ll.printLinkedList();
//        ll.reverseList();
//        ll.printLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(0,2);
        ll.removeCycle();
        ll.printLinkedList();
        System.out.println(head);
        System.out.println(tail);

        System.out.println("Palindrome Check : "+ ll.checkPalindrome() );


    }
}
