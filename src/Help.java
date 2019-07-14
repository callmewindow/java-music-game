import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/** 
* @ClassName: Setting 
* @Description: 键位设置
* @author Zhang Yuxuan
* @date 2019年6月8日 下午9:07:36 
*  
*/
public class Help {
    /** 
    * @Fields h : 背景图片
    */
    JLabel h = new JLabel(new ImageIcon("src/image/help.png"));

    /** 
    * @Fields bt : 返回键
    */
    JLabel bt = new JLabel();

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
    public void helpInit() {
        PageController.win.getContentPane().removeAll();
        PageController.win.getContentPane().repaint();

        bt.setVisible(false);
        bt.addMouseListener(returnListener);
        PageController.win.add(bt);
        bt.setBounds(1057, 530, 184, 68);
        bt.setVisible(true);

        h.setVisible(false);
        PageController.win.add(h);
        h.setBounds(0, 0, 1280, 800);
        h.setVisible(true);
        
    }
    
    /**
     * @ClassName: ReturnListener
     * @Description: 鼠标监视器
     * @author Zhang Yuxuan
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
