package org.noear.solon.core.util;

import org.noear.solon.core.PropsLoader;

/**
 * 日志打印小工具（仅限内部使用）
 *
 * @author noear
 * @since 1.10
 * */
public class LogUtil {
    private static LogUtil global;
    public static LogUtil global() {
        return global;
    }

    public static void globalSet(LogUtil instance) {
        if(instance != null) {
            LogUtil.global = instance;
        }
    }

    public  void trace(Object content) {
        System.out.print("[Solon] ");
        PrintUtil.greenln(content);
    }

    public  void debug(Object content) {
        System.out.print("[Solon] ");
        PrintUtil.blueln(content);
    }

    public  void info(Object content) {
        System.out.println("[Solon] " + content);
    }

    public  void warn(Object content) {
        System.out.print("[Solon] ");
        PrintUtil.yellowln(content);
    }

    public  void error(Object content) {
        System.out.print("[Solon] ");
        PrintUtil.redln(content);
    }
}
