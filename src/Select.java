import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/** 
* @ClassName: Select 
* @Description: 选歌界面
* @author Zhang Yuxuan
* @date 2019年6月8日 下午9:11:15 
*  
*/
public class Select {    
    /** 
    * @Fields inGame : 游戏类实例
    */
    InGame inGame = new InGame();
    
    /** 
    * @Fields b : 背景图片
    */
    JLabel b = new JLabel(new ImageIcon("src/image/select.png"));

    /** 
    * @Title: selectInit 
    * @Description: 初始化，加载资源
    * @param  
    * @return void  
    * @throws 
    */
    public void selectInit() {
        PageController.win.getContentPane().removeAll();
        PageController.win.getContentPane().repaint();
        Cover cover1 = new Cover("START-DASH!!");
        PageController.win.getContentPane().add(cover1);
        cover1.setLocation(100, 120);
        cover1.setVisible(true);
        cover1.addMouseListener(new selectListener());
        
        b.setVisible(false);
        PageController.win.add(b);
        b.setBounds(0, 0, 1280, 800);
        b.setVisible(true);
    }

    /** 
    * @ClassName: selectListener 
    * @Description: 鼠标监视器
    * @author Zhang Yuxuan
    * @date 2019年6月8日 下午9:11:40 
    *  
    */
    class selectListener implements MouseListener {

        /*
        * Title: mouseClicked
        *Description: 监视鼠标点击
        * @param e 
        * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent) 
        */
        @Override
        public void mouseClicked(MouseEvent e) {
            PageController.win.getContentPane().removeAll();
            PageController.win.getContentPane().repaint();
            inGame.inGameInit(((Cover) e.getComponent()).audioFilePath, ((Cover) e.getComponent()).scoreFilePath);
            inGame.start();
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
