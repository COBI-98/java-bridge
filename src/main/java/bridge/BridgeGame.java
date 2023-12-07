package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    Maps maps;
    int count = 0;
    String successStatus;
    public BridgeGame(){
        maps = new Maps();
        count = 0;
        successStatus = "O";
    }
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public Maps move(String moved, List<String> bridge) {
        successStatus = checkSuccessStatus(moved, bridge);
        if (moved.equals("U")){
            maps.addTopMap(successStatus);
        }
        if (moved.equals("D")){
            maps.addDownMap(successStatus);
        }
        return maps;
    }
    private String checkSuccessStatus(String moved, List<String> bridge) {
        String success = "O";
        String fail = "X";
        if (moved.equals(bridge.get(count))){
            count++;
            return success;
        }
        count++;
        return fail;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public int isEndGame(List<String> bridge) {
        int retryResult = 0;
        if (successStatus.equals("X")) {
            retryResult = 1;
            return retryResult;
        }
        if (count == bridge.size()) {
            retryResult = 2;
            return retryResult;
        }
        return retryResult;
    }
}
