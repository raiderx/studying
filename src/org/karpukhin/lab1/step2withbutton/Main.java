package org.karpukhin.lab1.step2withbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Pavel Karpukhin
 * @since 12.09.12
 */
public class Main {

    private JFrame mainFrame;
    private JTable table;
    private JButton buttonExit;

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
        mainFrame.setMinimumSize(new Dimension(250, 200));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationByPlatform(true);
    }

    /**
     * Initializes components
     */
    public void initComponents() {
        buttonExit = new JButton("Выход");
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Object[][] data = {
                {"Пупкин", "Вася", "МВГУ-12", "12.12.1994"}
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
                                .addGap(0, 0, Integer.MAX_VALUE)
                                .addComponent(buttonExit)
                        )
                )
                .addContainerGap();
        GroupLayout.Group verGroup = layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, 150, 150, Integer.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonExit)
                .addContainerGap();
        layout.setHorizontalGroup(horGroup);
        layout.setVerticalGroup(verGroup);
        mainFrame.getContentPane().setLayout(layout);
    }

    /**
     * Makes frame visible
     */
    public void show() {
        mainFrame.pack();
        mainFrame.setVisible(true);
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
