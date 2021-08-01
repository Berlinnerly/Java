/**
 * @Author: Berlinnerly
 * @Package: PACKAGE_NAME
 * @FileName: Test.java
 * @Tools: IntelliJ IDEA
 * @Time: 2021/7/15 9:06
 * @Blog: baigeinanhai.com
 * @Version: 1.0
 * @Description:
 */

class Hero {
    private String name;
    private Integer age;
    private String skill;

    public Hero(String name, Integer age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Skill: " + skill);
    }
}

class Cike extends Hero {
    private String wrop;

    public Cike(String name, Integer age, String skill, String wrop) {
        super(name, age, skill);
        this.wrop = wrop;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Wrop: " + wrop);
    }
}


class Test {
    public static void main(String[] args) {
        Hero hero = new Hero("Berlin", 18, "放逐之刃");
//        hero.display();

        Cike cike = new Cike("金科", 12, "刺秦", "小刀");
//        cike.display();

        Hero h = new Cike("123", 45, "7", "12345");
        h.display();
    }
}
