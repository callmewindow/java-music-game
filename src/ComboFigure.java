import javax.swing.*;

/** 
* @ClassName: ComboFigure 
* @Description: combo等的数字组件类
* @author Zhang Yuxuan
* @date 2019年6月5日 下午6:44:09 
*  
*/
public class ComboFigure {
    /** 
    * @Fields figureIcons : 0~9的ImageIcon对象
    */
    static ImageIcon[] figureIcons = { new ImageIcon("src/image/fig0.png"),
            new ImageIcon("src/image/fig1.png"),
            new ImageIcon("src/image/fig2.png"),
            new ImageIcon("src/image/fig3.png"),
            new ImageIcon("src/image/fig4.png"),
            new ImageIcon("src/image/fig5.png"),
            new ImageIcon("src/image/fig6.png"),
            new ImageIcon("src/image/fig7.png"),
            new ImageIcon("src/image/fig8.png"), 
            new ImageIcon("src/image/fig9.png") };
    
    /** 
    * @Fields comboFigure1 : combo计数个位的数字
    */
    public static JLabel[] comboFigure1 = { new JLabel(figureIcons[0]),
            new JLabel(figureIcons[1]),
            new JLabel(figureIcons[2]),
            new JLabel(figureIcons[3]), 
            new JLabel(figureIcons[4]),
            new JLabel(figureIcons[5]),
            new JLabel(figureIcons[6]),
            new JLabel(figureIcons[7]),
            new JLabel(figureIcons[8]),
            new JLabel(figureIcons[9]) };

    /** 
    * @Fields comboFigure10 : combo计数十位的数字
    */
    public static JLabel[] comboFigure10 = { new JLabel(figureIcons[0]),
            new JLabel(figureIcons[1]),
            new JLabel(figureIcons[2]),
            new JLabel(figureIcons[3]), 
            new JLabel(figureIcons[4]),
            new JLabel(figureIcons[5]),
            new JLabel(figureIcons[6]),
            new JLabel(figureIcons[7]),
            new JLabel(figureIcons[8]),
            new JLabel(figureIcons[9]) };

    /** 
    * @Fields comboFigure100 : combo计数百位的数字
    */
    public static JLabel[] comboFigure100 = { new JLabel(figureIcons[0]),
            new JLabel(figureIcons[1]),
            new JLabel(figureIcons[2]),
            new JLabel(figureIcons[3]), 
            new JLabel(figureIcons[4]),
            new JLabel(figureIcons[5]),
            new JLabel(figureIcons[6]),
            new JLabel(figureIcons[7]),
            new JLabel(figureIcons[8]),
            new JLabel(figureIcons[9]) };

    /** 
    * @Title: addFigure 
    * @Description: 向窗口中添加数字组件
    * @param win 被添加的窗口
    * @return void  
    * @throws 
    */
    public static void addFigure() {
        for (int i = 0; i < 10; i++) {
            comboFigure1[i].setVisible(false);
            comboFigure10[i].setVisible(false);
            comboFigure100[i].setVisible(false);
            PageController.win.getContentPane().add(comboFigure1[i]);
            PageController.win.getContentPane().add(comboFigure10[i]);
            PageController.win.getContentPane().add(comboFigure100[i]);
            comboFigure1[i].setBounds(229, 370, 34, 86);
            comboFigure10[i].setBounds(193, 370, 34, 86);
            comboFigure100[i].setBounds(157, 370, 34, 86);
        }
        comboFigure1[0].setVisible(true);
        comboFigure10[0].setVisible(true);
        comboFigure100[0].setVisible(true);
    }
}
