class MyHashMap {

    class Bucket{
        int key;
        int value;
        Bucket next;

        public Bucket(int key, int value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    Bucket map[];
    int len;

    public MyHashMap() {
        len = 100001;
        map = new Bucket[len];
    }
    
    public void put(int key, int value) {
        int index = key % len;
        if(map[index] == null)
        {
            map[index] = new Bucket(key,value);
            return;
        }
        if(map[index].key == key)
        {
            map[index].value = value;
            return;
        }
        else
        {
            Bucket temp = map[index];
            while(temp.next != null)
            {
                if(temp.key == key)
                {
                temp.value = value;
                return;
                }
                temp = temp.next;
            }
            temp.next = new Bucket(key ,value);
        }
    }
    
    public int get(int key) {
        int index = key % len;
        if(map[index] == null)
        return -1;
        else
        {
            if(map[index].key == key)
            return map[index].value;

            else
            {
                Bucket temp = map[index];
                while(temp != null)
                {
                    if(temp.key == key)
                    return temp.value;

                    temp = temp.next;
                }
                return -1;
            }
        }
    }
    
    public void remove(int key) {
        int index = key % len;
        if(map[index] == null)
        return;
        if(map[index].key == key)
        {
            map[index] = map[index].next;   
        }
        else
        {
            Bucket temp = map[index];
            while(temp.next != null)
            {
                if(temp.next.key == key)
                {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
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