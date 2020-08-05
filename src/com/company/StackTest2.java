package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-08-05
 * Time:16:37
 * 一万年太久，只争朝夕，加油
 */
//用链表来实现栈
    //链表头来进行插入和删除


public class StackTest2 {
    static class Node {

        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

        Node head = new Node(-1);

        //入栈
        public void offer(int val) {
            Node node = new Node(val);
            node.next = head.next;
            head.next = node;
        }

        //出栈
        public Integer pop() {
            if (head.next == null) {
                //栈中没有元素
                System.out.println("栈中没有元素");
                return null;
            }
            Node del = head.next;
            head.next = del.next;
            return del.val;
        }

        //取栈顶元素
        public Integer peek() {
            if (head.next == null) {
                //栈中没有元素
                System.out.println("栈中没有元素");
                return null;
            }
            Node ret = head.next;
            return ret.val;
        }

        public static void main(String[] args) {
            StackTest2 test2 = new StackTest2();
            test2.offer(1);
            test2.offer(2);
            test2.offer(3);

            System.out.println(test2.peek());

        }


    }
