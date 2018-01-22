package ooplab7;

public class StudentApp {

    public static void main(String[] args) {

        //create object as Student ดึงตัวแปลมาจาก Student แล้วใสค่าลงไป
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setname("Boy Saiyai");
        s1.setmajor("Information System");
        s1.setgroup("IS221"); //สร้างแบบพิมพ์

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221"); //สร้างแบบไม่พิมพ์
        showData(s1); //โชว์เฉพาะ s1
    }

    private static void showData(Student s) {
        System.out.println("Student info : ");
        System.out.println("ID : "+ s.getId());
        System.out.println("Name : "+ s.getname());
        System.out.println("Major : "+ s.getmajor());
        System.out.println("Group : "+ s.getgroup());
    }//โชว์ข้อมูล

}//class
