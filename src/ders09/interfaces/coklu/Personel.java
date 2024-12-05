package ders09.interfaces.coklu;

public class Personel implements IPerson, IEmployee {
  public String name;
  public String mail;
  public String dept;
  public String job;

  @Override
  public void setDept(String dept) {
    this.dept = dept;
  }

  @Override
  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setMail(String mail) {
    this.mail = mail;
  }
}
