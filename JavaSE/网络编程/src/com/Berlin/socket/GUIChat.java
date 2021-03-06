package com.Berlin.socket;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUIChat extends Frame {

    private TextField tf;
    private Button send;
    private Button log;
    private Button clear;
    private Button shake;
    private TextArea viewText;
    private TextArea sendText;
    private DatagramSocket socket;
    private BufferedWriter bw;

    /**
     * @author Berlin
     * @Time 2020/11/10 13:07
     */
    public GUIChat() {
        init();
        southPanel();
        centerPanel();
        event();
    }

    public static void main(String[] args) {
        new GUIChat();
    }

    public void event() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    socket.close();
                    bw.close();
                } catch (IOException e1) {

                    e1.printStackTrace();
                }
                System.exit(0);
            }
        });

        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    send();
                } catch (IOException e1) {

                    e1.printStackTrace();
                }
            }

        });

        log.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    logFile();
                } catch (IOException e1) {

                    e1.printStackTrace();
                }
            }

        });

        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewText.setText("");
            }
        });

        shake.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    send(new byte[]{-1}, tf.getText());
                } catch (IOException e1) {

                    e1.printStackTrace();
                }
            }

        });

        sendText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                //if(e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) {	//isControlDown ctrl??????????
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        send();
                    } catch (IOException e1) {

                        e1.printStackTrace();
                    }
                }
            }
        });
    }

    private void shake() {
        int x = this.getLocation().x;                            //??????????????
        int y = this.getLocation().y;                            //??????????????

        for (int i = 0; i < 20; i++) {
            try {
                this.setLocation(x + 20, y + 20);
                Thread.sleep(20);
                this.setLocation(x + 20, y - 20);
                Thread.sleep(20);
                this.setLocation(x - 20, y + 20);
                Thread.sleep(20);
                this.setLocation(x - 20, y - 20);
                Thread.sleep(20);
                this.setLocation(x, y);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    private void logFile() throws IOException {
        bw.flush();                                    //??????????
        FileInputStream fis = new FileInputStream("config.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();    //??????????????????

        int len;
        byte[] arr = new byte[8192];
        while ((len = fis.read(arr)) != -1) {
            baos.write(arr, 0, len);
        }

        String str = baos.toString();                //????????????????????????????
        viewText.setText(str);

        fis.close();
    }

    private void send(byte[] arr, String ip) throws IOException {
        DatagramPacket packet =
                new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 9999);
        socket.send(packet);                        //????????
    }

    private void send() throws IOException {
        String message = sendText.getText();        //??????????????????
        String ip = tf.getText();                   //????ip????;
        ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;

        send(message.getBytes(), ip);

        String time = getCurrentTime();               //????????????
        String str = time + " ????:" + (ip.equals("255.255.255.255") ? "??????" : ip) + "??\r\n" + message + "\r\n\r\n";    //alt + shift + l ????????????
        viewText.append(str);                         //??????????????????????
        bw.write(str);                                //??????????????????
        sendText.setText("");


    }

    private String getCurrentTime() {
        Date d = new Date();                        //????????????????
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy??MM??dd?? HH:mm:ss");
        return sdf.format(d);                        //????????????
    }

    public void centerPanel() {
        Panel center = new Panel();                    //??????????Panel
        viewText = new TextArea();
        sendText = new TextArea(5, 1);
        center.setLayout(new BorderLayout());        //????????????????????
        center.add(sendText, BorderLayout.SOUTH);    //??????????????????????
        center.add(viewText, BorderLayout.CENTER);    //????????????????
        viewText.setEditable(false);                //??????????????
        viewText.setBackground(Color.WHITE);        //????????????
        sendText.setFont(new Font("xxx", Font.PLAIN, 15));
        viewText.setFont(new Font("xxx", Font.PLAIN, 15));
        this.add(center, BorderLayout.CENTER);
    }

    public void southPanel() {
        Panel south = new Panel();                    //??????????Panel
        tf = new TextField(15);
        tf.setText("127.0.0.1");
        send = new Button("?? ??");
        log = new Button("?? ??");
        clear = new Button("?? ??");
        shake = new Button("?? ??");
        south.add(tf);
        south.add(send);
        south.add(log);
        south.add(clear);
        south.add(shake);
        this.add(south, BorderLayout.SOUTH);            //??Panel????Frame??????
    }

    public void init() {
        this.setLocation(500, 50);
        this.setSize(400, 600);
        new Receive().start();
        try {
            socket = new DatagramSocket();
            bw = new BufferedWriter(new FileWriter("config.txt", true));    //??????????????
        } catch (Exception e) {

            e.printStackTrace();
        }
        this.setVisible(true);
    }

    private class Receive extends Thread {            //??????????????????????,??????????????????
        public void run() {
            try {
                DatagramSocket socket = new DatagramSocket(9999);
                DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);

                while (true) {
                    socket.receive(packet);                //????????
                    byte[] arr = packet.getData();        //????????????
                    int len = packet.getLength();        //??????????????????
                    if (arr[0] == -1 && len == 1) {        //????????????????????????????????-1,??????????????1
                        shake();                        //????????????
                        continue;                        //????????????,????????????,??????????????????????????????
                    }
                    String message = new String(arr, 0, len);    //????????????

                    String time = getCurrentTime();        //????????????
                    String ip = packet.getAddress().getHostAddress();    //????ip????
                    String str = time + " " + ip + " ??????:\r\n" + message + "\r\n\r\n";
                    viewText.append(str);
                    bw.write(str);
                }
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

}


