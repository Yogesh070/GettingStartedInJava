package com.company;

import javax.swing.*;
import java.awt.*;

// Creating a form using swing in Java
/**
 * SwingForm
 */
public class SwingForm extends JFrame {

    SwingForm(){
        formUi();
        //File menuitems
        JMenuBar mb=new JMenuBar();
        JMenu fileMenu=new JMenu("File");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenu i3=new JMenu("SaveAs");
        JMenuItem Subitem1=new JMenuItem("New");
        JMenuItem Subitem2=new JMenuItem("Old");
        setJMenuBar(mb);
        mb.add(fileMenu);
        fileMenu.add(i1);
        fileMenu.add(i2);
        fileMenu.add(i3);
        i3.add(Subitem1);
        i3.add(Subitem2);
        //
        JMenu editMenu=new JMenu("Edit");
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy= new JMenuItem("Copy");
        mb.add(editMenu);
        editMenu.add(cut);
        editMenu.add(copy);
        JMenu windowMenu=new JMenu("Window");
        mb.add(windowMenu);
        FormElements();
    }
    void FormElements(){
       JTextField name, username;
       JLabel l1,l2;
       l1=new JLabel("Name");
       l2=new JLabel("UserName");
       name=new JTextField();
       username=new JTextField();
       name.setBounds(50,60,200,20);
       username.setBounds(60,70,200,20);
       add(l1);
       add(l2);
       add(name);
       add(username);
    }
    private void formUi(){
        Image icon =Toolkit.getDefaultToolkit().getImage("D:\\Gettingstarted\\src\\com\\company\\form.png");
        setIconImage(icon);
        setLayout(null);
        setTitle("Information Form");
        setVisible(true);
        setSize(500, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SwingForm();
    }
}