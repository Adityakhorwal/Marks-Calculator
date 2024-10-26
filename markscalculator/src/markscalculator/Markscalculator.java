package markscalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Markscalculator extends JFrame implements ActionListener {

    JTextField hinditext,englishtext,ssttext,mathtext,sciencetext,computertext;
    JLabel  totaltext,gradetext,percentagetext;
    JButton submit,exit,clear;
    int hindi,english,math,science,sst,computer,total;
    float persentage;
    
    Markscalculator()
    {
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(490,0,200,200);
        
        JLabel hindi=new JLabel("Hindi: ");
        add(hindi);
        hindi.setBounds(100,215,100,50);
        hindi.setFont(new Font("System",Font.BOLD,20));
        
        hinditext =new JTextField();
        add(hinditext);
        hinditext.setBounds(300,225,150,30);
        hinditext.setFont(new Font("Ralway",Font.BOLD,15));
        
        JLabel english=new JLabel("English: ");
        add(english);
        english.setBounds(100,260,100,50);
        english.setFont(new Font("System",Font.BOLD,20));
        
        englishtext =new JTextField();
        add(englishtext);
        englishtext.setBounds(300,270,150,30);
        englishtext.setFont(new Font("Ralway",Font.BOLD,15));
        
        JLabel maths=new JLabel("Mathematics: ");
        add(maths);
        maths.setBounds(100,310,300,50);
        maths.setFont(new Font("System",Font.BOLD,20));
        
        mathtext =new JTextField();
        add(mathtext);
        mathtext.setBounds(300,320,150,30);
        mathtext.setFont(new Font("Ralway",Font.BOLD,15));
        
        JLabel science=new JLabel("Science: ");
        add(science);
        science.setBounds(100,360,300,50);
        science.setFont(new Font("System",Font.BOLD,20));
        
        sciencetext =new JTextField();
        add(sciencetext);
        sciencetext.setBounds(300,370,150,30);
        sciencetext.setFont(new Font("Ralway",Font.BOLD,15));
        
        JLabel sst=new JLabel("Social Studies: ");
        add(sst);
        sst.setBounds(100,410,300,50);
        sst.setFont(new Font("System",Font.BOLD,20));
        
        ssttext =new JTextField();
        add(ssttext);
        ssttext.setBounds(300,420,150,30);
        ssttext.setFont(new Font("Ralway",Font.BOLD,15));
        
        JLabel computer=new JLabel("Computer Science: ");
        add(computer);
        computer.setBounds(100,460,300,50);
        computer.setFont(new Font("System",Font.BOLD,20));
        
        computertext =new JTextField();
        add(computertext);
        computertext.setBounds(300,470,150,30);
        computertext.setFont(new Font("Ralway",Font.BOLD,15));
        
        JLabel total=new JLabel("Total:");
        add(total);
        total.setBounds(800,210,300,50);
        total.setFont(new Font("System",Font.BOLD,40));
        
        totaltext =new JLabel();
        add(totaltext);
        totaltext.setBounds(820,270,300,50);
        totaltext.setFont(new Font("System",Font.BOLD,35));
        totaltext.setForeground(Color.green);
        
        JLabel percentage=new JLabel("Persentage: ");
        add(percentage);
        percentage.setBounds(750,330,300,50);
        percentage.setFont(new Font("System",Font.BOLD,40));
        
        percentagetext =new JLabel();
        add(percentagetext);
        percentagetext.setBounds(820,390,300,50);
        percentagetext.setFont(new Font("System",Font.BOLD,35));
        percentagetext.setForeground(Color.green);
        
        JLabel grade=new JLabel("Grade: ");
        add(grade);
        grade.setBounds(800,450,300,50);
        grade.setFont(new Font("System",Font.BOLD,40));
        
        gradetext =new JLabel();
        add(gradetext);
        gradetext.setBounds(840,500,300,50);
        gradetext.setFont(new Font("System",Font.BOLD,35));
        gradetext.setForeground(Color.green);
        
        submit=new JButton("Submit");
        add(submit);
        submit.addActionListener(this);
        submit.setBounds(450,520,100,50);
        submit.setBackground(Color.white);
        
        clear=new JButton("Clear");
        add(clear);
        clear.addActionListener(this);
        clear.setBounds(600,520,100,50);
        clear.setBackground(Color.white);
        
        exit=new JButton("Exit");
        add(exit);
        exit.addActionListener(this);
        exit.setBounds(450,580,250,50);
        exit.setBackground(Color.white);
        
        
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setBounds(100,10,1200,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
                
       try{
           if(e.getSource()==submit)
           {
                hindi =Integer.parseInt(hinditext.getText());
                english =Integer.parseInt(englishtext.getText());
                math =Integer.parseInt(mathtext.getText());
                sst =Integer.parseInt(ssttext.getText());
                science =Integer.parseInt(sciencetext.getText());
                computer =Integer.parseInt(computertext.getText());
                total=hindi+english+math+sst+science+computer;
                persentage = total*100/600;
                System.out.println(total+" "+persentage);
           if(hindi>100 || hinditext.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Pleas check your number");
               
           }else if(english>100 || computertext.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Pleas check your number");
           }else if(math>100 || englishtext.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Pleas check your number");
           }else if(sst>100 || mathtext.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Pleas check your number");
           }else if(science>100 ||ssttext.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Pleas check your number");
           }else if(computer>100 || sciencetext.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Pleas check your number");
           }
           else{
               totaltext.setText(String.valueOf(total));
               percentagetext.setText(persentage+"%");
               if(persentage>90)
               {
                   gradetext.setText("A+");
               }else if(persentage>80)
               {
                   gradetext.setText("A");
               }else if(persentage>70)
               {
                   gradetext.setText("B+");
               }else if(persentage>60)
               {
                   gradetext.setText("B");
               }else if(persentage>50)
               {
                   gradetext.setText("C");
               }else if(persentage>40)
               {
                   gradetext.setText("D");
               }else if(persentage<30)
               {
                   gradetext.setText("Fail");
                   totaltext.setForeground(Color.red);
                   percentagetext.setForeground(Color.red);
                   gradetext.setForeground(Color.red);
               }
           } 
       }
       if(e.getSource()==clear)
       {
           hinditext.setText("");
           englishtext.setText("");
           mathtext.setText("");
           ssttext.setText("");
           sciencetext.setText("");
           computertext.setText("");
       }
       if(e.getSource()==exit)
       {
           System.exit(0);
       }
       }
       catch(Exception e1)
       {
           System.out.println(e1);
       }
    }
    
    public static void main(String[] args) {
        
        new Markscalculator();
    }
    
}
