import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/** 
* @ClassName: Setting 
* @Description: 键位设置
* @author zmx
* @date 2019年6月8日 下午9:07:36 
*  
*/
public class Setting {
    /** 
    * @Fields set : 背景图片
    */
    JLabel set = new JLabel(new ImageIcon("src/image/settings.png"));

    /** 
    * @Fields bt : 返回键图片
    */
    JLabel bt = new JLabel(new ImageIcon("src/image/bt.png"));

    /** 
    * @Fields k1 : 第一个按键的标签，下同
    */
    JLabel k1 = new JLabel("" + (char) PageController.keyCode1, JLabel.CENTER);
    JLabel k2 = new JLabel("" + (char) PageController.keyCode2, JLabel.CENTER);
    JLabel k3 = new JLabel("" + (char) PageController.keyCode3, JLabel.CENTER);
    JLabel k4 = new JLabel("" + (char) PageController.keyCode4, JLabel.CENTER);

    /** 
    * @Fields index : 按键下标
    */
    int index = 1;
    
    /** 
    * @Fields hitListener : 监视器
    */
    HitListener hitListener = new HitListener();
    
    /**
     * @Fields returnListener : 监视器
     */
    ReturnListener returnListener = new ReturnListener();

    /** 
    * @Title: setInit 
    * @Description: 初始化资源
    * @param  
    * @return void  
    * @throws 
    */
    public void setInit() {
        index = 1;

        PageController.win.getContentPane().removeAll();
        PageController.win.getContentPane().repaint();

        k1.setFont(new Font("微软雅黑", Font.PLAIN, 60));
        k2.setFont(new Font("微软雅黑", Font.PLAIN, 60));
        k3.setFont(new Font("微软雅黑", Font.PLAIN, 60));
        k4.setFont(new Font("微软雅黑", Font.PLAIN, 60));

        k1.setVisible(false);
        k2.setVisible(false);
        k3.setVisible(false);
        k4.setVisible(false);

        PageController.win.add(k1);
        PageController.win.add(k2);
        PageController.win.add(k3);
        PageController.win.add(k4);

        k1.setBounds(629, 604, 80, 80);
        k2.setBounds(727, 604, 80, 80);
        k3.setBounds(825, 604, 80, 80);
        k4.setBounds(923, 604, 80, 80);

        k1.setVisible(true);
        k2.setVisible(true);
        k3.setVisible(true);
        k4.setVisible(true);

        bt.setVisible(false);
        bt.addMouseListener(returnListener);
        PageController.win.add(bt);
        bt.setBounds(80, 670, 130, 39);
        bt.setVisible(true);

        set.setVisible(false);
        PageController.win.add(set);
        set.setBounds(0, 0, 1280, 800);
        set.setVisible(true);
        
        PageController.win.addKeyListener(hitListener);
    }

    /** 
    * @ClassName: HitListener 
    * @Description: 键盘监视器
    * @author zmx
    * @date 2019年6月8日 下午9:08:53 
    *  
    */
    class HitListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub

        }

        /*
        * Title: keyPressed
        *Description: 监视哪个键被按下
        * @param e 
        * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent) 
        */
        @Override
        public void keyPressed(KeyEvent e) {
            if (index == 1) {
                PageController.keyCode1 = e.getKeyCode();
                k1.setText("" + (char) PageController.keyCode1);
                index = 2;
            }else if (index == 2) {
                PageController.keyCode2 = e.getKeyCode();
                k2.setText("" + (char) PageController.keyCode2);
                index = 3;
            }else if (index == 3) {
                PageController.keyCode3 = e.getKeyCode();
                k3.setText("" + (char) PageController.keyCode3);
                index = 4;
            }else if (index == 4) {
                PageController.keyCode4 = e.getKeyCode();
                k4.setText("" + (char) PageController.keyCode4);
                index = 1;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub

        }

    }

    /**
     * @ClassName: ReturnListener
     * @Description: 鼠标监视器
     * @author zmx
     * @date 2019年6月8日 下午8:18:31
     * 
     */
    class ReturnListener implements MouseListener {

        /*
         * Title: mouseClicked Description: 点击返回
         * 
         * @param e
         * 
         * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            PageController.ret = true;
            PageController.win.removeKeyListener(hitListener);
            bt.removeMouseListener(returnListener);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }
}
