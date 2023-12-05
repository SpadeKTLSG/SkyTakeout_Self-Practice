package com.sky.context;


//存储当前登录用户的id
//FIXME 存在重大bug, 无法获取UserID
//应该是特殊原因, 现在直接写死处理
public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
//        return threadLocal.get();
        return 1L;
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
