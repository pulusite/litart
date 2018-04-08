package tba.jihe;

/**
 * Created by zhangdong on 2018/3/7.
 */
public class Person {
    public int age;
    public String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
