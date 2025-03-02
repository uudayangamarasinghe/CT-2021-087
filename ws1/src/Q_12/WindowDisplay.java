import javax.swing.JFrame;

public class WindowDisplay {
    public static void main(String[] args) {
      
        JFrame mainWindow = new JFrame("My First Window");


        mainWindow.setSize(300, 200);

       
        mainWindow.setLocation(100, 50);


        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        mainWindow.setVisible(true);
    }
}
