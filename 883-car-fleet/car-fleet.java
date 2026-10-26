class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      int n = position.length;
      int[][] cars = new int[n][2];
      for(int i = 0; i < n ; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars , (a,b)-> a[0] - b[0]);
        
      int fleets = 0;
    double maxTime = 0;
      for(int i = position.length - 1; i >= 0 ; i--)
      {
        double t = (double)(target - cars[i][0])/cars[i][1];
        if(t > maxTime)
        {
        maxTime = t;
        fleets++;
        }
      }
      return fleets;
    }
}