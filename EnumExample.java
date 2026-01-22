
public class EnumExample {

    // class enum คือการกำหนดค่าที่แน่นอนอยู่แล้ว ไม่สามารถเปลี่ยนค่าอื่นได้ , ป้องกันการใส่ค่ามั่วๆ 
    enum Day { // public static final ไม่สามารถเปลี่ยนค่าได้
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY ->
                System.out.println("It's Monday!"); // It's Monday!
            case FRIDAY ->
                System.out.println("It's Friday!");
            default ->
                System.out.println("It's some other day.");
        }
    }
}
