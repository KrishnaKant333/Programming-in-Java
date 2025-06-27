import java.util.*;

public class Cwh_02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>(); 
        // unlike ArrayList, LinkedList cannot have an initial Capacity declaration
        
        l1.add(6); // l1.add(index, element) if we want to add an element at a particular index
        l1.add(4);
        l1.add(12);
        l1.add(7);
        l1.add(9);


        l1.add(0,5);
        l1.add(0,1); // if overwritten then replaced
        // l1.add() to append elements at the end of the LinkedList

        l2.add(15);
        l2.add(11);
        l2.add(25);
        
        // in LinkedList some methods are present which are not found in ArrayList
        // LinkedList Specific :

        // toArray() method returns an array containing the elements of the LinkedList :
        Object[] arr = new Object[l1.size()];
        arr = l1.toArray();
        for (Object item : arr) {
            System.out.println(item);
        }

        // to return a reverse collection : 
        System.out.println(l1.reversed());

        

        // rest methods are similar to ArrayList


        l1.addAll(l2); // add a collection to another by using addAll
        // without a second argument about the index from which the contents of l2 should be added, the addAll() method by default appends the contents of l2 at the end of l1


        // l1.clear(); // to clear the collection

        System.out.println("Does l2 contain 21? Ans : " + l2.contains(21));
        // contains() method returns true if the element is present in the collection and false if it doesn't


        System.out.println("Index of an element (23) which is not present : " +l1.indexOf(23));
        // as 23 is not in l1, therefore it returns -1 as index
        System.out.println("Index of first apperance of an element (9) : " + l1.indexOf(9));
        // and as 9 is present at 6th index it retruns 6

        //indexOf() searches the first appearance from index 0
        
        // to get index of the last appearance of an element we shall use lastIndexOf() method
        System.out.println("Index of last apperance of an element (11) : "+ l1.lastIndexOf(11));
        // searches from last index but returns index according to index 0

        l1.set(1, 566);
        // replaces element at 1st index by given element 
        
        System.out.println(l1.subList(1, 3)); // method used to get elements at index 1 and 2 (excludes 3)
        
        // l1.retainAll(l2); // retains only the element of l2 in l1
        
        l1.removeAll(l2); // removes only the element of l2 in l1
        
        l1.remove(2); // removes element from index 2

        l1.removeIf(n -> n%2==0); // removes element based on the condition provided

        for (int i = 0; i < l1.size(); i++) { // l1.size() to get Linkedlist size
            System.out.print(l1.get(i)); // l1.get(i) to get elements at i-th index
            System.out.print(", ");
        }
        System.out.println();

        // l2.trimToSize();

        // for (int i = 0; i < l2.size(); i++) { 
        //     System.out.print(l2.get(i)); 
        //     System.out.print(", ");
        // }

        System.out.println("Is l2 empty ? Ans : "+l2.isEmpty()); // returns boolean whether or not the Linked list is empty

        l1.getFirst(); // get first element of the Linked list
        l1.getLast(); // get last element of the Linked list

        // similar are addFirst() and addLast() ; removeFirst() and removeLast()

        
    }
}
