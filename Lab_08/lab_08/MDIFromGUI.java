package lab_08;
import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane desktopPane;
    private JInternalFrame sf1, sf2, sf3;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, msi1, msi2;
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        ms1 = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        desktopPane = new JDesktopPane();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        sf1 = new JInternalFrame("Application 01", true, true, true, true);
        sf2 = new JInternalFrame("Application 02", true, true, true, true);
        sf3 = new JInternalFrame("Application 03", true, true, true, true);
        sf1.setSize(250, 150);
        sf1.setVisible(true);
        sf2.setSize(250, 200);
        sf2.setVisible(true);
        sf3.setSize(300, 250);
        sf3.setVisible(true);
        sf1.setLocation(30, 350);
        int x2 = sf1.getX() + sf1.getWidth() - 60;
        int y2 = sf1.getY() - 250;
        sf2.setLocation(x2, y2);
        int x3 = sf2.getX() + sf2.getWidth() + 30;
        int y3 = sf1.getY() - 85;
        sf3.setLocation(x3, y3);
        desktopPane.setBackground(Color.BLACK);
        desktopPane.add(sf1);
        desktopPane.add(sf2);
        desktopPane.add(sf3);
        fr.add(desktopPane);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setMinimumSize(new Dimension(850, 600));
        fr.pack();
        fr.setVisible(true);
    }
}
