/*
 * ���� ����
���̰� ���� �� ���ڿ� str1�� str2�� �־����ϴ�.

�� ���ڿ��� �� ���ڰ� �տ������� ���� �����ư��鼭 �� ���� �����ϴ� ���ڿ��� ����� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
1 �� str1�� ���� = str2�� ���� �� 10
str1�� str2�� ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��Դϴ�.

������ ����ִ� ���� Ǯ�̿���.
���� ���� for���� ���� arr3[] �迭�� a�� b�� ���ʷ� �ִ� ������ ������
�̴� �־��� ���ڿ��� ���̿� �������� ���ڿ��� ���̰� �ٸ��⿡ �ε����� ũ�⸦ �Ѵ� ������ �߻��ߴ�.

�̸� �ذ��ϱ� ���� ���� ������ ã�� �� ���ڿ��� ¦���� Ȧ�� ��°�� ������ �Ǵ°��� �˾�����
�̸� �迭 �ε����� ���� �ʱ� ���� j�� k������ ������ �ش� ������ �迭�� ���̸� ���� �ʰԲ� ������ �־� ������ Ǯ����.
������ �ٸ� �׽�Ʈ ���̽��� ������ �������� �߻��Ͽ�

String.valueOf( str1.charAt(i) ) �� Ȱ���� ���ڿ� "ab"�� ���Ͽ� answer String �迭 �ȿ� �ִ� ����� �˾Ƽ�
�ش� ����� ���� ������ Ǯ���ߴ�.

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
