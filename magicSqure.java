package Kevin.exercise;

import java.util.HashSet;

public class magicSqure {

	static int[] nonDup(int[][] s) {
		int maxNum = s.length*s.length;
		HashSet<Integer> nonDupNum = new HashSet<Integer>();
    	int[] numbers = new int[maxNum];
    	int[] tmpNum = new int[maxNum];   	
    	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	nonDupNum.add(s[i][j]);
            }
        }


        for (int i = 0; i < maxNum; i++) {
        	numbers[i] = 1+i;
        	;
        }
        
        int q=0;
        for (int i = 0; i < numbers.length; i++) {
        	boolean flag = false;            
            for(int num : nonDupNum){
            	if(numbers[i] == num) {
            		flag = true;
            		break;
            	}
            }

            if(!flag) {
            	tmpNum[q] = numbers[i];
            	q++;
            }
        }
		return tmpNum;				
	}

	static int formingMagicSquare(int[][] s) {
    	
        /*
         * 0,0  1,1  2,2
         * 0,0  0,1  0,2
         * 0,1  1,1  2,1
         * 0,2  1,2  2,2
         * 1,0  1,1  1,2
         * 2,0  2,1  2,2
         * 0,0  1,0  2,0
         * 0,2  1,1  2,0
         */

    	return 0;
    }
    
	public static void main(String[] args) {
		
		String[] inputString = {"4 8 2","4 5 7","6 1 6"};
		
        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
        	String[] sRowItems = inputString[i].split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

	}

}
