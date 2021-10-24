package collectionExmple;

import java.util.*;

public class ArrayEx {

    public static void ex1() {
        List<String> names = new ArrayList();
        names.add("Dan");
        names.add("Caleb");
        names.add("Abc");
        System.out.println(names);
//        System.out.println(names.get(0));
        names.add(0, "Tom");
        Collections.sort(names);

        System.out.println(names);
        names.remove(2);
        System.out.println(names);

    }

    public static void ex2() {

        int size = 3;
        String x[] = new String[size];

        String names = "Tom,Dan,Caleb,Abc";
        String sNames[] = names.split(",");

        for (String s : sNames) {

        }

        if (x.length < sNames.length) {
            size = size * 2;
            x = new String[size];
        }
        for (int i = 0; i < sNames.length; i++) {
            x[i] = sNames[i];
        }


        System.out.println(Arrays.toString(x));


    }

    public static void linkedListex() {
        LinkedList<String> list =
                new LinkedList<String>();
        list.addLast("Harry");
        list.addFirst("Sally");
        System.out.println("first " + list.getFirst());
        System.out.println("last " + list.getLast());
        String removed = list.removeFirst();

        list.addFirst("David");
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }

    public static void llist() {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("David");
        staff.addLast("Caleb");
        staff.addLast("Meba");
        staff.addLast("Heldana");
        staff.addLast("Mike");

        // | in the comments indicates the iterator position

        ListIterator<String> iterator = staff.listIterator(); // |DHRT
        iterator.next(); // D|HRT

        // Add more elements after second element

        iterator.add("Mimi"); // DHJ|RT

        iterator.next(); // DHJNR|T
        iterator.next(); // DHJNR|T
        iterator.next(); // DHJNR|T
        iterator.next(); // DHJNR|T

        // Remove last traversed element

        iterator.remove(); // DHJN|T

        // Print all elements

        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
    }

    public static void setex() {
        String test = "This is a java class. John is intersted in programming. But he is not interested in math";
        String[] splits = test.split(" ");
        Set<String> unique = new HashSet<>();
        int counter = 0;

        for (String s : splits) {
            if (!unique.add(s)) {
                counter++;
            }
        }
        System.out.println(counter);
    }


    public static void hasmap() {

    }


    public static void test() {
        PriorityQueue<PrintQueue> q = new PriorityQueue<PrintQueue>();
        q.add(new PrintQueue(3, "Shampoo carpets"));
        q.add(new PrintQueue(1, "Fix broken sink"));
        q.add(new PrintQueue(2, "Order cleaning supplies"));
        while (q.size() > 0) {
            System.out.print(q.remove() + " ");
        }


    }

    public static void stackEx() {
        Stack<String> s = new Stack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        while (s.size() > 0) {
            s.pop();

        }
        s.push("A");
        System.out.print(s.pop() + " ");
    }

    public static void queex() {
        Queue<String> q = new LinkedList<String>();
        q.add("Java");
        q.add("C#");
        q.add("Biology");
        q.add("Math");

        String head = q.remove(); //Removes the head of the queue; head is set to 1 and q is [2, 3].
        head = q.peek(); //Gets the head of the queue without removing it; head is set to 2.
        System.out.println(head);
    }

//    private static boolean checkPermutationOfPalindrome(String str){
//        char[] arr = str.replaceAll("[\s]", "").toLowerCase().toCharArray();
//    }

    public void test1(){
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("David");
        staff.addLast("Caleb");
        staff.addLast("Meba");
        staff.addLast("Heldana");
        staff.addLast("Mike");

        System.out.println(staff);
    }

    public static void main(String[] args) {
//        System.out.println(Palindrome("atco cta"));
//        linkedListex();
//        test();
//        llist();
//        queex();
    }
}
