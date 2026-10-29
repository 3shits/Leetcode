class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int boats = 0 , k;
        for(k = 0 ; k < people.length ; k++)
        {
            if(people[k] >= limit)
            {
                boats = people.length - k -1;
                k++;
                break;
            }
        }

        int i = 0 , j = k - 1;

        while(i < j)
        {
            int sum = people[i] + people[j];
            if(sum == limit)
            {
                boats++;
                people[i] = 0;
                people[j] = 0;
                i++;
                j--;
            }
            else if(sum < limit)
            {
                if(sum != 0 && people[i] != 0)
                {
                    people[i] = 0;
                    people[j] = 0;
                    j--;
                    boats++;
                }
                i++;
            }
            else 
            j--;
        }
        
        for(int l = i; l < k ; l++)
        {
            if(people[l] != 0)
            boats++;
        }

        return boats;
    }
}