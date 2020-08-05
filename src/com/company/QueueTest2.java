package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-08-05
 * Time:17:03
 * 一万年太久，只争朝夕，加油
 */
//循环数组
    //从head下标删除，从tail下标插入

class MyQueue{
    public int[] elem;
    public int usedSize;

    public MyQueue() {
        this.elem=new int[100];
        this.usedSize=0;
    }

    int head=0;
    int tail=0;

    //入队列
    public void offer(int val){
        //先看有没有满
        if(usedSize==elem.length){
            System.out.println("队列已经满了");
            return;
        }
            elem[usedSize]=val;
            tail++;

        if(tail>=usedSize){
            tail=tail%elem.length;
        }
        usedSize++;
    }
    //出队列
    public Integer pop(){
        //先看有没有
        if(usedSize==0){
            System.out.println("队列为空");
            return null;
        }
        //出队列
        int del=elem[head];
        head++;
        usedSize--;
        return del;
    }

    //取队首元素
    public Integer peek(){
        if(usedSize==0){
            System.out.println("队列为空");
            return null;
        }
        return elem[head];

    }
    public boolean isEmpty(){
        if(usedSize==0){
            return true;
        }
        return false;
    }
}
public class QueueTest2 {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());


        while(!queue.isEmpty()){
            int cur=queue.pop();
            System.out.print(cur+" ");

        }
    }
}
