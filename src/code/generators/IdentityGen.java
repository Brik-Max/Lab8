package code.generators;

public class IdentityGen  implements IGenerator {
    @Override
    public String getName() {
        return "���������";
    }

    @Override
    public long getElement(int i, int j) {
        return i==j? 1:0;
    }
}
