package List;

class Node {

    // --- ส่วนประกาศตัวแปร (Fields) ---
    private int data;    // ตัวแปรเก็บข้อมูล (ในที่นี้เก็บตัวเลขจำนวนเต็ม)
    private Node next;   // ตัวแปรเก็บ "ที่อยู่" ของ Node ถัดไป (เอาไว้ชี้หากัน)
    private static int count;

    // --- Constructors (ตัวสร้างวัตถุ) ---
    // แบบที่ 1: สร้าง Node โดยใส่แค่ข้อมูล (ยังไม่เชื่อมต่อกับใคร)
    public Node(int dataValue) {
        data = dataValue;  // เอาค่าที่รับมาใส่ในตัวแปร data
        next = null;       // ให้ next เป็น null เพราะยังไม่มีตัวถัดไป
        ++count;
    }

    // แบบที่ 2: สร้าง Node พร้อมระบุตัวถัดไปทันที
    public Node(int dataValue, Node nextValue) {
        data = dataValue;  // ใส่ข้อมูล
        next = nextValue;  // ชี้ไปหา Node ถัดไปทันที
    }

    public static int getCount() {
        return count;
    }

    // --- Getter Methods (ขอดูค่า) ---
    // ขอดูข้อมูลข้างใน
    public int getData() {
        return data;
    }

    // ขอดูว่า Node นี้ชี้ไปหาใคร
    public Node getNext() {
        return next;
    }

    // --- Setter Methods (แก้ไขค่า) ---
    // แก้ไขข้อมูลข้างใน
    public void setData(int dataValue) {
        data = dataValue;
    }

    // สั่งให้ Node นี้ชี้ไปหา Node อื่น (ใช้เชื่อมต่อ Linked List)
    public void setNext(Node nextValue) {
        next = nextValue;
    }
    
}
