import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> arr = new Stack<>();
        boolean flag = false;
        for(int i = 0;  i < asteroids.length ; i++)
        {
            flag = false;
            if(asteroids[i] < 0 )
            {  
                while(!arr.empty())
                {
                    int ast = arr.peek();
                    if(ast > 0)
                    {
                        if(-asteroids[i] < ast)
                        {
                            flag = true;
                            break;
                        }
                        else if(-asteroids[i] == ast)
                        {
                            arr.pop();
                            flag = true;
                            break;
                        }
                        else
                        arr.pop();
                    }
                    else
                    break;
                }
            }
            if(!flag)
            arr.push(asteroids[i]);
        }
        int[] res= new int[arr.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = arr.pop();
        }

        return res;
    }
}