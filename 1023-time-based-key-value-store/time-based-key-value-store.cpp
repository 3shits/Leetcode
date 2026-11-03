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
        tmap[key].emplace_back(value,timestamp);
    }
    
    string get(string key, int timestamp) {
        const vector<MapValue>& t = tmap[key];
        int st = 0 , end = (int)t.size()-1;
        int res = -1;
        while(st <= end)
        {
            int mid = st + (end - st)/2;
            if(t[mid].timestamp <= timestamp)
            {
                res = mid;
                st = mid + 1;
            }
            else
            end = mid - 1;
        }
        

        return res != -1 ? t[res].val : "";
    }
};

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap* obj = new TimeMap();
 * obj->set(key,value,timestamp);
 * string param_2 = obj->get(key,timestamp);
 */