package POJO;

/**
 * @version 1.0
 * @Author MoDeZunZun
 * @Date 2024/7/8 15:35
 * @注释
 */
public class Person {
    private Integer ID;
    private String name;
    private Integer age;
    private byte sex;

    public Person() {
    }

    public Person(Integer ID, String name, Integer age, byte sex) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }
}
