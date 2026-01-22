package List;

class Node {

    // --- ส่วนประกาศตัวแปร (Fields) ---
    int data;    // ตัวแปรเก็บข้อมูล (ในที่นี้เก็บตัวเลขจำนวนเต็ม)
    Node next;   // ตัวแปรเก็บ "ที่อยู่" ของ Node ถัดไป (เอาไว้ชี้หากัน)

    // --- Constructors (ตัวสร้างวัตถุ) ---
    // แบบที่ 1: สร้าง Node โดยใส่แค่ข้อมูล (ยังไม่เชื่อมต่อกับใคร)
    public Node(int dataValue) {
        data = dataValue;  // เอาค่าที่รับมาใส่ในตัวแปร data
        next = null;       // ให้ next เป็น null เพราะยังไม่มีตัวถัดไป
    }

    // แบบที่ 2: สร้าง Node พร้อมระบุตัวถัดไปทันที
    public Node(int dataValue, Node nextValue) {
        data = dataValue;  // ใส่ข้อมูล
        next = nextValue;  // ชี้ไปหา Node ถัดไปทันที
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

    // --- ส่วนทดสอบการทำงาน (Main Class) ---
    public class TestNode {

        public static void main(String[] args) {

            // 1. สร้าง Node ขึ้นมา 2 ตัว (ยังแยกกันอยู่ อิสระจากกัน)
            Node n1 = new Node(1); // n1 เก็บเลข 1
            Node n2 = new Node(2); // n2 เก็บเลข 2

            System.out.println("Before "); // Before
            System.out.println("n1 = " + n1); // ปริ้นที่อยู่ของ n1

            // ตอนนี้ n1 ยังไม่ชี้ใคร ค่าที่ได้จะเป็น null
            System.out.println("next of n1 " + n1.getNext());

            System.out.println("n2 = " + n2);
            System.out.println("next of n2 " + n2.getNext());

            System.out.println("After "); // ปริ้นสถานะหลังเชื่อม

            // 2. ทำการเชื่อมต่อ! (Link)
            // สั่งให้ n1 ชี้ไปหา n2 (เอาตะขอ n1 ไปเกี่ยว n2)
            n1.setNext(n2);

            // ตอนนี้ n1 จะต้องรู้จักรหัสที่อยู่ของ n2 แล้ว (ไม่เป็น null แล้ว)
            System.out.println("next of n1 = " + n1.getNext());

            // n2 ยังไม่ได้ชี้ใคร ก็จะเป็น null เหมือนเดิม
            System.out.println("next of n2 = " + n2.getNext());
        }
    }

}
