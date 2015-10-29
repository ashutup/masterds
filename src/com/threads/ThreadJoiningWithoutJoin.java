/*
    Copyright (c) 2015 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
 */

package com.threads;

public class ThreadJoiningWithoutJoin
{

    public static void main (String[] args)
    {
        final JoinTask task = new JoinTask();

        Thread A = new Thread() {
            public void run ()
            {
                task.doJob(1, "JOB A DONE...");
            }
        };

        Thread B = new Thread() {
            public void run ()
            {
                task.doJob(2, "JOB B DONE...");
            }
        };

        Thread C = new Thread() {
            public void run ()
            {
                task.doJob(3, "JOB C DONE...");
            }
        };

//        C.start();
//        B.start();
//        A.start();
        
        for (int i = 1; i <= 100; i=i+2) {
            Thread t = new Thread(new MT(i,task));
            t.start();
        }
        
        for (int i = 2; i <= 100; i=i+2) {
            Thread t = new Thread(new MT(i,task));
            t.start();
        }

    }

}

class MT extends Thread{
    
    int i;
    JoinTask jt;
    
    MT(int ii, JoinTask jt){
        this.i = ii;
        this.jt = jt;
    }
    
    public void run(){
        jt.doJob(i, "JOB "+ i +" DONE...");
    }
}

// Shared Class or Object
class JoinTask
{

    private int currentRank = 1;

    public void doJob (int rank, String msg)
    {
        synchronized(this) {
            while (rank != currentRank) {
                try {
                    wait();
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Job:" + currentRank + " : " + msg);
            currentRank++;
            notifyAll();
        }
    }
}
