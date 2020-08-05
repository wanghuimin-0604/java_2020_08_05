package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-08-05
 * Time:16:48
 * 一万年太久，只争朝夕，加油
 */
//链表实现队列
    //尾部插入，头部删除
public class QueueTest {

    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = next;
        }
    }

        Node head=new Node(-1);
        Node tail=head;

        //入队列
    public void offer(int val){
        Node node=new Node(val);
        //先判断有没有
        if(head.next==null){
            head.next=node;
            tail=node;
            return;
        }
        //有的话
        tail.next=node;
        tail=node;
    }

    //出队列
    public Integer pop(){
        //先看有没有元素
        if(head.next==null){
            System.out.println("队列中没有元素");
            return null;
        }
        //有元素的话
        //从链表头进行删除
        Node del=head.next;
        head.next=del.next;
        return del.val;

    }
    //取栈顶元素
    public Integer peek(){
        if(head.next==null){
            System.out.println("队列中没有元素");
            return null;
        }
        Node ret=head.next;
        return ret.val;
    }

    public static void main(String[] args) {
        QueueTest test=new QueueTest();
        test.offer(1);
        test.offer(2);
        test.offer(3);

        System.out.println(test.peek());
    }
}
