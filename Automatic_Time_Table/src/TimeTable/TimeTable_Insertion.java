/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TimeTable;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tushar
 */
public class TimeTable_Insertion extends javax.swing.JFrame {

    /**
     * Creates new form TimeTable_Insertion
     */
    String first_sub,second_sub,third_sub,fourth_sub,fifth_sub,sixth_sub,year_info,sem_info,div_info,pr_first,pr_second,pr_third,pr_fourth;
    String num1,num2,num3,num4,num5,num6,num7,pr_val_1,pr_val_2,pr_val_3,pr_val_4;
    String sub_teacher1,sub_teacher2,sub_teacher3,sub_teacher4,sub_teacher5,sub_teacher6,pr_sub_teacher1,pr_sub_teacher2,pr_sub_teacher3,pr_sub_teacher4,tps_teacher;
    
    int value_1,value_2,value_3,value_4,value_5,value_6,value_7;
    int pr1_val,pr2_val,pr3_val,pr4_val;
    
    public TimeTable_Insertion(String first_sub,String second_sub,String third_sub,String fourth_sub,String fifth_sub,String sixth_sub,String value_1,String value_2,String value_3,String value_4,String value_5,String value_6,String value_7,String year_info,String sem_info,String div_info,String pr_first,String pr_second,String pr_third,String pr_fourth,String pr1_val,String pr2_val,String pr3_val,String pr4_val,String sub_teacher1,String sub_teacher2,String sub_teacher3,String sub_teacher4,String sub_teacher5,String sub_teacher6,String pr_sub_teacher1,String pr_sub_teacher2,String pr_sub_teacher3,String pr_sub_teacher4,String tps_teacher) {
        initComponents();
        
        main_image();
        
        this.first_sub = first_sub;
        this.second_sub = second_sub;
        this.third_sub = third_sub;
        this.fourth_sub = fourth_sub;
        this.fifth_sub = fifth_sub;
        this.sixth_sub = sixth_sub;
        
        this.value_1 = Integer.parseInt(value_1);
        this.value_2 = Integer.parseInt(value_2);
        this.value_3 = Integer.parseInt(value_3);
        this.value_4 = Integer.parseInt(value_4);
        this.value_5 = Integer.parseInt(value_5);
        this.value_6 = Integer.parseInt(value_6);
        this.value_7 = Integer.parseInt(value_7);
        
        this.year_info = year_info;
        this.sem_info = sem_info;
        this.div_info = div_info;
        
        this.pr_first = pr_first;
        this.pr_second = pr_second;
        this.pr_third = pr_third;
        this.pr_fourth = pr_fourth;
        
        this.pr1_val = Integer.parseInt(pr1_val);
        this.pr2_val = Integer.parseInt(pr2_val);
        this.pr3_val = Integer.parseInt(pr3_val);
        this.pr4_val = Integer.parseInt(pr4_val);
        
        this.sub_teacher1=sub_teacher1;
        this.sub_teacher2=sub_teacher2;
        this.sub_teacher3=sub_teacher3;
        this.sub_teacher4=sub_teacher4;
        this.sub_teacher5=sub_teacher5;
        this.sub_teacher6=sub_teacher6;
        
        this.pr_sub_teacher1=pr_sub_teacher1;
        this.pr_sub_teacher2=pr_sub_teacher2;
        this.pr_sub_teacher3=pr_sub_teacher3;
        this.pr_sub_teacher4=pr_sub_teacher4;
        
        this.tps_teacher=tps_teacher;
        
        setData();
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    void main_image()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/ses4.jpg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(tt_img.getWidth() ,tt_img.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        tt_img.setIcon(imageIcon);
    }
    public void setData()
    {
        
            year_label.setText(year_info);
            sem_label.setText(sem_info);
            div_label.setText(div_info);
            
            sub1_label.setText(first_sub);
            sub2_label.setText(second_sub);
            sub3_label.setText(third_sub);
            sub4_label.setText(fourth_sub);
            sub5_label.setText(fifth_sub);
            sub6_label.setText(sixth_sub);
            
            pr1_label.setText(pr_first);
            pr2_label.setText(pr_second);
            pr3_label.setText(pr_third);
            pr4_label.setText(pr_fourth);
            
            tea_lab1.setText(sub_teacher1);
            tea_lab2.setText(sub_teacher2);
            tea_lab3.setText(sub_teacher3);
            tea_lab4.setText(sub_teacher4);
            tea_lab5.setText(sub_teacher5);
            tea_lab6.setText(sub_teacher6);
            
            pr_tea_lab1.setText(pr_sub_teacher1);
            pr_tea_lab2.setText(pr_sub_teacher2);
            pr_tea_lab3.setText(pr_sub_teacher3);
            pr_tea_lab4.setText(pr_sub_teacher4);
            
            tps_tea_lab.setText(tps_teacher);
            
            if(!first_sub.equals(""))
            {
                
                    if(value_1==1)
                    {
                        mon_first.setText(first_sub);
                        tues_third.setText("");
                        wed_fourth.setText("");
                        fri_second.setText("");
                        
                    }
                    else if(value_1>1&&value_1<=2)
                    {
                        mon_first.setText(first_sub);
                        tues_third.setText(first_sub);
                        wed_fourth.setText("");
                        fri_second.setText("");
                    }
                    else if(value_1>2&&value_1<=3)
                    {
                        mon_first.setText(first_sub);
                        tues_third.setText(first_sub);
                        wed_fourth.setText(first_sub);
                        fri_second.setText("");
                        
                    }
                    else if(value_1>3&&value_1<=4)
                    {
                        mon_first.setText(first_sub);
                        tues_third.setText(first_sub);
                        wed_fourth.setText(first_sub);
                        fri_second.setText(first_sub);
                        
                    }
                    else
                    {
                        mon_first.setText("");
                        tues_third.setText("");
                        wed_fourth.setText("");
                        fri_second.setText("");
                    }
                    
            }
            if(!second_sub.equals(""))
            {
                
                    if(value_2==1)
                    {
                        mon_third.setText(second_sub);
                        tues_fourth.setText("");
                        thur_first.setText("");
                        sat_first.setText("");
                        
                        
                    }
                    else if(value_2>1&&value_2<=2)
                    {
                        mon_third.setText(second_sub);
                        tues_fourth.setText(second_sub);
                        thur_first.setText("");
                        sat_first.setText("");
                    }
                    else if(value_2>2&&value_2<=3)
                    {
                        mon_third.setText(second_sub);
                        tues_fourth.setText(second_sub);
                        thur_first.setText(second_sub);
                        sat_first.setText("");
                        
                    }
                    else if(value_2>3&&value_2<=4)
                    {
                        mon_third.setText(second_sub);
                        tues_fourth.setText(second_sub);
                        thur_first.setText(second_sub);
                        sat_first.setText(second_sub);
                        
                    }
                    else
                    {
                        mon_third.setText("");
                        tues_fourth.setText("");
                        thur_first.setText("");
                        sat_first.setText("");
                    }
                    
            }
            if(!third_sub.equals(""))
            {
                
                    if(value_3==1)
                    {
                        mon_second.setText(third_sub);
                        tues_fifth.setText("");
                        thur_second.setText("");
                        sat_second.setText("");
                        
                    }
                    else if(value_3>1&&value_3<=2)
                    {
                        mon_second.setText(third_sub);
                        tues_fifth.setText(third_sub);
                        thur_second.setText("");
                        sat_second.setText("");

                    }
                    else if(value_3>2&&value_3<=3)
                    {
                        mon_second.setText(third_sub);
                        tues_fifth.setText(third_sub);
                        thur_second.setText(third_sub);
                        sat_second.setText("");

                        
                    }
                    else if(value_3>3&&value_3<=4)
                    {
                        mon_second.setText(third_sub);
                        tues_fifth.setText(third_sub);
                        thur_second.setText(third_sub);
                        sat_second.setText(third_sub);
                       
                    }
                    else
                    {
                        mon_second.setText("");
                        tues_fifth.setText("");
                        thur_second.setText("");
                        sat_second.setText("");

                    }
                    
            }
            if(!fourth_sub.equals(""))
            {
                    if(value_4==1)
                    {
                        mon_fourth.setText(fourth_sub);
                        tues_sixth.setText("");
                        wed_first.setText("");
                        thur_third.setText("");
                        
                    }
                    else if(value_4>1&&value_4<=2)
                    {
                        mon_fourth.setText(fourth_sub);
                        tues_sixth.setText(fourth_sub);
                        wed_first.setText("");
                        thur_third.setText("");
                    }
                    else if(value_4>2&&value_4<=3)
                    {
                        mon_fourth.setText(fourth_sub);
                        tues_sixth.setText(fourth_sub);
                        wed_first.setText(fourth_sub);
                        thur_third.setText("");
                    }
                    else if(value_4>3&&value_4<=4)
                    {
                        mon_fourth.setText(fourth_sub);
                        tues_sixth.setText(fourth_sub);
                        wed_first.setText(fourth_sub);
                        thur_third.setText(fourth_sub);

                    }
                    else
                    {
                        mon_fourth.setText("");
                        tues_sixth.setText("");
                        wed_first.setText("");
                        thur_third.setText("");

                    }
            }
            if(!fifth_sub.equals(""))
            {
                    if(value_5==1)
                    {
                        tues_second.setText(fifth_sub);
                        wed_third.setText("");
                        thur_fourth.setText("");
                        sat_third.setText("");
                    }
                    else if(value_5>1&&value_5<=2)
                    {
                        tues_second.setText(fifth_sub);
                        wed_third.setText(fifth_sub);
                        thur_fourth.setText("");
                        sat_third.setText("");
                    }
                    else if(value_5>2&&value_5<=3)
                    {
                        tues_second.setText(fifth_sub);
                        wed_third.setText(fifth_sub);
                        thur_fourth.setText(fifth_sub);
                        sat_third.setText("");
                    }
                    else if(value_5>3&&value_5<=4)
                    {
                        tues_second.setText(fifth_sub);
                        wed_third.setText(fifth_sub);
                        thur_fourth.setText(fifth_sub);
                        sat_third.setText(fifth_sub);                      
                    }
                    else
                    {
                        tues_second.setText("");
                        wed_third.setText("");
                        thur_fourth.setText("");
                        sat_third.setText("");
                    }
            }
            if(!sixth_sub.equals(""))
            {
                    if(value_6==1)
                    {
                        tues_first.setText(sixth_sub);
                        wed_second.setText("");
                        fri_first.setText("");
                    }
                    else if(value_6>1&&value_6<=2)
                    {
                        tues_first.setText(sixth_sub);
                        wed_second.setText(sixth_sub);
                        fri_first.setText("");
                    }
                    else if(value_6>2&&value_6<=3)
                    {
                        tues_first.setText(sixth_sub);
                        wed_second.setText(sixth_sub);
                        fri_first.setText(sixth_sub);
                    }
                    else
                    {
                        tues_first.setText("");
                        wed_second.setText("");
                        fri_first.setText("");
                    }
            }
            if(value_7!=0)
            {
                if(value_7==1)
                {
                    tp1_lab1.setText("Technical");
                    tp1_lab2.setText("Project");
                    tp1_lab3.setText("Session");
                    
                    tp2_lab1.setText("");
                    tp2_lab2.setText("");
                    tp2_lab3.setText("");
                    
                }
                else if(value_7>1&&value_7<=2)
                {
                    tp1_lab1.setText("Technical");
                    tp1_lab2.setText("Project");
                    tp1_lab3.setText("Session");
                    
                    tp2_lab1.setText("Technical");
                    tp2_lab2.setText("Project");
                    tp2_lab3.setText("Session");
                    
                }
                else
                {
                    tp1_lab1.setText("");
                    tp1_lab2.setText("");
                    tp1_lab3.setText("");
                    
                    tp2_lab1.setText("");
                    tp2_lab2.setText("");
                    tp2_lab3.setText("");
                }
            }
            if(pr1_val!=0)
            {
                if(pr1_val==1&&pr2_val==1)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText("");
                    pr2222.setText("");
                }
                else if(pr1_val>1&&pr1_val<=2&&pr2_val>1&&pr2_val<=2)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText(pr_first);
                    pr22.setText("[A2&A3]");
                    pr222.setText(pr_second);
                    pr2222.setText("[A1]");
                }
                else if(pr1_val==1&&pr2_val>1&&pr2_val<=2)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText(pr_second);
                    pr2222.setText("[A1]");
                    
                }
                else if(pr1_val>1&&pr1_val<=2&&pr2_val==1)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText(pr_first);
                    pr22.setText("[A2&A3]");
                    pr222.setText("");
                    pr2222.setText("");
                    
                }
                else if(pr1_val==1&&pr2_val==0)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText("");
                    pr1111.setText("");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText("");
                    pr2222.setText("");
                }
                else if(pr1_val==2&&pr2_val==0)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText("");
                    pr1111.setText("");
                    pr2.setText(pr_first);
                    pr22.setText("[A2&A3]");
                    pr222.setText("");
                    pr2222.setText("");
                    
                    
                }
                else
                {
                    pr1.setText("");
                    pr11.setText("");
                    pr111.setText("");
                    pr1111.setText("");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText("");
                    pr2222.setText("");
                }
                
            }
            if(pr2_val!=0)
            {
                if(pr1_val==1&&pr2_val==1)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText("");
                    pr2222.setText("");
                }
                else if(pr1_val>1&&pr1_val<=2&&pr2_val>1&&pr2_val<=2)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText(pr_first);
                    pr22.setText("[A2&A3]");
                    pr222.setText(pr_second);
                    pr2222.setText("[A1]");
                }
                else if(pr1_val==1&&pr2_val>1&&pr2_val<=2)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText(pr_second);
                    pr2222.setText("[A1]");
                    
                }
                else if(pr1_val>1&&pr1_val<=2&&pr2_val==1)
                {
                    pr1.setText(pr_first);
                    pr11.setText("[A1]");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText(pr_first);
                    pr22.setText("[A2&A3]");
                    pr222.setText("");
                    pr2222.setText("");
                    
                }
                else if(pr1_val==0&&pr2_val==1)
                {
                    pr1.setText("");
                    pr11.setText("");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText("");
                    pr2222.setText("");
                }
                else if(pr1_val==0&&pr2_val==2)
                {
                    pr1.setText("");
                    pr11.setText("");
                    pr111.setText(pr_second);
                    pr1111.setText("[A2&A3]");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText(pr_second);
                    pr2222.setText("[A]");
                    
                    
                }
                else
                {
                    pr1.setText("");
                    pr11.setText("");
                    pr111.setText("");
                    pr1111.setText("");
                    pr2.setText("");
                    pr22.setText("");
                    pr222.setText("");
                    pr2222.setText("");
                }
                
            }
            if(pr3_val!=0)
            {
                if(pr3_val==1&&pr4_val==1)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText("");
                    pr4444.setText("");
                }
                else if(pr3_val>1&&pr3_val<=2&&pr4_val>1&&pr4_val<=2)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText(pr_third);
                    pr44.setText("[A1&A2]");
                    pr444.setText(pr_fourth);
                    pr4444.setText("[A3]");
                }
                else if(pr3_val==1&&pr4_val>1&&pr4_val<=2)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText(pr_fourth);
                    pr4444.setText("[A3]");
                    
                }
                else if(pr3_val>1&&pr3_val<=2&&pr4_val==1)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText(pr_third);
                    pr44.setText("[A1&A2]");
                    pr444.setText("");
                    pr4444.setText("");
                    
                }
                else if(pr3_val==1&&pr4_val==0)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText("");
                    pr3333.setText("");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText("");
                    pr4444.setText("");
                }
                else if(pr3_val==2&&pr4_val==0)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText("");
                    pr3333.setText("");
                    pr4.setText(pr_third);
                    pr44.setText("[A1&A2]");
                    pr444.setText("");
                    pr4444.setText("");
                    
                    
                }
                else
                {
                    pr3.setText("");
                    pr33.setText("");
                    pr333.setText("");
                    pr3333.setText("");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText("");
                    pr4444.setText("");
                }
            }
            if(pr4_val!=0)
            {
                if(pr3_val==1&&pr4_val==1)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText("");
                    pr4444.setText("");
                }
                else if(pr3_val>1&&pr3_val<=2&&pr4_val>1&&pr4_val<=2)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText(pr_third);
                    pr44.setText("[A1&A2]");
                    pr444.setText(pr_fourth);
                    pr4444.setText("[A3]");
                }
                else if(pr3_val==1&&pr4_val>1&&pr4_val<=2)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText(pr_fourth);
                    pr4444.setText("[A3]");
                    
                }
                else if(pr3_val>1&&pr3_val<=2&&pr4_val==1)
                {
                    pr3.setText(pr_third);
                    pr33.setText("[A3]");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText(pr_third);
                    pr44.setText("[A1&A2]");
                    pr444.setText("");
                    pr4444.setText("");
                    
                }
                else if(pr3_val==0&&pr4_val==1)
                {
                    pr3.setText("");
                    pr33.setText("");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText("");
                    pr4444.setText("");
                }
                else if(pr3_val==0&&pr4_val==2)
                {
                    pr3.setText("");
                    pr33.setText("");
                    pr333.setText(pr_fourth);
                    pr3333.setText("[A1&A2]");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText(pr_fourth);
                    pr4444.setText("[A3]");
                    
                    
                }
                else
                {
                    pr3.setText("");
                    pr33.setText("");
                    pr333.setText("");
                    pr3333.setText("");
                    pr4.setText("");
                    pr44.setText("");
                    pr444.setText("");
                    pr4444.setText("");
                }
                
            }
            
              
            
            
        
        
        
        
        
    }
    
    public void getData()
    {
        first_sub = mon_first.getText();
        second_sub = mon_third.getText();
        third_sub = mon_second.getText();
        fourth_sub = mon_fourth.getText();
        fifth_sub = tues_second.getText();
        sixth_sub = tues_first.getText();
        
        year_info = year_label.getText();
        sem_info = sem_label.getText();
        div_info = div_label.getText();
        
        num1 = Integer.toString(value_1);
        num2 = Integer.toString(value_2);
        num3 = Integer.toString(value_3);
        num4 = Integer.toString(value_4);
        num5 = Integer.toString(value_5);
        num6 = Integer.toString(value_6);
        num7 = Integer.toString(value_7);
        
        pr_first = pr1.getText();
        pr_second = pr111.getText();
        pr_third = pr3.getText();
        pr_fourth = pr333.getText();
        
        pr_val_1 = Integer.toString(pr1_val);
        pr_val_2 = Integer.toString(pr2_val);
        pr_val_3 = Integer.toString(pr3_val);
        pr_val_4 = Integer.toString(pr4_val);
        
        sub_teacher1=tea_lab1.getText();
        sub_teacher2=tea_lab2.getText();
        sub_teacher3=tea_lab3.getText();
        sub_teacher4=tea_lab4.getText();
        sub_teacher5=tea_lab5.getText();
        sub_teacher6=tea_lab6.getText();
        
        pr_sub_teacher1=pr_tea_lab1.getText();
        pr_sub_teacher2=pr_tea_lab2.getText();
        pr_sub_teacher3=pr_tea_lab3.getText();
        pr_sub_teacher4=pr_tea_lab4.getText();
        
        tps_teacher=tps_tea_lab.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        year_label = new javax.swing.JLabel();
        sem_label = new javax.swing.JLabel();
        div_label = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mon_first = new javax.swing.JTextField();
        tues_first = new javax.swing.JTextField();
        wed_first = new javax.swing.JTextField();
        thur_first = new javax.swing.JTextField();
        fri_first = new javax.swing.JTextField();
        sat_first = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mon_second = new javax.swing.JTextField();
        tues_second = new javax.swing.JTextField();
        wed_second = new javax.swing.JTextField();
        thur_second = new javax.swing.JTextField();
        fri_second = new javax.swing.JTextField();
        sat_second = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mon_third = new javax.swing.JTextField();
        tues_third = new javax.swing.JTextField();
        wed_third = new javax.swing.JTextField();
        thur_third = new javax.swing.JTextField();
        sat_third = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mon_fourth = new javax.swing.JTextField();
        tues_fourth = new javax.swing.JTextField();
        wed_fourth = new javax.swing.JTextField();
        thur_fourth = new javax.swing.JTextField();
        def = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        pr11 = new javax.swing.JLabel();
        pr1 = new javax.swing.JLabel();
        pr111 = new javax.swing.JLabel();
        pr1111 = new javax.swing.JLabel();
        pr2 = new javax.swing.JLabel();
        pr22 = new javax.swing.JLabel();
        pr222 = new javax.swing.JLabel();
        pr2222 = new javax.swing.JLabel();
        pr3 = new javax.swing.JLabel();
        pr33 = new javax.swing.JLabel();
        pr333 = new javax.swing.JLabel();
        pr3333 = new javax.swing.JLabel();
        pr4 = new javax.swing.JLabel();
        pr44 = new javax.swing.JLabel();
        pr444 = new javax.swing.JLabel();
        pr4444 = new javax.swing.JLabel();
        tp1_lab3 = new javax.swing.JLabel();
        tp1_lab2 = new javax.swing.JLabel();
        tp1_lab1 = new javax.swing.JLabel();
        tp2_lab2 = new javax.swing.JLabel();
        tp2_lab3 = new javax.swing.JLabel();
        tp2_lab1 = new javax.swing.JLabel();
        tp1 = new javax.swing.JTextField();
        tues_fifth = new javax.swing.JTextField();
        tp2 = new javax.swing.JTextField();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        p4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tues_sixth = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        previous = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        sub2_label = new javax.swing.JLabel();
        sub3_label = new javax.swing.JLabel();
        sub1_label = new javax.swing.JLabel();
        tea_lab3 = new javax.swing.JLabel();
        tea_lab2 = new javax.swing.JLabel();
        tea_lab1 = new javax.swing.JLabel();
        tea_lab5 = new javax.swing.JLabel();
        tea_lab4 = new javax.swing.JLabel();
        tea_lab6 = new javax.swing.JLabel();
        sub4_label = new javax.swing.JLabel();
        sub5_label = new javax.swing.JLabel();
        sub6_label = new javax.swing.JLabel();
        pr1_label = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tps_tea_lab = new javax.swing.JLabel();
        pr_tea_lab2 = new javax.swing.JLabel();
        pr_tea_lab1 = new javax.swing.JLabel();
        pr3_label = new javax.swing.JLabel();
        pr4_label = new javax.swing.JLabel();
        pr_tea_lab3 = new javax.swing.JLabel();
        pr_tea_lab4 = new javax.swing.JLabel();
        pr2_label = new javax.swing.JLabel();
        tsp_tea_lab1 = new javax.swing.JLabel();
        tt_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Table");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Semester :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Division :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 90, 30));

        year_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(year_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, 30));

        sem_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(sem_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 70, 30));

        div_label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(div_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 50, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Class :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 65, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time Table");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 68));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1368, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sr.No");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Wednesday");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 115, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Monday");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 115, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tuesday");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 115, 35));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thursday");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 115, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Friday");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 115, 35));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Saturday");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 115, 35));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("11:30 - 12:30");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 120, 35));

        mon_first.setEditable(false);
        mon_first.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mon_first.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(mon_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 115, 35));

        tues_first.setEditable(false);
        tues_first.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tues_first.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(tues_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 115, 35));

        wed_first.setEditable(false);
        wed_first.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wed_first.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(wed_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 115, 35));

        thur_first.setEditable(false);
        thur_first.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        thur_first.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(thur_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 115, 35));

        fri_first.setEditable(false);
        fri_first.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fri_first.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(fri_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 115, 35));

        sat_first.setEditable(false);
        sat_first.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sat_first.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(sat_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 70, 115, 35));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 35));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 35));

        mon_second.setEditable(false);
        mon_second.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mon_second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(mon_second, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 115, 35));

        tues_second.setEditable(false);
        tues_second.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tues_second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tues_second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tues_secondActionPerformed(evt);
            }
        });
        jPanel2.add(tues_second, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 115, 35));

        wed_second.setEditable(false);
        wed_second.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wed_second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(wed_second, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 115, 35));

        thur_second.setEditable(false);
        thur_second.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        thur_second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(thur_second, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 115, 35));

        fri_second.setEditable(false);
        fri_second.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fri_second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(fri_second, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, 115, 35));

        sat_second.setEditable(false);
        sat_second.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sat_second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(sat_second, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 120, 115, 35));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 35));

        mon_third.setEditable(false);
        mon_third.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mon_third.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(mon_third, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 115, 35));

        tues_third.setEditable(false);
        tues_third.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tues_third.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(tues_third, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 115, 35));

        wed_third.setEditable(false);
        wed_third.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wed_third.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(wed_third, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 115, 35));

        thur_third.setEditable(false);
        thur_third.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        thur_third.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(thur_third, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 115, 35));

        sat_third.setEditable(false);
        sat_third.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sat_third.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(sat_third, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 170, 115, 35));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("4");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 35));

        mon_fourth.setEditable(false);
        mon_fourth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mon_fourth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(mon_fourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 115, 35));

        tues_fourth.setEditable(false);
        tues_fourth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tues_fourth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(tues_fourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 115, 35));

        wed_fourth.setEditable(false);
        wed_fourth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        wed_fourth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(wed_fourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 115, 35));

        thur_fourth.setEditable(false);
        thur_fourth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        thur_fourth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(thur_fourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 115, 35));

        def.setEditable(false);
        def.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        def.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        def.setText("LG Hour");
        jPanel2.add(def, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 220, 115, 35));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("5");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 35));

        pr11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 110, 20));

        pr1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 110, 20));

        pr111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr111, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 110, 20));

        pr1111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr1111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr1111, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 110, 20));

        pr2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 110, 20));

        pr22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, 110, 20));

        pr222.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr222, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 210, 110, 20));

        pr2222.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr2222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr2222, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 230, 110, 20));

        pr3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 110, 20));

        pr33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 110, 20));

        pr333.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr333.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr333, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 110, 20));

        pr3333.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr3333.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr3333, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 110, 20));

        pr4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, 110, 20));

        pr44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, 110, 20));

        pr444.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr444.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr444, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 310, 110, 20));

        pr4444.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pr4444.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(pr4444, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 330, 110, 20));

        tp1_lab3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp1_lab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tp1_lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 110, 20));

        tp1_lab2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp1_lab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tp1_lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 110, 20));

        tp1_lab1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp1_lab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tp1_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 110, 20));

        tp2_lab2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp2_lab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tp2_lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 110, 20));

        tp2_lab3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp2_lab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tp2_lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 110, 20));

        tp2_lab1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp2_lab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tp2_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 110, 20));

        tp1.setEditable(false);
        tp1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(tp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 115, 85));

        tues_fifth.setEditable(false);
        tues_fifth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tues_fifth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tues_fifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tues_fifthActionPerformed(evt);
            }
        });
        jPanel2.add(tues_fifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 115, 35));

        tp2.setEditable(false);
        tp2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(tp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 115, 85));

        p1.setEditable(false);
        p1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 115, 85));

        p2.setEditable(false);
        p2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 115, 85));

        p3.setEditable(false);
        p3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 115, 85));

        p4.setEditable(false);
        p4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 270, 115, 85));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("6");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, 35));

        tues_sixth.setEditable(false);
        tues_sixth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tues_sixth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tues_sixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tues_sixthActionPerformed(evt);
            }
        });
        jPanel2.add(tues_sixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 115, 35));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("4:45 - 5:45");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, 35));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3:45 - 4:45");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, 35));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("2:30 - 3:30");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, 35));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("1:30 - 2:30");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, 35));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Time");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 35));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("10:30 - 11:30");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, 35));

        previous.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        jPanel2.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 120, 40));

        confirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 120, 40));

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 120, 40));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("TEACHING STAFF");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1400, 25));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("TH");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 30, 110));

        sub2_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(sub2_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 115, 30));

        sub3_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(sub3_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 115, 30));

        sub1_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(sub1_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 115, 30));

        tea_lab3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tea_lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 150, 30));

        tea_lab2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tea_lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 150, 30));

        tea_lab1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tea_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 150, 30));

        tea_lab5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tea_lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 150, 30));

        tea_lab4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tea_lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 150, 30));

        tea_lab6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tea_lab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 150, 30));

        sub4_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(sub4_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 115, 30));

        sub5_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(sub5_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 115, 30));

        sub6_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(sub6_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 115, 30));

        pr1_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr1_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 115, 30));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("PR");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 30, 70));

        tps_tea_lab.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(tps_tea_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 150, 30));

        pr_tea_lab2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr_tea_lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 150, 30));

        pr_tea_lab1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr_tea_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 150, 30));

        pr3_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr3_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 420, 115, 30));

        pr4_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr4_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 460, 115, 30));

        pr_tea_lab3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr_tea_lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 420, 150, 30));

        pr_tea_lab4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr_tea_lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 460, 150, 30));

        pr2_label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(pr2_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 115, 30));

        tsp_tea_lab1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        tsp_tea_lab1.setText("Technical Project Session");
        jPanel2.add(tsp_tea_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 175, 30));
        jPanel2.add(tt_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 680));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1368, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tues_fifthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tues_fifthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tues_fifthActionPerformed

    private void tues_secondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tues_secondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tues_secondActionPerformed

    private void tues_sixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tues_sixthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tues_sixthActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
        getData();
        new Selection_frame(first_sub,second_sub,third_sub,fourth_sub,fifth_sub,sixth_sub,year_info,sem_info,div_info,num1,num2,num3,num4,num5,num6,num7,pr_first,pr_second,pr_third,pr_fourth,pr_val_1,pr_val_2,pr_val_3,pr_val_4,sub_teacher1,sub_teacher2,sub_teacher3,sub_teacher4,sub_teacher5,sub_teacher6,pr_sub_teacher1,pr_sub_teacher2,pr_sub_teacher3,pr_sub_teacher4,tps_teacher).show();
        dispose();
    }//GEN-LAST:event_previousActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        new Login_frame().show();
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Time Table Publish Successfully");
       
    }//GEN-LAST:event_confirmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimeTable_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeTable_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeTable_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeTable_Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeTable_Insertion("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField def;
    private javax.swing.JLabel div_label;
    private javax.swing.JTextField fri_first;
    private javax.swing.JTextField fri_second;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mon_first;
    private javax.swing.JTextField mon_fourth;
    private javax.swing.JTextField mon_second;
    private javax.swing.JTextField mon_third;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JLabel pr1;
    private javax.swing.JLabel pr11;
    private javax.swing.JLabel pr111;
    private javax.swing.JLabel pr1111;
    private javax.swing.JLabel pr1_label;
    private javax.swing.JLabel pr2;
    private javax.swing.JLabel pr22;
    private javax.swing.JLabel pr222;
    private javax.swing.JLabel pr2222;
    private javax.swing.JLabel pr2_label;
    private javax.swing.JLabel pr3;
    private javax.swing.JLabel pr33;
    private javax.swing.JLabel pr333;
    private javax.swing.JLabel pr3333;
    private javax.swing.JLabel pr3_label;
    private javax.swing.JLabel pr4;
    private javax.swing.JLabel pr44;
    private javax.swing.JLabel pr444;
    private javax.swing.JLabel pr4444;
    private javax.swing.JLabel pr4_label;
    private javax.swing.JLabel pr_tea_lab1;
    private javax.swing.JLabel pr_tea_lab2;
    private javax.swing.JLabel pr_tea_lab3;
    private javax.swing.JLabel pr_tea_lab4;
    private javax.swing.JButton previous;
    private javax.swing.JTextField sat_first;
    private javax.swing.JTextField sat_second;
    private javax.swing.JTextField sat_third;
    private javax.swing.JLabel sem_label;
    private javax.swing.JLabel sub1_label;
    private javax.swing.JLabel sub2_label;
    private javax.swing.JLabel sub3_label;
    private javax.swing.JLabel sub4_label;
    private javax.swing.JLabel sub5_label;
    private javax.swing.JLabel sub6_label;
    private javax.swing.JLabel tea_lab1;
    private javax.swing.JLabel tea_lab2;
    private javax.swing.JLabel tea_lab3;
    private javax.swing.JLabel tea_lab4;
    private javax.swing.JLabel tea_lab5;
    private javax.swing.JLabel tea_lab6;
    private javax.swing.JTextField thur_first;
    private javax.swing.JTextField thur_fourth;
    private javax.swing.JTextField thur_second;
    private javax.swing.JTextField thur_third;
    private javax.swing.JTextField tp1;
    private javax.swing.JLabel tp1_lab1;
    private javax.swing.JLabel tp1_lab2;
    private javax.swing.JLabel tp1_lab3;
    private javax.swing.JTextField tp2;
    private javax.swing.JLabel tp2_lab1;
    private javax.swing.JLabel tp2_lab2;
    private javax.swing.JLabel tp2_lab3;
    private javax.swing.JLabel tps_tea_lab;
    private javax.swing.JLabel tsp_tea_lab1;
    private javax.swing.JLabel tt_img;
    private javax.swing.JTextField tues_fifth;
    private javax.swing.JTextField tues_first;
    private javax.swing.JTextField tues_fourth;
    private javax.swing.JTextField tues_second;
    private javax.swing.JTextField tues_sixth;
    private javax.swing.JTextField tues_third;
    private javax.swing.JTextField wed_first;
    private javax.swing.JTextField wed_fourth;
    private javax.swing.JTextField wed_second;
    private javax.swing.JTextField wed_third;
    private javax.swing.JLabel year_label;
    // End of variables declaration//GEN-END:variables
}
