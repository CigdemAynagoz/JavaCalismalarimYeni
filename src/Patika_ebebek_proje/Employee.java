package Patika_ebebek_proje;

public class Employee {
    /*
    Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. Sizden konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.
Sınıfın Nitelikleri
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları
Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
Notlar
raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
tax() fonksiyonu ile sadece salary’i uygulanan vergi hesaplanacak
Toplam maaş: çalışanın kendi maaşı+ bonus
Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.


     */
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() throws Exception {
        if (salary < 1000.0 && salary > 0.0) {
            return 0.0;
        } else if (salary >= 1000.0) {
            return salary * 0.03;
        } else {
            throw new Exception("Invalid salary.");
        }
    }

    public int bonus() throws Exception {
        if (workHours <= 40 && workHours >= 0) {
            return 0;
        } else if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            throw new Exception("Invalid work hours");
        }
    }

    public double raiseSalary() throws Exception {

        if (2021 - hireYear < 10 && 2021 - hireYear >= 0) {
            return (this.salary + bonus() - tax()) * 0.05;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return (this.salary + bonus() - tax()) * 0.1;
        } else if (2021 - hireYear > 19) {
            return (this.salary + bonus() - tax()) * 0.15;
        } else {
            throw new Exception("Invalid hire year.");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return this.hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String toString() {
        return "Employee Name: " + this.name + " Salary: " + this.salary + " Work hours: " + this.workHours + " Hire Year: " + this.hireYear;
    }
}
