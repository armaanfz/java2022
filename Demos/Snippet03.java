public class Snippet03 {
	
	public static void main (String[] args) {
		int num = 128;
		int temp = num, result = 0;
		while(temp>0)
		{	result = result + (temp % 10);
			temp = temp / 10;
		}
		System.out.println(result);
	}
}

