package com.bridgelabz;

public class Node<K> {
    Node prevNode;
    K data;
    Node next;

    Node(){

    }
    Node(K data){
        this.data = data;
    }
}
