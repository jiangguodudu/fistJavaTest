import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameTest {

    static Frame frm = new Frame("FrameTest");
    static Label lb = new Label("南京审计大学");
    static TextField txt1 = new TextField("Editable");
    static TextField txt2 = new TextField("unEditable");
    static Button btn1 = new Button("请按我");
    static Button btn2 = new Button("绿色");
    static Button btn3 = new Button("结束");

    static Checkbox cb1 = new Checkbox("Java");
    static Checkbox cb2 = new Checkbox("Python");

    static List lst = new List();
    static Choice ch = new Choice();

    static MenuBar mb = new MenuBar();
    static Menu menu1 = new Menu("File");
    static Menu menu2 = new Menu("Edit");
    static MenuItem mI1_1 = new MenuItem("New");
    static MenuItem mI1_2 = new MenuItem("Save");
    static MenuItem mI1_3 = new MenuItem("Exit");
    static MenuItem mI2_1 = new MenuItem("Copy");
    static MenuItem mI2_2 = new MenuItem("Paste");

    // 担任时间倾听者和拥有时间处理着
    static class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str = e.getActionCommand();
            if (str.equals("请按我")) {
                frm.setBackground(Color.gray);
            } else if (str.equals("绿色")) {
                frm.setBackground(Color.green);
            } else {
                System.exit(0);
            }

        }
    }

    static class MyItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Checkbox cb = (Checkbox) e.getSource();
            if (cb == cb1) {
                lb.setText("你最爱的是：Java");
            } else if (cb == cb2) {
                lb.setText("你最爱的是：Python");
            }
        }
    }

    public static void main(String[] args) {
        frm.setLayout(new FlowLayout());
        frm.setSize(200, 152);
        frm.setBackground(Color.yellow);
        frm.setLocation(200, 100);

        frm.setName("myWin");
        lb.setForeground(Color.BLUE);
        lb.setAlignment(Label.CENTER);
        lb.setFont(new Font("Microsoft Yahei", Font.BOLD+Font.ITALIC, 20));
        frm.add(lb);
        txt1.setBounds(30, 40, 150, 20);
        txt2.setBounds(30, 80, 150, 20);
        txt2.setEditable(false);
        frm.add(txt1);
        frm.add(txt2);

        btn1.addActionListener(new MyListener());
        btn2.addActionListener(new MyListener());
        btn3.addActionListener(new MyListener());

        cb1.setCheckboxGroup(new CheckboxGroup());
        cb2.setCheckboxGroup(new CheckboxGroup());
        cb1.addItemListener(new MyItemListener());
        cb2.addItemListener(new MyItemListener());
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(cb1);
        frm.add(cb2);

        lst.add("南京大学");
        lst.add("东南大学");
        lst.add("南京审计大学");
        lst.add("南京农业大学");
        lst.add("南京理工大学");
        lst.select(0);
        frm.add(lst);

        ch.add("南京大学");
        ch.add("东南大学");
        ch.add("南京审计大学");
        ch.add("南京农业大学");
        ch.add("南京理工大学");
        ch.select(0);
        frm.add(ch);

        mb.add(menu1);
        mb.add(menu2);
        menu1.add(mI1_1);
        menu1.add(mI1_2);
        menu1.addSeparator();
        menu1.add(mI1_3);
        menu2.add(mI2_1);
        menu2.add(mI2_2);
        frm.setMenuBar(mb);
        frm.setVisible(true);

        System.out.println("窗口x轴坐标：" + frm.getX());
        System.out.println("窗口y轴坐标：" + frm.getY());
        System.out.println("窗口高度：" + frm.getHeight());
        System.out.println("窗口宽度：" + frm.getWidth());

        GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontFamilyNames = graphicsEnv.getAvailableFontFamilyNames();
        for (String fontFamilyName:fontFamilyNames) {
            System.out.println(fontFamilyName);
        }
    }
}
