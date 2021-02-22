package testStuff;

public class solution {
	public int solution(int N) {
        // write your code in Java SE 8
		StringBuilder myBinary = new StringBuilder();
        int number = N;
        while(number > 0)
        {
            myBinary.append(number % 2);
            number /= 2;
        }
        //number/=2;
        //myBinary.append(number % 2);
        myBinary.reverse();
        int counter = 0;
        int maxCounter = 0;
        
        boolean track = false;
        System.out.println(myBinary);
        for(int i = 0; i < myBinary.length() - 1; i++)
        {
            if(myBinary.charAt(i) == '1' && myBinary.charAt(i + 1) == '0')
            {
                track = true;
                counter = 0;
            }
            if(track && (myBinary.charAt(i) == '0' && myBinary.charAt(i + 1) == '1'))
            {
                if(counter > maxCounter)
                    maxCounter = counter;
                counter = 0;
                track = false;
            }
            if(track)
            {
                counter++;
            }
            
        }
        return maxCounter;
    }
	
}
