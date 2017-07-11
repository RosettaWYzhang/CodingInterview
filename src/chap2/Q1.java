package chap2;

import java.util.HashSet;

/**
 * Created by wanyuezhang on 10/07/2017.
 * Write code to remove duplicates from an unsorted linked list
 * How would you solve this problem if a temporary buffer is not allowed?
 * from the answer
 */
 /*public class Q1 {
    void deleteDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        while( n != null){
            if (set.contains(n.data)){
                previous.next = n.next;
            }
            else{
                set.add(n.data);
                previous = n;
            }
        }
        n = n.next;
    } */
    /* if no buffer, use 2 pointers */
    /*
    void deleteDup(LinkedListNode head){
        LinkedListNode current = head;
        while (current != null){
            LinkedListNode runner = current;
            while(runner.next != null){
                if (runner.next.data == current.data){
                    runner.next = runner.next.next;
                }
                else{
                    runner = runner.next;
                }
            }
        }
        current = current.next;
    }

}
*/
