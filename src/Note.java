import javax.swing.*;

/** 
* @ClassName: Note 
* @Description: note（节奏图标）组件类
* @author Zhang Yuxuan
* @date 2019年6月5日 下午6:42:51 
*  
*/
@SuppressWarnings("serial")
public class Note extends JLabel {
    /** 
    * @Fields noteIcon : 图片资源
    */
    static ImageIcon noteIcon = new ImageIcon("src/image/note.png");
    /** 
    * @Fields x : 横坐标
    */
    public int x;
    /** 
    * @Fields y : 纵坐标
    */
    public int y;

    /** 
    * Title: Note构造器
    * Description: 设置图片、尺寸
    */
    public Note() {
        this.setIcon(noteIcon);
        this.setSize(104, 13);
        this.setVisible(false);
    }

}
