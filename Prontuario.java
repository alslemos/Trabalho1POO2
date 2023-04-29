package atividadeUm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Prontuario extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Prontuario frame = new Prontuario();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Prontuario() {
        setResizable(false);
        setTitle("Prontuário Médico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        contentPane.add(tabbedPane);
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(219, 255, 140));
        tabbedPane.addTab("Dados Pessoais", new ImageIcon(Prontuario.class.getResource("/icons/1.png")), panel1, null);
        panel1.setLayout(new MigLayout("", "[][grow][grow][grow]", "[][][][][][][][][grow][]"));
        
        JLabel lblNewLabel_6 = new JLabel("Dados pessoais");
        lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        panel1.add(lblNewLabel_6, "cell 1 0");
        
        JLabel lblNewLabel = new JLabel("Nome");
        panel1.add(lblNewLabel, "cell 0 1,alignx trailing");
        
        textField = new JTextField();
        panel1.add(textField, "cell 1 1 3 1,growx");
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("CPF");
        panel1.add(lblNewLabel_1, "cell 0 2,alignx trailing");
        
        textField_1 = new JTextField();
        panel1.add(textField_1, "cell 1 2 3 1,growx");
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Cartão SUS");
        panel1.add(lblNewLabel_2, "cell 0 3,alignx trailing");
        
        textField_2 = new JTextField();
        panel1.add(textField_2, "cell 1 3 3 1,growx");
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Plano privado");
        panel1.add(lblNewLabel_3, "cell 0 4,alignx trailing");
        
        textField_3 = new JTextField();
        panel1.add(textField_3, "cell 1 4 3 1,growx");
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Gênero");
        panel1.add(lblNewLabel_4, "cell 0 6,alignx right");
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
        panel1.add(rdbtnNewRadioButton, "flowx,cell 1 6 3 1,alignx left");
        
        JLabel lblNewLabel_5 = new JLabel("Condições conhecidas");
        panel1.add(lblNewLabel_5, "cell 0 8");
        
        JTextPane textPane = new JTextPane();
        panel1.add(textPane, "cell 1 8 3 1,grow");
        
        JButton btnNewButton = new JButton("Limpar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setIcon(new ImageIcon(Prontuario.class.getResource("/icons/clean.png")));
        panel1.add(btnNewButton, "flowx,cell 1 9");
        
        JButton btnNewButton_1 = new JButton("Salvar");
        btnNewButton_1.setIcon(new ImageIcon(Prontuario.class.getResource("/icons/ok.png")));
        panel1.add(btnNewButton_1, "cell 1 9");
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
        panel1.add(rdbtnNewRadioButton_1, "cell 1 6 2 1");
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Outro");
        panel1.add(rdbtnNewRadioButton_2, "cell 2 6");
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(200, 200, 200));
        tabbedPane.addTab("Anamnese", new ImageIcon(Prontuario.class.getResource("/icons/2.png")), panel2, null);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(100, 100, 100));
        tabbedPane.addTab("Exames", new ImageIcon(Prontuario.class.getResource("/icons/3.png")), panel3, null);
        
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(50, 50, 150));
        tabbedPane.addTab("Tratamentos", new ImageIcon(Prontuario.class.getResource("/icons/4.png")), panel4, null);
    }

}
