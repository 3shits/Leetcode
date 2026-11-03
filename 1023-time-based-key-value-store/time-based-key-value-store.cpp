#include <unordered_map>

struct MapValue{
    std::string val;
    int timestamp;
};

class TimeMap {
public:
    std::unordered_map<std::string, std::vector<MapValue>> tmap; 
    TimeMap() {
    }
    
    void set(string key, string value, int timestamp) {
        tmap[key].push_back({value,timestamp});
    }
    
    string get(string key, int timestamp) {
        vector<MapValue>& t = tmap[key];
        int st = 0 , end = (int)t.size()-1;
        std::string res = "";
        while(st <= end)
        {
            int mid = st + (end - st)/2;
            if(t[mid].timestamp <= timestamp)
            {
                res = t[mid].val;
                st = mid + 1;
            }
            else
            end = mid - 1;
        }
        

        return res;
    }
};

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap* obj = new TimeMap();
 * obj->set(key,value,timestamp);
 * string param_2 = obj->get(key,timestamp);
 */