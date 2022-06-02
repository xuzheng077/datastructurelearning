package collection;

import java.util.*;

/**
 * @author Xu Zheng
 * @description
 */
public class Collection {


    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(6);
        //HashSet
        HashSet<A> hashSet = new HashSet<>();
        hashSet.add(a1);
        hashSet.add(a2);
        hashSet.add(a3);
        //System.out.println(hashSet.size());
        for (A a : hashSet){
            System.out.println(a.id);
        }
        Iterator<A> iterator = hashSet.iterator();
        System.out.println(iterator.next().id);
        System.out.println(iterator.next().id);
        System.out.println(iterator.next().id);

        System.out.println("-------------------------------");

        //LinkedHashSet
        LinkedHashSet<A> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(a1);
        linkedHashSet.add(a2);
        linkedHashSet.add(a3);
        Iterator<A> iterator1 = linkedHashSet.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().id);
        }
        System.out.println("-------------------------------");

        //TreeSet
        TreeSet<A> treeSet = new TreeSet<>();
        treeSet.add(a1);
        treeSet.add(a2);
        treeSet.add(a3);
        Iterator<A> iterator2 = treeSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next().id);
        }
        //前闭后开
        System.out.println(treeSet.headSet(a2));
        System.out.println(treeSet.tailSet(a2,false));
        System.out.println(treeSet.subSet(a1,a3));
        System.out.println("-------------------------------");

        //EnumSet
        EnumSet<Season> enumSet = EnumSet.allOf(Season.class);
        EnumSet<Season> enumSet1 = EnumSet.of(Season.SPRING);
        EnumSet<Season> enumSet3 = EnumSet.complementOf(enumSet1);
        EnumSet<Season> enumSet2 = EnumSet.range(Season.SPRING,Season.WINTER); //前闭后闭
        Iterator<Season> iterator3 = enumSet.iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
        enumSet.add(Season.FALL);
        enumSet.remove(Season.FALL);
        System.out.println(enumSet);
        System.out.println(enumSet1);
        System.out.println(enumSet2);
        System.out.println(enumSet3);

        System.out.println("-------------------------------");

        // ArrayList
        ArrayList<A> arrayList = new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(2, new A(4));
        Iterator<A> iterator4 = arrayList.iterator();
        while(iterator4.hasNext()){
            System.out.println(iterator4.next().id);
        }
        arrayList.set(0,new A(9));
        iterator4 = arrayList.iterator();
        while(iterator4.hasNext()){
            System.out.println(iterator4.next().id);
        }
        List<A> sub = arrayList.subList(1,2);
        System.out.println(sub.get(0));
        System.out.println(sub.size());
        System.out.println("-------------------------------");

        //stack
        Stack<A> stack = new Stack<>();
        stack.push(a1);
        stack.push(a2);
        stack.push(a3);
        System.out.println(stack.peek().id);
        System.out.println(stack.size());
        Iterator<A> iterator5 = stack.iterator();
        while(iterator5.hasNext()){
            System.out.println(iterator5.next().id);
        }
        System.out.println(stack.pop().id);
        System.out.println(stack.firstElement().id);
        System.out.println(stack.size());

//        ListIterator<A> listIterator = arrayList.listIterator();
//        listIterator.hasPrevious();
//        listIterator.previous();
//        listIterator.previousIndex();
//        listIterator.nextIndex();

        System.out.println("-------------------------------");

        //LinkedList
        LinkedList<A> linkedList = new LinkedList<>();
        linkedList.add(a1);
        linkedList.add(a2);
        linkedList.add(a3);
        linkedList.offer(new A(9));
        linkedList.push(new A(11));
        linkedList.offerFirst(new A(20));
        Iterator<A> iterator6 = linkedList.iterator();
        while(iterator6.hasNext()){
            System.out.println(iterator6.next().id);
        }
        System.out.println(linkedList.peek().id);
        System.out.println(linkedList.peekFirst().id);
        System.out.println(linkedList.peekLast().id);

        System.out.println(linkedList.poll().id);
        System.out.println(linkedList.size());
        System.out.println(linkedList.pollFirst().id);
        System.out.println(linkedList.size());

        System.out.println("-------------------------------");

        //Queue
        //PriorityQueue
        PriorityQueue<A> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(a1);
        priorityQueue.offer(new A(22));
        priorityQueue.offer(a2);
        priorityQueue.offer(a3);
//        Object[] arr = priorityQueue.toArray();
//        for (Object o : arr){
//            A a = (A) o;
//            System.out.println(a.id);
//        }
        System.out.println(priorityQueue.peek().id);
        System.out.println(priorityQueue.poll().id);
        System.out.println(priorityQueue.size());
        Iterator<A> iterator7 = priorityQueue.iterator();
        while (iterator7.hasNext()){
            System.out.println(iterator7.next().id);
        }
        Iterator<A> iterator8 = priorityQueue.iterator();
        iterator8.next();
        iterator8.remove();

        System.out.println("-------------------------------");

        //ArrayDeque
        ArrayDeque<A> stack1 = new ArrayDeque<>();


        //进行迭代操作时，以链表作为底层实现的集合比以数组作为底层实现的集合性能好??

        System.out.println("---------------------------");
        //Map
        //HashMap, HashTable
        Hashtable<A,String> hashtable = new Hashtable<>();
        hashtable.put(a1, "a1");
        hashtable.put(a2, "a2");
        hashtable.put(new A(0),"a4");
        hashtable.put(a3, "a3");

        System.out.println(hashtable.contains("a1"));
        System.out.println(hashtable.containsValue("a1"));
        System.out.println(hashtable.containsKey(new A(2)));

        hashtable.remove(new A(2));
        System.out.println(hashtable.containsKey(a2));

        for (A a : hashtable.keySet()){
            System.out.println(a.id);
            System.out.println(hashtable.get(a));
        }
        for (String str : hashtable.values()){
            System.out.println(str);
        }
    }
}

class A implements Comparable<A>{
    public int id;

    A(int id){
        this.id = id;
    }

    @Override
    public int compareTo(A o) {
        return this.id - o.id;
    }
}

enum Season{
    SPRING, SUMMER, FALL, WINTER
}
