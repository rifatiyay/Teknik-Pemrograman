package Tugas10GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.TextArea;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.Panel;
import java.awt.ScrollPane;

public class AplikasiPemesananMakanan extends JFrame {

	private JPanel contentPane;
	private JTextField txtNamaCust;
	private JTextField txtAlamatCust;
	private JTextField txtTelpCust;
	private JTextField txtTotalHarga;
	private String outputDP = "";
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikasiPemesananMakanan frame = new AplikasiPemesananMakanan();
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
	public AplikasiPemesananMakanan() {
		setTitle("Aplikasi Pemesanan Makanan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 640);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("RESTORAN RIFATIYAY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Data Customer");
		
		txtNamaCust = new JTextField();
		txtNamaCust.setColumns(10);
		
		txtAlamatCust = new JTextField();
		txtAlamatCust.setColumns(10);
		
		txtTelpCust = new JTextField();
		txtTelpCust.setColumns(10);
		
		TextArea txtDP = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		txtDP.setEditable(false);
		
		JLabel lblNama = new JLabel("Nama :");
		
		JLabel lblAlamat = new JLabel("Alamat :");
		
		JLabel lblTelp = new JLabel("No. Telp :");
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		JLabel lblPilihMenu = new JLabel("Pilih Menu");
		
		JLabel lblTotalHarga = new JLabel("Total Harga");
		lblTotalHarga.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panelPilihMenu = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		
		JCheckBox chkSate = new JCheckBox("Sate");
		panelPilihMenu.add(chkSate);
		
		JCheckBox chkGulai = new JCheckBox("Gulai");
		chkGulai.setHorizontalAlignment(SwingConstants.LEFT);
		panelPilihMenu.add(chkGulai);
		
		JCheckBox chkRendang = new JCheckBox("Rendang");
		panelPilihMenu.add(chkRendang);
		contentPane.setLayout(gl_contentPane);
		
		class pilihMenuListener implements ChangeListener {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				int totalHarga = 0;
				if(chkRendang.isSelected()){
					totalHarga += 12000;
				}
				if(chkGulai.isSelected()){
					totalHarga += 8000;
				}
				if(chkSate.isSelected()){
					totalHarga += 5000;
				}
				txtTotalHarga.setText(Integer.toString(totalHarga));
			}
		}
		
		chkRendang.addChangeListener(new pilihMenuListener());
		chkGulai.addChangeListener(new pilihMenuListener());
		chkSate.addChangeListener(new pilihMenuListener());
		
		txtTotalHarga = new JTextField();
		txtTotalHarga.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotalHarga.setBackground(Color.BLACK);
		txtTotalHarga.setEditable(false);
		txtTotalHarga.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTotalHarga.setForeground(Color.RED);
		txtTotalHarga.setColumns(10);
		
		JLabel lblDataPenjualan = new JLabel("Data Penjualan");
		
		JButton btnTambah = new JButton("Tambah");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				outputDP += "\t +++RESTORAN RIFATIYAY+++\n";
				outputDP += "-----------------------------------\n";
				outputDP += "Data Customer\n\n";
				outputDP += "Nama : " + txtNamaCust.getText() + "\n";
				outputDP += "Alamat : " + txtAlamatCust.getText() + "\n";
				outputDP += "No. Telp : " + txtTelpCust.getText() + "\n";
				outputDP += "-----------------------------------\n";
				outputDP += "Pesanan\n\n";
				if(chkSate.isSelected()){
					outputDP += "Sate [5000]\n";
				}
				if(chkGulai.isSelected()){
					outputDP += "Gulai [8000]\n";
				}
				if(chkRendang.isSelected()){
					outputDP += "Rendang [12000]\n";
				}
				outputDP += "-----------------------------------\n";
				outputDP += "Total Harga :\n";
				outputDP += txtTotalHarga.getText() + "\n";
				outputDP += "-----------------------------------\n";
				outputDP += "-----------------------------------\n\n";
				
				txtDP.setText(outputDP);
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNamaCust.setText("");
				txtAlamatCust.setText("");
				txtTelpCust.setText("");
				chkSate.setSelected(false);
				chkGulai.setSelected(false);
				chkRendang.setSelected(false);
			}
		});
		
		
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(243)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(293)
										.addComponent(lblNewLabel_2))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(58)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNama)
													.addComponent(lblAlamat)
													.addComponent(lblTelp, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_1)
													.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(txtTelpCust, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtAlamatCust, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtNamaCust, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblTotalHarga, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblPilihMenu)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addComponent(txtTotalHarga, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
														.addComponent(btnTambah))
													.addGroup(gl_contentPane.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(panelPilihMenu, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))))
											.addComponent(lblDataPenjualan)
											.addComponent(txtDP, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE))))
								.addGap(38)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(9)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel_2)
						.addGap(30)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1)
							.addComponent(lblPilihMenu))
						.addGap(16)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(panelPilihMenu, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtNamaCust, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNama))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtAlamatCust, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblAlamat))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtTelpCust, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblTelp))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(18)
										.addComponent(btnReset)
										.addGap(60)
										.addComponent(lblDataPenjualan))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblTotalHarga)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtTotalHarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnTambah)))
								.addGap(18)
								.addComponent(txtDP, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
		
	}
}
