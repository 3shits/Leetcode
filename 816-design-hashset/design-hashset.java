import java.util.LinkedList;

class MyHashSet {

    int len;
    int set[];
    public MyHashSet() {
        len = 10001;
        set = new int[len];
        Arrays.fill(set,-1);
    }

    public void add(int key) {
        int index = key % len;
        if(set[index] == -1)
        {
            set[index] = key;
        }
        else
        {
            if(set[index] == key)
            return;
            else
            {
            while(set[index] != -1)
            {
                index++;
                if(index == len - 1)
                {
                    System.out.println("Exceeded");
                return;
                }
            }
            set[index] = key;
            }
        }
    }
    
    public void remove(int key) {
         int index = key % len;
         if(set[index] == key)
         {
            set[index] = -1;
         }
         else
         {
            while(set[index] != key)
            {
                index++;
                if(index == len - 1)
                {
                System.out.println("Exceeded");
                return;
                }
                if(set[index]== key)
                set[index] = -1;
            }
         }

    }
    
    public boolean contains(int key) {
        int index = key % len;
         if(set[index] == key)
         {
            return true;
         }
         else
         {
            while(index != len -1)
            {
                index++;
                if(set[index]== key)
                return true;
            }
            System.out.println("Exceeded");
            return false;
         }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */