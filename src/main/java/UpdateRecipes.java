public class UpdateRecipes extends Recipes{
    public void update(String name, String description)
    {
        for(int i = 0; i < recipes.size(); i++)
        {
            if(recipes.get(i)[0] == name)
            {
                recipes.get(i)[1] = description;
            }
        }
    }
}
