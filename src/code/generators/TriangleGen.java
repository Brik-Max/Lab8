package code.generators;

public class TriangleGen implements IGenerator {
    @Override
    public String getName() {
        return "�����������";
    }


    @Override
    public long getElement(int i, int j)
    {
        return (long) (j<i? 0:Math.floor(Math.random()*100));
    }
}
