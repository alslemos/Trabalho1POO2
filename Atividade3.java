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
				
				
				// codigo da opcao 1 vai aqui dentro
				JInternalFrame ji = new JInternalFrame("Janela Interna 1 ", true);
				ji.setBounds(20, 20, 250, 200);
				ji.setVisible(true);
				
				
				desktopPane.add(ji);
				ji.setMaximizable(true); // pode ser maximizada
				ji.setClosable(true); // pode ser fechada;
				
			}
		});
		menu.add(menuItem);
		
		menuItem2 = new JMenuItem("JSplitDemo: atividade 2");
		menuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// codigo da opcao 2 vai aqui
				JInternalFrame ju = new JInternalFrame("Janela Interna 2 ", true);
				ju.setBounds(50, 50, 250, 200);
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
