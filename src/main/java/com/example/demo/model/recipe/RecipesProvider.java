package com.example.demo.model.recipe;

import java.util.ArrayList;

public class RecipesProvider {

    private static ArrayList<Recipe> recipes;

    static {
        recipes = new ArrayList<>();
        recipes.add(new Recipe(1,"Fried chicken", 30, "chicken","salt, olive oil", "Put bit of oil to pan and let it heat for two minutes. By that time put little salt to chicken breasts. After the oil is heated, put chicken breasts into pan and let it fry for 5 minutes."));
        recipes.add(new Recipe(1,"Chicken with tomatoes", 30, "chicken", "olive oil, tomatoes, garlic, oregano or other suitable herbs", "Put bit of olive oil into pan and let it heat for two minutes. Then put sliced garlic into the pan and let it fry for a while. After garlic is fried put chicken breasts together with sliced tomatoes into the pan, put cover on the top of the pan and let the chicken boil for 20 minutes. After chicken is ready, turn the heat off."));
        recipes.add(new Recipe(1,"Duck style chicken", 45, "chicken","sour cabbage, olive oil", "Put little bit of olive oil into the pan. Put sour cabbage into the pan so that cabbage covers all the surface of the pan. Put pieces of chicken on the cabbage. Cover the pan with cover and let it boil for 45 minutes."));
        recipes.add(new Recipe(2,"Pasta with tuna fish and olives", 30, "pasta","tuna fish chunks, olives, tomato puree, white yogurt, olive oil, garlic, oregano, basil or other suitable herbs", "Put olive oil into the pan and let it heat. When heated, put sliced garlic into the pan and let it fry. When garlic is fried, put tuna chunks into the pan and boil it for few minutes. Put sliced olives into the pan and boil for another few minutes. Pour tomato puree into the pan and boil for few minutes. Add white yogurt and boil until sauce is thick enough. By the time sauce is boiling, put water into another pan and let it boil. When water is boiling, add pasta into the water and let it boil until pasta is ready to eat. Can be served with grated cheese."));
        recipes.add(new Recipe(2,"One pot pasta", 30, "pasta", "cherry tomatoes, garlic, onion, fresh basil, olive oil, water, cheese", "Place pasta into the pan. Put sliced tomatoes, garlic and onion on the sides of pasta, put basil on the top, and pour olive oil on the top. Add salt and pour hot water into the pan. Boil all together for 10 minutes and mix everything together. Can be served with grated cheese."));
        recipes.add(new Recipe(3,"Mozzarella salad", 15,"mozzarella","tomatoes, oregano, garlic, olive oil, lemon squash", "Cut mozzarella into cubes, so do tomatoes. Add few drops of olive oil, few drops of lemon squash, mashed garlic and oregano. Mix well."));
        recipes.add(new Recipe(3,"Mozzarella toast", 20,"mozzarella","bread, tomatoes, oregano, garlic, olive oil", "Put few drops of olive oil to slice of bread. Put mozzarella slices to top of the bread slice, put tomatoes slices on the top of the mozzarella slices. Put meshed garlic and oregano at the top of the tomatoes and put second slice of bread on the top. Bake bread in grill or in oven."));
        recipes.add(new Recipe(4,"Risotto with mushrooms", 45,"rice","mushrooms, tomatoes, olive oil, oregano", "Clean rice in water. Put little bit of olive oil into the pan and let it heat. Put sliced mushrooms into the pan and fry it. Once mushrooms are fried, put rice into the pan and boil it while mixing it. When rice starts to stick to the pan, add water. Amount of water is doubled amount of rice. Add oregano. Cover pan and let the rice boil."));
        recipes.add(new Recipe(4, "Rice salad", 30,"rice","tomatoes, cucumber, tuna fish chunks, olive oil, salt, oregano or other suitable herbs, white yogurt", "Clean rice in water. Put little bit of olive oil into the pan and let it heat. Put rice into the pan and boil it while mixing it. When rice starts to stick to the pan, add water. Amount of water is doubled amount of rice. Cover the pan and let the rice boil. By the time rice is boiling, cut tomatoes and cucumber to pieces, mix it together with tuna fish chunks. Once rice is boiled, let it cool down and mix it with vegetables and tuna fish and add little bit of salt and herbs. Add yogurt. Mix well."));
        recipes.add(new Recipe(5,"American style potatoes", 20,"potatoes","olive oil, mix of herbs for potato", "Cut potatoes into pieces and put it into the pan. Mix olive oil with herbs and pour this mix on the potato pieces. Put pan to the oven and bake for 20 minutes. This potatoes can be served with meat or fish."));
        recipes.add(new Recipe(5,"Baked potatoes with mushrooms", 20,"potatoes","mushrooms, olive oil, onion, salt, pepper, parsley", "Boil potatoes, peel them and slice them. Slice mushrooms and fry them on olive oil. Add potatoes into the pan with mushrooms, add salt and pepper, and fry this mix. Serve topped with parsley."));
        recipes.add(new Recipe(6,"Salmon with fried potatoes", 45,"salomon","lemon, potatoes, cumin, olive oil", "Put little bit of olive oil into the pan. Put salmon fillets into the pan. Put lemon slices on the top of the fillets. Put potato pieces to the pan. Top fillets and potatoes with cumin and put pan into the oven. Bake for 45 minutes."));
        recipes.add(new Recipe(6,"Salmon with almonds", 45,"salomon","flour, lemon juice, salt, oregano, olive oil, sliced almonds", "Put piece of salt and lemon juice to fillets. Mix flour with oregano and put fillets into this mix. Fry fillets on olive oil. When fillets are ready, put the away from pan. Put almonds into the rest oil in pan and fry them. Mix little bit of lemon juice int the almond mix. Pour this mix on the fillets. Can be served with potatoes."));
        recipes.add(new Recipe(7,"Scrambled eggs with mushrooms", 10, "eggs","mushrooms, olive oil, salt, pepper", "Fry sliced mushrooms on olive oil. Mix eggs in bowl and add them to pan with mushrooms. Fry this mix for 5 minutes. Add bit of salt and bit of pepper."));
        recipes.add(new Recipe(7,"Peasant omelet", 10, "eggs","bacon, butter, salt and pepper, onion", "Fry sliced onion and sliced bacon on butter. Mix eggs with salt and pepper. Pour eggs to pan and fry. When omelet is fried, fill it with mix of bacon and onion. Can be served with bread and vegetables."));
    }

    public static ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public static Recipe findRecipeById(Integer id) {
        for (Recipe r: recipes) {
            if (r.getRecipeId() == id)
                return r;
        }
        return null;
    }

    public static Recipe findRecipeByIngredientId(Integer id) {
        for (Recipe r: recipes) {
            if (r.getMainIngredientId() == id) {
                return r;
            }
        }
        return null;
    }

    public static void addRecipe(Recipe r) {
        recipes.add(r);
    }

    public static void addRecipe(int mainIngredientId, String name, int cookingTime, String mainIngredient, String ingredients, String cookingProcedure) {
        recipes.add(new Recipe(mainIngredientId, name, cookingTime, mainIngredient, ingredients, cookingProcedure));
    }


}
