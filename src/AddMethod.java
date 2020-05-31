/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martha
 */
public class AddMethod {

    String[] data;
    int head = 0;

    int no = 0;

    public AddMethod(int limit) {
        data = new String[limit];
    }

    public void enqueue(String inputan) {
        if (head < data.length) {
            data[head] = inputan;
            head++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public String dequeue() {
        String tmp = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        head--;
        if (head >= 0) {
            data[head] = null;
            no++;
        } else {
            no = 0;
            head = 0;
            return "Queue is empty";
        }
        return "No.00" + no + ", Nama : " + tmp;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("No.00" + (no++) + ", Nama : " + data[i]);
        }
    }

    public static void main(String[] args) {
        AddMethod Cust = new AddMethod(5);
        Cust.enqueue("bureng");
        Cust.enqueue("buris");
        Cust.enqueue("reza");
        Cust.enqueue("ayis");
        Cust.enqueue("suroso");
        Cust.print();
    }
}
