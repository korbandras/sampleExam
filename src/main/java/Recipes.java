import java.util.ArrayList;

public class Recipes {
    protected ArrayList<String[]> recipes = new ArrayList<>();
    public void add(String name, String description)
    {
        String[] recept = new String[2];
        recept[0] = name;
        recept[1] = description;
        recipes.add(recept);
    }
    public void delete(String name)
    {
        for(int i = 0; i < recipes.size(); i++)
        {
            if(recipes.get(i)[0] == name)
            {
                recipes.remove(i);
            }
        }
    }
    public ArrayList<String[]> getItems()
    {
        return recipes;
    }
}
