package datastracture;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    Map<String,Node> map;
    int capacity;

    Node head;
    Node tail;

    public Cache(Map<String, Node> map, int capacity) {
        this.map = map;
        this.capacity = capacity;

    }

    public void put(Node node){

    }

    public void insertTail(String key, String value){

        Node node = new Node(key, value);

        if (head == null){
            head  = node;
            tail  = head;
        }else {
            tail.next  = node;
            node.prev = tail;
            tail = node;
        }

    }

    public void insertHead(String key, String value){

        Node node = new Node(key, value);

        if (head == null){
            head  = node;
            tail  = head;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
            System.out.println();
        }

    }




    public String get(String key){
        if (!map.containsKey(key)){
            return null;
        }else{

           Node node = map.get(key);

           //move it to head
           moveToHead(node);

           return node.value;
        }
    }



    private void moveToHead(Node node) {

        //if the node a head already don't do antyhing
        if  (node != head){
            node.prev.next  = node.next;
            node.next.prev = node.prev;

            node.next = head;
            head.prev  = node;
            head  = node;

        }

    }



    public void display(){
        Node temp =  head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Map<String,Node> map = new HashMap<>();
        Cache cache = new Cache(map, 5);

//        cache.insertTail("1","Dawit");
//        cache.insertTail("2","Mimi");
//        cache.insertTail("3","Caleb");
//        cache.insertTail("4","Meba");
//        cache.insertTail("5","Heldana");
        cache.insertHead("1","Dawit");
        cache.insertHead("2","Mimi");
        cache.insertHead("3","Caleb");
        cache.insertHead("4","Meba");
        cache.insertHead("5","Heldana");

        System.out.println("\n");
        System.out.println(" Find value for 4 "+ cache.get("4"));
        System.out.println("\n\n");

        cache.display();

//        cache.moveToHead();

    }


}
