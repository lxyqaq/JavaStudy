package exercise;

/**
 * @ClassName Kids
 * @Description 子类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/14 11:57
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids() {

    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
