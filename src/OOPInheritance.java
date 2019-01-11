class Person{
        private int age;
        private String address;
        private String FIO;

        public Person(int age, String address, String name){
            this.age=age;
            this.address=address;
            this.FIO=name;

        }
        @Override
        public String toString(){
            return "Ma age is " + this.age+
                    ". I am " + this.FIO+
                    ". I live in " + this.address;
        }

    public int getAge() {
        return age;
    }

        public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}

