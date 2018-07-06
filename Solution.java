package Kevin.exercise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	static int anagramCnt;
    public static void addChar(ArrayList<char[]> charArr, String substrString) {
    	char[] substrAnagramTochar = substrString.toCharArray();
        Arrays.sort(substrAnagramTochar);
        charArr.add(substrAnagramTochar);
    }
    
    
    public static void compareArr(ArrayList<char[]> arr) {
    	for(int i=0;i<arr.size()-1;i++) {
    		
    		String aaa = new String(arr.get(i));
    		
    		for (int j = 1+i; j < arr.size(); j++) {
    			
    			String bbb = new String(arr.get(j));
				if(aaa.equals(bbb)) {
					anagramCnt++;
				}
				
			}
    	}
    }
    
//     Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        anagramCnt = 0;
        
        /* 진행중 */
        for(int i=1;i<s.length();i++) {
        	
        	ArrayList<char[]> substrAnagram = new ArrayList<char[]>();
        	
            for(int j=0;j<=s.length()-i;j++) {
            	
            	addChar(substrAnagram, s.substring(j, j+i));

            }
            compareArr(substrAnagram);
        }
        return anagramCnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}