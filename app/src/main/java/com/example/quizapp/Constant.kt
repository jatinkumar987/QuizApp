package com.example.quizapp

object Constant {
    fun getQuestions(): ArrayList<Question> {
        val questionList=ArrayList<Question>()

        val que1 =Question(
            1,
            "Which company's logo is this?",
            R.drawable.apple,
            optionOne = "Walmart",
            optionTwo = "google",
            optionThree = "Microsoft",
            optionFour = "Apple",
            4
        )
        questionList.add(que1)

    //q2
        val que2 =Question(
            2,
            "Which company's logo is this?",
            R.drawable.google,
            optionOne = "Walmart",
            optionTwo = "google",
            optionThree = "Microsoft",
            optionFour = "Apple",
            2
        )
        questionList.add(que2)

        //q3
        val que3 =Question(
            3,
            "Which company's logo is this?",
            R.drawable.walmart,
            optionOne = "Walmart",
            optionTwo = "google",
            optionThree = "Microsoft",
            optionFour = "Apple",
            1
        )
        questionList.add(que3)


        val que4 =Question(
            4,
            "Which company's logo is this?",
            R.drawable.microsoft,
            optionOne = "Walmart",
            optionTwo = "google",
            optionThree = "Microsoft",
            optionFour = "Apple",
            3
        )
        questionList.add(que4)


        val que5 =Question(
            5,
            "Which company's logo is this?",
            R.drawable.amazon,
            optionOne = "Walmart",
            optionTwo = "google",
            optionThree = "Amazon",
            optionFour = "Apple",
            3
        )
        questionList.add(que5)

        return questionList

    }

}