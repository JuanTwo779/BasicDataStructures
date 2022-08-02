public class LinkedList
{
    Node head; //refers to first node on the list

    public void insert(int data) //method to create new node
    {
        Node node = new Node();
        node.data = data;
        node.next = null; //by default null, code makes it look better

        if(head==null) //if first node on list
        {
            head = node; //set the head to the node you made
        }
        else //if not first object, already nodes in the list
        {
            //assign a temp node head to assist loop with travelling
            Node n = head;

            //node needs to be added to end of list
            //how do we find end?
            //while loop to look through list starting from head
            //when the node has no address, it reached the tail
            while(n.next != null)
            {
                n = n.next;
                //this jumps to the next node; next element is address to next node
                //n now refers to the [2nd, 3rd, 4th...] node on the list
            }

            //after reaching tail, we assign our new node to next node of tail
            n.next = node;

        }
    }

    public void show()
    {
        Node node = head;
        while(node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }

        //loop doesn't print last value cos it has no next value
        //node does now refer to tail
        //manual print
        System.out.println(node.data);
    }
}
