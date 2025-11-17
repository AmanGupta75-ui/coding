import javax.swing.*;
import java.awt.event.*;
import java.io.*;

    public class NotepadEditor extends JFrame implements ActionListener {
        JTextArea textArea;
        JMenuItem newFile, openFile, saveFile, exitApp, cut, copy, paste;

        public NotepadEditor() {
            setTitle("Java Notepad");
            setSize(600, 500);

            textArea = new JTextArea();
            add(new JScrollPane(textArea));

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");

            newFile = new JMenuItem("New");
            openFile = new JMenuItem("Open");
            saveFile = new JMenuItem("Save");
            exitApp = new JMenuItem("Exit");

            cut = new JMenuItem("Cut");
            copy = new JMenuItem("Copy");
            paste = new JMenuItem("Paste");

            fileMenu.add(newFile);
            fileMenu.add(openFile);
            fileMenu.add(saveFile);
            fileMenu.add(exitApp);

            editMenu.add(cut);
            editMenu.add(copy);
            editMenu.add(paste);

            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            setJMenuBar(menuBar);

            newFile.addActionListener(this);
            openFile.addActionListener(this);
            saveFile.addActionListener(this);
            exitApp.addActionListener(this);
            cut.addActionListener(this);
            copy.addActionListener(this);
            paste.addActionListener(this);

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == newFile) {
                    textArea.setText("");
                }
                else if (e.getSource() == openFile) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.showOpenDialog(null);

                    File file = chooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(file));

                    textArea.read(reader, null);
                    reader.close();
                }
                else if (e.getSource() == saveFile) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.showSaveDialog(null);

                    File file = chooser.getSelectedFile();
                    FileWriter writer = new FileWriter(file);

                    writer.write(textArea.getText());
                    writer.close();
                }
                else if (e.getSource() == cut) {
                    textArea.cut();
                }
                else if (e.getSource() == copy) {
                    textArea.copy();
                }
                else if (e.getSource() == paste) {
                    textArea.paste();
                }
                else if (e.getSource() == exitApp) {
                    System.exit(0);
                }
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }

        public static void main(String[] args) {
            new NotepadEditor();
        }
    }


