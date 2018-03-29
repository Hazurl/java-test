package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 *  Calculator
 */
public class Calculator extends JFrame implements ActionListener {

    JLabel result;
    JPanel operators;
    JPanel numpad;
    JPanel other;

    public static void main(String[] args) {
        Calculator c = new Calculator();   
    }

    Calculator() {
        this.setSize(400, 400);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        result = new JLabel();
        result.setText("0");

        numpad = new JPanel();
        numpad.setLayout(new GridLayout(4, 3));
        for(int i = 0; i < 10; ++i) {
            JButton but = new JButton("" + ((i + 1)%10));
            but.addActionListener(this);
            if (i == 9) {
                JButton space = new JButton(" ");
                space.addActionListener(this);
                numpad.add(space);
            }
            numpad.add(but);
            if (i == 9) {
                JButton point = new JButton(".");
                point.addActionListener(this);
                numpad.add(point);
            }
        }

        operators = new JPanel();
        operators.setLayout(new GridLayout(3, 2));
        JButton mult = new JButton("*");
        mult.addActionListener(this);
        operators.add(mult);
        JButton div = new JButton("/");
        div.addActionListener(this);
        operators.add(div);
        JButton plus = new JButton("+");
        plus.addActionListener(this);
        operators.add(plus);
        JButton minus = new JButton("-");
        minus.addActionListener(this);
        operators.add(minus);
        JButton inv = new JButton("inv");
        inv.addActionListener(this);
        operators.add(inv);
        JButton sqrt = new JButton("rac");
        sqrt.addActionListener(this);
        operators.add(sqrt);

        other = new JPanel();
        JButton rst = new JButton("C");
        rst.addActionListener(this);
        other.add(rst);
        JButton equal = new JButton("=");
        equal.addActionListener(this);
        other.add(equal);

        this.add(result, BorderLayout.NORTH);
        this.add(numpad, BorderLayout.WEST);
        this.add(operators, BorderLayout.EAST);
        this.add(other, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        switch(b.getText()) {
            case " ":
            case ".":
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                result.setText(result.getText() + b.getText());
                break;
            case "*":
            case "/":
            case "+":
            case "-":
            case "rac":
            case "inv":
                result.setText(result.getText() + " " + b.getText() + " ");
                break;
            case "=":
                result.setText("" +  evaluate(result.getText()));
                break;
            case "C":
                result.setText("");
                break;
        }
    }

    public float evaluate(String str) {
        Stack<Float> stack = new Stack<Float>();
        try {
            for(String s : str.split(" ")) {
                try {
                    float f = Float.parseFloat(s);
                    stack.add(f);
                } catch(NumberFormatException n) {
                    switch(s) {
                        case "*":
                            stack.add(stack.pop() * stack.pop());
                            break;
                        case "/":
                            stack.add(stack.pop() / stack.pop());
                            break;
                        case "+":
                            stack.add(stack.pop() + stack.pop());
                            break;
                        case "-":
                            stack.add(stack.pop() - stack.pop());
                            break;
                        case "rac":
                            stack.add((float)Math.sqrt(stack.pop()));
                            break;
                        case "inv":
                            stack.add(1 / stack.pop());
                            break;
                    }
                }
            }    
            return stack.pop();    
        } catch(EmptyStackException e) {
            JOptionPane.showMessageDialog(this, "Error");
            return 0;
        }
    }
}
