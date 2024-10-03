

/*
 * List of Students
The following task needs to be done:
1. Retrieve the student whose name starts with "H".
2. Calculate the average of all the marks of all the students.
Use the Iterator to iterate through the List.
 */
import java.util.ArrayList;
import java.util.Iterator;


class Student{
    String name;
    int eng;
    int java;
    int c;

    Student(String name, int eng, int java, int c){
        this.name = name;
        this.eng = eng;
        this.java = java;
        this.c = c;
    }

    String getName(){
        return this.name;
    }

    int getEng(){
        return this.eng;
    }
    int getJava(){
        return this.java;
    }
    int getC(){
        return this.c;
    }
    int getTotal(){
      int total = this.eng + this.java + this.c;
      return total; 
    }

    public String toString(){
        return this.name + " " + this.eng + " " + this.java + " " + this.c;
    }
}

public class StudentObjectInArrayList {
    public static void main(String[] args) {
        ArrayList<Student> obj = new ArrayList<>();
        obj.add(new Student("Heena", 34, 89, 96));
        obj.add(new Student("Payal", 98, 76, 97));
        obj.add(new Student("Bhavna", 89, 98, 67));

        for (Student student : obj) {
            if (student.getName().startsWith("H")) {
              System.out.println(student);
            }
        }

        Iterator<Student> iterator = obj.iterator();
        while (iterator.hasNext()) {
            Student students = iterator.next();
            if (students.getName().startsWith("B")) {
                iterator.remove();
            }
        }
      

       int total = 0;
       for(Student student: obj){
         total += student.getTotal();
       }
         
       int average = total/obj.size();
       System.out.println(average);
}

}
