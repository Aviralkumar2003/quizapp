package com.project.quizapp.model;

import lombok.Data;

@Data
public class QuestionsWrapper {
    private int qid;
    private String question_title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    public QuestionsWrapper(int qid, String question_title, String option1, String option2, String option3,String option4) {
        this.qid = qid;
        this.question_title = question_title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    
    
}
