package ProgrammingExercises;

public class FavoriteSong {
    public static void main(String[] args){
        System.out.println("Song name: Here with me");
        String[] lyrics = new String[4];
        lyrics[0] = "Watch the sunrise along the coast";
        lyrics[1] = "As we're both getting old";
        lyrics[2] = "I can't describe what I'm feeling";
        lyrics[3] = "And all I know is we're going home";

        for (int i = 0; i < 4; i++ )
        {
            System.out.println(lyrics[i]);
        }
    }
}
