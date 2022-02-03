package com.example.sqoutgeo.models;

public class QuizLibrary {

    private String mQuestions [] = {
            "Apa nama hote yang terdekat dari lokasi Geopark Ciletuh ?",
            "Pantai yang berlokasi di gunung batu yang memiliki pasir silika sebagai khasnya, ialah?",
            "Pantai indah yang berlokasi di desa cimaja yang memiliki pasir putih dan landai, sepi dan bersih,ialah?",
            "Ada berapa Penginapan indah yang dapat pengunjung nikmati di desa Balekambang By Nendi? "

    };


    private String mChoices [][] = {
            {"Villa Batman By Asnap", "OYO 921 Hotel Ratu Pantai", "Vanada Bugeul"},
            {"Pantai Cimaja", "Pantai Pangumbahan", "Pantai Ujung Genteng"},
            {"Pantai Cimaja,", "Pantai Pangumbahan", "Pantai Ujung Genteng"},
            {"4", "3", "5"}
    };



    private String mCorrectAnswers[] = {"Villa Batman By Asnap", "Pantai Pangumbahan", "Pantai Cimaja", "3"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
