 public class Cat
    {
        private String name;
        private int age;

        public Cat(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public String speak()
        {
            int randomNum = (int) (Math.random() * 3) + 1;

            if (randomNum == 1)
            {
                return "meow!";
            }
            else if (randomNum == 2)
            {
                return "I'm trying to sleep.";
            }
            else
            {
                return "*purring noise*";
            }
        }

        public void introduce()
        {
            System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
        }
}
