class MyCircularQueue {

    int[] arr;
    int count;
    int max;
    int head;

    public MyCircularQueue(int k) {
        arr = new int[k];
        count = 0;
        max = k;
        head = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        arr[(head + count) % max] = value;
        count++;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        head = (head + 1) % max;
        count--;

        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return arr[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[(head + count - 1) % max];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == max;
    }
}