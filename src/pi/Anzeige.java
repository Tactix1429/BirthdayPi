package pi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.Font;

public class Anzeige {

	private JFrame frame;
	private JTextField Geburtsdatum;
	//This is the GUI
	//Test

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anzeige window = new Anzeige();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Anzeige() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		final JLabel Answer = new JLabel("------");
		final Geburtstagsfinder Finder = new Geburtstagsfinder();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Geburtsdatum = new JTextField();
		Geburtsdatum.setColumns(10);
		
		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum");
		
		JButton btnFinden = new JButton("Finden");
		btnFinden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				int Geburtsdatum1 = Integer.parseInt(Geburtsdatum.getText());
				Integer meinInteger = new Integer(Geburtsdatum1); 
		        String s = meinInteger.toString(); 
		        Integer meinInteger1 = new Integer(Finder.Scanner(s)); 
		        
		        String s1 = meinInteger1.toString();
		        if(Finder.Scanner(s) == -1)
		        {
		        	Answer.setText("Wurde leider nicht gefunden, versuch es mit mit DDMMJJ oder einer anderen Kombination");
		        }
		        else
		        {
		        Answer.setText(s1);
				}}
				catch(Exception exp)
				{
					
				}
				}
		});
		
		JLabel lblDeinGeburtsdatumBefindet = new JLabel("Dein Geburtsdatum befindet sich an der ...");
		
		JLabel lblnachkommastelleVonPi = new JLabel("...Nachkommastelle von Pi");
		
		JLabel lblNewLabel = new JLabel("Pi-Birthdayfinder");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblGeburtsdatum)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnFinden)
								.addComponent(Geburtsdatum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(51)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblnachkommastelleVonPi)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(Answer, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblDeinGeburtsdatumBefindet, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel)
					.addGap(58)
					.addComponent(lblGeburtsdatum)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDeinGeburtsdatumBefindet)
						.addComponent(Geburtsdatum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Answer)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFinden)
						.addComponent(lblnachkommastelleVonPi))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
