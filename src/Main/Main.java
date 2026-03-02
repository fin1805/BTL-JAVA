package Main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import View.LoginForm;

public class Main {

    public static void main(String[] args) {

        // 1. Set giao diện giống hệ điều hành
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName()
            );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // 2. Chạy chương trình
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginForm login = new LoginForm();
                login.setLocationRelativeTo(null); // căn giữa màn hình
                login.setVisible(true);
            }
        });
    }
}
