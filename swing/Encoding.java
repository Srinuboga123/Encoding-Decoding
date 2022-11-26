import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

class xyz implements ActionListener{
    JFrame jf;
    JButton jed;
    JButton jde;
    JButton jrest;
    JTextField jt1;
    JTextField jt2;
    JLabel jl1;
      JLabel jl2;


    xyz(){
        jf=new JFrame("HELLO THIS IS ENCODING AND DECODING");
        jf.setLayout(new FlowLayout());
        jf.setSize(350,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jl1 = new JLabel("encoding");
        jt1 = new JTextField(10);
        jf.add(jl1);
        jf.add(jt1);
         jl2 = new JLabel("decoding");
        jt2 = new JTextField(10);
           
           jf.add(jl2);
        jf.add(jt2);
        
        jed =new JButton("ENCODING");
        jde = new JButton("DECODING");
        jrest=new JButton("reset");
        jed.setActionCommand("encode");
        jde.setActionCommand("decode");
        jrest.setActionCommand("rest");
        jed.addActionListener(this);
        jde.addActionListener(this);
        jrest.addActionListener(this);
        jf.add(jed);
        jf.add(jde);
        jf.add(jrest);

        jf.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        String decode= " ";
        if(ae.getActionCommand().equals("encode")){
            String str = jt1.getText();
            
            for(int i=0;i<str.length();i++){
              
                decode += (char)(str.charAt(i)+1);
                 

            }
           // String st1=Integer.toString(decode);
             jt2.setText(decode.toString());
           

        }else if(ae.getActionCommand().equals("decode")){
            String encode=" ";
            String str1=jt2.getText();
            for(int j=0;j<str1.length();j++){
                encode +=(char)(str1.charAt(j)+1);

            }
            jt1.setText(encode.toString());

        }else{
            jt1.setText(" ");
            jt2.setText("");
        }

        }
    }




class Encoding{
    public static void main(String args[]){
        new xyz();
    }
}