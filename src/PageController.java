import java.awt.event.KeyEvent;

import javax.swing.*;

/** 
* @ClassName: PageController 
* @Description: 页面控制
* @author Zhang Yuxuan
* @date 2019年6月8日 下午9:28:59 
*  
*/
public class PageController {

    /** 
    * @Fields win : 主窗口
    */
    public static JFrame win = new JFrame();

    /** 
    * @Fields page : 页面标志位
    */
    public static int page = 0;
    /** 
    * @Fields ret : 返回标志位
    */
    public static boolean ret = false;

    /** 
    * @Fields keyCode1 : 键位1，下同
    */
    public static int keyCode1 = KeyEvent.VK_F;
    public static int keyCode2 = KeyEvent.VK_G;
    public static int keyCode3 = KeyEvent.VK_H;
    public static int keyCode4 = KeyEvent.VK_J;

    /** 
    * @Fields select : 选歌页实例
    */
    Select select = new Select();

    /** 
    * @Fields setting : 设置页实例
    */
    Setting setting = new Setting();

    /** 
    * @Fields help : 帮助页实例
    */
    Help help=new Help();

    /** 
    * Title: PageController
    * Description:  构造器
    */
    public PageController() {
        win.setSize(1280, 835);
        win.setResizable(false);
        win.setVisible(true);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /** 
    * @Title: run 
    * @Description: 开始运行
    * @param  
    * @return void  
    * @throws 
    */
    public void run() {
        while (true) {
            page = 0;
            ret = false;
            Menu.setfoundation();
            Menu.setbutton();
            Menu.setbackground();
            Menu.moveimage();
            while (true) {
                if (page != 0) {
                    break;
                }
            }
            if (page == 1) {
                select.selectInit();
                while (true) {
                    System.out.print("");
                    if (ret) {
                        break;
                    }
                }
            }
            if (page == 2) {
                setting.setInit();
                while (true) {
                    System.out.print("");
                    if (ret) {
                        break;
                    }
                }
            }
            if (page == 3) {
                help.helpInit();
                while (true) {
                    System.out.print("");
                    if (ret) {
                        break;
                    }
                }
            }
        }
    }

}
