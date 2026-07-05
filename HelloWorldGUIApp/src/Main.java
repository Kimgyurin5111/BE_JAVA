import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // 화면 사이즈
                frame.setPreferredSize(new Dimension(800, 800));
                // 출력 밑 글자 정렬
                JLabel label = new JLabel("스윙을 이용한 데스크탑 앱", SwingConstants.CENTER);
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}