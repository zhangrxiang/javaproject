package com.zrx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhang on 2015/9/3.
 */
public class InterruptedSwing extends JFrame implements Runnable {
    private JTextArea textArea;
    private boolean running = true;

    public InterruptedSwing() {
        setBounds(100, 100, 232, 241);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("按钮");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doButtonPerformed(e);
            }
        });
        button.setVisible(true);
        panel.add(button);
        final JScrollPane scrollPane = new JScrollPane();

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setVisible(true);
        scrollPane.setViewportView(textArea);
        //  panel.add(scrollPane,button);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

    }

    private void doButtonPerformed(ActionEvent e) {
        stopThread();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterruptedSwing fram = new InterruptedSwing();
                new Thread(fram).start();
                fram.setVisible(true);
            }
        });
    }

    private void stopThread() {
        this.running = false;
    }

    @Override
    public void run() {
        int count = 0;
        while (running) {
            try {
                Thread.sleep(1000);
                textArea.append(++count + "  ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

