
public class SwitchDay {

	public static void main(String[] args) {
		int day=3;
		String daystring=" ";
		switch(day) {
		case 1: daystring=" Sunday";
		break;
		case 2: daystring="Monday ";
		break;
		case 3: daystring="Tuesday ";
		break;
		case 4: daystring=" Wednesday";
		break;
		case 5: daystring=" Thursday";
		break;
		case 6: daystring=" Friday";
		break;
		case 7: daystring=" Saturday";
		break;
		default: daystring=" invalid day";
		}
		System.out.println(daystring);
	}

}
