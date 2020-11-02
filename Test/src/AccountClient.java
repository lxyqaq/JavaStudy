import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class AccountClient {

    String url = "rmi:///";
    Account acc;

    private JComboBox comboBox_0 = new JComboBox();
    private JComboBox comboBox_1 = new JComboBox();
    private JFrame frame;
    private JTextField textField_0;
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
                    AccountClient window = new AccountClient();
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
    public AccountClient() throws Exception {
            initialize();

    }


    public void refresh() throws Exception {
        textField_0.setText("" + acc.read_name());
        textField_1.setText("" + acc.read_bal());
        textField_2.setText("" + acc.read_transactions());
        textField_3.setText("");

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() throws Exception {
        frame = new JFrame();
        frame.setBounds(100, 100, 604, 428);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1.setBounds(23, 111, 70, 20);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Balance");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2.setBounds(23, 142, 70, 20);
        frame.getContentPane().add(lblNewLabel_2);

        textField_0 = new JTextField();
        textField_0.setBounds(143, 113, 86, 20);
        frame.getContentPane().add(textField_0);
        textField_0.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(143, 142, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(143, 173, 86, 20);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(143, 309, 249, 20);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        acc = (Account) Naming.lookup(url + "toaster");
        refresh();

        JButton btnNewButton_1 = new JButton("Deposit");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    int amt = Integer.parseInt((String) comboBox_0.getSelectedItem());
                    acc.deposit(amt);
                    refresh();

                } catch (Exception e1) {
                }

            }
        });
        btnNewButton_1.setBounds(26, 228, 130, 23);
        frame.getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("Error Message");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1_1_1.setBounds(23, 307, 133, 20);
        frame.getContentPane().add(lblNewLabel_1_1_1);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(203, 354, 5, 22);
        frame.getContentPane().add(textArea);


        JSeparator separator = new JSeparator();
        separator.setBounds(45, 204, 370, 13);
        frame.getContentPane().add(separator);

        JLabel lblNewLabel_2_1 = new JLabel("Transactions");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_2_1.setBounds(23, 173, 110, 20);
        frame.getContentPane().add(lblNewLabel_2_1);


        comboBox_0.setModel(new DefaultComboBoxModel(new String[]{"10", "20", "50", "100"}));
        comboBox_0.setBounds(176, 228, 133, 22);
        frame.getContentPane().add(comboBox_0);

        JButton btnNewButton_2 = new JButton("Withdraw");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    int amt = Integer.parseInt((String) comboBox_1.getSelectedItem());
                    boolean result = acc.withdraw(amt);
                    refresh();
                    if (result == false) {
                        textField_3.setText("Insufficient Funds");
                    }

                } catch (Exception e1) {
                }


            }
        });
        btnNewButton_2.setBounds(23, 262, 130, 23);
        frame.getContentPane().add(btnNewButton_2);


        comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"10", "20", "50", "100"}));
        comboBox_1.setBounds(176, 262, 133, 22);
        frame.getContentPane().add(comboBox_1);

        JLabel lblNewLabel = new JLabel("Bank Account");
        lblNewLabel.setBounds(45, 67, 160, 33);
        frame.getContentPane().add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Options");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Refresh");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    refresh();
                } catch (Exception e1) {
                }
            }
        });

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Reset_Transactions");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    acc.resetTransactions();
                    refresh();
                } catch (Exception e1) {
                }

            }
        });
        mnNewMenu.add(mntmNewMenuItem_2);
        mnNewMenu.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnNewMenu.add(mntmNewMenuItem_1);
    }
}
