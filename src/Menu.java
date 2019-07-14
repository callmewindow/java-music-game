/**
 * SwingTest
 * @Title Menu.java
 * @Description 当前文件为控制菜单而存在
 * @author wangyuxuan
 * @date 2019/6/7 16:13
 * @version V2.2
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @Class menu
 * @date 2019/6/7 16:13
 * @Description 这是游戏的菜单类，也就是首页
 * @since
 **/
public class Menu {
    /**
     * @Type int
     * @Description 该变量作用为判断组件移动的方向
     */
    public static int which = -1;
    /**
     * @Type javax.swing.JLabel[]
     * @Description 该变量作用为储存移动的彩图组件
     */
    public static JLabel[] img;
    /**
     * @Type double[][]
     * @Description 该变量作用为储存组件移动的距离
     */
    public static double [][] move;
    /**
     * @Title setfoundation
     * @Description 该方法的作用为设置窗口的基础属性
     * @param PageController.win 设置基础属性的窗口
     * @return void 不返回数据
     * @throws
     */
    public static void setfoundation(){
        PageController.win.getContentPane().removeAll();
        PageController.win.getContentPane().repaint();
        which = -1;
        img = new JLabel[4];
        move = new double[4][2];
    }
    /**
     * @Title setbackground
     * @Description 该方法的作用为设置窗口的背景
     * @param PageController.win 设置基础属性的窗口
     * @return void 不返回数据
     * @throws
     */
    public static void setbackground(){
        /**
         * @Type javax.swing.ImageIcon
         * @Description 该变量作用为储存背景图片
         */
        ImageIcon bgimg = new ImageIcon("src/image/menubg.png");
        /**
         * @Type javax.swing.JLabel
         * @Description 该变量作用为将背景图储存在组件中并设置在窗口中
         */
        JLabel bg = new JLabel();
        bg.setSize(1280,800);
        bg.setLocation(0,0);
        bg.setIcon(bgimg);
        bg.setVisible(false);
        PageController.win.getContentPane().add(bg);
        bg.setVisible(true);
    }
    /**
     * @Title setbutton
     * @Description 该方法的作用为窗口添加功能按钮
     * @param PageController.win 添加功能按钮的窗口
     * @return void 不返回数据
     * @throws
     */
    public static void setbutton(){
        /**
         * @Type javax.sPageController.wing.JLabel[]
         * @Description 该变量作用为储存四个功能组件
         */
        JLabel[] func = new JLabel[4];
        /**
         * @Type javax.sPageController.wing.Border
         * @Description 该变量作用为调整组件位置时测试使用
         */
        for(int i = 0;i<4;i++){
            func[i] = new JLabel();
            switch (i){
                case 0:
                    func[i].setSize(250,110);
                    func[i].setLocation(155,105-40);
                    break;
                case 1:
                    func[i].setSize(365,115);
                    func[i].setLocation(425,370-40);
                    break;
                case 2:
                    func[i].setSize(265,110);
                    func[i].setLocation(975,380-40);
                    break;
                case 3:
                    func[i].setSize(265,110);
                    func[i].setLocation(930,705-25);
                    break;
                default:
                        break;
            }
            PageController.win.getContentPane().add(func[i]);
        }
        addfunction(func);
    }
    /**
     * @Title addfunction
     * @Description 该方法的作用为通过添加监听器为按钮添加不同的功能
     * @param func func为添加监听器的对象数组
     * @return void  不返回数据
     * @throws
     */
    public static void addfunction(JLabel[] func){
        /**
         * @Type javax.sPageController.wing.JLabel
         * @Description 该变量作用为储存不同背景图用于切换
         */
        JLabel bg = new JLabel();
        bg.setBounds(0,0,1280,800);
        for(int i = 0;i<4;i++){
            switch (i){
                case 0:
                    func[i].addMouseListener(new MouseAdapter() {
                        /**
                         * @Title mouseClicked
                         * @Description 该重写方法的作用为对应的点击事件，运行动画准备跳转
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            which = 0;
                            img = setimage();
                        }
                        /**
                         * @Title mouseEntered
                         * @Description 该重写方法的作用为对应的鼠标进入事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg0.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                        /**
                         * @Title: mouseExited
                         * @Description 该重写方法的作用为对应的鼠标离开事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseExited(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                    });
                    break;
                case 1:
                    func[i].addMouseListener(new MouseAdapter() {
                        /**
                         * @Title mouseClicked
                         * @Description 该重写方法的作用为对应的点击事件，运行动画准备跳转
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            which = 1;
                            img = setimage();
                        }
                        /**
                         * @Title mouseEntered
                         * @Description 该重写方法的作用为对应的鼠标进入事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg1.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                        /**
                         * @Title: mouseExited
                         * @Description 该重写方法的作用为对应的鼠标离开事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseExited(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                    });
                    break;
                case 2:
                    func[i].addMouseListener(new MouseAdapter() {
                        /**
                         * @Title mouseClicked
                         * @Description 该重写方法的作用为对应的点击事件，运行动画准备跳转
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            which = 2;
                            img = setimage();
                        }
                        /**
                         * @Title mouseEntered
                         * @Description 该重写方法的作用为对应的鼠标进入事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg2.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                        /**
                         * @Title: mouseExited
                         * @Description 该重写方法的作用为对应的鼠标离开事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseExited(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                    });
                    break;
                case 3:
                    func[i].addMouseListener(new MouseAdapter() {
                        /**
                         * @Title mouseClicked
                         * @Description 该重写方法的作用为对应的点击事件，运行动画准备跳转
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            which = 3;
                            img = setimage();
                        }
                        /**
                         * @Title mouseEntered
                         * @Description 该重写方法的作用为对应的鼠标进入事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg3.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                        /**
                         * @Title: mouseExited
                         * @Description 该重写方法的作用为对应的鼠标离开事件，重绘窗口
                         * @param e 鼠标事件
                         * @return void 不返回数据
                         */
                        @Override
                        public void mouseExited(MouseEvent e) {
                            ImageIcon bgimg = new ImageIcon("src/image/menubg.png");
                            bg.setIcon(bgimg);
                            PageController.win.getContentPane().removeAll();
                            PageController.win.getContentPane().repaint();
                            for(int j = 0;j<4;j++){
                                PageController.win.getContentPane().add(func[j]);
                            }
                            PageController.win.getContentPane().add(bg);
                        }
                    });
                    break;
                default:
                        break;
            }
        }

    }
    /**
     * @Title setimage
     * @Description 该方法的作用为浮现彩色图片，微动画做准备
     * @param PageController.win 添加彩图的窗口
     * @return javax.swing.JLabel[] 返回添加的图片数组，准备位置移动
     * @throws
     */
    public static JLabel[] setimage(){
        /**
         * @Type javax.swing.JLabel[]
         * @Description 该变量作用为储存所有的图片组件
         */
        JLabel[] img = new JLabel[4];
        /**
         * @Type javax.swing.ImageIcon
         * @Description 该变量作用为储存不同图片
         */
        ImageIcon image;
        /**
         * @Type java.awi.Image
         * @Description 该变量作用为后续修改图片大小为根据组件大小改变
         */
        Image imgtemp;
        /**
         * @Type int
         * @Description 该变量作用为两次循环最为循环量使用
         */
        int i;
        for(i = 0;i<4;i++){
            img[i] = new JLabel();
            switch (i){
                case 0:
                    img[i].setSize(100,100);
                    img[i].setLocation(155+3,105-40+3);
                    image = new ImageIcon("src/image/nozomi.png");
                    imgtemp = image.getImage().getScaledInstance(img[i].getWidth(),img[i].getHeight(),1);
                    image = new ImageIcon(imgtemp);
                    img[i].setIcon(image);
                    break;
                case 1:
                    img[i].setSize(100,100);
                    img[i].setLocation(425,370-40+5);
                    image = new ImageIcon("src/image/honoka.png");
                    imgtemp = image.getImage().getScaledInstance(img[i].getWidth(),img[i].getHeight(),1);
                    image = new ImageIcon(imgtemp);
                    img[i].setIcon(image);
                    break;
                case 2:
                    img[i].setSize(100,100);
                    img[i].setLocation(975+3,380-40+7);
                    image = new ImageIcon("src/image/hanayo.png");
                    imgtemp = image.getImage().getScaledInstance(img[i].getWidth(),img[i].getHeight(),1);
                    image = new ImageIcon(imgtemp);
                    img[i].setIcon(image);
                    break;
                case 3:
                    img[i].setSize(100,100);
                    img[i].setLocation(930+5,705-25+2);
                    image = new ImageIcon("src/image/eli.png");
                    imgtemp = image.getImage().getScaledInstance(img[i].getWidth(),img[i].getHeight(),1);
                    image = new ImageIcon(imgtemp);
                    img[i].setIcon(image);
                    break;
                default:
                    break;
            }
        }
        PageController.win.getContentPane().add(img[which]);
        for (i = 0;i<4;i++){
            if(i == which){
                continue;
            }
            PageController.win.getContentPane().add(img[i]);
        }
        setbackground();
        return img;
    }
    /**
     * @Title moveimage
     * @Description 该方法作用为根据指令时令彩图移动到对应的位置
     * @param 
     * @return void 不反悔数据
     * @throws
     */
    public static void moveimage(){
        while(which == -1){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        move = new double[4][2];
        try{
            for(int i = 0;i<4;i++){
                move[i][0] = (double)(img[i].getX() - img[which].getX())/100;
                move[i][1] = (double)(img[i].getY() - img[which].getY())/100;
            }
        }catch(NullPointerException e){
            PageController.win.getContentPane().removeAll();
            PageController.win.getContentPane().repaint();
            setfoundation();
            setbutton();
            setbackground();
            moveimage();
        }
        /**
         * @Type int
         * @Description 该变量作用为令组件按比例逐渐移动
         */
        int i = 100;
        while(i>=0){
            for(int j = 0;j < 4;j++){
                img[j].setLocation((int)(img[which].getX()+i*move[j][0]),(int)(img[which].getY()+i*move[j][1]));
                try{
                    Thread.sleep(2);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            i--;
        }
        //这里添加对应的跳转方法
        switch (which){
            case 0://设置键位
                PageController.page = 2;
                return;
            case 1://开始游戏
                PageController.page = 1;
                return;
            case 2://帮助
                PageController.page = 3;
                return;
            case 3://退出
                System.exit(0);
                break;
            default:
                setfoundation();
                setbutton();
                setbackground();
                moveimage();
                break;
        }
    }
}