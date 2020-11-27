package com.atguigu.team.service;

/**
 * @author shkstart  Email:shkstart@126.com
 * @Description 自定义异常类
 * @date 2019年2月12日上午10:51:19
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -3387514229948L;

    public TeamException() {
        super();
    }

    public TeamException(String msg) {
        super(msg);
    }
}
