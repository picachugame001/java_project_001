package test02;
import test02.area01.Test02_Input01;
import test02.area02.Test02_Output01;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExResult{
	private boolean found;
	private Test02_Input01 input01;
	private Test02_Input02 input02;
	private Test02_Output01 output01;
	public RegExResult(Test02_Input01 p1,Test02_Input02 p2,Test02_Output01 p3){
		input01 = p1;
		input02 = p2;
		output01 = p3;
	}
	public void setFound(boolean a){
		found = a;
	}
	public boolean getFound(){
		return found;
	}
	public void calculator(){
		Pattern pattern = Pattern.compile(input02.getText());
		Matcher matcher = pattern.matcher(input01.getText());
		StringBuilder stringbuilder01 = new StringBuilder();
		
		while(matcher.find()){
			String out = matcher.group();
			stringbuilder01.append(out);
			stringbuilder01.append("\n");
		}
		
		output01.setText(stringbuilder01.toString());
		
	}
}
