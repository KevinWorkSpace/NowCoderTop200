//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
//public class LRU {
//
//    Node head = new Node(-1, -1);
//    Node tail = new Node(-1, -1);
//    int cnt;
//    int k;
//    Map<Integer, Node> map = new HashMap<>();
//
//    public int[] LRU (int[][] operators, int k) {
//        head.next = tail;
//        tail.pre = head;
//        // write code here
//        this.k = k;
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i=0; i<operators.length; i++) {
//            int[] operator = operators[i];
//            if (operator[0] == 1) {
//                set(operator[1], operator[2]);
//            }
//            else {
//                res.add(get(operator[1]));
//            }
//        }
//        int[] r = new int[res.size()];
//        for (int i=0; i<r.length; i++) {
//            r[i] = res.get(i);
//        }
//        return r;
//    }
//
//    public void set(int key, int value) {
//        Node node = null;
//        if (map.containsKey(key)) {
//            node = map.get(key);
//            node.value = value;
//            if (node.pre != null) {
//                node.pre.next = node.next;
//                node.next.pre = node.pre;
//                Node next = head.next;
//                head.next = node;
//                node.pre = head;
//                node.next = next;
//                next.pre = node;
//            }
//        }
//        else {
//            if (cnt < k) {
//                node = new Node(key, value);
//                Node next = head.next;
//                head.next = node;
//                node.pre = head;
//                node.next = next;
//                next.pre = node;
//                cnt ++;
//            }
//            else {
//                Node n = tail.pre;
//                tail.pre.pre.next = tail;
//                tail.pre = tail.pre.pre;
//                map.put(n.key, null);
//                node = new Node(key, value);
//                Node next = head.next;
//                head.next = node;
//                node.pre = head;
//                node.next = next;
//                next.pre = node;
//            }
//        }
//        map.put(key, node);
//    }
//
//    public int get(int key) {
//        Node node = map.get(key);
//        if (node == null) return -1;
//        node.pre.next = node.next;
//        node.next.pre = node.pre;
//        Node next = head.next;
//        head.next = node;
//        node.pre = head;
//        node.next = next;
//        next.pre = node;
//        return map.get(key).value;
//    }
//
//    public static void main(String[] args) {
//        int[][] opers = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
//        int k = 3;
//        LRU lru = new LRU();
//        int[] res = lru.LRU(opers, k);
//    }
//}
//
////class Node {
////    int key;
////    int value;
////    Node pre;
////    Node next;
////
////    public Node(int key, int value) {
////        this.key = key;
////        this.value = value;
////    }
////}
