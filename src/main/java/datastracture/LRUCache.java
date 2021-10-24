package datastracture;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final Map<String, Node> map;
    private final int capacity;

    Node head = null;
    Node tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public void put(String key, String value) {
        //check if it is in the cache . If it is in the
        if (map.containsKey(key)) {
            //updated the cache
            Node node = map.get(key);
            node.value = value;

           // deleteFromList(node);
            setListHead(node);
            System.out.println();
        } else {
            //if it doesn't exist in the the cache check if
            // the cache is full
            if (map.size() >= capacity) {
                map.remove(tail.key);
                deleteTail();
            }

            Node node = new Node(key, value);
            map.put(node.key, node);
            setListHead(node);


        }


    }

    private void deleteFromList(Node node) {
        //if remove head

        if (node == head){
            head = head.next;
            head.prev  = null;
            return;
        }

        if(node == tail){
            tail = tail.prev;
            tail.next = null;
            return;
        }

        node.prev.next = node.next;
        node.next.prev  = node.prev;
        System.out.println();

    }

    private void setListHead(Node node) {
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head = node;
            head.prev = null;

            System.out.println();
        }
    }


    public String get(String key) {

        // if it does not exist in the hash table return null
        if (!map.containsKey(key)) {
            return null;
        }

        Node node = map.get(key);

        deleteTail();

        setListHead(node);

        return node.value;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    private void deleteTail() {

        tail.prev.next = null;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.put("1", "Dawit");
        lruCache.put("2", "Caleb");
        lruCache.put("3", "Meba");
        lruCache.put("1", "Heldana");

        lruCache.display();

    }


}
