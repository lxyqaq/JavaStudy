package main;

import view.TopJFrame;

import java.io.IOException;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:15
 * @Version 1.0
 */
public class Main {

    public static TopJFrame top;

    public static void main(String[] args) throws IOException {
        top = new TopJFrame("Employee Information Management System");
    }

}
