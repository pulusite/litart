package tba.jdk.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by zhangdong on 5/2/18.
 *
 * Arrays.sort(T[],Comparator<? super T> c);
 * Collections.sort(List<T> list,Comparator<? super T> c);
 *
 * Comparable是排序接口；若一个类实现了Comparable接口，就意味着“该类支持排序”。实现了Comparable接口的类的对象的列表或数组可以通过Collections.sort或Arrays.sort进行自动排序。
 * 而Comparator是比较器；我们若需要控制某个类的次序，可以建立一个“该类的比较器”来进行排序。Comparator是比较接口，我们如果需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)，那么我们就可以建立一个“该类的比较器”来进行排序，这个“比较器”只需要实现Comparator接口即可。也就是说，我们可以通过实现Comparator来新建一个比较器，然后通过这个比较器对类进行排序。
 *
 * 我们不难发现：Comparable相当于“内部比较器”，而Comparator相当于“外部比较器”。
 *
/**
 * @desc "Comparator"和“Comparable”的比较程序。
 *   (01) "Comparable"
 *   它是一个排序接口，只包含一个函数compareTo()。
 *   一个类实现了Comparable接口，就意味着“该类本身支持排序”，它可以直接通过Arrays.sort() 或 Collections.sort()进行排序。
 *   (02) "Comparator"
 *   它是一个比较器接口，包括两个函数：compare() 和 equals()。
 *   一个类实现了Comparator接口，那么它就是一个“比较器”。其它的类，可以根据该比较器去排序。
 *
 *   综上所述：Comparable是内部比较器，而Comparator是外部比较器。
 *   一个类本身实现了Comparable比较器，就意味着它本身支持排序；若它本身没实现Comparable，也可以通过外部比较器Comparator进行排序。
 */
public class Comparable_tor{

    public static void main(String[] args) {
        // 新建ArrayList(动态数组)
        ArrayList<Person> list = new ArrayList<Person>();
        // 添加对象到ArrayList中
        list.add(new Person("ccc", 20));
        list.add(new Person("AAA", 30));
        list.add(new Person("bbb", 10));
        list.add(new Person("ddd", 40));

        // 打印list的原始序列
        System.out.printf("Original  sort, list:%s\n", list);

        // 对list进行排序
        // 这里会根据“Person实现的Comparable<String>接口”进行排序，即会根据“name”进行排序
        Collections.sort(list);
        System.out.printf("Name      sort, list:%s\n", list);

        // 通过“比较器(AscAgeComparator)”，对list进行排序
        // AscAgeComparator的排序方式是：根据“age”的升序排序
        Collections.sort(list, new AscAgeComparator());
        System.out.printf("Asc(age)  sort, list:%s\n", list);

        // 通过“比较器(DescAgeComparator)”，对list进行排序
        // DescAgeComparator的排序方式是：根据“age”的降序排序
        Collections.sort(list, new DescAgeComparator());
        System.out.printf("Desc(age) sort, list:%s\n", list);

        // 判断两个person是否相等
        testEquals();
    }

    /**
     * @desc 测试两个Person比较是否相等。
     *   由于Person实现了equals()函数：若两person的age、name都相等，则认为这两个person相等。
     *   所以，这里的p1和p2相等。
     *
     *   TODO：若去掉Person中的equals()函数，则p1不等于p2
     */
    private static void testEquals() {
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        if (p1.equals(p2)) {
            System.out.printf("%s EQUAL %s\n", p1, p2);
        } else {
            System.out.printf("%s NOT EQUAL %s\n", p1, p2);
        }
    }

    /**
     * @desc Person类。
     *       Person实现了Comparable接口，这意味着Person本身支持排序
     */
    private static class Person implements Comparable<Person>{
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return name + " - " +age;
        }

        /**
         * 比较两个Person是否相等：若它们的name和age都相等，则认为它们相等
         */
        boolean equals(Person person) {
            if (this.age == person.age && this.name == person.name)
                return true;
            return false;
        }

        /**
         * @desc 实现 “Comparable<String>” 的接口，即重写compareTo<T t>函数。
         *  这里是通过“person的名字”进行比较的
         */
        @Override
        public int compareTo(Person person) {
            return name.compareTo(person.name);
            //return this.name - person.name;
        }
    }

    /**
     * @desc AscAgeComparator比较器
     *       它是“Person的age的升序比较器”
     */
    private static class AscAgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return p1.getAge() - p2.getAge();
        }
    }

    /**
     * @desc DescAgeComparator比较器
     *       它是“Person的age的升序比较器”
     */
    private static class DescAgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return p2.getAge() - p1.getAge();
        }
    }

}
