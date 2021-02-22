public class Stack <V> {

    private Element head;

    int size = 0;

    //Adds element to top of the stack
    public void add(V data)
    {
        Element temp = head;
        if(head == null)
        {
            head = new Element(data);
        }
        else {

            head = new Element(data);
            head.next = temp;
        }
    }

    public int size(){
        return size;
    }

    //Removes last element from stack and returns it
    public V remove()
    {
        //Reference to element from top of the stack(head)
        Element temp = head;

        //If head is not null it returns data from it
        //otherwise it returns null
        if(temp!=null) {
            head = temp.next;
            System.out.println("X1");
            return temp.data;

        }
        else {
            System.out.println("X2");
            return null;
        }

    }

    public void printAll()
    {
        Element temp = head;
        while (temp!=null)
        {
            System.out.println("value:"+temp.data);
            temp = temp.next;
        }
    }

    //Contains reference to next element and instance of data object
    private class Element
    {
        public Element (V data)
        {
            this.data = data;
        }

        //PREVIOUS ELEMENT IN STACK
        public Element next = null;
        public V data;

        @Override
        public String toString(){
            return data.toString();
        }

    }
}
