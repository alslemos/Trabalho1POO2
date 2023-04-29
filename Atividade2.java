package atividadeDois;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import net.miginfocom.swing.MigLayout;

public class Imagem extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagem frame = new Imagem();
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
	public Imagem() {
		setTitle("JSplit Task");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Sair");
		panel.add(btnNewButton);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		splitPane.setToolTipText("tool tip\n"); 
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
				
		JPanel RighPanel = new JPanel();
		RighPanel.setBackground(SystemColor.window);
		scrollPane.setViewportView(RighPanel);
		
		
		JLabel labelImagem = new JLabel("");
		
		try {
			labelImagem.setBounds(0, 0, 194, 241); // width, height
			labelImagem.setIcon(new ImageIcon(ImageIO.read(Imagem.class.getResource("/icons/homer2.jpg"))
					.getScaledInstance(labelImagem.getWidth(), labelImagem.getHeight(), BufferedImage.TYPE_INT_RGB)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RighPanel.add(labelImagem);
		
		
		try {
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		JPanel LeftPanel = new JPanel();
		splitPane.setRightComponent(LeftPanel);
		
		LeftPanel.setLayout(new MigLayout("", "[110px]", "[16px][][][][][][]"));
		
		File imageFile = new File("/icons/homer2.jpg");
        String imageName = imageFile.getName();
        
		JLabel labelNome = new JLabel("Nome da Imagem: "+ imageName + " ");
		LeftPanel.add(labelNome, "cell 0 0,alignx left,aligny top");
		
		
		int wid = labelImagem.getWidth();
		JLabel labelLargura = new JLabel("Largura da Imagem: " + wid + " ");
		LeftPanel.add(labelLargura, "cell 0 3");
	
		
		int hei = labelImagem.getHeight();
		JLabel labelAltura = new JLabel("Altura da Imagem: "+ hei + " ");
		LeftPanel.add(labelAltura, "cell 0 6,alignx left");
		
	}
}
