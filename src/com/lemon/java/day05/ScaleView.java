package com.lemon.java.day05;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.*;

/**
 * 为了尽量让结构清晰，这个.java用来负责界面的渲染
 *
 * @author Frankie To
 *
 *         计算器总体的结构为上下结构，上面是一个显示文本的Text，下面是一个Pane，所以我们可以用一个VBox来吧两个东西装进去
 *         下半部分因为是4*4结构，所以可以用GridPane并且把Button一个个都new出来 因为不只是做一个UI
 *         界面，我们要把button全都new出来做运算
 *
 *
 * =.= 这里被打脸了，这次是赶上学校要交一个计算器的UI的程序，所以想做一个功能基本能实现的简单计算器出来。
 * 因为很少用eclipse，不清楚怎么对文件进行拆分，所以只能将所有东西放在一个.java里。正常工程里应该遵循软件工程的低耦合高聚合的理念来做
 * 不过在这个工程里，也有一点点这种思想的体现，对不同模块的功能，都抽出来尽量做成一个方法或者类。
 * 在以后的实战中这样的代码方便维护和理解。
 */
public class ScaleView extends Application {

    public HBox hbox ;
    public VBox vbox ;
    public TextField tfAns;
    public GridPane gridpane;


    //---------------------------------
    //----------Buttons----------------

    public Button bt_add;
    public Button bt_sub;
    public Button bt_mul;
    public Button bt_div;
    public Button bt_ans;
    public Button bt_0;
    public Button bt_1;
    public Button bt_2;
    public Button bt_3;
    public Button bt_4;
    public Button bt_5;
    public Button bt_6;
    public Button bt_7;
    public Button bt_8;
    public Button bt_9;
    public Button bt_dot;


    public Scene scene ;
    //记录scene的宽高
    public double Height;
    public double Width;

    //----------------------------
    //--------for textfield-------
    String firstInput = "";
    String secondInput = "";
    String ansOutput = "";
    boolean isSecond;
    char operations;
    //这几个变量主要是用来文本的输入输出的
    //输入数分为第一个输入，第二个输入，所以夙瑶两个串来存，然后用一个串ans来更新
    //用一个boolean 变量来记录是否是第二哥输入数，如果是第二个输入的数，则将第一个串跟第二个串变为整形计算输出到ans
    //----------------------------

    //---------------------------------
    @Override
    public void start(Stage arg0) throws Exception {

        //用一个函数initBundles()来对基本控件进行初始化
        //结构上更加清晰
        initBundles();
        initGridPane();
        //----------------------------------------
        scene = new Scene(vbox,330,350);

        initBTSize();
        initListener();

        isSecond = false;

        arg0.setTitle("Calculator!");
        arg0.setScene(scene);
        arg0.show();
    }


    public void initListener() {

        //-----for number buttons-------------
        bt_0.setOnAction(e->{
            if(!isSecond) {
                firstInput+="0";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="0";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_1.setOnAction(e->{
            if(!isSecond) {
                firstInput+="1";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="1";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_2.setOnAction(e->{
            if(!isSecond) {
                firstInput+="2";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="2";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_3.setOnAction(e->{
            if(!isSecond) {
                firstInput+="3";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="3";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_4.setOnAction(e->{
            if(!isSecond) {
                firstInput+="4";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="4";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_5.setOnAction(e->{
            if(!isSecond) {
                firstInput+="5";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="5";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_6.setOnAction(e->{
            if(!isSecond) {
                firstInput+="6";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="6";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_7.setOnAction(e->{
            if(!isSecond) {
                firstInput+="7";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="7";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_8.setOnAction(e->{
            if(!isSecond) {
                firstInput+="8";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="8";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        bt_9.setOnAction(e->{
            if(!isSecond) {
                firstInput+="9";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+="9";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });

        bt_dot.setOnAction(e->{
            if(!isSecond) {
                firstInput+=".";
                ansOutput = firstInput;
                tfAns.setText(ansOutput);
            }else {
                secondInput+=".";
                ansOutput = secondInput;
                tfAns.setText(secondInput);
            }
        });
        //------------------------------------
        //-------for operations---------------
        bt_add.setOnAction(e->{
            if(!isSecond) {
                isSecond = true;
                ansOutput += "+";
                operations = '+';
            }
        });
        bt_sub.setOnAction(e->{
            if(!isSecond) {
                isSecond = true;
                ansOutput += "-";
                operations = '-';
            }
        });
        bt_mul.setOnAction(e->{
            if(!isSecond) {
                isSecond = true;
                ansOutput += "*";
                operations = '*';
            }
        });
        bt_div.setOnAction(e->{
            if(!isSecond) {
                isSecond = true;
                ansOutput += "/";
                operations = '/';
            }
        });
        //-------for ansString--------------
        bt_ans.setOnAction(e->{
            //将两个串转成double类型 然后根据不同的operations进行运算
            double firstS = Double.parseDouble(firstInput);
            double secondS = Double.parseDouble(secondInput);
            double ansS = 0.0f;

            if(operations == '+') {
                ansS = firstS+secondS;
            }else if (operations == '-') {
                ansS = firstS - secondS;
            }else if (operations == '*') {
                ansS = firstS * secondS;
            }else if (operations == '/') {
                ansS = firstS / secondS;
            }

            //将ansS转串对tfAns赋值 则完成对结果的显示
            tfAns.setText(ansS+"");
            //完成操作后还要对isSecond标志进行初始化即变为false
            //这里可以再改进一下，将上次的结果变为first串，这样就不用改标志isSecond，但是要加一个ClearButton来清零，表示运算重新开始
            isSecond = false;

            //对两个串进行清零，不然下一个操作的时候会错误
            firstInput = "";secondInput = "";
        });


    }

    /**
     * 该函数用于设置button的大小
     * 思路是从scene里拿到舞台的宽高，然后平分赋值给bt
     */
    public void initBTSize() {
        Height = scene.getHeight();
        Width = scene.getWidth();

        bt_add.setMinSize(Width/4, Width/4);
        bt_sub.setMinSize(Width/4, Width/4);
        bt_mul.setMinSize(Width/4, Width/4);
        bt_div.setMinSize(Width/4, Width/4);
        bt_0.setMinSize(Width/4, Width/4);
        bt_1.setMinSize(Width/4, Width/4);
        bt_2.setMinSize(Width/4, Width/4);
        bt_3.setMinSize(Width/4, Width/4);
        bt_4.setMinSize(Width/4, Width/4);
        bt_5.setMinSize(Width/4, Width/4);
        bt_6.setMinSize(Width/4, Width/4);
        bt_7.setMinSize(Width/4, Width/4);
        bt_8.setMinSize(Width/4, Width/4);
        bt_9.setMinSize(Width/4, Width/4);
        bt_dot.setMinSize(Width/4, Width/4);
        bt_ans.setMinSize(Width/4, Width/4);

    }

    public void initBundles() {

        tfAns = new TextField();
        //禁止text可编辑 然后对button设置监听器
        //这个TextField没有右对齐，需要右对齐的话改用 JTextField (javax.swing.JTextField)
        tfAns.setEditable(false);
        tfAns.setText("0");
        //------------------------------------
        hbox = new HBox();
        gridpane = new GridPane();
        //这两个方法可以设置gridpane里面的元素间的间隙，Vgap是垂直方向，Hgap是竖直方向
        //gridpane.setHgap(4);
        //gridpane.setVgap(4);

        vbox = new VBox(tfAns,gridpane);
        //------------------------------------
        //---------for button-----------------
        bt_add = new Button("+");
        bt_sub = new Button("-");
        bt_mul = new Button("*");
        bt_div = new Button("/");
        bt_0 = new Button("0");
        bt_1 = new Button("1");
        bt_2 = new Button("2");
        bt_3 = new Button("3");
        bt_4 = new Button("4");
        bt_5 = new Button("5");
        bt_6 = new Button("6");
        bt_7 = new Button("7");
        bt_8 = new Button("8");
        bt_9 = new Button("9");
        bt_dot = new Button(".");
        //所有的button一定要new出来，我看了半个钟的exception才找出来,eclipse的检查还是很粗糙的，大家写的时候一定要考虑周全
        bt_ans = new Button("=");

    }

    public void initGridPane() {
        gridpane.add(bt_1, 0,0);
        gridpane.add(bt_2, 1,0);
        gridpane.add(bt_3, 2,0);
        gridpane.add(bt_add, 3,0);
        //-------------------------
        gridpane.add(bt_4, 0,1);
        gridpane.add(bt_5, 1,1);
        gridpane.add(bt_6, 2,1);
        gridpane.add(bt_sub, 3,1);
        //-------------------------
        gridpane.add(bt_7, 0,2);
        gridpane.add(bt_8, 1,2);
        gridpane.add(bt_9, 2,2);
        gridpane.add(bt_mul, 3,2);
        //-------------------------
        gridpane.add(bt_0, 0,3);
        gridpane.add(bt_dot, 1,3);
        gridpane.add(bt_ans, 2,3);
        gridpane.add(bt_div, 3,3);
        //-------------------------


    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}