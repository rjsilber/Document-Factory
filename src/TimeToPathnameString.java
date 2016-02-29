public class TimeToPathnameString {
	
	public String getCalendarString(String date){
		
		int length = date.length();

		String month = getMonth(date);
		String day = dayOfMonth(date);
		String year = date.substring(length-4);
		String time = getTime(date);

		return month + day + year + "-" + time;
	}
	
	private String getMonth(String date){
		int index = charIndex(date, 1);
		if(index >= 0){
			return date.substring(index, index+3);
		}else return "";
	}
	
	private String dayOfMonth(String date){
		int index = charIndex(date, 2);
		if(index >= 0){
			if(date.charAt(index+1) != ' '){
				return date.substring(index, index+2);
			}else{
				return date.charAt(index) + "";
			}
		}else return "";
	}
	
	private String getTime(String date){
		String str = "";
		int indexStart = charIndex(date, 3);
		int indexEnd = charIndex(date, 4) - 1;
		if(date.length() >= indexEnd){
			str = date.substring(indexStart, indexEnd);
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) == ':'){
					String a = str.substring(0,i);
					if((i+1) < str.length()){
						String b = str.substring(i+1);
						str = a + "-" + b;
					}else{
						str = a + "-";
					}
				}
			}
		}
		return str;
	}
	
	private int charIndex(String date, int spaces){
		int i = 0;
		int count = 0;
		while((count < spaces) && (i<date.length())){
			if(date.charAt(i) == ' '){
				count++;
			}
			i++;
		}
		
		if(i == date.length()){
			i = -1;
		}
		return i;
	}
	


}
