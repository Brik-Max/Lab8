package code;

import code.generators.IGenerator;

public class RandomGen implements IGenerator {

    @Override
    public String getName() {
        return "��������";
    }


    @Override
    public long getElement(int i, int j)
    {
        return (long) Math.floor(Math.random()*100);
    }

}
