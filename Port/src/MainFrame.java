import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import PaqI04.Hub;
import PaqI04.Container;

public class MainFrame extends JFrame {
    private JTextField textField1;
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JRadioButton a1RadioButton;
    private JTextArea descriptionIsShownHereTextArea;
    private JTextArea logo;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox customInspectionCheckBox;
    private JButton pileButton;
    private JButton unpileButton;
    private JTextField columnNumberTextField;
    private JTextArea descriptionIsShownHereTextArea1;
    private JTextField putNumberHereTextField;
    private JButton description;
    private JTextArea logoo;
    private JTextField weighttext;
    private JButton numberc;
    private JComboBox cccountry;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Port");
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Hub ex=new Hub();



        description.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String descp=descriptionIsShownHereTextArea.getText();
                descriptionIsShownHereTextArea1.setText(descp);


            }


        });


        pileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){

                Container one=new Container();
                one.setIdentifiernumber(Integer.parseInt(textField1.getText()));
                one.setDescription(descriptionIsShownHereTextArea.getText());
                one.setCountryoforigin((String)comboBox1.getSelectedItem());
                if (a1RadioButton.isSelected()) one.setPriority(1);
                if (a2RadioButton.isSelected()) one.setPriority(2);
                if (a3RadioButton.isSelected()) one.setPriority(3);
                one.setWeight(Integer.parseInt(weighttext.getText()));
                if(customInspectionCheckBox.isSelected()) one.isInspected();
                one.setCompanysend(textField2.getText());
                one.setCompanyreceive(textField3.getText());

                System.out.println("A container is being stacked...");
                ex.stack(one);
                logo.setText(ex.toString());
            }
        });

        unpileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
               ex.unstack(Integer.parseInt(columnNumberTextField.getText()));
                System.out.println("A container from the selected column has been removed");
                logo.setText(ex.toString());

            }
        });

        numberc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){

                ex.ccountry((String) cccountry.getSelectedItem());

                putNumberHereTextField.setText(String.valueOf(ex.ccountry((String) cccountry.getSelectedItem())));

            }
        });



        logoo.setSize(150, 128);
    }


    public static void main(String[] args) {
        MainFrame myFrame= new MainFrame();
    }
}
