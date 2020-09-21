package javacode2;


/**
 * @ClassName StudentTest
 * @Description 测试
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/21 21:12
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.regist(-1111);
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private int id;

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
            throw new Exception("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}