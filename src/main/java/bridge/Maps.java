package bridge;

import java.util.List;

public class Maps {
	public List<String> topMap;
	public List<String> downMap;

	public void addTopMap(String successStatus){
		if (!topMap.isEmpty()){
			String successMassage = " | " + successStatus;
			topMap.add(successMassage);
			return;
		}
		String successMassage = "[ " + successStatus;
		topMap.add(successMassage);
	}

	public void addDownMap(String successStatus){
		if (!downMap.isEmpty()){
			String successMassage = " | " + successStatus;
			downMap.add(successMassage);
			return;
		}
		String successMassage = "[ " + successStatus;
		downMap.add(successMassage);
	}
}
