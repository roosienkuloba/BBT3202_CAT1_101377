package com.baobapps.recipeapp

data class recipes_list(
    var name: String,
    var type: String,
    var servings: Int,
    var difficultyLevel: String,
    var ingredients: List<String>,
    var instructions: String) : CharSequence {
    override val length: Int
        get() = TODO("Not yet implemented")

    override fun get(index: Int): Char {
        TODO("Not yet implemented")
    }

    override fun subSequence(startIndex: Int, endIndex: Int): CharSequence {
        TODO("Not yet implemented")
    }
}

var list_recipes = listOf(
    recipes_list(
        name = "Pizza Quesadilla",
        type = "Lunch",
        servings = 2,
        difficultyLevel = "Intermediate",
        ingredients = listOf(
            "1 TBSP olive oil",
            "6-8 almond flour wraps (I use siete)",
            "2 cups grated zucchini",
            "1 ½ cups grated cauliflower",
            "1 ½ cups shredded cabbage",
            "½ cups peppers chopped",
            "1 cup black olives chopped",
            "1 TBSP dried oregano",
            "1 TBSP dried basil",
            "1 TBSP dried parsley",
            "⅛ TSP hing",
            "¾ cup strained tomatoes",
            "2 TBSP chopped jalapenos (optional)",
            "1 cup grated vegan mozzarella",
            "1 TSP salt"
        ),
        instructions = """
            1. Grate your zucchini and cauliflower, squeeze water out of the zucchini.
            2. Thinly slice your cabbage or use a mandoline to shred it.
            3. Chop your peppers and olives.
            4. Pour the oil into a nonstick pan and heat on a medium flame for a couple of minutes.
            5. Add in your cabbage, salt, and hing, saute for a couple of minutes, then add the rest of the veggies in and stir fry on medium to high heat for 6-8 minutes.
            6. Once soft (I like mine soft but not mushy, so keep an eye on it to make sure you get the texture of veggies you prefer), add in all the dried herbs, strained tomatoes, and 1/2 cup of the mozzarella, and cook on low heat for another 5 minutes.
            7. Heat your cast iron pan or another non-stick pan, spray some oil and toast 2 wraps for a couple of minutes each side till slightly brown, then place a couple of tbsp of the filling onto one wrap, sprinkle over some cheese and place the second wrap over the top and press down with a spatula.
            8. Cook on either side for about 2-3 minutes on medium to high heat till crisp and brown, when you turn the quesadilla over spray some more oil to make sure both sides are crispy.
            9. Eat hot or cold (done both and both taste good, hot and fresh is obviously better though).
        """.trimIndent()
    ),
    recipes_list(
        name = "Rainbow Stir Fry - 15 MIN MEAL",
        type = "Supper",
        servings = 2,
        difficultyLevel = "Beginner",
        ingredients = listOf(
            "1 TBSP sesame oil",
            "1/4 TSP hing",
            "1/2 TBSP grated ginger",
            "2 cups shredded white cabbage",
            "2 cups grated red cabbage",
            "3 cups spirilised zucchini",
            "2 cups spirilised carrots",
            "100g brown rice pad thai noodles",
            "1 TBSP black sesame seeds",
            "SAUCE:",
            "1/2 cup liquid aminos",
            "2.5 TBSP peanut butter",
            "1 TBSP sambal oelek",
            "1/8 agave syrup",
            "2 TBSP rice vinegar",
            "1/2 TBSP sesame oil"
        ),
        instructions = """
            1. Add sesame oil to a wok or frying pan on medium heat
            2. Add hing, grated ginger then all the veggies, stir fry on medium to high heat for 3 minutes then turn down to medium heat and cook for another 10 minutes till cooked ( I like to keep my veggies a little al dente!) 
            3. Meanwhile put your noodles on to cook
            4. Add all sauce ingredients into a jar and give it a good ol shake till its all smooth and mixed together 
            5. drain noodles and rinse in cold water then add the noodles to the veggies and mix, you may not need all the noodles so add as necessary
            6. Pour in the sauce and give it a good mix
            7. garnish with black sesame seeds and cilantro or micro greens 
        """.trimIndent()
    )
)
