package project.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import project.bean.StudentBean;
import project.view.TopJFrame;

public class Main {
    //设置表的题头
    public static String[] t_head = {"学号", "姓名", "性别", "年龄", "学院", "地址"};

    //定义学生列表
    public static String[][] s_list = new String[20][6];

    //给学生列表初始化值
    static {
        s_list[0] = new String[]{"16103301", "小明", "男", "19", "计算机学院", "河南"};
        s_list[1] = new String[]{"16103302", "小华", "女", "20", "艺术学院", "河北"};
        s_list[2] = new String[]{"16103303", "小松", "男", "21", "海洋学院", "天津"};
        s_list[3] = new String[]{"16103304", "小美", "女", "22", "艺术学院", "海南"};
        s_list[4] = new String[]{"16103305", "小南", "男", "20", "经管学院", "甘肃"};
        s_list[5] = new String[]{"16103306", "小杰", "男", "20", "电信学院", "浙江"};
    }


    //定义大框的名字
    public static TopJFrame top;

    public static void main(String[] args) throws IOException {
        top = new TopJFrame("学生信息管理系统");
    }

}
	 

 
