package com.baobapps.recipeapp

data class Recipes(
    var name: String,
    var type: String,
    var servings: Int,
    var difficultyLevel: String,
    var ingredients: String,
    var instructions: String
    ) : CharSequence {

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
    Recipes(
        name = "Pizza Quesadilla",
        type = "Lunch",
        servings = 2,
        difficultyLevel = "Intermediate",
        ingredients = """
            1 TBSP olive oil
            6-8 almond flour wraps (I use siete)
            2 cups grated zucchini
            1 ½ cups grated cauliflower
            1 ½ cups shredded cabbage
            ½ cups peppers chopped
            1 cup black olives chopped
            1 TBSP dried oregano
            1 TBSP dried basil
            1 TBSP dried parsley
            ⅛ TSP hing
            ¾ cup strained tomatoes
            2 TBSP chopped jalapenos (optional)
            1 cup grated vegan mozzarella
            1 TSP salt
            """.trimIndent(),
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
    Recipes(
        name = "Rainbow Stir Fry - 15 MIN MEAL",
        type = "Supper",
        servings = 2,
        difficultyLevel = "Beginner",
        ingredients = """
            1 TBSP sesame oil
            1/4 TSP hing
            1/2 TBSP grated ginger
            2 cups shredded white cabbage
            2 cups grated red cabbage
            3 cups spirilised zucchini
            2 cups spirilised carrots
            100g brown rice pad thai noodles
            1 TBSP black sesame seeds
            SAUCE:
            1/2 cup liquid aminos
            2.5 TBSP peanut butter
            1 TBSP sambal oelek
            1/8 agave syrup
            2 TBSP rice vinegar
            1/2 TBSP sesame oil
        """.trimIndent(),
        instructions = """
            1. Add sesame oil to a wok or frying pan on medium heat
            2. Add hing, grated ginger then all the veggies, stir fry on medium to high heat for 3 minutes then turn down to medium heat and cook for another 10 minutes till cooked ( I like to keep my veggies a little al dente!) 
            3. Meanwhile put your noodles on to cook
            4. Add all sauce ingredients into a jar and give it a good ol shake till its all smooth and mixed together 
            5. drain noodles and rinse in cold water then add the noodles to the veggies and mix, you may not need all the noodles so add as necessary
            6. Pour in the sauce and give it a good mix
            7. garnish with black sesame seeds and cilantro or micro greens 
        """.trimIndent()
    ),
    Recipes(
        name = "Crispy Cauliflower Tikka Wings",
        type = "Supper",
        servings = 2,
        difficultyLevel = "Beginner",
        ingredients = """
            MARINADE:
            ¼ cup yogurt
            3 tbsp tomato paste
            2 tbsp coconut or avocado oil
            ⅓ cup unsweetened non-dairy milk
            ½ tsp turmeric
            ¼ tsp hing
            1 ½ tbsp garam masala
            2 tsp smokey paprika
            1 tbsp dried fenugreek
            3 tbsp chickpea flour
            1 tsp salt
            COATING:
            2 cups panko breadcrumbs or gd breadcrumbs
        """.trimIndent(),
        instructions = """
            1. preheat oven to 415f 
            2. add all marinade ingredients into a large bowl and whisk till smooth and add breadcrumbs into another bowl 
            3. add a few florets at a time into the marinade and mix evenly coat and shake off excess marinade, you can bake it just like this or throw it into the breadcrumbs and use your dry hand to coat evenly 
            4. place onto a baking tray lined with baking paper and spray with oil and place into the oven for about 20 minutes till golden brown and crispy 
            5. to make the epic tacos try it with my mango salsa, coriander chutney, yoghurt mint sauce and slaw. otherwise just choose your favorite dip and enjoy!
        """.trimIndent()
    ),
    Recipes(
        name = "Chai Coconut Banana Bread",
        type = "Breakfast",
        servings = 6,
        difficultyLevel = "Intermediate",
        ingredients = """
            DRY:
            1 ½ cups of gluten-free flour
            ½ desiccated coconut
            3/4 cup coconut sugar/unrefined brown sugar
            1 tsp baking soda
            1 tbsp Lairds Chai mix
            ½ tsp cardamom powder
            1/2 cup walnuts chopped
            10 dates chopped - super small
            WET:
            ½ cup non-dairy milk
            ½ cup vegan butter melted or soft at room temperature
            3 medium-sized super-ripe almost on its way out bananas
            1 flax egg or egg replacer
        """.trimIndent(),
        instructions = """
            1. Preheat oven to 350F ( 175C ), grease your loaf pans ( 3 small or 1 large one) and prepare your flax egg and leave aside
            2. In a large bow, sift the flour and add the coconut, then add the rest of the dry ingredients 
            3. In a blender, add in the banana and non-dairy milk, mix until smooth but do not over blend.  
            4. Pour the wet into the dry, add in the flax egg and give it a good mix. 
            5. Pour into your banana bread tin or into little muffin cases 
            6. place in the oven for 40- 50 minutes (time will vary depending on your oven and if youre making muffins then 15-20 minutes). Test at 30 minutes with the very technical knife test (aka put a thin knife into the banana bread and if it comes out wet then it's not done. If it comes out dry, ISSA READY)
            7. NOW, I know you smell that divine smell, and you're so excited to eat it, and you just want to have it all hot and warm with butter melted on top...
            BUT WAIT MY FRIEND, JUST WAIT OK...DONT RUIN IT NOW. If you try to remove your banana bread from the pan when it's hot, I guarantee you, it will fall apart and you will be drizzling it with your tears rather than cream! That was a bit dramatic...but sometimes you gotta be cruel to be kind...in the right measure.
            OK SO LET IT SIT FOR ABOUT 10 - 15 MINS then it should pop out easily. 
            9. Serve with some cream, butter or just eat it on its own
        """.trimIndent()

    ),
    Recipes(
        name = "Chai Spiced & Almond Oatmeal",
        type = "Lunch",
        servings = 2,
        difficultyLevel = "Beginner",
        ingredients = """
            1 cup quick cook oats
            1 tsp chai spice
            1/2 tsp cardamom
            2 medjool dates chopped
            1/4 cup water
            2 cups plant based milk
            Topping:
            1 tbsp almond butter
            sprinkle of roasted pumpkin seeds
            sprinkle of shaved almonds
            sprinkle of rose petals
            drizzle of date syrup
        """.trimIndent(),
        instructions = """
           1. Add the oats, chai spice, cardamom, dates and water into a pan and heat on medium flame. 
           2. Once it thickens add in 1 cup of milk, let it cook for about 5 minutes until it thickens again 
           3. Add the remaining milk and continue to cook for another 5-10 minutes till thick and creamy! 
           4. Pour into a bowl and sprinkle your toppings 
        """.trimIndent()
    )
)
