import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class AdminSuccess extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2909922128893924501L;
	static AdminSuccess frame;
	private JPanel contentPane = new JPanel();
    JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSuccess();
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
	@SuppressWarnings("null")
	public AdminSuccess() {
		
		super("Library Management System (Home)");
        setBounds(400, 150, 1000, 800);
        setBackground(new Color(255, 255, 204));
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 204));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		   JLabel l1 = new JLabel("Library Management System");
           l1.setForeground(new Color(204, 51, 102));
           l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
           l1.setBounds(268, 30, 701, 80);
           contentPane.add(l1);

           JLabel l2 = new JLabel("");
           l2.setVerticalAlignment(SwingConstants.TOP);
           ImageIcon i1  = new ImageIcon("C:\\Users\\welcome\\Desktop\\addBook.png");
           Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           l2 = new JLabel(i3);
           l2.setBounds(60, 140, 159, 152);
           contentPane.add(l2);
           
           JLabel l3 = new JLabel("");
           ImageIcon i4  = new ImageIcon("C:\\Users\\welcome\\Desktop\\statistics.png");
           Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
           ImageIcon i6 = new ImageIcon(i5);
           l3 = new JLabel(i6);
           l3.setBounds(300, 160, 134, 128);
           contentPane.add(l3);

           JLabel l4 = new JLabel("");
           ImageIcon i7  = new ImageIcon("C:\\Users\\welcome\\Desktop\\addStudent.png");
           Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
           ImageIcon i9 = new ImageIcon(i8);
           l4 = new JLabel(i9);
           l4.setBounds(530, 140, 225, 152);
           contentPane.add(l4);

           b1 = new JButton("Add Books");
           b1.setFont(new Font("Tahoma", Font.PLAIN, 18));
           b1.addActionListener((ActionListener) this);
           b1.setBackground(Color.BLACK);
           b1.setForeground(Color.WHITE);
           b1.setBounds(60, 320, 159, 44);
           contentPane.add(b1);

           b2 = new JButton("Statistics");
           b2.setFont(new Font("Tahoma", Font.PLAIN, 18));
           b2.addActionListener(this);
           b2.setBackground(Color.BLACK);
           b2.setForeground(Color.WHITE);
           b2.setBounds(313, 320, 139, 44);
           contentPane.add(b2);
           
           b3 = new JButton("Add Student");
           b3.setFont(new Font("Tahoma", Font.PLAIN, 18));
           b3.addActionListener((ActionListener) this);
           b3.setBackground(Color.BLACK);
           b3.setForeground(Color.WHITE);
           b3.setBounds(562, 320, 167, 44);
           contentPane.add(b3);

           JPanel panel = new JPanel();
           panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Perform Operations", TitledBorder.RIGHT,
				TitledBorder.TOP, null, new Color(255, 0, 0)));
           panel.setBounds(20, 120, 750, 260);
           panel.setBackground(Color.PINK);
           contentPane.add(panel);

           b4 = new JButton("Issue Book");
           b4.setFont(new Font("Tahoma", Font.PLAIN, 18));
           b4.addActionListener((ActionListener) this);
           b4.setBackground(Color.BLACK);
           b4.setForeground(Color.WHITE);
           b4.setBounds(76, 620, 143, 41);
           contentPane.add(b4);

           b5 = new JButton("Return Book");
           b5.setFont(new Font("Tahoma", Font.PLAIN, 18));
           b5.addActionListener((ActionListener) this);
           b5.setBackground(Color.BLACK);
           b5.setForeground(Color.WHITE);
           b5.setBounds(310, 620, 159, 41);
           contentPane.add(b5);

           b6 = new JButton("About Us");
           b6.setFont(new Font("Tahoma", Font.PLAIN, 18));
           b6.addActionListener(this);
           b6.setBackground(Color.BLACK);
           b6.setForeground(Color.WHITE);
           b6.setBounds(562, 620, 159, 41);
           contentPane.add(b6);

           JLabel l5 = new JLabel("");
           ImageIcon i10  = new ImageIcon("C:\\Users\\welcome\\Desktop\\issueBooks.png");
           Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
           ImageIcon i12 = new ImageIcon(i11);
           l5 = new JLabel(i12);
           l5.setBounds(60, 440, 159, 163);
           contentPane.add(l5);

           JLabel l6 = new JLabel("");
           ImageIcon i13  = new ImageIcon("C:\\Users\\welcome\\Desktop\\returnBook.png");
           Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
           ImageIcon i15 = new ImageIcon(i14);
           l6 = new JLabel(i15);
           l6.setBounds(332, 440, 139, 152);
           contentPane.add(l6);
           
           JLabel l7 = new JLabel("");
           ImageIcon i16  = new ImageIcon("C:\\Users\\welcome\\Desktop\\about.png");
           Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
           ImageIcon i18 = new ImageIcon(i17);
           l7 = new JLabel(i18);
           l7.setBounds(562, 440, 157, 152);
           contentPane.add(l7);

           JPanel panel2 = new JPanel();
           panel2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 3), "Perform Actions", TitledBorder.RIGHT,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
           panel2.setBounds(20, 420, 750, 270);
           panel2.setBackground(Color.PINK);
           contentPane.add(panel2);
           
           getContentPane().setBackground(Color.PINK);
           contentPane.setBackground(Color.PINK);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String msg = ae.getActionCommand();
        
        if(msg.equals("Logout")){
            setVisible(false);
        }
        
        if(ae.getSource() == b1){
            this.setVisible(false);
            new BooksForm().setVisible(true);
        }
        if(ae.getSource() == b3){
            this.setVisible(false);
            new StudentForm().setVisible(true);
        }
        if(ae.getSource() == b4){
            this.setVisible(false);
            new IssueBookForm().setVisible(true);
        }
        if(ae.getSource() == b5){
            this.setVisible(false);
            new ReturnBook().setVisible(true);
        }
        
        if(ae.getSource() == b2){
            this.setVisible(false);
            new Statistics().setVisible(true);
        }
		
	}
}
