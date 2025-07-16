package Collections_Framework_and_Streams_Masterclass_35.Map_6.comparable_8;

public class Student implements Comparable<Student> {

    private String name;
    private int rollNo;

    

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }



    public String getName() {
        return name;
    }



    public int getRollNo() {
        return rollNo;
    }



    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }



    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getRollNo(),this.getRollNo()); //Double is the method that already contains that all o1 , o2 logic , we  don't have to manually write it
    }
}
