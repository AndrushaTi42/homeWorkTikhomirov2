//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 76379;
            System.out.println("1) Значение dog "+ dog +"; Значение cat "+ cat + "; Значение paper "+ paper+ ".");

            dog = dog +4;
            cat = cat +4;
            paper = paper +4;
            System.out.println("2) Значение dog "+ dog +"; Значение cat "+ cat + "; Значение paper "+ paper+ ".");

            dog = dog -3.5;
            cat = cat -1.6;
            paper = paper -7639;
            System.out.println("3) Значение dog "+ dog +"; Значение cat "+ cat + "; Значение paper "+ paper+ ".");


        System.out.println("Friend:");
        var friend = 19;
        System.out.println( "1)"+ friend);
        friend= friend+2;
        System.out.println( "2)"+friend);
        friend=friend/7;
        System.out.println( "3)"+ friend);


        System.out.println("Frog:");
        var frog = 3.5;
        System.out.println("1)"+frog);
        frog = frog*10;
        System.out.println("2)"+frog);
        frog=frog/3.5;
        System.out.println("3)"+frog);
        frog= frog+4;
        System.out.println("4)"+frog);


        System.out.println("Боксеры:");
        var boxerAlexander= 78.2;
        var boxerNikolai=82.7;
        System.out.println("Александр весит "+ boxerAlexander+"кг, а Николай весит "+ boxerNikolai+"кг.");
        var boxerWeight=boxerAlexander+boxerNikolai;
        System.out.println("Общий вес боксеров "+ boxerWeight+"кг;");
        boxerWeight=boxerNikolai-boxerAlexander;
        System.out.println("Разница в весе между боксерами "+ boxerWeight+ "кг.");

        boxerWeight=boxerNikolai%boxerAlexander;
        System.out.println("Остаток деления: "+ boxerWeight+ ".");


        System.out.println("Сотрудники:");
        var hours = 640;
        var workingHours= 8;
        var worker = hours/workingHours;
        System.out.println("Всего работников в компании - "+ worker+ " человек.");

        worker=worker+94;
        hours=worker*workingHours;
        System.out.println("Если в компании работает "+worker+ " человек, то всего "+ hours+ " часов работы может быть поделено между сотрудниками.");






    }
}
