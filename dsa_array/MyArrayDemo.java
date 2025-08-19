class MyArray{
    private int[] array; // capacity; // ?
    private int size = 0;

    public MyArray(int capacity){
        this.array = new int[capacity];
    }
    public void add(int data){
        // if(size==5){}
        if(isFull()){
            System.out.println("Array is full");
            return;
        }
        array[size] = data;

        size++;
    }
    public void removeLast(){
        // if(size==0){}
        if(isEmpty()){
            System.out.println("Array is empty");
            return;
        }
        size--;
    }

    
    public void size(){
        System.out.println("Size: "+size);
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==5;
    }
    public void read(){
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("]");
    }

    public int read(int index){
        return 0;
    }

    public void addFirst(int data){
        
    }
}

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.size();     // 0
        myArray.read();     // []
        myArray.add(4);
        myArray.add(2);
        myArray.add(1);
        myArray.add(5);
        myArray.add(6);
        myArray.add(8);
        myArray.size();     // 5
        myArray.read();     // [4,2,1,5,6]
        myArray.removeLast();
        myArray.size();     // 4
        myArray.read();     // [4,2,1,5]
    }
}
