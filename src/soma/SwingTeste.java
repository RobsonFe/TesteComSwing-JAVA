package soma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class SwingTeste extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTeste frame = new SwingTeste();
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
	public SwingTeste() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SwingTeste.class.getResource("/img/ferramentas.png")));
		setTitle("SOMA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNumero1.setBounds(26, 60, 67, 19);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNumero2.setBounds(120, 60, 79, 18);
		contentPane.add(lblNumero2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(26, 86, 67, 19);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(120, 86, 61, 19);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblResultado.setBounds(322, 62, 67, 15);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.parseInt(txtNumero1.getText());
				int numero2 = Integer.parseInt(txtNumero2.getText());
				
				int soma = numero1 + numero2;
				
				txtResultado.setText(String.valueOf(soma));
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnNewButton.setBounds(203, 81, 89, 29);
		contentPane.add(btnNewButton);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(314, 86, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
}
