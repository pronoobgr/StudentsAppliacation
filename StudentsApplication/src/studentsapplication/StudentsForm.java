/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsapplication;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class StudentsForm extends JFrame{
    
    private JButton nextBtn,saveBtn;
    private JLabel nameLbl,surnameLbl, mobileLbl,amLbl,uniLbl,inYearLbl;
    private JTextField nameTF,surnameTF, mobileTF,amTF,uniTF,inYearTF;
    
    private ArrayList<Student> studentList ;
    
    public StudentsForm()  throws HeadlessException {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nextBtn=new JButton("Next");
        saveBtn= new JButton("Save Student");
        
        nameTF= new JTextField("",10);        
        nameLbl = new JLabel("Name: ");
        
        surnameTF= new JTextField("",10);
        surnameLbl = new JLabel("Surname: ");
        
        mobileTF= new JTextField("",10);
        mobileLbl = new JLabel("Mobile: ");
        
        amTF= new JTextField("",10);
        amLbl = new JLabel("AM: ");
        
        uniTF= new JTextField("",10);
        uniLbl = new JLabel("University: ");
        
        inYearTF= new JTextField("",10);
        inYearLbl = new JLabel("Insert Year: ");
        
        studentList = new ArrayList();
        
         JPanel infoPanel = new JPanel();  
        infoPanel.setLayout(new GridLayout(8,2,10,3));
        // seires, columns , ,
        infoPanel.add(nameLbl);
        infoPanel.add(nameTF);
        infoPanel.add(surnameLbl);
        infoPanel.add(surnameTF);
        infoPanel.add(mobileLbl);
        infoPanel.add(mobileTF);
        infoPanel.add(amLbl);
        infoPanel.add(amTF);
        infoPanel.add(uniLbl);
        infoPanel.add(uniTF);
        infoPanel.add(inYearLbl);
        infoPanel.add(inYearTF);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(nextBtn);
        buttonPanel.add(saveBtn);      
        
        this.add(infoPanel,BorderLayout.CENTER);
        this.add(buttonPanel,BorderLayout.SOUTH);
        
        addWindowListener(new WindowAdapter() { //windowlistener saves in a file when closing the program
            @Override
            public void windowClosing(WindowEvent we) {
                  //  load();
                    System.exit(0);
        }
        });
        
        saveBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               saveOp();
            } 
        });
        
        nextBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               nextOP();
            } 
        });
                
        
    }
    public void saveOp(){
    try {
            FileWriter out = new FileWriter("Students.txt");//enter your path here
            BufferedWriter file = new BufferedWriter(out);
            
            StringBuilder str = new StringBuilder(); 
            
            Student tmp;
            for (int i =0; i<studentList.size(); i++) {
                tmp = (Student)studentList.get(i);
                str.append(tmp.toString()); 
                str.append("\n");
            }                       
        
            file.write(str.toString().trim()); //saving the string in the file & trimming it (in case of spaces)
            file.close(); 
            int num;
            num = studentList.size();
            String num1 = String.valueOf(num);
            JOptionPane.showMessageDialog(this,   "Number of Records= " + num1  );
            
        } catch (IOException ex) {
           
        }
    
    }
    
    public void nextOP(){
                    
                Student temp = new Student(amTF.getText(), uniTF.getText(),  
                        inYearTF.getText(),nameTF.getText(), surnameTF.getText(), mobileTF.getText()); 
                studentList.add(temp);
                
                amTF.setText("");
                uniTF.setText("");
                inYearTF.setText("");
                nameTF.setText("");
                surnameTF.setText("");
                mobileTF.setText("");
                
            }
    }

