package animals;

public abstract class Animal {
    protected String name;
    protected float age;
    protected float weight;
    protected String color;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public float getAge() {

        return age;
    }

    public void setAge(float age) {

        this.age = age;
    }

    public float getWeight() {

        return weight;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void say () {

        System.out.println("Я говорю");
    }
    public void go () {

        System.out.println("Я иду");
    }
    public void drink () {

        System.out.println("Я пью");
    }
    public void eat () {

        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String toString;
        int lastChar =  (int) age%10;
        String outputAgeNoun;
        switch (lastChar) {
            case 2, 3, 4:
            {
                if ( (age >=12) & (age <= 14)) {
                    outputAgeNoun = " лет";
                }
                else {
                    outputAgeNoun = " года";
                }
                break;
            }

            case 1: {          //проверки для возраста больше 100 не приводятся, нецелесообразно для переменной, в которой хранится возраст животного вида кошка/собака/утка
                if (age == 11) {
                    outputAgeNoun = " лет";
                }
                else {
                    outputAgeNoun = " год";
                }
                break;
            }
            default:
            {
                outputAgeNoun = " лет";
            }
        }
        toString = "Привет! Меня зовут " + name + ", мне " + age + outputAgeNoun + ", я вешу " + weight + " кг, мой цвет - " + color + ".";
        return toString;
    }

}
