package org.kosmocourses.junior.lesson19;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vladislav Gasanov on 20.02.2019.
 */
public class Request {
    private static ThreadLocal<Integer> userId = new ThreadLocal<>();
    private ThreadLocal<Integer> clientPort = new ThreadLocal<>();
    private static volatile boolean isDDOS = false; // FIXME:

    // InheritableThreadLocal<Integer>

    // Map<Thread.currentTread().getName(), Integer> userIdmap = new HashMap<>();



    public static Integer getUserId() {
        return userId.get();
    }

    public static void setUserId(Integer userId) {
        Request.userId.set(userId);
    }

    public int getClientPort() {
        return clientPort.get();
    }

    public void setClientPort(int clientPort) {
        this.clientPort.set(clientPort);
    }

    public boolean isDDOS() {
        return isDDOS;
    }

    public void setDDOS(boolean DDOS) {
        isDDOS = DDOS;
    }
}
