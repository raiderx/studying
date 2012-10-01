package org.karpukhin.lab1.step1withtable;

import javax.swing.*;
import java.awt.*;

/**
 * @author Pavel Karpukhin
 * @since  12.09.2012
 */
public class Main {

    private JFrame mainFrame;
    private JTable table;

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
        Object[][] data = {
                {"Пупкин", "Вася", "МГВУ-12", "12.12.1994"}
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
                .addComponent(scrollPane, 150, 150, Integer.MAX_VALUE)
                .addContainerGap();
        GroupLayout.Group verGroup = layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, 100, 100, Integer.MAX_VALUE)
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
