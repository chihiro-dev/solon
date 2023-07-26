package org.noear.solon.admin.server.test;

import org.noear.solon.Solon;
import org.noear.solon.admin.server.config.EnableAdminServer;
import org.noear.solon.annotation.SolonMain;

@EnableAdminServer
@SolonMain
public class Main {

    public static void main(String[] args) {
        Solon.start(Main.class, args);
    }
}