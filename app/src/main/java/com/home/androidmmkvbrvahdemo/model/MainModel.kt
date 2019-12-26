package com.home.androidmmkvbrvahdemo.model

class MainModel {

    companion object {
        const val MAIN_POJO = "mainPojo"
    }

    fun getMainPojo(): MainPojo {
        val results = mutableListOf<MainPojo.Result>()
        results.add(
            MainPojo.Result(
                "奮鬥只是一種行動的昭示，而實際的行動卻應該有詳細的計畫，清楚的段落，堅定的意志和力量。\uD83D\uDC4D",
                "一天前"
            )
        )
        results.add(MainPojo.Result("勝利屬於最堅忍的人。\uD83E\uDD17", "二天前"))
        results.add(
            MainPojo.Result(
                "魯莽往往以勇敢的名義出現，但它是另一回事，並不屬於美德；勇敢直接來源於謹慎，而魯莽則出於愚蠢和想當然。\uD83D\uDE06",
                "三天前"
            )
        )
        results.add(MainPojo.Result("怯懦是你最大的敵人，勇敢則是你最好的朋友。\uD83E\uDD1F", "2019-12-21"))
        results.add(MainPojo.Result("就是有九十九個困難，只要有一個堅強的意志就不困難。\uD83D\uDCA4", "2019-12-20"))
        results.add(MainPojo.Result("勇氣通往天堂，怯懦通往地獄。\uD83D\uDC7F", "2019-12-19"))
        results.add(
            MainPojo.Result(
                "英勇是一種力量，但不是腿部和臂部的力量，而是心靈和靈魂的力量，這力量並不存在於戰馬和武器價值之中，而是存在於我們自身之中。\uD83D\uDC68\u200D✈️",
                "2019-12-18"
            )
        )
        results.add(
            MainPojo.Result(
                "剛強的人儘管在內心很激動，但他們的見解和信念卻像在暴風雨中顛簸船上的羅盤指針，仍能準確地指出方向。\uD83D\uDE0E",
                "2019-12-17"
            )
        )
        results.add(MainPojo.Result("勇敢的人以生命冒險，不以良心冒險。\uD83D\uDCAC", "2019-12-16"))
        results.add(MainPojo.Result("勇氣就是一種堅韌；正因為它是一種堅韌，才使我們具有任何形式的自我否定和自我戰勝的能力。因而，正是藉助於這上點，勇氣也多少與德行發生了關係。\uD83D\uDD14", "2019-12-15"))
        results.add(MainPojo.Result("當一個人一心一意做好事情的時候，他最終是必然會成功的。\uD83C\uDF08", "2019-12-14"))
        results.add(MainPojo.Result("我認為克服恐懼最好的辦法理應是：面對內心所恐懼的事情，勇往直前地去做，直到成功為止。\uD83E\uDD3C\u200D♂️", "2019-12-13"))
        results.add(MainPojo.Result("勇氣是人類最重要的一種特質，倘若有了勇氣，人類其他的特質自然也就具備了。\uD83C\uDF1F", "2019-12-12"))
        results.add(MainPojo.Result("勇敢是與深思和決斷為伍的。\uD83E\uDD1E", "2019-12-11"))
        results.add(MainPojo.Result("勇敢裡面有天才、力量和魔法。\uD83E\uDDD9\u200D♂️", "2019-12-10"))
        results.add(MainPojo.Result("在膽小怕事和優柔寡斷的人眼中，一切事情都是不可能辦到的。\uD83D\uDE37", "2019-12-09"))
        results.add(MainPojo.Result("成功的第一個條件就是要有決心；而決心要不得迅速、乾脆、果斷、又必須具有成功的信心。\uD83D\uDE4F", "2019-12-08"))
        results.add(MainPojo.Result("一個人的膽子大，才能有作為；畏怯的人，懦弱的人，他雖然沒有身臨其境的危險，但只要一聽到人家的恐嚇言語，早已嚇得不知所措，試問這樣的人可能有什麼建樹呢？\uD83D\uDC65", "2019-12-07"))
        return MainPojo(results)
    }
}