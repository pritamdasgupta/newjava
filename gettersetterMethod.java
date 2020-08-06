package gettersetterMethod;

public class gettersetterMethod {
    public static void main(String[] Args) {
        passingParams PassingParams = new passingParams();
        PassingParams.setName("Pritam");
        System.out.println(PassingParams.getName());
        PassingParams.setAge(23);
        System.out.println(PassingParams.getAge());
        PassingParams.speak();


    }
}

    class passingParams{
        private String name;
        int age;

        public void setName(String name){

            this.name = name;
        }

        public String getName(){

            return name;
        }

        public void setAge(int age){

            this.age = age;
        }

        public int getAge(){

            return age;
        }

        public void speak(){

            System.out.println("My name is " + this.name + " and My age is " + this.age);

        }

    }

