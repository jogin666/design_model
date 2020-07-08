package com.zy.designmodel.bulid.protype.deepAndshallow;

public class Animal {
    private String name;
    private Person person;

    public Animal(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    //拷贝构造函数
    //深度拷贝 使用一个已知的对象对新建的实例对象的成员逐个进行赋值（包括引用和非引用）
    public Animal(Animal animal){
        this(animal.name,animal.person);
    }

    public Person getPerson(){
        return this.person;
    }

//    @Override
//    public String toString() {
//        return "name->"+name+"___person->"+person;
//    }

    public static void main(String args[]){
//        Person person=new Person("zhangsan","male","12");
//        Animal animal_1=new Animal("猿类",person);
//        Animal animal_2=new Animal(animal_1);
//        System.out.println(animal_1);
//        System.out.println(animal_2);
//        System.out.println(animal_1.getPerson()==animal_2.getPerson());

            int x,y;

            x=-5;
            System.out.println(Integer.toBinaryString(x));

//            y=x>>>2;

            System.out.println(x);

//        animal_2.person=new Person(animal_1.person);
//        System.out.println(animal_1.getPerson());
//        System.out.println(animal_2.getPerson());

    }
}
