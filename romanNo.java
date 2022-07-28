// developed by : @Coder_SagarThakare

import java.io.*;

class RomanNo {

	public static void main(String[] args)throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Enter Roman No : ");
		String rNum = br.readLine();

		RomanNo obj = new RomanNo();
		int intNo = obj.converteToInt(rNum);

		if(intNo != -1)
			System.out.println("Integer no : "+intNo);

	}

	int converteToInt(String num) {

		int add=0;

		for(int i=0 ;i<num.length(); i++){
			char ch = (char)num.charAt(i);

			switch(ch){
				case 'I' : add++;
					break;
				case 'V':
					   if(i==0)
						   add += 5;
					   else if(num.charAt(i-1) == 'I')
						   add += 3;
					   else if(num.charAt(i)=='V')
						   add += 5;
					   break;
				case 'X':
					   if(i==0)
						   add += 10;
					   else if(num.charAt(i-1)=='I')
						  add += 8;
					   else if(num.charAt(i) == 'X')
						   add += 10;
					   break;
				case 'L':
					   if(i==0)
						   add += 50;
					   else if(num.charAt(i-1)=='X')
						   add += 30;
					   else if (num.charAt(i)=='L')
						   add += 50;
					   break;
				case 'C':
					   if(i==0)
						   add += 100;
					   else if (num.charAt(i-1)=='X')
						   add += 80;
					   else if (num.charAt(i)=='C')
						   add += 100;
					   break;

				case 'D' :
					   if(i==0)
						   add += 500;
					   else if (num.charAt(i-1)=='C')
						   add += 300;
					   else if (num.charAt(i)=='D')
						   add += 500;
					   break;
				case 'M' : 
					   if(i==0)
						   add += 1000;
					   else if (num.charAt(i-1)=='C')
						   add += 800;
					   else if (num.charAt(i)=='M')
						   add += 1000;
					   break;
				default :
				   	
					 System.out.println("\tThis is not Roman No. \n\tRoman No. are written in only Capital Letters");	   
					 return -1;
			}

		}
		return add;
	}
}
