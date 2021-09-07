package reflection.homework;

import java.lang.reflect.Field;

public class StudentTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Field indexField = Student.class.getDeclaredField("indexNumber");
        indexField.setAccessible(true);
        String indexValue = (String) indexField.get(student);
        System.out.println(indexValue);
    }
}
