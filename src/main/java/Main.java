public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox(GearBoxType.AUTOMATIC);
        System.out.println(gearBox.shiftUp());
        System.out.println(gearBox.shiftUp());
        System.out.println(gearBox.shiftUp());
        System.out.println(gearBox.shiftUp());
        System.out.println(gearBox.shiftDown());
        System.out.println(gearBox.shiftDown());
        System.out.println(gearBox.shiftDown());
        System.out.println(gearBox.shiftRear());
        System.out.println(gearBox.getGearBoxType());
    }
}
