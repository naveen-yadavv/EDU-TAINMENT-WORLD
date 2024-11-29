import java.util.*;

class scanner
{
	
	static Scanner sc = new Scanner(System.in);
}

class colour{

		static String bgred="\u001B[41m";
		static String bgblue="\u001B[44m";
        	static String bgmegenta="\u001B[45";
        	static String bggreen="\u001B[42m";
		static String bgyellow="\u001B[43m";
    		static String SET_BOLD_TEXT = "\033[0;1m";
		static String REDBRI= "\033[1;91m";
		static String increaseFontSize = "\033[1;31m";
		static String resetFormatting = "\033[0m";
		static String BOLD="\u001B[1m";
		static String BLINK ="\u001B[5m";
		static String whitebg="\u001B[47m";
		static String black ="\u001B[30m";
		static String magent = "\u001B[95m";
		static final String ital = "\u001B[3m";
		static String ul = "\u001B[4m";
		static String skblue = "\u001B[36m";
		static String RESET = "\u001B[0m";
        	static String RED = "\u001B[31m";
        	static String GREEN = "\u001B[32m";
        	static String YELLOW = "\u001B[33m";
		static String BLUE="\u001B[34m";
		static String PURPLE="\u001B[35m";
		static String WHITE="\u001B[37m";
		static String CYAN="\u001B[36m";


}
abstract class A1 extends colour{
	abstract void que1();
	abstract void que2();
	abstract void que3();
}


class A extends A1 {
	Random obj = new Random();
	int a = obj.nextInt(10);
	int b = obj.nextInt(50);
	static int count=0;
	int d=0;
	void que1(){
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgyellow  +black+" Question-1 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		System. out. print(a+" + "+b+" is : " );
		int Result = a+b;
		String Ans =  scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1))
		{
			count++;
		}
		que2();
	}
	void que2(){
		System.out.println(" ");
		System.out.println("NOTE : Enter Capital Letters Only "); 
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgyellow  +black+" Question-2 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		if(a==0)
		{
			a=1;
		}
		if(a>=1&&a<=25)
		{
			for(char i = 'A';i<=(char)(64+a);i++)
			{
	   			System.out.print(i+" ");
			}
	    		System. out. print (" after is : " );
   	    		char ans1 = scanner.sc.next().charAt(0);
			if(ans1 == (char)(65+a))
			{
				count++;
		
			}
		}
		que3();
	}
	void que3(){
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgyellow  +black+" Question-3 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		if(a==1)
		{
			a=2;
		}
		char n = (char)(64+a);
		System.out.println("Write Before and After Alphabets of " + n);
		System.out.println("_"+n+"_");
		System.out.print("Before alphabet of "+n+" is : ");
		char ans3 = scanner.sc.next().charAt(0);
		System.out.print("After  alphabet of "+n+" is : ");
		char ans4 = scanner.sc.next().charAt(0);
		if(ans3==(char)(65+a-2))
		{
			d++;
		}
		if(ans4==(char)(65+a))
		{
			d++;
		}
		if(d==2)
		{
			count++;
		}
	}
}


interface result47{
	void result();
}


class result extends A implements result47{
	



	void gamechance()
	{
	
		System.out.println(GREEN+"1. FRUIT NINJA \n2. TALKING TOM \n3. BUBBLE SHOOTER\n4. CANDY CRUSH\n5. CARROM"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("FRUIT NINJA");break;
			case "2" : System.out.println("TALKING TOM");break;
			case "3" : System.out.println("BUBBLE SHOOTER");break;
			case "4" : System.out.println("CANDY CRUSH");break;
			case "5" : System.out.println("CARROM");break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance();
			}
	}

	void gamechance1()
	{

		System.out.println(GREEN+"1. FRUIT NINJA  \n2. TALKING TOM \n3. CANDY CRUSH "+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("FRUIT NINJA \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2" : System.out.println("TALKING TOM \n WOW...!! Great Choice..Enjoy your Game ");break;
			case "3" : System.out.println("CANDY CRUSH \n WOW...!! Great Choice..Enjoy your Game ");break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance1();
			}
	}	


	void gamechance2()
	{

		System.out.println(GREEN+"1. BUBBLE SHOOTER \n2. CARROM"+RESET);
		String x=scanner.sc.next();
		switch(x){
			case "1":System.out.println("BUBBLE SHOOTER  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2":System.out.println("CARROM  \n WOW...!! Great Choice..Enjoy your Game" );break;	
			default :System.out.println("SORRY....! Enter Valid Number");gamechance2();
			}
	}


	public void result()
    	{
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgyellow  +black+" Results: "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
	    if(count==3)
	    {
		System.out.println(BOLD+skblue+"WOWW....Cheers !!Quick-Witted...!");
		System.out.println("Marks scored is "+count+" out of 3");
		System.out.println("Amazing...Congratulations you got 25 Gold coins");
		System.out.println("You are eligible to play all types of Games "+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
			
		
	   }
	   else if(count==2)
	   {
		System.out.println(BOLD+skblue+"Marvellous!! that's a great work...!");
		System.out.println("Marks scored is "+count+" out of 3");
		System.out.println("Impressive...Congratulations you got 10 Gold coins");
		System.out.println("You are eligible to play few Games only "+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games)  \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance1(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
			
	  }	
	  else if(count==1)
	  {
		System.out.println(BOLD+skblue+"Nice try...Not bad buddy!");
		System.out.println("Marks scored is "+count+" out of 3");
		System.out.println("Congratulations you got 5 Gold coins");
		System.out.println("You are eligible to play few Games only "+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance2(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
			
	  }
	  else
	  {
		System.out.println(BOLD+skblue+"Do practice and Study Well");
		System.out.println("Marks scored is "+count+" out of 3");
		System.out.println("Better Luck Next Time! you got 0 Gold coins");
		System.out.println("You are NOT Eligible to play Games "+RESET);
	  }
      }

  }



//age 8-11



abstract class B1 extends colour{
	abstract void que1();
	abstract void que2();
	abstract void que3();
}



class B extends B1{
	static int count=0;
	void que1(){
		Random obj = new Random();
		int a = obj.nextInt(10);
		int b = obj.nextInt(100);
		int z=0;
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +" Question-1(a) "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		if(a==0)
		{
			a=1;
		}
		System. out. print(b+"/"+a+" is : " );
		int Result1 = b/a;
		String Ans1 = scanner.sc.next();
		String Result11 = Result1+"";
		if(Ans1.equals(Result11))
		{
			z++;
		}
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Question-1(b) "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		if(a==0)
		{
			a=1;
		}
		System. out. print(a+"-"+b+" is : " );
		int Result2 = a-b;
		String Ans2 =  scanner.sc.next();
		String Result22 = Result2+"";
		if(Ans2.equals(Result22))
		{
			z++;
		
		}
		if(z==2){
			count+=1;
		}
		System.out.println(" ");
		que2();
	}
    	void que2(){
    		int z=0, c=0, result=0;
    		Random random = new Random();
    		int a = random.nextInt(1) + 1;
    		int b = random.nextInt(20) + 1;
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Question-2 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
    		if(a>b){
    			a=a+b-(b=a);
    		}
    		System.out.println("Each mango cost is Rs "+a+". How much costs for "+b+" mangoes?");
		int Result = a*b;
		String Ans = scanner.sc.next();
    		
		String Result1 = Result+"";
    		if(Ans.equals(Result1)){
    			count++;
		}
		
		que3();
		
	}
    	void que3(){
    		Random obj=new Random();
    		int a=obj.nextInt(10)+1;
    		int b=obj.nextInt(10)+1;
    		int c=obj.nextInt(10)+1;
		System.out.println(BLINK+"-------------  "+RESET+bggreen +black+" Question-3 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
    		System.out.println("The value of a is "+a);
    		System.out.println("The value of b is "+b);
    		System.out.println("The value of c is "+c);
    		System.out.println("Solve this expression by using above values a+(b-c)*a+b");
    		int Result=a+(b-c)*a+b;
    		String Ans=scanner.sc.next();
		String Result1 = Result+"";
    		if(Ans.equals(Result1))
    		{
    			count++;
    		}
	}
}
    	
		

interface result811{
	void result2();
}



class result2 extends B implements result811{

	void gamechance()
	{

	System.out.println(BLUE+"1. WOW GAME \n2. SUBWAY SURFACE \n3. HILL CLIMB \n4. CANDY CRUSH \n5. CARROM"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("WOW GAME  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2" : System.out.println("SUBWAY SURFACE  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "3" : System.out.println("HILL CLIMB  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "4" : System.out.println("CANDY CRUSH  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "5" : System.out.println("CARROM  \n WOW...!! Great Choice..Enjoy your Game" );break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance();
			}
		
	}


	void gamechance1()
	{

		System.out.println(BLUE+"1. SUBWAY SURFACE \n2. HILL CLIMB \n3. CANDY CRUSH"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("SUBWAY SURFACE  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2": System.out.println("HILL CLIMB  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "3" : System.out.println("CANDY CRUSH  \n WOW...!! Great Choice..Enjoy your Game" );break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance1();
			}
		
	}


	void gamechance2()
	{

		System.out.println(BLUE+"1. WOW GAME \n2. CARROM"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("WOW GAME  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2" : System.out.println("CARROM \n WOW...!! Great Choice..Enjoy your Game" );break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance2();
			}
		
	}



     public void result2()
     {
	System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Results :  "+RESET+BLINK+"  -------------"+RESET);
	System.out.println(" ");
	if(count==3)
	{
		System.out.println(BOLD+PURPLE+"WOWW....Cheers !!Quick-Witted...! ");
		System.out.println("Marks scored is "+count+" out of 3.");
		System.out.println("Amazing...Congratulations you got 25 Gold coins.");
		System.out.println("You are eligible to play all types of Games, Enjoy your time."+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
			
		
	}
	else if(count==2)
	{
		System.out.println(BOLD+PURPLE+"Marvellous!! that's a great work...!");
		System.out.println("Marks scored is "+count+" out of 3.");
		System.out.println("Impressive...Congratulations you got 15 Gold coins.");
		System.out.println("You are eligible to play few Games only."+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance1(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
		
	}
	else if(count==1)
	{
		System.out.println(BOLD+PURPLE+"Nice try...Not bad buddy!");
		System.out.println("Marks scored is "+count+" out of 3.");
		System.out.println("You are eligible to play few Games only."+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance2(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
			
	}
	else
	{
		System.out.println(BOLD+PURPLE+"Do practice and Study Well");
		System.out.println("Marks scored is "+count+" out of 3");
		System.out.println("Better Luck Next Time! you got 0 Gold coins");
		System.out.println("You are NOT Eligible to play Games"+RESET);
	}
    }
}





// age 12-15

abstract class C1 extends colour{
	abstract void que1();
	abstract void que2();
	abstract void que3();
}


class C extends C1{
	Random obj = new Random();
	int n1 = obj.nextInt(10);
	int n2 = obj.nextInt(30);
	static int p=0,q=0,count=0;
	
	void que1(){
		System.out.println(BLINK+"-------------  "+RESET+bgred  +black+" Question-1 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		System.out.print(n1+" Times of "+n2+" equals to :");
		int Result = n1 * n2;
		String Ans = scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1)){
			count++;
		}
		 
		que2();
	}

	void que2(){
		System.out.println(" ");
		System.out.println("NOTE : Enter The value upto Two Decimals ");
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgred  +black+" Question-2 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		System.out.print(" What is "+n2+"% of "+n1+" Equals to :");
		float Result = (float)(n2*n1)/100;
		String Ans = scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1)){
			count++;
		}

		que3();
	}

	void que3(){
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgred  +black+" Question-3 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		System.out.print("What is the value of "+n1 + " power of 2 + " + n2 + " power of 2 : ");
		int Result = (int)(Math.pow(n1, 2) + Math.pow(n2, 2));
		String Ans = scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1)){
			count++;
		}
		
	}
}



interface result1215{
	void result3();
}


class result3 extends C implements result1215{




	void gamechance()
	{

			System.out.println(skblue+"1. LUDO GAME \n2. 8 BALL POOL \n3. DR DRIVING \n4. CANDY CRUSH \n5. CARROM "+RESET);

			String x=scanner.sc.next();
			switch(x){
		
				case "1" : System.out.println("LUDO GAME");break;
				case "2" : System.out.println("8 BALL POOL");break;
				case "3" : System.out.println("DR DRIVING");break;
				case "4" : System.out.println("CANDY CRUSH");break;
				case "5" : System.out.println("CARROM");break;
				default :System.out.println("SORRY....! Enter Valid Number");gamechance();
			}
		
	}


	void gamechance1()
	{

			System.out.println(skblue+"1. 8 BALL POOL \n2. DR DRIVING \n3. CARROM"+RESET);

			String x=scanner.sc.next();
			switch(x){
		
				case "1" : System.out.println("8 BALL POOL  \n WOW...!! Great Choice..Enjoy your Game" );break;
				case "2": System.out.println("DR DRIVING  \n WOW...!! Great Choice..Enjoy your Game" );break;
				case "3" : System.out.println("CARROM  \n WOW...!! Great Choice..Enjoy your Game" );break;
				default :System.out.println("SORRY....! Enter Valid Number");gamechance1();
			}
		
	}


	void gamechance2()
	{
			System.out.println(skblue+"1. LUDO GAME \n2. CANDY CRUSH"+RESET);

			String x=scanner.sc.next();
			switch(x){
		
				case "1" : System.out.println("LUDO GAME  \n WOW...!! Great Choice..Enjoy your Game" );break;
				case "2" : System.out.println("CANDY CRUSH  \n WOW...!! Great Choice..Enjoy your Game" );break;
				default :System.out.println("SORRY....! Enter Valid Number");gamechance2();
			}
		
	}




	public void result3()
	{
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bgred  +black+" Results : "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
		if(count==3)
		{
			System.out.println(BOLD+YELLOW+"WOWW....Cheers !!Quick-Witted...! ");
			System.out.println("Marks scored is "+count+" out of 3.");
			System.out.println("Amazing...Congratulations you got 25 Gold coins.");
			System.out.println("You are eligible to play all Types of Games,Enjoy your time."+RESET);

			System.out.println(" ");
			System.out.println("1 for to Enter into the Joyful World (Games) \n2 for Exit");
			String x=scanner.sc.next();
			switch(x){
		
				case "1" :gamechance(); break;
				case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
			}
			
		
		}
		else if(count==2)
		{
			System.out.println(BOLD+YELLOW+"Marvellous!! that's a great work...!");
			System.out.println("Marks scored is "+count+" out of 3.");
			System.out.println("Impressive...Congratulations you got 15 Gold coins.");
			System.out.println("You are eligible to play few Games only."+RESET);

			System.out.println(" ");
			System.out.println("1 for to Enter into the Joyful World (Games) \n2 for Exit");
			String x=scanner.sc.next();
			switch(x){
		
			case "1" :gamechance1(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
			}
			
		}
		else if(count==1)
		{
			System.out.println(BOLD+YELLOW+"Nice try...Not bad buddy!");
			System.out.println("Marks scored is "+count+" out of 3.");
			System.out.println("Congratulations you got 10 Gold coins.");
			System.out.println("You are eligible to play few Games only."+RESET);

			System.out.println(" ");
			System.out.println("1 for to Enter into the Joyful World (Games) \n2 for Exit");
			String x=scanner.sc.next();
			switch(x){
		
			case "1" :gamechance2(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
			}
			
		}
		else
		{
			System.out.println(BOLD+YELLOW+"Do practice and Study Well");
			System.out.println("Marks scored is "+q+" out of 3");
			System.out.println("Better Luck Next Time! you got 0 Gold coins");
			System.out.println("You are NOT eligible to play Games"+RESET);
		}
	}
}




//age 16-18

abstract class D1 extends colour{
	abstract void que1();
	abstract void que2();
	abstract void que3();
}



class D extends D1{
	Random random = new Random();
	int a = random.nextInt(10) + 1;
	int b = random.nextInt(50) + 1;
   	static int count=0;
	int sum=0;

	void que1(){
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Question-1 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");
	
		int n=6;  
		for(int i=1;i<=n;i++)
		{
			System.out.print((a+i*b)+" ");
		}

		System.out.println("Find the next Number");
	
		int Result = a+(n+1)*b;
		String Ans = scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1))
		{
			count++;
		}
	
		que2();
	}
	void que2(){
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Question-2 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");


		int Result=0;
		int y = random.nextInt(15)+1; 
        	switch (y) {
            
            	case 1:
                	System.out.println("How many continents are there in the world?");
			Result = 7;
                	break;
            	case 2:
                	System.out.println("How many states are there in India?");
			Result = 28;
                	break;
            	case 3:
                	System.out.println("In what year did World War II end?");
			Result = 1945;
                	break;
            	case 4:
                	System.out.println("How many ICC tropies should India Won");
			Result = 5;
                	break;
	    	case 5:
			System.out.println("How many Metres are there in a Kilometre?");
			Result = 1000;
                	break;
	    	case 6:
			System.out.println("ICC ODI World Cup is held after how many years?");
			Result = 4;
                	break;
	    	case 7:
			System.out.println("What is the launch year for Chandrayaan 3 mission?");
			Result = 2023;
                	break;
	    	case 8:
			System.out.println("In which year The Indian premier League start");
			Result = 2008;
                	break;
	   	case 9:
                	System.out.println(" How many seconds make one hour?");
		 	Result = 3600;
                	break;	
	   	case 10:
			System.out.println("What is the maximum strength of the Lok Sabha");
			Result = 552;
                	break;
	   	case 11:
                	System.out.println(" When was the Constitution of India adopted ?");
			Result = 1950;
                	break;
	   	case 12:
                	System.out.println("How many Schedules are there in the Indian Constitution?");
			Result = 20;
                	break;
	   	case 13:
                	System.out.println("What is the term years office for the President of India?");
			Result = 5;
                	break;
	   	case 14:
                	System.out.println("  What is the minimum age for a person to become the Prime Minister of India?");
			Result = 35;
                	break;
	   	case 15:
                	System.out.println(" How many Fundamental Rights are guaranteed by the Indian Constitution?");
			Result = 6;
                	break;
            	default:
                	System.out.println("Invalid question number");
        	}
		String Ans = scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1))
		{
			count++;
		}
	
		que3();
	}
	void que3(){
		System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Question-3 "+RESET+BLINK+"  -------------"+RESET);
		System.out.println(" ");


		System.out.println("Find the LCM of given two numbers "+a+" and "+b+" is ?");

     		int highest = a>b?a:b;
		int Result = 0;
	
		for(int i=highest;true;i=i+highest)
		{
			if(i%a==0 && i%b==0)
	     		{
				Result = i;
				break;
	     		}
		}
		String Ans = scanner.sc.next();
		String Result1 = Result+"";
		if(Ans.equals(Result1))
		{
			count++;
		}
	}
}


interface result1618{
	void result4();
}


	
class result4 extends D implements result1618{
	

	void gamechance()
	{
	
		System.out.println(YELLOW+"1. WCC \n2. ROBLOX \n3. BOOM KARTS \n4. CANDY CRUSH \n5. CARROM"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("WCC  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2" : System.out.println("ROBLOX  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "3" : System.out.println("BOOM KARTS  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "4" : System.out.println("CANDY CRUSH  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "5" : System.out.println("CARROM  \n WOW...!! Great Choice..Enjoy your Game" );break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance();
			}
		
	}


	void gamechance1()
	{
	
		System.out.println(YELLOW+"1. WCC \n2. ROBLOX \n3. CANDY CRUSH"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("WCC  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2": System.out.println("ROBLOX  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "3" : System.out.println("CANDY CRUSH  \n WOW...!! Great Choice..Enjoy your Game" );break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance1();
			}
		
	}


	void gamechance2()
	{
	
		System.out.println(YELLOW+"1. WOW \n2. CANDY CRUSH"+RESET);
		String x=scanner.sc.next();
		switch(x){
		
			case "1" : System.out.println("WOW  \n WOW...!! Great Choice..Enjoy your Game" );break;
			case "2" : System.out.println("CANDY CRUSH  \n WOW...!! Great Choice..Enjoy your Game" );break;
			default :System.out.println("SORRY....! Enter Valid Number");gamechance2();
			}
		
	}



     public void result4()
     {
	
	System.out.println(" ");
		System.out.println(BLINK+"-------------  "+RESET+bggreen  +black+" Results :  "+RESET+BLINK+"  -------------"+RESET);
	System.out.println(" ");
	if(count==3)
	{
		System.out.println(BOLD+skblue+"WOWW....Cheers !!Quick-Witted...! ");
		System.out.println("Marks scored is "+count+" out of 3.");
		System.out.println("Amazing...Congratulations you got 25 Gold coins.");
		System.out.println("You are eligible to play all Types of Games,Enjoy your time."+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
		
	}
	else if(count==2)
	{
		System.out.println(BOLD+skblue+"Marvellous!! that's a great work...!");
		System.out.println("Marks scored is "+count+" out of 3.");
		System.out.println("Impressive...Congratulations you got 15 Gold coins.");
		System.out.println("You are eligible to play few Games only."+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance1(); break;
			case "2": System.out.println("Have a Nice Day Buddy....!");break;
		
		}
		
	}
	else if(count==1)
	{
		System.out.println(BOLD+skblue+"Nice try...Not bad buddy!");
		System.out.println("Marks scored is "+count+" out of 3.");
		System.out.println("Congratulations you got 10 Gold coins.");
		System.out.println("You are Eligible to play few Games only."+RESET);

		System.out.println(" ");
		System.out.println("1 for to enter into the Joyful World (Games) \n2 for Exit");
		String x=scanner.sc.next();
		switch(x){
		
			case "1" :gamechance2(); break;
			case "2": System.out.println("Have a nice day buddy....!");break;
		
		}
			
	}
	else
	{
		System.out.println(BOLD+skblue+"Do practice and Study Well");
		System.out.println("Marks scored is "+count+" out of 3");
		System.out.println("Better Luck Next Time! you got 0 Gold coins");
		System.out.println("You are NOT eligible to play Games"+RESET);
	}
    }
}



class test extends colour{

		
		static private String mobilenumber;		
		
		static Random obj = new Random();	
  	     

       void mobilenumber()
   	{ 

		String s=scanner.sc.next();
		this.mobilenumber = s;
		int c=0;

  		if(s.length()<10 || s.charAt(0)=='0' ||s.length()>10)
		{
			c=1;
		}
		else
		{
			char ch=s.charAt(0);
			if(ch>='0'&&ch<='5')
			{
				c=1;
			}
			else
			{
				for(int i=0;i<=s.length()-1;i++)
				{
					char ch1=s.charAt(i);
					if(ch1>='0'&&ch1<='9')
					{

					}
					else
					{
						c=1;
						break;
					}
				}
			}
		}
	
		if(c==1)
		{
			System.out.println();System.out.println(BOLD+RED+"Number Should contains Only 10 Charters and should Not Starts With 0-5");
			System.out.println();
			System.out.println(RED+"Please recheck your mobile number and Enter Again");
			System.out.println(CYAN+" ");
			mobilenumber();
		}
		else
		{
			OTP();
		}

   	}


	    static void OTP()  
    	    {  
        	int OTP   = obj.nextInt(1000)+1000;
		System.out.println();
		System.out.println("your Generated OTP is : "+PURPLE+""+OTP+WHITE+"");
		System.out.println();
		System.out.println("Enter OTP ");
		String userotp = scanner.sc.next();
		String otp1 = OTP+"";
		System.out.println();
		if(otp1.equals(userotp))
		{
			System.out.println(BOLD+GREEN+"Hurryyyy...!!!! Your Login was Successfully completed. ");
			System.out.println(" ");
		}
		else
		{
		      	System.out.println("Invalid OTP");
			System.out.println("Please Enter Valid  OTP");
            		OTP();
			
		}	
    	   } 

		static void registration(){

		System.out.println(BOLD+skblue+"Enter Your First Name : "+RESET);
		String Firstname=scanner.sc.next();
		System.out.println();
		System.out.println(BOLD+YELLOW+"Enter Your Last Name : "+RESET);
		String Lastname=scanner.sc.next();
		System.out.println();
		System.out.println(BOLD+PURPLE+"Enter Your Age : "+RESET);
		String age=scanner.sc.next();
		System.out.println();
		System.out.println("Enter mobile number : ");
		String num = scanner.sc.next();
		if(num.equals(mobilenumber))
		{	
			System.out.println(GREEN+"Registration successfully Completed"+RESET);	
		}
		else
		{
			System.out.println(BOLD+RED+"Your mobile number is not matching with  login number try again"+RESET);	
			registration();
		}
		
	}

 static void agechoose()	 {
		String age = scanner.sc.next();
		test x=new test();
		switch(age){
		
				case "1" : System.out.println(YELLOW);
					 A age4 = new A();
					age4.que1();
					result age7 = new result();
					age7.result();break;

				case "2" : System.out.println(WHITE);
					B age8 = new B();
					age8.que1();
					result2 age11 = new result2();
					age11.result2();break;

				case "3" : System.out.println(skblue);
					C age12 = new C();
					age12.que1();
					result3 age15 = new result3();
					age15.result3();									break;

				case "4" : System.out.println(YELLOW);
					D age16 = new D();
					age16.que1();
					result4 age18 = new result4();
					age18.result4();
					break;

				default :System.out.println(RED+"Invalid  Number ....! PLEASE Enter The number Which Suitable to Your Age buddy...\n Try Again"+WHITE+" ");System.out.println(WHITE+" ");System.out.println("     1.  4 - 7 YEARS OLD  \n     2.  8 -11 YEARS OLD \n     3.  12-15 YEARS OLD \n     4.  16-18 YEARS OLD \n ");
agechoose();
			}

	}



	public static void main(String[]args){
System.out.println();
		System.out.println();

	System.out.println(BLINK+"-------------  "+RESET+bgyellow+black+" * WELCOME TO OUR EDU'TAINMENT PLATFORM *"+RESET+BLINK+"  -------------"+RESET);

		System.out.println();
	System.out.println("    		 * Play *      * Learn *      * Chill *");
		System.out.println();
	System.out.println(BOLD+GREEN+"......Here are few steps to enter into our Cheerful World.............Login process for Champions to show their Talent......."+RESET);
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println(BOLD+BLUE+"Enter your Mobile Number");
		test obj1 = new test();	
		obj1.mobilenumber();
		System.out.println();

		registration();
		System.out.println(PURPLE+BOLD+" Thank you for your Interset.\n Please do check out the follwing features my dear ones...\n Here are the following Groups to Edutainment :-"+RESET+"");
		System.out.println();
		System.out.println(""+BOLD+" * Age 4 - 7 :- "+RESET+BLINK+BOLD+YELLOW+"This group is for our Little Ones's...."+RESET);
		System.out.println(""+BOLD+" * Age 8 -11 :- "+RESET+BLINK+BOLD+YELLOW+"This group is for our Little Champions...."+RESET );

		System.out.println(""+BOLD+" * Age 12-15 :- "+RESET+BLINK+BOLD+YELLOW+"This group is for our Youngsters...."+RESET);

		System.out.println(""+BOLD+" * Age 16-18 :- "+RESET+BLINK+BOLD+YELLOW+"This group is for our Teenagers...."+RESET);
		System.out.println();
		System.out.println(BOLD+skblue+"* Wait!! Wait..!! Here are few Instructions for our Fellows.");
		System.out.println("* Please go through the Question carefully.");
		System.out.println("* No re-attempt of Question is there.");
		System.out.println("* Once your are out of the race there is no continuation of your page.");
		System.out.println("* Please enter proper values to your Questions.");
		System.out.println("* Go through the questions carefully and Please Enter Numerical Values only (excluding for 4 - 7 age) "+RESET);
		System.out.println();





		System.out.println("   "+bgyellow+black+" Choose your Age to play and Learn on our Edu'tainment Platform "+RESET);
		System.out.println();
		System.out.println(BLINK+"-------------  "+RESET+bgyellow  +black+" Select Age "+RESET+BLINK+"  -------------"+RESET);

	System.out.println(WHITE+" ");
	System.out.println("     1.  4 - 7 YEARS OLD  \n     2.  8 -11 YEARS OLD \n     3.  12-15 YEARS OLD \n     4.  16-18 YEARS OLD \n ");

		agechoose();
	
	System.out.println(WHITE+" ");
						 
 
	}
} 