/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsapplication;

/**
 *
 * @author Παναγιώτης
 */
public class StudentsApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             StudentsForm frame = new StudentsForm();
            frame.setTitle("Καταγραφή Φοιτητών");
            frame.setSize(500,300);
            frame.setLocationRelativeTo(null); 
            frame.setVisible(true);
    }
    
}
