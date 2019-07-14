import javax.swing.*;

/** 
* @ClassName: Cover 
* @Description: 选歌界面歌曲封面组件
* @author Zhang Yuxuan
* @date 2019年6月5日 下午9:06:30 
*  
*/
@SuppressWarnings("serial")
public class Cover extends JLabel {
    /** 
    * @Fields coverPic : 封面图片对象
    */
    ImageIcon coverPic;
    /** 
    * @Fields audioFilePath : 对应音频文件路径
    */
    String audioFilePath;
    /** 
    * @Fields scoreFilePath : 对应文本文件路径
    */
    String scoreFilePath;

    /** 
    * Title: Cover构造器
    * Description: 设置图片大小、文件路径
    * @param name 
    */
    public Cover(String name) {
        coverPic = new ImageIcon("src/cover/" + name + ".png");
        audioFilePath = "src/mp3/" + name + ".mp3";
        scoreFilePath = "src/txt/" + name + ".txt";
        this.setIcon(coverPic);
        this.setSize(150, 150);
        this.setVisible(false);
    }
}
