/*
 * 문제 설명
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ str1의 길이 = str2의 길이 ≤ 10
str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.

참으로 재미있는 문제 풀이였다.
나는 이중 for문을 통해 arr3[] 배열에 a와 b를 차례로 넣는 생각을 했지만
이는 주어진 문자열의 길이와 합쳐지는 문자열의 길이가 다르기에 인덱스의 크기를 넘는 오류가 발생했다.

이를 해결하기 위해 나는 패턴을 찾아 각 문자열이 짝수와 홀수 번째에 들어오면 되는것을 알았으며
이를 배열 인덱스를 넘지 않기 위해 j와 k변수를 선언후 해당 변수가 배열의 길이를 넘지 않게끔 조건을 주어 문제를 풀었다.
하지만 다른 테스트 케이스를 넣을때 문제점이 발생하여

String.valueOf( str1.charAt(i) ) 를 활용해 문자열 "ab"를 더하여 answer String 배열 안에 넣는 방법을 알아서
해당 방법을 통해 문제를 풀이했다.

 * */


public class Solution {
	 public String solution(String str1, String str2) {
//	        String answer = "";
//	        int j = 0;
//	        int k = 0;
//	        
//	        char arr1[] = str1.toCharArray();
//	        char arr2[] = str2.toCharArray();
//	        char arr3[] = new char[arr1.length+arr2.length];
//	        
//	        for(int i=0; i < arr1.length + arr2.length; i++)
//	        {
//	        	if( i / 2 == 0 && j < 5)
//	        	{
//	        		arr3[i] = arr1[j];
//	        		j++;
//	        	}
//	        	else if(i / 2 != 0 && k < 5)
//	        	{
//	        		arr3[i] = arr2[k];
//	        		k++;
//	        	}
//	        }
//	        
//	        answer = String.valueOf(arr3);
//	        
//	        return answer;
		 
		 String answer = "";
		 
		 for(int i = 0; i < str1.length(); i++)
		 {
			 answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
		 }
		 
		 
		 return answer;
		 
	    }
}
