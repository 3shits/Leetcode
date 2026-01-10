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
        if(set[index] == -1 || set[index] == key)
        {
            set[index] = key;
        }
        else
        {
            index++;
            while(index < len)
            {
                if(set[index] == -1 )
                break;
                if(index == len - 1)
                index = 0;
                if(index == key % len)
                {
                    System.out.println("Full");
                    return;
                }
                index++;
            }
            set[index] = key;
        }
    }
    
    public void remove(int key) {
         int index = key % len;
         if(set[index] == key)
         {
         set[index] = -1;
         return;
         }
         else
         {
            index++;
            while(index < len)
            {
                if(set[index] == key)
                {
                    set[index] = -1;
                    return;
                }
                if(index == len - 1)
                index = 0;
                if(index == key % len)
                {
                    System.out.println("Not found");
                return;
                }
                index++;
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
            index++;
            while(index < len)
            {
                if(set[index] == key)
                {  
                    return true;
                }
                if(index == len - 1)
                index = 0;
                if(index == key % len)
                {
                    System.out.println("Not found");
                return false;
                }
                index++;
            }
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