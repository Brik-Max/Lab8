package code.generators;

public class ZeroGen implements IGenerator {
    @Override
    public String getName() {
        return "�������";
    }


    @Override
    public long getElement(int i, int j)
    {
        return 0;
    }
}
