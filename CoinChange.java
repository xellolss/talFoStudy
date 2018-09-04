package Kevin.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CoinChange {
	static long getCoin(long n, long[] c) {
		
		return 0;
	}
    // Complete the getWays function below.
    static long getWays(long n, long[] c) {
    	Arrays.sort(c);

    	int cLength = c.length;
    	
    	ArrayList<long[]> arrWays = new ArrayList<>();
    	
//    	for(int j=0;j<cLength;j++) {
    		long minusAdd = n;
//        	long[] ways = new long[10];
        	String ways ="";
        	int addNum = 0;
        	
        	int i = 0;
//	    	while(i == cLength &&  ) {

	//    		System.out.println(c[i]);
	    		System.out.print("1.minusAdd : "+minusAdd);
				System.out.println(" mod : "+ c[i]);

	    		if(minusAdd%c[i] == 0)  {
	    			while(minusAdd !=0) {
	    				minusAdd -= c[i];
//	    				ways[addNum++] = cc;
	    				if(minusAdd == 0) {
	    					ways += c[i];
	    				} else {
	    					ways += c[i]+",";
	    				}
	    				System.out.print("3.minusAdd : "+minusAdd);
		    			System.out.println(" mod : "+ c[i]);
	    			}
	    		} else if(minusAdd%c[i] != 0 && minusAdd > c[i]) {
		    		do {
		    			if(minusAdd - c[i] <0) {
		    				ways =  ways.substring(0,ways.lastIndexOf(",")-1); 
		    				minusAdd += c[i];
		    				i++;
		    			} else {
			    			minusAdd -= c[i];
	//		    			ways[addNum++] = cc;
		    				if(minusAdd == 0) {
		    					ways += c[i];
		    				} else {
		    					ways += c[i]+",";
		    				}
			    			System.out.print("2.minusAdd : "+minusAdd);
			    			System.out.println(" mod : "+ c[i]);
		    			}
		    		} while(i<cLength || minusAdd ==0);
	    		}
//	    		if(minusAdd == 0) break;
//	    	}
	    	System.out.println(ways);
	        String[] cItems = ways.split(",");
	        
	        long[] tmp = new long[cItems.length];
	        for (int j = 0; j < cItems.length; j++) {
	            long cItem = Long.parseLong(cItems[j]);
	            tmp[j] = cItem;
	        }
	    	arrWays.add(tmp);
    	
//    	}
    	
    	for(long[] arrWay : arrWays) {
    		for(long way : arrWay) {System.out.print(way+" ");}
    		System.out.println();
    	}
    	
    	return 0;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 7;

        int m = 2;

        long[] c = new long[m];

        String[] cItems = "3 4".split(" ");
        
        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);
        
        System.out.println("result : "+ways);
	}

}

1 2 3

1 1 1 1
2 1 1
1 2 1
1 1 2
3 1

