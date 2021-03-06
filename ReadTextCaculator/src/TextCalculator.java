
public class TextCalculator {

	public int addText(String text) {
		if(text.isEmpty()){
			return 0;
		}
		
		return addNumbers(toIntArray(splitByCommaOrSemicolon(text)));
	}
	
	public String[] splitByCommaOrSemicolon(String text){
		return text.split(",|;"); 
			
	}
	
	public int[] toIntArray(String[] textNumArr){
		int[] intArr = new int[textNumArr.length];
		
		for(int i = 0 ; i < textNumArr.length ; i++){
			intArr[i] = Integer.parseInt(textNumArr[i]);
		}
		
		return intArr;
	}
	
	public int addNumbers(int[] intArr){
		int result = 0;
		for (int i : intArr) {
			result += i;
		}
		return result;
	}
	

}
