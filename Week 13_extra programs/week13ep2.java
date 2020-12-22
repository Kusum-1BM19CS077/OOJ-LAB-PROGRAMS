/*Develop a Java program that displays 4(Four) text fields, two of which accepts integer inputs
and the third an arithmetic operator. A button with label Result when clicked displays the
result of the above operation in the fourth text field.*/

import java.awt.*;
import java.awt.event.*;
 
class ep2 extends Frame implements ActionListener{
   TextField n1,n2,n3,n4,res1;
   Label l1,l2,l3,res2;
   Button b;
   ep2(){
       setLayout(new FlowLayout());
       Label l1=new Label("ENTER NUMBER 1",Label.RIGHT);
       Label l2=new Label("ENTER NUMBER 2",Label.RIGHT);
       Label l3=new Label("ENTER ARITHMETIC OPERATOR",Label.RIGHT);
       Label res2=new Label("RESULT",Label.RIGHT);
       n1=new TextField(12);
       n2=new TextField(12);
       n3=new TextField(12);
       res1=new TextField(30);
       b=new Button("RESULT");
       add(l1);
       add(n1);
       add(l2);
       add(n2);
       add(l3);
       add(n3);
       add(b);
       add(res2);
       add(res1);      
       b.addActionListener(this);
  addWindowListener(new WindowAdapter1());
}
public void actionPerformed(ActionEvent ae)
{
   int ans=0;
   if(ae.getSource()==b)
   {
      try{
       int num1=Integer.parseInt(n1.getText());
       int num2=Integer.parseInt(n2.getText());
       String num3=n3.getText();
       
       switch(num3){
           case "+": ans=num1+num2;
           res1.setText(String.valueOf(ans));
           break;
           case "-": ans=num1-num2;
           res1.setText(String.valueOf(ans));
           break;
           case "*": ans=num1*num2;
           res1.setText(String.valueOf(ans));
           break;
           case "/": ans=num1/num2;
           res1.setText(String.valueOf(ans));
           break;
           case "%": ans=num1%num2;
           res1.setText(String.valueOf(ans));
           break;
           default:
           res1.setText("NO OPERATOR ENTERED");
           break;
     }
      }
   catch(ArithmeticException a){
       res1.setText("ERROR:ArithmeticException");
   }
   catch(NumberFormatException ne ){
       res1.setText("ERROR:NumberFormatException");
   }
}
}
public static void main(String args[])
{
   ep2 c=new ep2();
   c.setSize(new Dimension(900,300));
   c.setTitle("CALCULATOR");
   c.setVisible(true);
}
class WindowAdapter1 extends WindowAdapter{ 
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
}