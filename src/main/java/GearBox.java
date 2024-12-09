public class GearBox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6
     */
    public static final int REAR = -1;
    public static final int NEUTRAL = 0;
    public static final int MIN_GEAR = 1;
    public static final int MAX_GEAR = 6;
    public int currentGear = NEUTRAL;
    public GearBoxType gearBoxType;

    public GearBox(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public int shiftUp() {
        return currentGear < MAX_GEAR ? currentGear += 1 : currentGear;
    }

    public int shiftDown() {
        return currentGear > MIN_GEAR ? currentGear -= 1: currentGear;
    }

    public int shiftRear() {
        return currentGear > MIN_GEAR ? currentGear : REAR;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }
}
