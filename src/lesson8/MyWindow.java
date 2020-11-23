package lesson8;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleToIntFunction;

public class MyWindow extends JFrame {
    protected boolean result = false;
    protected boolean actMul = false;
    protected boolean actDiv = false;
    protected boolean actPlus = false;
    protected boolean actMin =false;
    protected String outputResult = "";
    protected float firstNumber = 0;
    protected float secondNumber = 0;

    public MyWindow () {

        JFrame frame = new JFrame("Тест");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(450, 450);


        JPanel shPanel = new JPanel();
        JTextField winShow = new JTextField(10);
        winShow.setHorizontalAlignment(JTextField.RIGHT);

        shPanel.setSize(300, 100);

        winShow.setFont(new Font("Dialog", Font.PLAIN, 45));
        shPanel.add(winShow);
        //создание цифр
        int [] but = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        JPanel panelIn = new JPanel(new GridLayout(4, 5, 6, 6));
        JButton[] jbs = new JButton[but.length];

        for (int i = 0; i < but.length; i++) {
            jbs[i] = new JButton(String.format("%s", but[i]));

            panelIn.add(jbs[i]);
            int finalI = i;
            jbs[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e) {
                    if(result == true)
                    {
                        winShow.setText("");
                        result = false;
                    }

                    winShow.setText(new StringBuilder().append(winShow.getText()).append( but[finalI]).toString());
                }
            });
        }
        String[] butAct = {"+", "-", "/", "*"};
        JButton[] jbsAct = new JButton[butAct.length];
// действие +
        jbsAct[0] = new JButton(String.format( butAct[0]));

        panelIn.add(jbsAct[0]);
        jbsAct[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                if (winShow.getText().equals("") == true || winShow.getText().equals(".") == true) firstNumber = 0;

                else {
                    firstNumber = Float.parseFloat(winShow.getText());
                }
                resetAct();
                actPlus = true;
                winShow.setText("");
            }
        });
        //действие  -
        jbsAct[1] = new JButton(String.format("%s", butAct[1]));
        panelIn.add(jbsAct[1]);
        jbsAct[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                if (winShow.getText().equals("") == true || winShow.getText().equals(".") == true) firstNumber = 0;

                else {
                    firstNumber = Float.parseFloat(winShow.getText());
                }
                resetAct();
                actMin = true;
                winShow.setText("");
            }
        });
        //действие /
        jbsAct[2] = new JButton(String.format("%s", butAct[2]));
        panelIn.add(jbsAct[2]);
        jbsAct[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                if (winShow.getText().equals("") == true || winShow.getText().equals(".") == true) firstNumber = 0;

                else {
                    firstNumber = Float.parseFloat(winShow.getText());
                }
                resetAct();
                actDiv = true;
                winShow.setText("");
            }
        });
        //действие *
        jbsAct[3] = new JButton(String.format("%s", butAct[3]));
        panelIn.add(jbsAct[3]);
        jbsAct[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                if (winShow.getText().equals("") == true || winShow.getText().equals(".") == true) firstNumber = 0;

                else {
                    firstNumber = Float.parseFloat(winShow.getText());
                }
                resetAct();
                actMul = true;
                winShow.setText("");
            }
        });
        // десятичная точка
        String []dotAr = {"."};
        JButton buttonDot = new JButton(".");
        panelIn.add(buttonDot);
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                if(result == true){
                    winShow.setText("");
                    result = false;
                }

                if(charFind(dotAr, winShow.getText()) == false)
                {
                    winShow.setText(new StringBuilder().append(winShow.getText()).append(".").toString());
                    System.out.println(result);
                }
            }
        });

        // C - сброс
        JButton buttonC = new JButton("C");
        panelIn.add(buttonC);
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                resetVar(firstNumber,secondNumber);
                winShow.setText("");
            }
        });

        // клавиша равно
        JButton buttonEnt = new JButton("=");
        panelIn.add(buttonEnt);
        buttonEnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                if(winShow.getText().equals("") == true || winShow.getText().equals(".") == true) secondNumber = 0;

                 else {
                    secondNumber = Float.parseFloat(winShow.getText());
                };

                winShow.setText(actionCalc(firstNumber, secondNumber));
                resetVar(firstNumber,secondNumber);
                resetAct();
                result = true;
            }
        });

        frame.getContentPane().add(BorderLayout.NORTH, shPanel);
        frame.getContentPane().add(BorderLayout.CENTER, panelIn);
        frame.setVisible(true);
    }
    // модуль поиска повторных значений в выводимых данных
    public boolean charFind (String [] charf, String wordSourse) {
        boolean result = false;
        for (int i = 0; i<charf.length; i++) {
            for (int charFill = 0; charFill < wordSourse.length(); charFill++) {
                if (charf[i].charAt(0) == wordSourse.charAt(charFill)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    // модуль вычисления арифметических операций
    public String actionCalc (double a, double b) {
        if (actDiv == true && b == 0.0) outputResult = "Err";
        else if (actPlus == true) {
            outputResult = Float.toString((float) (a+b));}
        else if (actMin == true) {
            outputResult = Float.toString((float) (a-b));}
        else if (actDiv == true) {
            outputResult = Float.toString((float) (a/b));}
        else if (actMul == true) {
            outputResult = Float.toString((float) (a*b));
        }
        else {
            outputResult = Float.toString((float) b);
        }


   return outputResult;
        }
// обнуление признаков арифметических действий
    public void resetAct(){
        actDiv = false;
        actMin = false;
        actMul = false;
        actPlus =false;
        return;
    }
    // обнуление переменных
   public void resetVar(float a,  float b) {
       a = 0;
       b = 0;
       return;
   }
}

