package calculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener{
    JFrame frame =new JFrame();
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(2,10);
    JButton bt1 = new JButton();
    JButton bt2 = new JButton();
    JButton bt3 = new JButton();
    JButton bt4 = new JButton();
    JButton bt5 = new JButton();
    JButton bt6 = new JButton();
    JButton bt7 = new JButton();
    JButton bt8 = new JButton();
    JButton bt9 = new JButton();
    JButton bt0 = new JButton();

    JButton btAdd = new JButton();
    JButton btSub = new JButton();
    JButton btMul = new JButton();
    JButton btDev = new JButton();
    JButton btClear = new JButton();
    JButton btDot = new JButton();
    JButton btEqual = new JButton();

    double num1,num2,result;
    int add=0,sub=0,mul=0,dev=0;

    public calculator(){
        frame.setSize(340,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Calculator ");
//        frame.setResizable(false);
        frame.add(panel);
        panel.setBackground(Color.lightGray);
        Border border = BorderFactory.createLineBorder(Color.RED,4);

        panel.add(textArea);
        textArea.setBackground(Color.BLACK);
        Border tborder = BorderFactory.createLineBorder(Color.blue,3);
        textArea.setBorder(tborder);
        Font font = new Font("arial",Font.BOLD,33);
        textArea.setFont(font);
        textArea.setForeground(Color.white);
        textArea.setPreferredSize(new Dimension(2,10));
        textArea.setLineWrap(true);

        panel.add(bt0);
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        panel.add(bt5);
        panel.add(bt6);
        panel.add(bt7);
        panel.add(bt8);
        panel.add(bt9);
        panel.add(btAdd);
        panel.add(btSub);
        panel.add(btMul);
        panel.add(btDev);
        panel.add(btDot);
        panel.add(btClear);
        panel.add(btEqual);

        bt1.addActionListener((ActionListener) this);
        bt2.addActionListener((ActionListener) this);
        bt3.addActionListener((ActionListener) this);
        bt4.addActionListener((ActionListener)this);
        bt5.addActionListener((ActionListener)this);
        bt6.addActionListener((ActionListener)this);
        bt7.addActionListener((ActionListener)this);
        bt8.addActionListener((ActionListener)this);
        bt9.addActionListener((ActionListener)this);
        bt0.addActionListener((ActionListener)this);
        btAdd.addActionListener((ActionListener)this);
        btMul.addActionListener((ActionListener)this);
        btSub.addActionListener((ActionListener)this);
        btDot.addActionListener((ActionListener)this);
        btDev.addActionListener((ActionListener)this);
        btClear.addActionListener((ActionListener)this);
        btEqual.addActionListener((ActionListener) this);

        bt4.setPreferredSize(new Dimension(100,40));
        bt4.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button4.png"));

        bt5.setPreferredSize(new Dimension(100,40));
        bt5.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button5.png"));

        bt6.setPreferredSize(new Dimension(100,40));
        bt6.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button6.png"));

        bt7.setPreferredSize(new Dimension(100,40));
        bt7.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button7.png"));

        bt8.setPreferredSize(new Dimension(100,40));
        bt8.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button8.png"));

        bt9.setPreferredSize(new Dimension(100,40));
        bt9.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button9.png"));

        bt0.setPreferredSize(new Dimension(100,40));
        bt0.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button0.png"));

        bt1.setPreferredSize(new Dimension(100,40));
        bt1.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button1.png"));

        bt2.setPreferredSize(new Dimension(100,40));
        bt2.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button2.png"));

        bt3.setPreferredSize(new Dimension(100,40));
        bt3.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\button3.png"));

        btClear.setPreferredSize(new Dimension(100,40));
        btClear.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttonclear.png"));

        btAdd.setPreferredSize(new Dimension(100,40));
        btAdd.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttonadd.png"));

        btDev.setPreferredSize(new Dimension(100,40));
        btDev.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttondiv.png"));

        btDot.setPreferredSize(new Dimension(100,40));
        btDot.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttondot.png"));

        btEqual.setPreferredSize(new Dimension(100,40));
        btEqual.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttonequal.png"));

        btSub.setPreferredSize(new Dimension(100,40));
        btSub.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttonsub.png"));

        btMul.setPreferredSize(new Dimension(100,40));
        btMul.setIcon(new ImageIcon("D:\\java prjocts\\calculator\\buttonmul.png"));

    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source==bt1){
            textArea.append("1");
        }
        if(source==bt2){
            textArea.append("2");
        }
        if(source==bt3){
            textArea.append("3");
        }
        if(source==bt4){
            textArea.append("4");
        }
        if(source==bt5){
            textArea.append("5");
        }
        if(source==bt6){
            textArea.append("6");
        }
        if(source==bt7){
            textArea.append("7");
        }
        if(source==bt8){
            textArea.append("8");
        }
        if(source==bt9){
            textArea.append("9");
        }
        if(source==bt0){
            textArea.append("0");
        }
        if(source==btDot){
            textArea.append(".");
        }
        if(source==btAdd){
            num1=number_reader();
            textArea.setText("+");
            add=1;
            mul=0;
            dev=0;
            sub=0;
        }
        if(source==btDev){
            num1=number_reader();
            textArea.setText("/");
            add=0;
            mul=0;
            dev=1;
            sub=0;
        }
        if(source==btSub){
            num1=number_reader();
            textArea.setText("-");
            add=0;
            mul=0;
            dev=0;
            sub=1;
        }
        if(source==btMul){
            num1=number_reader();
            textArea.setText("*");
            add=0;
            mul=1;
            dev=0;
            sub=0;
        }
        if(source==btEqual){
           num2= number_reader();
           if(add>0){
               result=num1+num2;
               textArea.setText(Double.toString(result));
           }
            if(sub>0){
                result=num1-num2;
                textArea.setText(Double.toString(result));
            }
            if(mul>0){
                result=num1*num2;
                textArea.setText(Double.toString(result));
            }
            if(dev>0){
                result=num1/num2;
                textArea.setText(Double.toString(result));
            }
        }
        if(source== btClear){
            num1=0.0;
            num2=0.0;
            textArea.setText("");
        }


    }
    public double number_reader(){
        double num;
        String s;
        s= textArea.getText();
        num=Double.valueOf(s);
        return num;
    }
}
