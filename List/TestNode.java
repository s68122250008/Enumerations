package List;

public class TestNode {

    public static void main(String[] args) {

        // 1. สร้าง Node ขึ้นมา 2 ตัว (ยังแยกกันอยู่ อิสระจากกัน)
        System.out.println("Before "); // Before
        System.out.println("number of Obj = " + Node.getCount());
        Node n1 = new Node(1); // n1 เก็บเลข 1
        Node n2 = new Node(2); // n2 เก็บเลข 2

        System.out.println("n1 = " + n1); // ปริ้นที่อยู่ของ n1

        // ตอนนี้ n1 ยังไม่ชี้ใคร ค่าที่ได้จะเป็น null
        System.out.println("next of n1 " + n1.getNext());

        System.out.println("n2 = " + n2);
        System.out.println("next of n2 " + n2.getNext());

        System.out.println("After "); // ปริ้นสถานะหลังเชื่อม
        System.out.println("number of Obj = " + Node.getCount());

        // 2. ทำการเชื่อมต่อ! (Link)
        // สั่งให้ n1 ชี้ไปหา n2 (เอาตะขอ n1 ไปเกี่ยว n2)
        n1.setNext(n2);

        // ตอนนี้ n1 จะต้องรู้จักรหัสที่อยู่ของ n2 แล้ว (ไม่เป็น null แล้ว)
        System.out.println("next of n1 = " + n1.getNext());

        // n2 ยังไม่ได้ชี้ใคร ก็จะเป็น null เหมือนเดิม
        System.out.println("next of n2 = " + n2.getNext());
    }
}
