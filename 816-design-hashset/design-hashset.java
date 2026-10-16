class MyHashSet {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    
    public MyHashSet() {
        head = null;
    }
    
    
    public void add(int key) {
        if (contains(key)) {
            return;
        }
        Node newNode = new Node(key);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
    
    public void remove(int key) {
        if(head == null){
            return;
        }
        if(head.data == key){
            head = head.next;
        }
        else{
            Node temp = head;
            while(temp.next != null && temp.next.data != key){
                temp = temp.next;
            }
            if (temp.next != null)
                temp.next = temp.next.next;
        }
    }
    
    public boolean contains(int key) {
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */