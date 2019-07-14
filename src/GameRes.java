import javax.swing.*;
import java.applet.*;
import java.io.*;
import java.net.*;

/** 
* @ClassName: GameRes 
* @Description: 游戏主要功能所需资源
* @author Zhang Yuxuan
* @date 2019年6月5日 下午9:14:19 
*  
*/
public class GameRes {
    /** 
    * @Fields pecfectIcon : perfect字样组件
    */
    public static JLabel pecfectIcon = new JLabel(new ImageIcon("src/image/perfect.png"));
    /** 
    * @Fields goodIcon : good字样组件
    */
    public static JLabel goodIcon = new JLabel(new ImageIcon("src/image/good.png"));
    /** 
    * @Fields missIcon : miss字样组件
    */
    public static JLabel missIcon = new JLabel(new ImageIcon("src/image/miss.png"));
    /** 
    * @Fields rail : 轨道图片组件
    */
    static JLabel rail = new JLabel(new ImageIcon("src/image/rail.png"));
    /** 
    * @Fields background : 背景图片组件
    */
    static JLabel background = new JLabel(new ImageIcon("src/image/livebg.png"));

    /** 
    * @Fields perfectSound : perfect音效，用数组避免间隔过短无法完全播放
    */
    @SuppressWarnings("deprecation")
    public static AudioClip[] perfectSound = new AudioClip[3];
    /** 
    * @Fields goodSound : good音效，用数组避免间隔过短无法完全播放
    */
    @SuppressWarnings("deprecation")
    public static AudioClip[] goodSound = new AudioClip[3];

    /** 
    * @Fields resultbgm : 结算页面bgm
    */
    @SuppressWarnings("deprecation")
    public static AudioClip resultbgm;

    /** 
    * @Title: load 
    * @Description: 向主窗口中添加相应图片资源、加载音效文件以开始游戏
    * @param @param notes 需要添加的note
    * @return void  
    * @throws 
    */
    @SuppressWarnings("deprecation")
    public static void load(Note[] notes) {
        try {
            URL pecfectUrl = new File("src/sound/perfecthit.wav").toURI().toURL();
            URL goodUrl = new File("src/sound/goodhit.wav").toURI().toURL();
            perfectSound[0] = Applet.newAudioClip(pecfectUrl);
            perfectSound[1] = Applet.newAudioClip(pecfectUrl);
            perfectSound[2] = Applet.newAudioClip(pecfectUrl);
            goodSound[0] = Applet.newAudioClip(goodUrl);
            goodSound[1] = Applet.newAudioClip(goodUrl);
            goodSound[2] = Applet.newAudioClip(goodUrl);
            resultbgm = Applet.newAudioClip(new File("src/sound/resultbgm.wav").toURI().toURL());
        } catch (Exception e) {
        }

        for (int i = 0; i < 20; i++) {
            notes[i] = new Note();
            PageController.win.getContentPane().add(notes[i]);
        }

        pecfectIcon.setVisible(false);
        goodIcon.setVisible(false);
        missIcon.setVisible(false);
        PageController.win.getContentPane().add(pecfectIcon);
        PageController.win.getContentPane().add(goodIcon);
        PageController.win.getContentPane().add(missIcon);
        pecfectIcon.setBounds(950, 300, 300, 75);
        goodIcon.setBounds(950, 300, 300, 75);
        missIcon.setBounds(950, 300, 300, 75);

        ComboFigure.addFigure();

        rail.setVisible(false);
        background.setVisible(false);
        PageController.win.getContentPane().add(rail);
        PageController.win.getContentPane().add(background);
        rail.setBounds(330, 0, 616, 800);
        background.setBounds(0, 0, 1280, 800);
        background.setVisible(true);
        rail.setVisible(true);
    }
}
