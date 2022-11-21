package bridge;

import java.util.Arrays;

public enum BridgeEnum {
    U(1,"U"),
    D(0,"D");

    private final int bridgeNumberType;
    private final String bridgeStringType;
    BridgeEnum(int numberType, String stringType) {
        this.bridgeNumberType = numberType;
        this.bridgeStringType = stringType;
    }

    public static BridgeEnum createBridgeNumberType(int locationNumber) {
        return Arrays.stream(values())
                .filter(pointValue -> pointValue.bridgeNumberType == locationNumber)
                .findFirst()
                .orElseThrow();
    }

    public static BridgeEnum createBridgeStringType(String location, boolean correctLocation) {
        return Arrays.stream(values())
                .filter(locationValue -> isLocation(locationValue, location)
                        && isCorrectLocation(locationValue, correctLocation))
                .findFirst()
                .orElseThrow();
    }
    }

    public String getStringType() {
        return bridgeStringType;
    }

}
