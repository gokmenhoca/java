package ders09.interfaces.coklu;

public class Student implements IPerson {
  public String name;
  public String mail;
  public String num;

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setNum(String num) {
    this.num = num;
  }
}
