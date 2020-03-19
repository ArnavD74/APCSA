import java.util.Scanner;

public class Main {

	public static String getSaying(int m, int d) {

		String month = " ";
		String season = " ";
		String horoscope = " ";
		String saying = " ";

		if ((m == 1 && d >= 20 && d <= 31) || (m == 2 && d >= 1 && d <= 18))
			horoscope = "Aquarius";
		
		else if ((m == 2 && d >= 19 && d <= 29) || (m == 3 && d >= 1 && d <= 20))
			horoscope = "Pisces";
		
		else if ((m == 3 && d >= 21 && d <= 31) || (m == 4 && d >= 1 && d <= 19))
			horoscope = "Aries";
		
		else if ((m == 4 && d >= 20 && d <= 30) || (m == 5 && d >= 1 && d <= 20))
			horoscope = "Taurus";
		
		else if ((m == 5 && d >= 21 && d <= 31) || (m == 6 && d >= 1 && d <= 20))
			horoscope = "Gemini";
		
		else if ((m == 6 && d >= 21 && d <= 30) || (m == 7 && d >= 1 && d <= 22))
			horoscope = "Cancer";
		
		else if ((m == 7 && d >= 23 && d <= 31) || (m == 8 && d >= 1 && d <= 22))
			horoscope = "Leo";
		
		else if ((m == 8 && d >= 23 && d <= 30) || (m == 9 && d >= 1 && d <= 22))
			horoscope = "Virgo";
		
		else if ((m == 9 && d >= 23 && d <= 31) || (m == 10 && d >= 1 && d <= 22))
			horoscope = "Libra";
		
		else if ((m == 10 && d >= 23 && d <= 30) || (m == 11 && d >= 1 && d <= 21))
			horoscope = "Scorpio";
		
		else if ((m == 11 && d >= 22 && d <= 31) || (m == 12 && d >= 1 && d <= 21))
			horoscope = "Sagittarius";
		
		else if ((m == 12 && d >= 22 && d <= 31) || (m == 1 && d >= 1 && d <= 19))
			horoscope = "Capricorn";
		
		else horoscope = "Invalid";
		
		if (horoscope.equals("Aquarius"))
			saying = "Aquarius, you never merge within the group, but you are always the outsider everyone wants.";
		
		else if (horoscope.equals("Pisces"))
			saying = "Pisces, 2019 does end up rewarding you, in terms of there being some kind of karmic payback or justice, for your many years of hard work or education.";
		
		else if (horoscope.equals("Aries"))
			saying = "November 23rd, 24th, 25th, 26th, 27th is your window for the biggest and best outcomes with America, Asia and/or Europe – depending on your location, Aries.";
		
		else if (horoscope.equals("Taurus"))
			saying = "Taurus, now that difficult Ceres is set to change signs on November 15th, the stage is set for you to gratefully receive the mother of all money solutions, November 23rd-27th. ";
		
		else if (horoscope.equals("Gemini"))
			saying = "Well, this is interesting for your duet or duel. You’re going to see everything happen really quickly, after a year of false starts and ‘almost’ situations, Gemini. In fact, I predict you’ll be awfully happy, in the end.";
		
		else if (horoscope.equals("Cancer"))
			saying = "Cancer, November will feel like playing Monopoly, particularly if you have a son or daughter, nieces or nephews, godchildren.";
		
		else if (horoscope.equals("Leo"))
			saying = "Leo, here we have fantastic opportunities and solutions for you ahead. The Jupiter-Venus conjunction and New Moon of November 23rd, 24th, 25th, 26th, 27th makes the final week of the month reason to celebrate."; 
		else if (horoscope.equals("Virgo"))
			saying = "You’ll be successfully and happily redecorating the guest room, renovating the bathroom or kitchen (long overdue), revamping the look of your bedroom, or even relocating before Christmas.";
		
		else if (horoscope.equals("Libra"))
			saying = "It’s just so interesting to look at the big, long-term picture with all your ideas, plans and projects, Libra. What you might have assumed was just a 2019 event which is all over by 2020, has a long reach, all the way to January 2022. ";
		
		else if (horoscope.equals("Scorpio"))
			saying = "Scorpio, Here we have ‘delivery’ after a year of major stand-offs, politics and hard home truths. You’ve had both Jupiter, the planet of big opportunity, and Ceres – a symbol of difficult situations – in your finance zone all year.";
		
		else if (horoscope.equals("Sagittarius"))
			saying = "All these questions about how to promote yourself – how to rate on Twitter – now come full circle for you. The fact is you’ve been living with Jupiter and Ceres in Sagittarius all year, and so, despite recent glad tidings about yourself, you are still full of questions about how to make things work.";
		
		else if (horoscope.equals("Capricorn"))
			saying = "Capricorn, you saw a really obvious (huge) opportunity to work on yourself on the inside, at the end of 2018 or start of 2019. You were enthusiastic. ";
		
		else saying = "Invalid";
		
		System.out.println("Your horoscope is " + horoscope + ".");
		
		return saying;
	}

	public static void main(String[] args) {
		System.out.println(Math.pow(3, Math.sqrt(2)));

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a month.");
		int m = in.nextInt();

		System.out.println("Please enter a day.");
		int d = in.nextInt();

		System.out.println(getSaying(m, d));

	}

}
