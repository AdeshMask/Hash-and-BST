package com.bridgelabz;


public class MyHashMap<K, V> {
    MyLinkedList<K> myLinkedList;
    public MyHashMap(){
        this.myLinkedList = new MyLinkedList<>();
    }

    public V get(K data) {
        V value=null;
        MyMapNode<K,V> myMapNode = new MyMapNode(data, value);
        myMapNode.search(data);
        return (myMapNode==null) ? null:myMapNode.getValue();
    }
}
