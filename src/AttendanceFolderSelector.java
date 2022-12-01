import javax.swing.*;


public class AttendanceFolderSelector extends JFileChooser {

    JFileChooser chooser = new JFileChooser();

    public AttendanceFolderSelector() {

        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        }
        else {
            System.out.println("No Selection ");
        }
    }
}


