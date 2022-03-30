package com.bridgelabz;

public class MyHashMapTest {

    public void count(){
        String stenetce = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = stenetce.toLowerCase().split(" ");
        for (String word: words){
            Integer value = myHashMap.get(word);
        }
    }
}
