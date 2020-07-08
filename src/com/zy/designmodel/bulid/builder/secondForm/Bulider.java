package com.zy.designmodel.bulid.builder.secondForm;

public class Bulider {

    static class Student{
        private String name=null;
        private String gender=null;
        private int age=-1;
        private String id=null;
        private String school=null;
        public Student(StudentBuilder builder){
            this.age = builder.age;
            this.name = builder.name;
            this.id = builder.id;
            this.school = builder.school ;
            this.gender = builder.gender ;
        }

        @Override
        public String toString() {
            return "name->"+name+"__agender->"+gender;
        }

        static class StudentBuilder{
            private String name=null;
            private String gender=null;
            private int age=-1;
            private String id=null;
            private String school=null;

            public StudentBuilder setName(String name){
                this.name=name;
                return this;
            }

            public StudentBuilder setAgender(String gender){
                this.gender=gender;
                return this;
            }

            public StudentBuilder setAge(int age){
                this.age=age;
                return this;
            }

            public StudentBuilder setId(String id) {
                this.id = id;
                return this;
            }
            public StudentBuilder setSchool(String shool){
                this.school=shool;
                return this;
            }

            public Student build(){
                return new Student(this);
            }
            }
        }

    public static void main(String args[]){
        Student a = new Student.StudentBuilder().setAgender("Male").setName("LiHua").build();
        System.out.println(a);
        Student b = new Student.StudentBuilder().setSchool("sc").setAgender("Male").setName("ZhangSan").build();
        System.out.println(b);
    }
}

