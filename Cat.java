import java.util.Iterator;

// Использование встроенного интерфейса Comparable
public class Cat extends Breed implements Comparable<Cat>, Iterator<String> {
    public String nickName;
    public String breed;
    public String color;
    public int age;
    public int weight;

    public Cat(String nickName,
            String breed,
            String color,
            int age,
            int weight) {
        this.nickName = nickName;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    public String catName() {
        return String.format("%s", nickName);
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s порода: %s возраст: %d цвет: %s вес: %d", nickName, breed, age, color, weight);
    }

    @Override
    public int compareTo(Cat o) {
        if (this.weight > o.weight)
            return 1;
        else if (this.weight < o.weight)
            return -1;
        else
            return 0;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 5;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                //return кличка;
                return String.format("Кличка: %s", nickName);
            case 2:
                //return Порода;
                return String.format("Порода: %s", breed);
            case 3:
                //return Возраст;
                return String.format("Возраст: %d", age);
            case 4:
                //return цвет;
                return String.format("Цвет: %d", color);
            default:
                //return вес;
                return String.format("Вес: %d", weight);

        }
    }



}
