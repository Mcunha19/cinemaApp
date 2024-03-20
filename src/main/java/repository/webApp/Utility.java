package repository.webApp;

public class Utility {

    static public String RepeatedCharString(String letter, int repetitions){

        String string = "";
        for(int i = 0; i < repetitions; i++){
            string = string.concat(letter);
        }

        return string;
    }

}
