package cn.list;

/**
 * @ClassName CycleQueen
 * @Description TODO
 * @Auther danni
 * @Date 2019/7/31 15:17]
 * @Version 1.0
 *
 **/

public class CycleQueen {
    private int front = -1;
    private int rear = -1;
    private int size = 0;
    private int[] array = new int[10];

    //入队列
    public void push(int x) {
        if (size == array.length) {
            System.err.println("队列已满");
            return;
        }
        int index = (rear + 1) % array.length;
        array[index] = x;
        if (size == 0) {
            front = index;
        }
        rear = index;
        size++;
    }

    public int pop() {
        if (size == 0) {
            System.err.println("队列为空");
            return -1;
        }
        int val = array[front];
        front = (front + 1) % array.length;
        size--;
        return val;
    }

    public int peek() {
        if (size == 0) {
            System.err.println("队列为空");
            return -1;
        }
        int val = array[front];
        return val;
    }

    public static void main(String[] args) {
        CycleQueen cqueen=new CycleQueen();
        cqueen.push(1);
        cqueen.push(2);
        cqueen.push(3);
        cqueen.push(4);
        cqueen.push(5);
        System.out.println(cqueen.pop());
        System.out.println(cqueen.pop());
        System.out.println(cqueen.pop());
        System.out.println(cqueen.pop());
        System.out.println(cqueen.pop());
        System.out.println(cqueen.pop());


    }
}