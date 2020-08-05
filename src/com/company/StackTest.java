package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-08-05
 * Time:14:02
 * 一万年太久，只争朝夕，加油
 */

/**
 * 数据结构：栈
 *     特点：先进后出
 *     基本操作：
 *     入栈：从栈顶插入元素
 *     出栈：删除栈顶元素
 *     得到栈顶元素
 *     用数组和链表两种方式实现
 *     数组：数组末尾进行插入和删除
 */
class MyStack {
    public int[] elem;
    public int usedSize;
    //初始化数组大小和数组中元素个数

    public MyStack() {
        this.elem = new int[100];
        this.usedSize = 0;
    }

    //操作
    //入栈
    public void push(int value) {
        //先判断栈中元素是否满了
        if (usedSize == elem.length) {
            System.out.println("栈已经满了");
            return;
        }
        //如果栈没有满，插入就可以了
        elem[usedSize] = value;
        usedSize++;
    }

    //出栈
    public Integer pop() {
        //先判断栈是否为空
        if (usedSize == 0) {
            System.out.println("栈为空");
            return null;
        }
        //栈如果不为空，那么直接删除
        int del = elem[usedSize - 1];
        usedSize--;
        return del;
    }

    //取栈首元素
    public Integer peek() {
        //先判断栈是否为空
        if (usedSize == 0) {
            System.out.println("栈为空");
            return null;
        }
        int ret = elem[usedSize - 1];
        return ret;
    }

    public boolean isEmpty(){
        if(usedSize==0){
            return true;
        }
        return false;
    }
}
public class StackTest {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        //依次输出栈中的所有元素
        while(!stack.isEmpty()){
            Integer ret=stack.pop();
            System.out.print(ret+" ");
        }

    }
}
