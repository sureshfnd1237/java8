package src;

//record creates getters, setters, constructor, equals, hashcode and toString() methods automatically.
    public record EmpRecord(int id, String name){
        public static void main(String[] args) {
            EmpRecord emp1 = new EmpRecord(1,"Suresh");
            EmpRecord emp2 = new EmpRecord(2,"Naresh");

            System.out.println(emp1.id());
            System.out.println(emp2.id());

        }
    }

