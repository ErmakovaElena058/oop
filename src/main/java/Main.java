public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate formDate = new FormDate();
        post.name = "Иван";
        post.passport = "4444 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999) 999-99-99";
        post.surname = "Иванов";
        post.subcription = true;
        formDate.day = 13;
        formDate.month = 6;
        formDate.year = 1999;
    }
}
