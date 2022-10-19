public class CatHouse
{
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner)
    {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    public void rollCall()
    {
        if (cat1.getAge() > cat2.getAge())
        {
            cat1.introduce();
            cat2.introduce();
        }
        else if (cat2.getAge() > cat1.getAge())
        {
            cat2.introduce();
            cat1.introduce();
        }
        else {
            if ((cat2.getName()).compareTo(cat1.getName()) > 0) {
                cat1.introduce();
                cat2.introduce();
            }
            else if ((cat1.getName()).compareTo(cat2.getName()) < 0) {
                cat2.introduce();
                cat1.introduce();
            }
            else {
                cat1.introduce();
                cat2.introduce();
            }
        }
    }

    public void catNoise()
    {
        cat1.speak();
        cat2.speak();
    }

    // MODIFY this so that it prints each Cat's age next to its name
    // e.g. Cat 1's Name: Petunia, Age: 3
    public String toString()
    {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + "\n";
        str += "Cat 2's Name: " + cat2.getName();

        return str;
    }
}

