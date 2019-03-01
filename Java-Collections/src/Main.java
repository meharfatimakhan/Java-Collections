import java.util.*;

public class Main {

    public static void main(String[] args) {

         /*
         1.	ArrayList,
         2. Vector,
         3.	HashSet,
         4. SortedSet,
         5.	TreeSet,
         6.	Array, List, Set
         7.	NavigableSet, NavigableMap
         */

        //ArrayList
        List<Integer> arrayList1=new ArrayList<Integer>();
        arrayList1.add(0,1);
        arrayList1.add(1,2);
        System.out.println("ArrayList1: "+arrayList1);

        System.out.println("ArrayList1 size:" + arrayList1.size());

        List<Integer> arrayList2=new ArrayList<Integer>();
        arrayList2.add(67);
        arrayList2.add(43);
        System.out.println("ArrayList2: "+ arrayList2);

        arrayList1.addAll(2,arrayList2);
        System.out.println("ArrayList1 appended with ArrayList2: "+arrayList1);

        System.out.println("ArrayList1 through iterator: ");
        Iterator itr=arrayList1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        List <String> listStr=new ArrayList<>();
        listStr.add("Mehar");
        listStr.add("This is my code");
        listStr.add("Print ArrayList");

        System.out.println("List String: "+listStr);

        listStr.set(2,"Changed!");
        System.out.println("List String after modification: "+listStr);

        listStr.remove(2);
        System.out.println("List String after remove: "+listStr);

        System.out.println("------------------------------");

        //Vector
        Vector<String> vector1 = new Vector<String>();
        vector1.addElement("4388");
        vector1.addElement("4269");
        vector1.addElement("4028");

        // traversing elements using Enumeration
        System.out.println("Vector1 elements are:");
        Enumeration enumerator = vector1.elements();
        while (enumerator.hasMoreElements())
            System.out.println(enumerator.nextElement());

        // copying all element of array list in vector
        vector1.addAll(1,listStr);

        System.out.println("Vector1 after appending with listStr:" + vector1);

        vector1.remove(4);

        System.out.println("Vector1 after removing:" + vector1);

        vector1.clear();

        System.out.println("Vector1 after clearing:" + vector1);

        System.out.println("------------------------------");

        //HashSet

        Set<String> hashSet1 = new HashSet<>();


        hashSet1.add("Cat");
        hashSet1.add("Meow");
        hashSet1.add("Dog");
        hashSet1.add("Woof");
        hashSet1.add("Woof");//wont be inserted as it is duplicate

        System.out.println("HashSet1 elements are: "+hashSet1);
        String element = "Meow";
        if(hashSet1.contains(element)) {
            System.out.println(element + " is present.");
        } else {
            System.out.println(element + " is not present.");
        }

        System.out.println("HashSet1 size:" + hashSet1.size());

        boolean removeIt = hashSet1.remove("Meow");
        System.out.println("After removing " + hashSet1);

        System.out.println("HashSet1 through iterator: ");
        Iterator itr2=hashSet1.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("------------------------------");
        //SortedSet
        SortedSet<Integer> sortedSet1=new TreeSet<>();
        sortedSet1.add(2345);
        sortedSet1.add(43991);
        sortedSet1.add(201212);
        sortedSet1.add(66231);

        System.out.println("Sorted Set1: " + sortedSet1);
        System.out.println("First element: " + sortedSet1.first());
        System.out.println("Last element: " + sortedSet1.last());


        SortedSet<Integer> before = sortedSet1.headSet(66231);
        System.out.println("Before 66321 (headSet): "+before);

        SortedSet<Integer> betweenElements = sortedSet1.subSet(2345,66231);
        System.out.println("Between 2345 and 66231(subSet): "+betweenElements);

        SortedSet<Integer> after = sortedSet1.tailSet(43991);
        System.out.println("After 43991 (tailSet): "+after);

        sortedSet1.remove(66231);
        System.out.println("After removal: "+sortedSet1);

        System.out.println("------------------------------");

        //TreeSet

        TreeSet<String> treeSet1 = new TreeSet<String>();

        treeSet1.add("Lexus");
        treeSet1.add("Corolla");
        treeSet1.add("Camry");

        // Duplicates will not get inserted
        treeSet1.add("Corolla");

        System.out.println("TreeSet: "+treeSet1); //Ascending order

        System.out.println("Traversing elements through Iterator in descending order:");
        Iterator itr3=treeSet1.descendingIterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }

        TreeSet<Integer> treeSet2=new TreeSet<Integer>();
        treeSet2.add(541);
        treeSet2.add(41321);
        treeSet2.add(31231);
        treeSet2.add(31319);
        System.out.println("TreeSet2: "+treeSet2);
        System.out.println("Highest Value: "+treeSet2.pollFirst());
        System.out.println("Lowest Value: "+treeSet2.pollLast());
        System.out.println("TreeSet2 now: "+treeSet2);

        treeSet2.add(76511);
        treeSet2.add(12412);

        System.out.println("TreeSet2 after adding two values: "+treeSet2);

        System.out.println("Initial Set: "+treeSet2);

        System.out.println("Reverse Set: "+treeSet2.descendingSet());

        System.out.println("Head Set: "+treeSet2.headSet(12412, true));

        System.out.println("SubSet: "+treeSet2.subSet(541, false, 41321, true));

        System.out.println("TailSet: "+treeSet2.tailSet(12412, false));

        System.out.println("------------------------------");

        //List

        List<String> linkedList1=new LinkedList<>();


        linkedList1.add("Izzah ");
        linkedList1.add("Mehar");
        linkedList1.add(2, "Zoro");
        linkedList1.add("Paul");
        linkedList1.add("Lucy");
        System.out.println("Linked List1: " + linkedList1);


        boolean present= linkedList1.contains("Mehar");

        if(present)
            System.out.println(" Mehar' present! ");
        else
            System.out.println("'Mehar' not present!");


        linkedList1.remove("Izzah");
        linkedList1.remove(3);

        System.out.println("Linked List1 after deletion: " + linkedList1);

        Object getElement = linkedList1.get(2);
        System.out.println("Name returned: " + getElement);

        linkedList1.set(2, "Naami");
        System.out.println("LinkedList1 after setting: " + linkedList1);

        int size = linkedList1.size();
        System.out.println("Size of LinkedList1: " + size);


        System.out.println("------------------------------");

        //Array

        int array[] = {1, 2, 3, 5};

        System.out.println("Elements in array: ");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " ");
        }

        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum =sum+array[index];
        }
        System.out.println("Sum of all elements in array: " + sum);

        System.out.println("Through advanced for-loop: ");
        for (int arrayElement: array) {
            System.out.println(arrayElement);
        }


        int arrayNew[] = new int[5]; //specifying size in start
        System.out.println("Old Array Size: " +arrayNew.length);
        for (int index=0; index<5; index++) {
            arrayNew[index] = index+1;
        }
        int extendThis[] = new int[10];
       System.out.println("New Array Size: " +extendThis.length);
        arrayNew = extendThis;

        System.out.println("------------------------------");

        //NavigableSet
        NavigableSet<Integer> navigableSet1 = new TreeSet<>();
        navigableSet1.add(899);
        navigableSet1.add(799);
        navigableSet1.add(299);
        navigableSet1.add(400);
        navigableSet1.add(198);
        navigableSet1.add(12);

        NavigableSet<Integer> reverseNavigableSet = navigableSet1.descendingSet();

        System.out.println("NavigableSet1: " + navigableSet1);
        System.out.println("ReverseNavigableSet1: " + reverseNavigableSet);

        System.out.println("higher(3): " + navigableSet1.higher(5));
        System.out.println("lower(3): " + navigableSet1.lower(5));
        System.out.println("ceiling(3): " + navigableSet1.ceiling(5));
        System.out.println("floor(3): " + navigableSet1.floor(5));

        NavigableSet<Integer> moreThan12 = navigableSet1.tailSet(12, true);
        System.out.println("12 or  more:  " + moreThan12);

        System.out.println("pollLast(): " + navigableSet1.pollLast());
        System.out.println("NavigableSet1:  " + navigableSet1);

        System.out.println("pollFirst(): " + navigableSet1.pollFirst());
        System.out.println("NavigableSet1:  " + navigableSet1);

        System.out.println("------------------------------");

        //NavigableMap

        NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>();
        navigableMap.put(1,"Amy");
        navigableMap.put(2,"Rosa");
        navigableMap.put(3, "Terry");
        navigableMap.put(4,"Peralta");
        navigableMap.put(5, "Gina");
        navigableMap.put(3, "Holt");

        System.out.println("Original Map: "+ navigableMap);

        System.out.println("Floor Entry: "+ navigableMap.floorEntry(3));
        System.out.println("First Entry: "+ navigableMap.firstEntry());
        System.out.println("First Key: "+ navigableMap.firstKey());
        System.out.println("Last Key: "+ navigableMap.lastKey());

        System.out.println("Descending Set: "+  navigableMap.descendingKeySet());
        System.out.println("Reverse Map: "+ navigableMap.descendingMap());


    }
}
