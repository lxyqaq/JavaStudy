package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.rmi.RemoteException;

public class MainFrm extends JFrame {

    private JPanel contentPane;
    private JDesktopPane table = null;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrm frame = new MainFrm();
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
    public MainFrm() {
        setTitle("Guitar Shop Management System Homepage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Data Maintenance");
        mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
        menuBar.add(mnNewMenu);

        JMenu mnNewMenu_2 = new JMenu("Category Management");
        mnNewMenu.add(mnNewMenu_2);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Category added");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CategoriesAddFrm categoriesAddFrm = null;
                try {
                    categoriesAddFrm = new CategoriesAddFrm();
                } catch (RemoteException remoteException) {
                    remoteException.printStackTrace();
                }
                categoriesAddFrm.setVisible(true);
                table.add(categoriesAddFrm);
            }
        });
        mntmNewMenuItem_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu_2.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Category management");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CategoriesManageFrm categoriesManageFrm = null;
                try {
                    categoriesManageFrm = new CategoriesManageFrm();
                } catch (RemoteException remoteException) {
                    remoteException.printStackTrace();
                }
                categoriesManageFrm.setVisible(true);
                table.add(categoriesManageFrm);
            }
        });
        mntmNewMenuItem_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu_2.add(mntmNewMenuItem_2);

        JMenu mnNewMenu_3 = new JMenu("Product Management");
        mnNewMenu_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu.add(mnNewMenu_3);

        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Product added");
        mntmNewMenuItem_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu_3.add(mntmNewMenuItem_4);

        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Product management");
        mntmNewMenuItem_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu_3.add(mntmNewMenuItem_5);

        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Quit");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want to log out of the system?");
                if (result == 0) {
                    dispose();
                }
            }
        });
        mntmNewMenuItem_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu.add(mntmNewMenuItem_3);

        JMenu mnNewMenu_1 = new JMenu("About");
        mnNewMenu_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        menuBar.add(mnNewMenu_1);

        JMenuItem mntmNewMenuItem = new JMenuItem("About this Project");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AssignmentFrm assignmentFrm = new AssignmentFrm();
                assignmentFrm.setVisible(true);
            }
        });
        mntmNewMenuItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mnNewMenu_1.add(mntmNewMenuItem);
        contentPane = new JPanel();
        contentPane.setToolTipText("");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        table = new JDesktopPane();
        table.setBackground(Color.WHITE);
        contentPane.add(table, BorderLayout.CENTER);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}
