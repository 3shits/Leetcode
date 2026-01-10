class MyHashSet {

    int len;
    int set[];
    public MyHashSet() {
        len = 100000;
        set = new int[len];
        
    }

    public void add(int key) {
        int index = key % len;
        if(key == 0)
        {
        set[index] = 1;
        return;
        }
        if(set[index] == 0)
        {
            set[index] = key;
        }
        else
        {
            if(set[index] == key)
            return;
            else
            {
            while(set[index] != 0)
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
         if(key == 0 && set[index] == 1)
         {
            set[index] = 0;
            return;
         }
         if(set[index] == key)
         {
            set[index] = 0;
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
                set[index] = 0;
            }
         }

    }
    
    public boolean contains(int key) {
        int index = key % len;
        if(key == 0)
        {
            return set[index] == 1? true:false;
        }

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