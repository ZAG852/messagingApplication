package testStuff;

import java.util.HashMap;

public class checker {

	public static void main(String args[]) {
		String x = "new";
	
	if("new"==x)
	{
		System.out.println(true);
	}
	}
	boolean solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++)
        {
        	if(map.containsKey(A[i])) {
        		int currentNum = map.get(A[i]);
        		if(currentNum == 2)
        			return false;
        		else {
        			currentNum++;
        			map.replace(A[i], currentNum);
        		}
        	}
        	else {
        		map.put(A[i], 1);
        	}
        }
        for(int i = 0; i < A.length; i++)
        {
			if(map.get(A[i]) != 2)
        		return false;
        }
        return true;
    }
}
