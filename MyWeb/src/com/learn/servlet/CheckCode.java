package com.learn.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckCode")
public class CheckCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int w = 100;
        int h = 50;
        //内存创建图片对象
        BufferedImage img = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        //绘制图片
        Graphics g = img.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,w-1,h-1);
        g.setColor(Color.RED);
        g.drawRect(0,0,w,h);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rm = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            int index = rm.nextInt(str.length());
            char ch = str.charAt(index);
            sb.append(ch);
            g.drawString(ch+"",w/5*i,h/2);
        }
        HttpSession session = req.getSession();
        String ee = new String(sb);
        session.setAttribute("code_session",ee);
        //画干扰线
        g.setColor(Color.GREEN);

        //生成随机坐标点
        for (int i = 0; i < 7; i++) {
            int x1 = rm.nextInt(w);
            int x2 = rm.nextInt(w);
            int y1 = rm.nextInt(h);
            int y2 = rm.nextInt(h);

            g.drawLine(x1,y1,x2,y2);
        }
        //获取随机数的角标
//        int index = rm.nextInt(str.length());
//        char c = str.charAt(index);
//        String c1 = c+"";
//        g.drawString(c1,20,25);

        //输出图片到页面上
        //ImageIO 可以将图片写出到外部，参数1：写出的图片  参数2： 后缀  参数3：关联的输出流

        ServletOutputStream output = resp.getOutputStream();

        ImageIO.write(img,"jpg",output);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
