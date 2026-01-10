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
        len = 10001;
        map = new Bucket[len];
    }
    
    public void put(int key, int value) {
        System.out.println("Put:"+key+","+value);
        int index = key % len;
        // System.out.println("put: "+index);
        if(map[index] == null)
        {
        map[index] = new Bucket(key,value);
        }
        else
        {
            if(map[index].key == key)
            {
                map[index].value = value;
                return;
            }
            Bucket temp = map[index];
            while(temp.next != null)
            {
                if(temp.key == key)
                {
                    System.out.println("Updated");
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
        System.out.println("get: "+key);
        if(map[index] == null)
        {
        return -1;
        }
        else
        {
            System.out.println("Head: "+ map[index].key +","+map[index].value);
            if(map[index].key == key)
            {
                System.out.println("Found: "+ map[index].key +","+map[index].value);
            return map[index].value;
            }
            else
            {
                Bucket temp = map[index];
                while(temp != null)
                {
                    System.out.println("Others: "+ temp.key +","+temp.value);
                    if(temp.key == key)
                    {
                    System.out.println("Found: "+ temp.key +","+temp.value);
                    return temp.value;
                    }
                    temp = temp.next;
                }
                return -1;
            }
        }
    }
    
    public void remove(int key) {
        System.out.println("Remove:"+key);
        int index = key % len;
        if(map[index] == null)
        return;
        else
        {
            
            if(map[index].key == key)
            {
                if(map[index].next != null)
                map[index] = map[index].next;
                else
                map[index] = null;
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
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */