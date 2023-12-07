package bridge;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.Objects;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() throws IllegalArgumentException{
        String bridgeSize = readLine();
		int bridgeLength;
		try {
			bridgeLength = Integer.parseInt(bridgeSize);
		}catch (Exception e){
			throw new IllegalArgumentException("[ERROR]");
		}
		return bridgeLength;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
		String movedLocation = readLine();
		if (!Objects.equals(movedLocation, "U") && !Objects.equals(movedLocation,"D")){
			throw new IllegalArgumentException("[ERROR]");
		}
		return movedLocation;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
		String retry = readLine();
		if (!Objects.equals(retry, "Q") && !Objects.equals(retry,"R")){
			throw new IllegalArgumentException("[ERROR]");
		}
		return retry;
    }
}
