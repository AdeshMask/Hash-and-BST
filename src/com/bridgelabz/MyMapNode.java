package com.bridgelabz;

public class MyMapNode<K, V> implements INode<K> {
    Node head;
    Node tail;
    K data;
    Node prevNode;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K data,V value){
        this.data = data;
        this.value = value;
        next =null;
    }

    public Node search(K data) {
        Node temp = head;
        while(temp != null){
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
            //System.out.println(data);
        }
        return null;
    }
    @Override
    public K getData() {
        return data;
    }

    @Override
    public void setData(K data) {
        this.data = data;
    }

    public void setNext(INode<K> next){
        this.next = (MyMapNode<K, V>) next;
    }
    public V getValue(){
        return this.value;
    }

    public INode<K> getNext(){
        return next;
    }

    @Override
    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{"+"k=").append(data).append("V").append(value).append('}');
        if ( next!= null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}
