//Strings are upper case S "String", while double, int, char all are lower case for java

// 4 spaces in quotes to copy and paste for indentation purposes and consistency "    "

public class LinkedList
{
    private class Node
    {
        public String data;
        public Node next;

        //Node constructor
        public Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
     
    private Node head;
    private Node tail;

    public LinkedList()
    {
        this.head = null;
        this.tail = null; 
    }
    
    public String about()
    {
        String about = "This code was brought to you by ETHAN HENNING, first year at Sac State from los rios, a bit lost on Java but giving it a shot" + "\n";
        about = about + "Added this while reviewing code: Java was a little hard to start, everything being in a class was weird at first, however not having to worry about pointers is phenomenal!" + "\n";
        return about;
    }

    public void addHead(String data)
    {
        Node newNode = new Node(data);
        if(isEmpty() == true)
        {
            //head = tail
            head = newNode;
            tail = head;
        }
        else
        {
            // adds to the front then redifines the newnode as the head
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail(String data)
    {
        //just have to add item to next after tail then reassigne as tail after
        Node newNode = new Node(data);
        if(head == null)
        {
            tail = newNode;
            head = tail;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean isEmpty()
    {
        //check if the list doesn't have any information in it first because I assume most the time it will have information
        if(head != null)
        {
            return false;
        }

        return true;
    } 

    public String toList()
    {
        //have to check if the list is empty just incase, don't want to break the code... again
        if(isEmpty() == true)
        {
            return "List is empty";
        }
        
        //starting outputs and initialization for the list
        Node curr = head.next;
        int counter = 1;
        String lineOutPut = counter + ": " + head.data + "\n";
        counter++;

        //note, while curr != null means that if its just one item in list it will bypass this loop and exit
        while(curr != null)
        {
            lineOutPut = lineOutPut + counter + ": " + curr.data + "\n";
            curr = curr.next;
            counter++;
        }

        return lineOutPut;
    }
}

