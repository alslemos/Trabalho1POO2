//package atividadeTres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gerenciador extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	
	// criando elementos que serao criados
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem, menuItem2;
	
	Imagem myObject = new Imagem();
	Prontuario myObject1 = new Prontuario();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gerenciador frame = new gerenciador();
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
	public gerenciador() {
		setTitle("Ativdade 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.control);
		contentPane.add(panel, BorderLayout.NORTH);
		
		
		menuBar = new JMenuBar();
		menu = new JMenu("Adicionar");
		// menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
		        "The only menu in this program that has menu items");
		
		menuBar.add(menu);
		
		menuItem = new JMenuItem("JTabbedPaneDemo: atividade 1");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// variáveis necessárias para o código da primeira atividade de prontuário
			    JTextField textField;
				JTextField textField_1;
				JTextField textField_2;
				JTextField textField_3;
				
				JInternalFrame ji = new JInternalFrame("Janela Interna 1 ", true);
				ji.setBounds(20, 20, 420, 318); // proporcoa usada na primeira atividade
				
				// codigo referente a atividade 1
					JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
					ji.add(tabbedPane);
					
					JPanel panel1 = new JPanel();
					panel1.setBackground(new Color(219, 255, 140));
					tabbedPane.addTab("Dados Pessoais", new ImageIcon(Prontuario.class.getResource("/icons/1.png")), panel1, null);
					panel1.setLayout(new MigLayout("", "[][grow][grow][grow]", "[][][][][][][][][grow][]"));
					
					JLabel lblNewLabel_6 = new JLabel("Dados pessoais");
					lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
					panel1.add(lblNewLabel_6, "cell 1 0");
					
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
					panel2.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][][][grow]"));
					
					JLabel lblNewLabel_7 = new JLabel("Anamnese");
					lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
					panel2.add(lblNewLabel_7, "cell 0 0");
					
					JLabel lblNewLabel_8 = new JLabel("Anamnese inicial");
					panel2.add(lblNewLabel_8, "cell 0 1");
					
					textField_4 = new JTextField();
					panel2.add(textField_4, "cell 0 2 1 2,growx");
					textField_4.setColumns(10);
					
					JCheckBox chckbxNewCheckBox = new JCheckBox("Auscuta realizada");
					panel2.add(chckbxNewCheckBox, "cell 0 4");
					
					JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Aferição pressao sanguinea");
					panel2.add(chckbxNewCheckBox_1, "cell 0 5");
					
					JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Nível oxigenação");
					panel2.add(chckbxNewCheckBox_2, "cell 0 6");
					
					JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Temperatura corportal");
					panel2.add(chckbxNewCheckBox_3, "cell 0 7");
					
					JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Sintomas gripais");
					panel2.add(chckbxNewCheckBox_4, "cell 0 8");
					
					JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Sinais de fratura");
					panel2.add(chckbxNewCheckBox_5, "cell 0 9");
					
					JLabel lblNewLabel_9 = new JLabel("Observações completas");
					panel2.add(lblNewLabel_9, "cell 0 10");
					
					JEditorPane editorPane = new JEditorPane();
					panel2.add(editorPane, "cell 0 11,grow");
					
					JPanel panel3 = new JPanel();
					panel3.setBackground(new Color(100, 100, 100));
					tabbedPane.addTab("Exames", new ImageIcon(Prontuario.class.getResource("/icons/3.png")), panel3, null);
					panel3.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][grow]"));
					
					JLabel lblNewLabel_10 = new JLabel("Exames solicitados");
					lblNewLabel_10.setForeground(new Color(255, 255, 255));
					lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
					panel3.add(lblNewLabel_10, "cell 0 0");
					
					JSeparator separator = new JSeparator();
					panel3.add(separator, "cell 0 1");
					
					JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Exame 1");
					chckbxNewCheckBox_6.setForeground(new Color(255, 255, 255));
					panel3.add(chckbxNewCheckBox_6, "cell 0 2");
					
					JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Exame 2");
					chckbxNewCheckBox_7.setForeground(new Color(255, 255, 255));
					panel3.add(chckbxNewCheckBox_7, "cell 0 3");
					
					JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Exame 3");
					chckbxNewCheckBox_8.setForeground(new Color(255, 255, 255));
					panel3.add(chckbxNewCheckBox_8, "cell 0 4");
					
					JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Exame 4");
					chckbxNewCheckBox_9.setForeground(new Color(255, 255, 255));
					panel3.add(chckbxNewCheckBox_9, "cell 0 5");
					
					JLabel lblNewLabel_11 = new JLabel("Resultados significativos anteriores");
					lblNewLabel_11.setForeground(new Color(255, 255, 255));
					panel3.add(lblNewLabel_11, "cell 0 7");
					
					JEditorPane editorPane_1 = new JEditorPane();
					panel3.add(editorPane_1, "cell 0 8,grow");
					
					JPanel panel4 = new JPanel();
					panel4.setBackground(new Color(50, 50, 150));
					tabbedPane.addTab("Tratamentos", new ImageIcon(Prontuario.class.getResource("/icons/4.png")), panel4, null);
					panel4.setLayout(new MigLayout("", "[61px,grow]", "[16px][][grow][][][][][][][]"));
					
					JLabel lblNewLabel_12 = new JLabel("Tratamentos indicados");
					lblNewLabel_12.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
					lblNewLabel_12.setForeground(new Color(255, 255, 255));
					panel4.add(lblNewLabel_12, "cell 0 0");
					
					JLabel lblNewLabel_13 = new JLabel("Siga-os por gentileza");
					lblNewLabel_13.setForeground(new Color(198, 198, 198));
					panel4.add(lblNewLabel_13, "cell 0 1");
					
					JTextPane textPane_1 = new JTextPane();
					panel4.add(textPane_1, "cell 0 2 1 8,grow");

            // aqui termina 
                
                ju.setVisible(true);
				desktopPane.add(ju);
				ju.setMaximizable(true); // pode ser maximizada
				ju.setClosable(true); // pode ser fechada;
				
			}
		});
		
		menu.add(menuItem2);
		
		
		panel.add(menuBar);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.textHighlight);
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}
}
