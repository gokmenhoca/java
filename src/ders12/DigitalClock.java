package ders12;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
class ClockFrame extends JFrame {
  Calendar         calendar;
  SimpleDateFormat timeFormat;
  SimpleDateFormat dateFormat;
  JLabel           timeLabel;
  JLabel           dateLabel;
  String           time;
  String           date;

  public ClockFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Digital Clock");
    setLayout(new FlowLayout());
    this.setSize(255, 150);
    setResizable(false);
    timeFormat = new SimpleDateFormat("HH:mm:ss");
    dateFormat = new SimpleDateFormat("dd.MM.yyyy EEEE");
    timeLabel  = new JLabel();
    timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
    timeLabel.setForeground(new Color(0x00FF00));
    timeLabel.setBackground(Color.BLACK);
    timeLabel.setOpaque(true);
    dateLabel = new JLabel();
    dateLabel.setFont(new Font("Dialog", Font.PLAIN, 22));
    this.add(timeLabel);
    this.add(dateLabel);
    setVisible(true);
    setTime();
  }

  public void setTime() {
    while (true) {
      time = timeFormat.format(Calendar.getInstance().getTime());
      timeLabel.setText(time);
      date = dateFormat.format(Calendar.getInstance().getTime());
      dateLabel.setText(date);

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("ERROR!: " + e.getLocalizedMessage());
      } finally {
        System.gc();
      }
    }
  }
}

public class DigitalClock {
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    new ClockFrame();
  }
}
