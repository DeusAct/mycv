import javax.swing.*;
import java.awt.*;

public class Text extends JPanel {

    public void paint(Graphics g){

        formatting(g, "ALEKSANDR RAZDOLSKI", 20);

        formatting(g, "Koorti 19-78 | Tallinn, 13623 | +372 58547705 | aleksandr.razdolski@gmail.com", 40);

        formatting(g, "Objective", 60);
        g.drawString("The main aim of internship in your company is improving my skills in practical way and learn new things to have a success in future work", 10, 80);

        formatting(g, "Education", 100);
        g.drawString("• Tallinn University of Technology - Expected 2020", 10, 120);
        g.drawString("  Telematics and Smart Systems", 10, 140);
        g.drawString("  Relevant courses: Object-oriented programming, Database Systems, Algorithms and Data Structures, Network Application", 10, 160);
        g.drawString("• Lasnamäe Vene Gümnaasium, 2005 – 2017", 10, 180);
        g.drawString("  Relevant courses: Arduino Programming, Web Technologies", 10, 200);

        formatting(g, "Experience:", 220);
        g.drawString("13.06.2017 – 30.06.2017", 10, 240);
        g.drawString("Tuner | Ericsson Eesti AS | Valukoja 8, 101415, Tallinn", 10, 260);
        g.drawString("28.01.2019 – 31.05.2019", 10, 280);
        g.drawString("Teacher assistant | Tallinn University of Technology", 10, 300);

        formatting(g, "Languages", 320);
        g.drawString("• Russian – mother tongue", 10, 340);
        g.drawString("• Estonian – B2", 10, 360);
        g.drawString("• English – B1", 10, 380);

        formatting(g, "Skills", 400);
        g.drawString("C, Python, Java programming language basics", 10, 420);
        g.drawString("Arduino programming", 10, 440);
        g.drawString("SQL basics", 10, 460);
        g.drawString("Have experience in repairing computers, tablets, smartphones and etc", 10, 480);

        formatting(g, "Attendance at conferences, ...", 500);
        g.drawString("28.02.2019 – Inseneripäev in TTÜ Virumaa College", 10,520);
        g.drawString("07.03.2019 – Tulevikuhariduse väljakutsed conference in TTÜ Virumaa College", 10, 540);
        g.drawString("19.03.2019 – TTÜ avatud uste päev. Smart house presentation in Tudengimaja", 10, 560);
        g.drawString("23.03.2019 – Agile Saturday XV", 10, 580);
        g.drawString("07.04.2019 – Reaalainete õhtu 2019 in TTK University of Applied Sciences", 10, 600);
        g.drawString("11.04.2019 - Game Dev Days 2019", 10, 620);
        g.drawString("Twice a month – Devclub", 10, 640);

        formatting(g, "Interests", 660);
        g.drawString("Coding. I am beginner, but I want to know OOP on high level and maybe in the future become Full-stack developer. In my opinion if you do", 10, 680);
        g.drawString("some software from beginning to end and know all aspects of task, then you will get well-crafted software", 10, 700);
        g.drawString("Electronics. From childhood particularly enjoyed in electronics. I like to solder, do some projects based on Arduino and so on. And ", 10, 720);
        g.drawString("sometimes I am sitting till the morning, because I always want to do my task to end. To get a positive result. I do not leave uncompleted task.", 10, 740);
        g.drawString("Cars. Car enthusiast, always want to reach perfection of my 20 years old car. Yes, I am perfectionist. Also I would like to try participate in rally", 10,760);
        g.drawString("Sport. I have 6 year experince in basketball. I tried different kind of sport, but basketball is my favorite one", 10, 780);
    }

    private void formatting(Graphics g, String objective, int i) {
        Font f;
        f = new Font ("Arial", Font.BOLD, 12);
        g.setFont (f);
        g.drawString(objective, 10, i);
        f = new Font ("Arial", Font.PLAIN, 12);
        g.setFont (f);
    }
}
