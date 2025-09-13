class test {
    String name;
    int roll_no;
    long phone;

    public static void main(String[] args) {
        test student1 = new test();
        student1.name = "Alice";
        student1.roll_no = 101;
        student1.phone = 9876543210L;

        test student2 = new test();
        student2.name = "Bob";
        student2.roll_no = 102;
        student2.phone = 9876543211L;

        System.out.println(student1);
        System.out.println(student2);
    }
}
