/**
 * @author lxyqaq
 * @date 2020/9/6 - 00:42
 */
public class FamilyAccount {
    public static void main(String[] args) {
        //定义一个标记
        boolean isFlag = true;
        //记录用户收入和支出的详情
        String details = "收支\t\t\t" + "账户金额\t\t\t" + "收支金额\t\t\t" + "说  明\n";
        //初始金额10000元
        int balance = 10000;
        while (isFlag) {

            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("                  1 收支明细");
            System.out.println("                  2 登记收入");
            System.out.println("                  3 登记支出");
            System.out.println("                  4 退   出\n");
            System.out.print("                  请选择(1-4)：");

            //获取用户的选择
            char selection = Utility.readMenuSelection();

            switch (selection) {

                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("------------------------------------------------");
                    break;

                case '2':
                    System.out.println("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String addInfo = Utility.readString();
                    //处理初始金额
                    balance += addMoney;
                    //处理details
                    details += ("收入\t\t\t" + balance + "\t\t\t" + addMoney + "\t\t\t\t" + addInfo + "\n");

                    System.out.println("---------------------登记完成---------------------\n");
                    break;

                case '3':
                    System.out.println("本次支出金额：");
                    int exMoney = Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String exInfo = Utility.readString();
                    //处理初始金额
                    balance -= exMoney;
                    //处理details
                    if (balance >= exMoney) {
                        balance -= exMoney;
                        details += ("支出\t\t\t" + balance + "\t\t\t" + exMoney + "\t\t\t\t" + exInfo + "\n");
                    } else {
                        System.out.println("您的余额不足！");
                    }

                    System.out.println("---------------------登记完成---------------------\n");
                    break;

                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }

            }
        }


    }
}
