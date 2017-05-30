import java.util.Scanner;

public class IntToWords {
public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int theInt;
		do{
			System.out.println("Enter an integer to find out how to say it.");
			while (!scan.hasNextInt()){
				System.out.println("You must enter a valid integer to continue.");
				scan.next();
			}
			theInt = scan.nextInt();
			if (theInt < 0){
				System.out.println("negative " + printTo999Million(theInt*-1));
			} else if(theInt == 0){
				System.out.println("zero");
			} else System.out.println(printTo999Million(theInt));
        	} while (true);
	}
	public static String printTo999(int theInt){
		String[] under20 = {
			"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "elevin ", 
			"twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eightteen ", "nineteen "
		};
		String[] over20 = {
			"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "
		};
		if (theInt < 20){
			return under20[theInt];
		} else if (theInt < 100){
			String temp = Integer.toString(theInt);
			int ten = Integer.parseInt(temp.substring(0,1));
			int underTen = Integer.parseInt(temp.substring(1,2));
			
			return over20[ten] + under20[underTen];
		} else if (theInt < 1000){
			String temp = Integer.toString(theInt);
			int hundred = Integer.parseInt(temp.substring(0,1));
			int ten = Integer.parseInt(temp.substring(1,2));
			int underTen = Integer.parseInt(temp.substring(2,3));
			String and = "and ";
			if (underTen == 0) and = "";
			return under20[hundred] + "hundred "+ and + over20[ten] + under20[underTen];
		}	
		return "";
	}
	
	public static String printTo999Million(int theInt){
		
		if (theInt < 1000){
			return printTo999(theInt);
		} else if (theInt < 10000){
			String temp = Integer.toString(theInt);
			int thousand = Integer.parseInt(temp.substring(0,1));
			int hundreds = Integer.parseInt(temp.substring(1,4));
			String kComma = ", ";
			if (hundreds == 0) kComma = " ";
			if (hundreds < 100 && hundreds != 0) kComma = " and ";
			return printTo999(thousand) + "thousand" + kComma + printTo999(hundreds);
		} else if (theInt < 100000){
			String temp = Integer.toString(theInt);
			int thousand = Integer.parseInt(temp.substring(0,2));
			int hundreds = Integer.parseInt(temp.substring(2,5));
			String kComma = ", ";
			if (hundreds == 0) kComma = " ";
			if (hundreds < 100 && hundreds != 0) kComma = " and ";
			return printTo999(thousand) + "thousand" + kComma + printTo999(hundreds);
		} else if (theInt < 1000000){
			String temp = Integer.toString(theInt);
			int thousand = Integer.parseInt(temp.substring(0,3));
			int hundreds = Integer.parseInt(temp.substring(3,6));
			String kComma = ", ";
			if (hundreds == 0 || hundreds <100) kComma = " ";
			if (hundreds < 100 && hundreds != 0) kComma = " and ";
			return printTo999(thousand) + "thousand" + kComma + printTo999(hundreds);
		} else if (theInt < 10000000){
			String temp = Integer.toString(theInt);
			int millions = Integer.parseInt(temp.substring(0,1));
			int thousand = Integer.parseInt(temp.substring(1,4));
			int hundreds = Integer.parseInt(temp.substring(4,7));
			String kComma = ", ";
			if (hundreds == 0) kComma = " ";
			String mComma = ", ";
			String thousandText = "thousand";
			if (thousand == 0) {
			    thousandText = "";
			    mComma = "";
			}
			if (hundreds == 0 || hundreds <100) kComma = " ";
			if (hundreds < 100 && hundreds != 0) kComma = " and ";
			return printTo999(millions) + "million" + mComma + printTo999(thousand) + thousandText + kComma + printTo999(hundreds);
		} else if (theInt < 100000000){
			String temp = Integer.toString(theInt);
			int millions = Integer.parseInt(temp.substring(0,2));
			int thousand = Integer.parseInt(temp.substring(2,5));
			int hundreds = Integer.parseInt(temp.substring(5,8));
			String kComma = ", ";
			if (hundreds == 0) kComma = " ";
			String mComma = ", ";
			String thousandText = "thousand";
			if (thousand == 0) {
			    thousandText = "";
			    mComma = "";
			}
			if (hundreds == 0 || hundreds <100) kComma = " ";
			if (hundreds < 100 && hundreds != 0) kComma = " and ";
			return printTo999(millions) + "million" + mComma + printTo999(thousand) + thousandText + kComma + printTo999(hundreds);
		} else if (theInt <= 999999999){
			String temp = Integer.toString(theInt);
			int millions = Integer.parseInt(temp.substring(0,3));
			int thousand = Integer.parseInt(temp.substring(3,6));
			int hundreds = Integer.parseInt(temp.substring(6,9));
			String kComma = ", ";
			String mComma = ", ";
			String thousandText = "thousand";
			if (thousand == 0) {
			    thousandText = "";
			    mComma = "";
			}
			if (hundreds == 0 || hundreds <100) kComma = " ";
			if (hundreds < 100 && hundreds != 0) kComma = " and ";
			return printTo999(millions) + "million" + mComma + printTo999(thousand) + thousandText + kComma + printTo999(hundreds);
		}
		return "";
	}
}

/*
uses grammar from:
https://forum.wordreference.com/threads/topic-summary-numbers-reading-speaking-saying-writing-in-full-number-say-speak-read-write.15/
*/


