import java.util.Scanner;
public class Listing_3_9_Class {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		
		System.out.print("Enter the month of the year you were born: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month you were born: ");
		int day = input.nextInt();
		
		String chineseZodiacYear = null;
		String zodiacSign = null;
		
		switch (year % 12){
		case 0:  chineseZodiacYear = "monkey"; 	break; 
		case 1:  chineseZodiacYear = "rooster"; 	break;
		case 2:  chineseZodiacYear = "dog"; 		break;
		case 3:  chineseZodiacYear = "pig"; 		break;
		case 4:  chineseZodiacYear = "rat"; 		break;
		case 5:  chineseZodiacYear = "ox"; 		break;
		case 6:  chineseZodiacYear = "tiger"; 		break;
		case 7:  chineseZodiacYear = "rabbit"; 	break;
		case 8:  chineseZodiacYear = "dragon"; 	break;
		case 9:  chineseZodiacYear = "snake"; 		break;
		case 10: chineseZodiacYear = "horse"; 		break;
		case 11: chineseZodiacYear = "sheep"; 
		}

		switch (month){
		case 1:	 zodiacSign = (day<20) ? "Capricorn."	: "Aquarius."; 		break;
		case 2:  zodiacSign = (day<19) ? "Aquarius."  	: "Pices."; 		break;
		case 3:	 zodiacSign = (day<21) ? "Pices."     	: "Aries."; 		break;
		case 4:	 zodiacSign = (day<20) ? "Aries."     	: "Taurus."; 		break;
		case 5:	 zodiacSign = (day<21) ? "Taurus."    	: "Gemini."; 		break;
		case 6:	 zodiacSign = (day<22) ? "Gemini." 		: "Cancer."; 		break;
		case 7:	 zodiacSign = (day<23) ? "Cancer." 		: "Leo."; 			break;
		case 8:	 zodiacSign = (day<24) ? "Leo." 		: "Virgo."; 		break;
		case 9:	 zodiacSign = (day<23) ? "Virgo." 		: "Libra."; 		break;
		case 10: zodiacSign = (day<23) ? "Libra." 		: "Scorpio."; 		break;
		case 11: zodiacSign = (day<22) ? "Scorpio." 	: "Sagittarius.";	break;
		case 12: zodiacSign = (day<22) ? "Sagittarius." : "Capricorn."; 		  
		}
		
		
		System.out.print("\nYou were born in the year of the " + chineseZodiacYear);
		System.out.print(" and you are a " + zodiacSign);

	}
}
