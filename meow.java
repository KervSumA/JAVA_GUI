import java.awt.*;
import javax.swing.*;

public class meow{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello Kerv");
        frame.setSize(500,600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 1));


     JLabel lblschool = new JLabel("Enter School");
     String[] school = {"Select School", "FRANCE","USA","CEBU","BALAY"};
     JComboBox<String> cmbschool = new JComboBox<>(school);

     JLabel lblname = new JLabel("Enter name");
     JTextField txtname = new JTextField(30);
     JLabel lblage = new JLabel ("Enter age");
     JTextField txtage = new JTextField(30);

     JLabel lblmultiple = new JLabel("MULTIPLE HOICE:");
     JRadioButton a = new JRadioButton("Money");
     JRadioButton b = new JRadioButton("Ako");
     JRadioButton c = new JRadioButton("Siya");
     JRadioButton d = new JRadioButton("None");

     ButtonGroup multiplechoice = new ButtonGroup();
     
     JLabel lblmenu = new JLabel ("FOOD MENU:");
     JCheckBox v1 = new JCheckBox("Meow");
     JCheckBox v2 = new JCheckBox("Sphagetti");
     JCheckBox v3 = new JCheckBox("Siya");
     JCheckBox v4 = new JCheckBox("NONE");

    JLabel lbladdress = new JLabel("ADDRESS:");
    JTextArea txtaddress = new JTextArea(1, 20);
     txtaddress.setLineWrap(true);
     txtaddress.setWrapStyleWord(true);

     JButton btnStart = new JButton("Start");
     JButton btnStop = new JButton("Stop");

     

     multiplechoice.add(a);
     multiplechoice.add(b);
     multiplechoice.add(c);
     multiplechoice.add(d);

     frame.add (lblname);
     frame.add (txtname);
     frame.add (lblage);
     frame.add (txtage);
     frame.add (cmbschool);
     frame.add (lblmultiple);
     frame.add (a);
     frame.add (b);
     frame.add (c);
     frame.add (d);
     frame.add (lblmenu);
     frame.add (v1);
     frame.add (v2);
     frame.add (v3);
     frame.add (v4);
     frame.add (lbladdress);
     frame.add (txtaddress);
     frame.add (btnStart);
     frame.add (btnStop);
     
btnStart.addActionListener(e->{
    String name = txtname.getText().trim();
    String ageText = txtage.getText().trim();
    String getschool = cmbschool.getSelectedItem().toString();
    String Choice = multiplechoice.toString();
    if (a. isSelected()){
        Choice = "Money";


    }if (b. isSelected()){
        Choice = "Ako";
    }if (c. isSelected()){
        Choice = "Siya";
    }if (d. isSelected()){
        Choice = "None";
    }

String menu = "";
if (v1. isSelected()){
        menu += "Meow\n";
} if (v2. isSelected()){
        menu += "Sphagetti\n";
} if (v3. isSelected()){
        menu += "siya\n";
} if (v4. isSelected()){
        menu += "NONE\n";
}
menu = menu.substring(0, menu.length() -2);


    String message = "DATA ENTRY \n\n" + "NAME:" + name + "\nAge:" + ageText + "\nSchool:" + getschool + "\nMenu:" + menu;

    JOptionPane.showMessageDialog(frame,message);




});

    frame.setVisible(true);

        
    }
}




