import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/4 - 20:46
 */
public class SwitchCaseExercise2 {
    public static void main(String[] args) {
/*
编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天。

2  15:  31 + 15

5 7: 31 + 28 + 31 + 30 + 7

....

说明:break在switch-case中是可选的
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入几号：");
        int day = scan.nextInt();

        //定义一个变量来保存总天数
        int sumDay = 0;

        //方式一：冗余
		/*

		if(month == 1){
			sumDays = day;
		}else if(month == 2){
			sumDays = 31 + day;
		}else if(month == 3){
			sumDays = 31 + 28 + day;
		}else if(month == 4){
			sumDays = 31 + 28 + 31 + day;
		}
		//...
		else{//month == 12
			//sumDays = ..... + day;
		}

		*/

        //方式二：冗余
		/*
		switch(month){
		case 1:
			sumDays = day;
			break;
		case 2:
			sumDays = 31 + day;
			break;
		case 3:
			sumDays = 31 + 28 + day;
			break;
		...
		}
		*/


        switch (month) {
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                sumDay += 28;
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
        }

        System.out.println("您输入的为2019的第：" + sumDay);


    }
}
