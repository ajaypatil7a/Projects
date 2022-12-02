/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Admin
 */
public class Selection_frame extends javax.swing.JFrame {

    /**
     * Creates new form Selection_frame
     */
    String first_sub,second_sub,third_sub,fourth_sub,fifth_sub,sixth_sub,year_info,sem_info,div_info,pr_first,pr_second,pr_third,pr_fourth;
    String value_1,value_2,value_3,value_4,value_5,value_6,value_7;
    String pr1_val,pr2_val,pr3_val,pr4_val;
    String sub_teacher1,sub_teacher2,sub_teacher3,sub_teacher4,sub_teacher5,sub_teacher6,pr_sub_teacher1,pr_sub_teacher2,pr_sub_teacher3,pr_sub_teacher4,tps_teacher;
    
    public Selection_frame(String first_sub,String second_sub,String third_sub,String fourth_sub,String fifth_sub,String sixth_sub,String year_info,String sem_info,String div_info,String num1,String num2,String num3,String num4,String num5,String num6,String num7,String pr_first,String pr_second,String pr_third,String pr_fourth,String pr_val_1,String pr_val_2,String pr_val_3,String pr_val_4,String sub_teacher1,String sub_teacher2,String sub_teacher3,String sub_teacher4,String sub_teacher5,String sub_teacher6,String pr_sub_teacher1,String pr_sub_teacher2,String pr_sub_teacher3,String pr_sub_teacher4,String tps_teacher) {
        initComponents();
        
        this.first_sub = first_sub;
        this.second_sub = second_sub;
        this.third_sub = third_sub;
        this.fourth_sub = fourth_sub;
        this.fifth_sub = fifth_sub;
        this.sixth_sub = sixth_sub;
        
        this.year_info = year_info;
        this.sem_info = sem_info;
        this.div_info = div_info;

        this.value_1 = num1;
        this.value_2 = num2;
        this.value_3 = num3;
        this.value_4 = num4;
        this.value_5 = num5;
        this.value_6 = num6;
        this.value_7 = num7;
        
        this.pr_first = pr_first;
        this.pr_second = pr_second;
        this.pr_third = pr_third;
        this.pr_fourth = pr_fourth;
        
        this.pr1_val = pr_val_1;
        this.pr2_val = pr_val_2;
        this.pr3_val = pr_val_3;
        this.pr4_val = pr_val_4;
                
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
        
        main_image();
        setData();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
    }
    public void setData()
    {
        sub1.setText(first_sub);
        sub2.setText(second_sub);
        sub3.setText(third_sub);
        sub4.setText(fourth_sub);
        sub5.setText(fifth_sub);
        sub6.setText(sixth_sub);
        
        year.setText(year_info);
        semester.setText(sem_info);
        division.setText(div_info);
        
        prac_sub1.setText(pr_first);
        prac_sub2.setText(pr_second);
        prac_sub3.setText(pr_third);
        prac_sub4.setText(pr_fourth);
        
        tea1.setText(sub_teacher1);
        tea2.setText(sub_teacher2);
        tea3.setText(sub_teacher3);
        tea4.setText(sub_teacher4);
        tea5.setText(sub_teacher5);
        tea6.setText(sub_teacher6);
        
        tps_tea.setText(tps_teacher);
        
        pr_tea1.setText(pr_sub_teacher1);
        pr_tea2.setText(pr_sub_teacher2);
        pr_tea3.setText(pr_sub_teacher3);
        pr_tea4.setText(pr_sub_teacher4);
        
        if(value_1.equals("0"))
        {
            count1.setText("");
        }
        else
        {
            count1.setText(value_1);
        }
        if(value_2.equals("0"))
        {
            count2.setText("");
        }
        else
        {
            count2.setText(value_2);
        }
        if(value_3.equals("0"))
        {
            count3.setText("");
        }
        else
        {
            count3.setText(value_3);
        }
        if(value_4.equals("0"))
        {
            count4.setText("");
        }
        else
        {
            count4.setText(value_4);
        }
        if(value_5.equals("0"))
        {
            count5.setText("");
        }
        else
        {
            count5.setText(value_5);
        }
        if(value_6.equals("0"))
        {
            count6.setText("");
        }
        else
        {
            count6.setText(value_6);
        }
        if(value_7.equals("0"))
        {
            r1.setText("");
        }
        else
        {
            r1.setText(value_7);
        }
        if(pr1_val.equals("0"))
        {
            rep1.setText("");
        }
        else
        {
            rep1.setText(pr1_val);
        }
        if(pr2_val.equals("0"))
        {
            rep2.setText("");
        }
        else
        {
            rep2.setText(pr2_val);
        }
        if(pr3_val.equals("0"))
        {
            rep3.setText("");
        }
        else
        {
            rep3.setText(pr3_val);
        }
        if(pr4_val.equals("0"))
        {
            rep4.setText("");
        }
        else
        {
            rep4.setText(pr4_val);
        }
        
    }
    public void saveData()
    {
       if(sub1.getText().equals("")&&count1.getText().equals(""))
        {
           value_1="0"; 
        }
        else
        {
           value_1=count1.getText(); 
        }
        if(sub2.getText().equals("")&&count2.getText().equals(""))
        {
           value_2="0";
        }
        else
        {
           value_2=count2.getText(); 
        }
        if(sub3.getText().equals("")&&count3.getText().equals(""))
        {
           value_3="0";
        }
        else
        {
           value_3=count3.getText(); 
        }
        if(sub4.getText().equals("")&&count4.getText().equals(""))
        {
           value_4="0";
        }
        else
        {
           value_4=count4.getText(); 
        }
        if(sub5.getText().equals("")&&count5.getText().equals(""))
        {
           value_5="0"; 
        }
        else
        {
           value_5=count5.getText(); 
        }
        if(sub6.getText().equals("")&&count6.getText().equals(""))
        {
           value_6="0"; 
        }
        else
        {
           value_6=count6.getText(); 
        }
        if(r1.getText().equals(""))
        {
           value_7="0"; 
        }
        else
        {
           value_7=r1.getText(); 
        }
        if(prac_sub1.getText().equals("")&&rep1.getText().equals(""))
        {
            pr1_val="0";
        }
        else
        {
            pr1_val=rep1.getText();
        }
        
        if(prac_sub2.getText().equals("")&&rep2.getText().equals(""))
        {
           pr2_val="0"; 
        }
        else
        {
           pr2_val=rep2.getText(); 
        }
        if(prac_sub3.getText().equals("")&&rep3.getText().equals(""))
        {
           pr3_val="0"; 
        }
        else
        {
           pr3_val=rep3.getText(); 
        }
        if(prac_sub4.getText().equals("")&&rep4.getText().equals(""))
        {
           pr4_val="0"; 
        }
        else
        {
           pr4_val=rep4.getText(); 
        }
        first_sub = sub1.getText();
        second_sub = sub2.getText();
        third_sub = sub3.getText();
        fourth_sub = sub4.getText();
        fifth_sub = sub5.getText();
        sixth_sub = sub6.getText();
        
        year_info = year.getText();
        sem_info = semester.getText();
        div_info = division.getText();
        
        pr_first = prac_sub1.getText();
        pr_second = prac_sub2.getText();
        pr_third = prac_sub3.getText();
        pr_fourth = prac_sub4.getText();
        
        sub_teacher1=tea1.getText();
        sub_teacher2=tea2.getText();
        sub_teacher3=tea3.getText();
        sub_teacher4=tea4.getText();
        sub_teacher5=tea5.getText();
        sub_teacher6=tea6.getText();
        
        pr_sub_teacher1=pr_tea1.getText();
        pr_sub_teacher2=pr_tea2.getText();
        pr_sub_teacher3=pr_tea3.getText();
        pr_sub_teacher4=pr_tea4.getText();
        
        tps_teacher=tps_tea.getText();
        
    }
    public void checkData()
    {
        saveData();
        if(year.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Batch Year!");
        }
        else if(semester.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Semester!");
        }
        else if(division.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Division!");
        } 
        else if(sub1.getText().equals("")&&sub2.getText().equals("")&&sub3.getText().equals("")&&sub4.getText().equals("")&&sub5.getText().equals("")&&sub6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subjects ");
        }
        else if(!sub1.getText().equals("")&&count1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition for Subject 1");
        }
        else if(sub1.getText().equals("")&&!count1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subject 1");
        }
        else if(!sub2.getText().equals("")&&count2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition for Subject 2");
        }
        else if(sub2.getText().equals("")&&!count2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subject 2");
        }
        else if(!sub3.getText().equals("")&&count3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition for Subject 3");
        }
        else if(sub3.getText().equals("")&&!count3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subject 3");
        }
         else if(!sub4.getText().equals("")&&count4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition for Subject 4");
        }
        else if(sub4.getText().equals("")&&!count4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subject 4");
        }
        else if(!sub5.getText().equals("")&&count5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition for Subject 5");
        }
        else if(sub5.getText().equals("")&&!count5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subject 5");
        }
         else if(!sub6.getText().equals("")&&count6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition for Subject 6");
        }
        else if(sub6.getText().equals("")&&!count6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Subject 6");
        }
        else if(Integer.parseInt(value_1)>4 ||Integer.parseInt(value_2)>4||Integer.parseInt(value_3)>4||Integer.parseInt(value_4)>4||Integer.parseInt(value_5)>4)
        {
            JOptionPane.showMessageDialog(null,"Weekly Repetition Limit Exceeds Please Enter Value Between 1 to 4 for Proper Time Table Settlement");
        }
        else if(Integer.parseInt(value_6)>3)
        {
            JOptionPane.showMessageDialog(null,"Please Insert Weekly Repetition Value of Subject 6 Between 1 to 3 for Proper Time Table Settlement");
        }
        else if(Integer.parseInt(value_7)>2)
        {
            JOptionPane.showMessageDialog(null,"Technical Project Session Repetition Limit Exceeds Please Enter Value Upto 2 Only");
        }
        else if(!prac_sub1.getText().equals("")&&rep1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Repetition for Practical Subject 1");
        }
        else if(!prac_sub2.getText().equals("")&&rep2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Repetition for Practical Subject 2");
        }
        else if(!prac_sub3.getText().equals("")&&rep3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Repetition for Practical Subject 3");
        }
        else if(!prac_sub4.getText().equals("")&&rep4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Repetition for Practical Subject 4");
        }
        else if(prac_sub1.getText().equals("")&&!rep1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Practical Subject 1");
        }
        else if(prac_sub2.getText().equals("")&&!rep2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Practical Subject 2");
        }
        else if(prac_sub3.getText().equals("")&&!rep3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Practical Subject 3");
        }
        else if(prac_sub4.getText().equals("")&&!rep4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Insert Practical Subject 4");
        }
        else if(Integer.parseInt(pr1_val)>2)
        {
            JOptionPane.showMessageDialog(null,"Practical Subject 1 Repetition Limit Exceeds Please Enter Value Upto 2 Only");
        }
        else if(Integer.parseInt(pr2_val)>2)
        {
            JOptionPane.showMessageDialog(null,"Practical Subject 2 Repetition Limit Exceeds Please Enter Value Upto 2 Only");
        }
        else if(Integer.parseInt(pr3_val)>2)
        {
            JOptionPane.showMessageDialog(null,"Practical Subject 3 Repetition Limit Exceeds Please Enter Value Upto 2 Only");
        }
        else if(Integer.parseInt(pr4_val)>2)
        {
            JOptionPane.showMessageDialog(null,"Practical Subject 4 Repetition Limit Exceeds Please Enter Value Upto 2 Only");
        }
        else
        {
            saveData();
            new TimeTable_Insertion(first_sub,second_sub,third_sub,fourth_sub,fifth_sub,sixth_sub,value_1,value_2,value_3,value_4,value_5,value_6,value_7,year_info,sem_info,div_info,pr_first,pr_second,pr_third,pr_fourth,pr1_val,pr2_val,pr3_val,pr4_val,sub_teacher1,sub_teacher2,sub_teacher3,sub_teacher4,sub_teacher5,sub_teacher6,pr_sub_teacher1,pr_sub_teacher2,pr_sub_teacher3,pr_sub_teacher4,tps_teacher).show();         
            dispose();
        }
        
        
    }
    void main_image()
    {
        BufferedImage  img = null;
        try{
            img = ImageIO.read(new File("images/ses.jpg"));
        }catch(IOException e){
        e.printStackTrace();
        }
       
        Image dimg = img.getScaledInstance(selection_frame_img.getWidth() ,selection_frame_img.getHeight(),Image.SCALE_SMOOTH);
       
        ImageIcon imageIcon = new ImageIcon(dimg);
        selection_frame_img.setIcon(imageIcon);
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
        jLabel2 = new javax.swing.JLabel();
        sub1 = new javax.swing.JTextField();
        sub2 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        count1 = new javax.swing.JTextField();
        count2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sub3 = new javax.swing.JTextField();
        count3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sub4 = new javax.swing.JTextField();
        count4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sub5 = new javax.swing.JTextField();
        count5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sub6 = new javax.swing.JTextField();
        count6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        division = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rep4 = new javax.swing.JTextField();
        prac_sub2 = new javax.swing.JTextField();
        prac_sub3 = new javax.swing.JTextField();
        prac_sub1 = new javax.swing.JTextField();
        rep1 = new javax.swing.JTextField();
        rep2 = new javax.swing.JTextField();
        rep3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        prac_sub4 = new javax.swing.JTextField();
        r1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pr_tea4 = new javax.swing.JTextField();
        pr_tea1 = new javax.swing.JTextField();
        pr_tea2 = new javax.swing.JTextField();
        pr_tea3 = new javax.swing.JTextField();
        tps_tea = new javax.swing.JTextField();
        tea4 = new javax.swing.JTextField();
        tea1 = new javax.swing.JTextField();
        tea2 = new javax.swing.JTextField();
        tea3 = new javax.swing.JTextField();
        tea5 = new javax.swing.JTextField();
        tea6 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        selection_frame_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information Submission Portal");
        setPreferredSize(new java.awt.Dimension(1490, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Subject 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 85, 35));

        sub1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 130, 35));

        sub2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 130, 35));

        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 120, 40));

        count1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(count1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 190, 50, 35));

        count2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(count2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 250, 50, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Subject 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 85, 35));

        sub3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 130, 35));

        count3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(count3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 310, 50, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Subject 4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 85, 35));

        sub4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 130, 35));

        count4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(count4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 370, 50, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Subject 5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 85, 35));

        sub5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(sub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 130, 35));

        count5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(count5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 430, 50, 35));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Subject 6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 85, 35));

        sub6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(sub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 130, 35));

        count6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        count6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count6ActionPerformed(evt);
            }
        });
        jPanel1.add(count6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 490, 50, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lecture Schedule Planner Portal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1358, 70));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Division");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, 35));

        division.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, 35));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Batch Year");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 35));

        year.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 100, 35));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Semester");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 35));

        semester.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 100, 35));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Repetition");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 160, 70, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Weekly");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 140, 50, 20));

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, 120, 40));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 120, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setText("Subject 1");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 85, 35));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("PR Sub 1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 85, 35));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("PR Sub 2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 85, 35));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("PR Sub 3");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 85, 35));

        rep4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep4ActionPerformed(evt);
            }
        });
        jPanel1.add(rep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 50, 35));

        prac_sub2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        prac_sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prac_sub2ActionPerformed(evt);
            }
        });
        jPanel1.add(prac_sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 115, 35));

        prac_sub3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        prac_sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prac_sub3ActionPerformed(evt);
            }
        });
        jPanel1.add(prac_sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 115, 35));

        prac_sub1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        prac_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prac_sub1ActionPerformed(evt);
            }
        });
        jPanel1.add(prac_sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 115, 35));

        rep1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep1ActionPerformed(evt);
            }
        });
        jPanel1.add(rep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 50, 35));

        rep2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep2ActionPerformed(evt);
            }
        });
        jPanel1.add(rep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 50, 35));

        rep3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        rep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep3ActionPerformed(evt);
            }
        });
        jPanel1.add(rep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 50, 35));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Teaching Staff");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 130, 35));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("PR Sub Name");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 115, 35));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setText("PR Sub 4");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 85, 35));

        prac_sub4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        prac_sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prac_sub4ActionPerformed(evt);
            }
        });
        jPanel1.add(prac_sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 115, 35));

        r1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 50, 35));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Repetition");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 80, 35));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Technical Project Session ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 250, 35));

        pr_tea4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(pr_tea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 130, 35));

        pr_tea1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(pr_tea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 130, 35));

        pr_tea2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(pr_tea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 130, 35));

        pr_tea3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(pr_tea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 130, 35));

        tps_tea.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tps_tea, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 130, 35));

        tea4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 370, 130, 35));

        tea1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 130, 35));

        tea2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 250, 130, 35));

        tea3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 310, 130, 35));

        tea5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 430, 130, 35));

        tea6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(tea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 490, 130, 35));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Subject Name");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 130, 35));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Teaching Staff");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 150, 130, 35));

        selection_frame_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(selection_frame_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        checkData();
        
    }//GEN-LAST:event_submitActionPerformed

    private void count6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_count6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_count6ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new Login_frame().show();
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
           year.setText("");
           semester.setText("");
           division.setText("");
           sub1.setText("");
           sub2.setText("");
           sub3.setText("");
           sub4.setText("");
           sub5.setText("");
           sub6.setText("");
           
           count1.setText("");
           count2.setText("");
           count3.setText("");
           count4.setText("");
           count5.setText("");
           count6.setText("");
           
           prac_sub1.setText("");
           prac_sub2.setText("");
           prac_sub3.setText("");
           prac_sub4.setText("");
           
           rep1.setText("");
           rep2.setText("");
           rep3.setText("");
           rep4.setText("");
           
           r1.setText("");
           
           tea1.setText("");
           tea2.setText("");
           tea3.setText("");
           tea4.setText("");
           tea5.setText("");
           tea6.setText("");
           
           pr_tea1.setText("");
           pr_tea2.setText("");
           pr_tea3.setText("");
           pr_tea4.setText("");
           
           tps_tea.setText("");
           
           
           
    }//GEN-LAST:event_clearActionPerformed

    private void rep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep4ActionPerformed

    private void prac_sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prac_sub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prac_sub2ActionPerformed

    private void prac_sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prac_sub3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prac_sub3ActionPerformed

    private void prac_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prac_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prac_sub1ActionPerformed

    private void rep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep1ActionPerformed

    private void rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep2ActionPerformed

    private void rep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rep3ActionPerformed

    private void prac_sub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prac_sub4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prac_sub4ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

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
            java.util.logging.Logger.getLogger(Selection_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selection_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selection_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selection_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selection_frame("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JTextField count1;
    private javax.swing.JTextField count2;
    private javax.swing.JTextField count3;
    private javax.swing.JTextField count4;
    private javax.swing.JTextField count5;
    private javax.swing.JTextField count6;
    private javax.swing.JTextField division;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pr_tea1;
    private javax.swing.JTextField pr_tea2;
    private javax.swing.JTextField pr_tea3;
    private javax.swing.JTextField pr_tea4;
    private javax.swing.JTextField prac_sub1;
    private javax.swing.JTextField prac_sub2;
    private javax.swing.JTextField prac_sub3;
    private javax.swing.JTextField prac_sub4;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField rep1;
    private javax.swing.JTextField rep2;
    private javax.swing.JTextField rep3;
    private javax.swing.JTextField rep4;
    private javax.swing.JLabel selection_frame_img;
    private javax.swing.JTextField semester;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JTextField sub3;
    private javax.swing.JTextField sub4;
    private javax.swing.JTextField sub5;
    private javax.swing.JTextField sub6;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tea1;
    private javax.swing.JTextField tea2;
    private javax.swing.JTextField tea3;
    private javax.swing.JTextField tea4;
    private javax.swing.JTextField tea5;
    private javax.swing.JTextField tea6;
    private javax.swing.JTextField tps_tea;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
