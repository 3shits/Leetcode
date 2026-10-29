class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0 , j = people.length -1 , boats = 0;

        for(int k = 0 ; k < people.length ; k++)
        {
            if(people[k] >= limit)
            {
                people[k] = 0;
                boats++;
            }
        }

        Arrays.sort(people);
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

        for(int k = i ; k < people.length ; k++)
        {
            if(people[k] != 0)
            boats++;
        }

        return boats;
    }
}