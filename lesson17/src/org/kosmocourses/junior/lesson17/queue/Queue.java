package org.kosmocourses.junior.lesson17.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Vladislav Gasanov on 16.02.2019.
 */
public class Queue {

    LinkedList<String> tasks = new LinkedList<>();
    int maxParallelTasks = 2;

    public synchronized void addTask(String task){
        if (tasks.size() < maxParallelTasks) {
            tasks.addLast(task);
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getTask(){
        if (tasks.size() > 0) {
            String task = tasks.getFirst();
            tasks.removeFirst();
            notifyAll();
            return task;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
