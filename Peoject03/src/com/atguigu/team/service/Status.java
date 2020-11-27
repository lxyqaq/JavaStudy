package com.atguigu.team.service;

/**
 * @author shkstart  Email:shkstart@126.com
 * @Description 表示员工的状态
 * @date 2019年2月12日上午10:05:39
 */
public class Status {
    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }

}
