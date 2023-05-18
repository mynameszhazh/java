package src.collection;

import java.util.*;

public class Stu {
    public int age;

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

    private String name;

    public Stu() {

    }

    public Stu(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public void treeSet() {
        TreeSet<Stu> ts = new TreeSet<Stu>(new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                return o1.age - o2.age;
            }
        });
        Stu s1 = new Stu("xjh", 12);
        Stu s2 = new Stu("xjh2", 13);
        Stu s3 = new Stu("xjh3", 14);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Stu s : ts) {
            System.out.println(s.getName() + ',' + s.getAge());
        }
    }

    public void randomSet() {
        Random r = new Random();
        TreeSet<Integer> tr = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2))
                    return 0;
                return 1;
            }
        });
        while (tr.size() < 20) {
            tr.add(r.nextInt(20) + 1);
        }

        for (Integer integer : tr) {
            System.out.println(integer);
        }
    }

    public void hashMap() {
        HashMap<String, Stu> hash = new HashMap<String, Stu>();
        hash.put("name", new Stu("name", 12));
        Set<String> keySet = hash.keySet();
        for (String key : keySet) {
            System.out.println(key);
            System.out.println(hash.get(key).age);
        }
    }

    public void strCompa() {
        System.out.println("age".compareTo("age"));
    }
}
