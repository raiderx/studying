package org.karpukhin.lab1.step3withdialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * @author Pavel Karpukhin
 * @since 12.09.12
 */
public class Main {

    private JFrame mainFrame;
    private JTable table;
    private JButton buttonAdd;
    private JButton buttonExit;

    private JDialog dialogAdd;

    /**
     * Default constructor
     */
    public Main() {
    }

    /**
     * Initializes entire application
     */
    public void init() {
        initFrame();
        initComponents();
        initLayout();
    }

    /**
     * Initializes frame
     */
    public void initFrame() {
        mainFrame = new JFrame("Lab 1");
        mainFrame.setMinimumSize(new Dimension(300, 200));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationByPlatform(true);
    }

    /**
     * Initializes components
     */
    public void initComponents() {
        buttonAdd = new JButton("Добавить");
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDialog();
            }
        });
        buttonExit = new JButton("Выход");
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Object[][] data = {
                {"Федоров", "Дмитрий", "МВТУ-12", "12.12.1994"},
                {"Иванов", "Роман", "МВТУ-11", "8.7.1994"},
                {"Петров", "Федор", "МВТУ-12", "14.5.1994"},
                {"Семенов", "Константин", "МВТУ-11", "26.3.1994"},
        };
        String[] columns = {"Фамилия", "Имя", "Группа", "Дата рождения"};
        table = new JTable(data, columns);
    }

    /**
     * Initializes layout
     */
    public void initLayout() {
        JScrollPane scrollPane = new JScrollPane(table);

        GroupLayout layout = new GroupLayout(mainFrame.getContentPane());
        GroupLayout.Group horGroup = layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup()
                        .addComponent(scrollPane, 100, 100, Integer.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAdd)
                                .addGap(0, 0, Integer.MAX_VALUE)
                                .addComponent(buttonExit)
                        )
                )
                .addContainerGap();
        GroupLayout.Group verGroup = layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, 150, 150, Integer.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup()
                        .addComponent(buttonAdd)
                        .addComponent(buttonExit)
                )
                .addContainerGap();
        layout.setHorizontalGroup(horGroup);
        layout.setVerticalGroup(verGroup);
        mainFrame.getContentPane().setLayout(layout);
        Locale[] locales = Locale.getAvailableLocales();
    }

    /**
     * Makes frame visible
     */
    public void show() {
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public void createDialog() {
        dialogAdd = new JDialog(mainFrame, "Добавить студента", true);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogAdd.setVisible(false);
            }
        });

        JButton cancelButton = new JButton("Отмена");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogAdd.setVisible(false);
            }
        });

        dialogAdd.setLayout(new GridBagLayout());

        Insets insets = new Insets(7, 7, 7, 7);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = insets;
        dialogAdd.add(new JLabel("Фамилия"), gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        dialogAdd.add(new JTextField(10), gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = insets;
        dialogAdd.add(new JLabel("Имя"), gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        dialogAdd.add(new JTextField(10), gbc);

        gbc = new GridBagConstraints();
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.gridwidth = 2;
        gbc.weightx = 100;
        gbc.weighty = 100;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = insets;
        dialogAdd.add(okButton, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = insets;
        dialogAdd.add(cancelButton, gbc);

        dialogAdd.pack();
        dialogAdd.setResizable(false);
        dialogAdd.setLocationByPlatform(true);
        dialogAdd.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.init();
                main.show();
            }
        });
    }
}
