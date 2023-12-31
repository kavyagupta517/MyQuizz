package eu.tutorials.myquizapp

object Constants {


    const val USER_NAME : String = "username"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestion(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Kuwait", "India",
            "Germany", 1
        )
        questionsList.add(que1)



        val que2 = Question(
            2, "What country does this flag belong to",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Kuwait", "India",
            "Belgium", 4
        )

        questionsList.add(que2)


        val que3 = Question(
            3, "What country does this flag belong to",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Germany", "Australia",
            "Belgium", 3
        )

        questionsList.add(que3)


        val que4 = Question(
            3, "What country does this flag belong to",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "London", "India",
            "Brazil", 4
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Germany", "India",
            "Belgium", 2
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to",
            R.drawable.ic_flag_of_new_zealand,
            "New York", "Canada", "New Zealand",
            "Belgium", 3
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to",
            R.drawable.ic_flag_of_india,
            "India", "Fiji", "Denmark",
            "Belgium", 1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Kuwait", "India",
            "Fiji", 4
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Kuwait", "India",
            "Fiji", 2
        )

        questionsList.add(que9)

        return questionsList
}
}
