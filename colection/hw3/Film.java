//Даны 2 класса:
//
//- Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
//
//- Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив, где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
//
//Добавить функционал в кинотеатр таким образом, чтобы можно было:
//
//- добавлять в него новый фильм
//
//- получить все фильмы по переданному году
//
//- получить все фильмы по переданному году и месяцу
//
//- получить все фильмы по переданному жанру
//
//- получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
//
//Учесть следующее:
//
//- в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
//
//- не должен добавляться фильм, если такой уже есть в кинотеатре
//
//Продемонстрировать работу кинотеатра в отдельном классе.
package oop.getcourse.dmdev.colection.hw3;

public class Film {
    private final int id;
    private final int year;
    private final int month;
    private final Genre genre;
    private final double rating;


    public Film(int id, int year, int month, Genre genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }



}
