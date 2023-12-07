package bridge;

import java.util.ArrayList;
import java.util.List;

public class Maps {
	public List<String> topMap;
	public List<String> downMap;
	String noting;

	public Maps(){
		topMap = new ArrayList<>();
		downMap = new ArrayList<>();
		noting = " ";
	}
	public void addTopMap(String successStatus){
		if (!topMap.isEmpty()){
			String successMassage = " | " + successStatus;
			topMap.add(successMassage);
			noting = " |  ";
			downMap.add(noting);
			return;
		}
		topMap.add(successStatus);
		downMap.add(noting);
	}

	public void addDownMap(String successStatus){
		if (!downMap.isEmpty()){
			String successMassage = " | " + successStatus;
			downMap.add(successMassage);
			noting = " |  ";
			topMap.add(noting);
			return;
		}
		downMap.add(successStatus);
		topMap.add(noting);
	}
}
