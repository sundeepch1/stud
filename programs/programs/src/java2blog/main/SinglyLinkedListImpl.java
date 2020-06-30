package java2blog.main;

import java2blog.support.SinglyLinkedList;

public class SinglyLinkedListImpl {

	public static void main(String[] args) {    
        
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList.display();    
    }    
}
