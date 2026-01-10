class MyHashMap {

    class Bucket{
        int key,value;
        Bucket next;

        public Bucket(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    Bucket map[];
    int len;

    public MyHashMap() {
        len = 1000;
        map = new Bucket[len];
    }
    
    public void put(int key, int value) {
        int index = key % len;
        Bucket curr = map[index];
        while(curr != null)
        {
            if(curr.key  == key)
            {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Bucket newBucket = new Bucket(key,value);
        newBucket.next = map[index];
        map[index] = newBucket;
    }
    
    public int get(int key) {
        int index = key % len;
        Bucket curr = map[index];
        while(curr != null)
        {
            if(curr.key == key)
            {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key % len;
        Bucket curr = map[index] , prev = null;
        while(curr != null)
        {
            if(curr.key == key)
            {
                if(prev == null)
                map[index] = curr.next;
                
                else
                prev.next = curr.next;

                return;
            }
        prev = curr;
        curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */