package code.listeners;

import code.model.Matrix;

public class CalculateSumListener extends AbstractTextMatrixListener{

    long sum;

    @Override
    protected void initialization(Matrix matrix) {
        sum=0;
    }
    @Override
    protected void nextStep(Matrix matrix, int i, int j) {
        sum+=matrix.getValue(i, j);
    }
    @Override
    protected void finalization(Matrix matrix) {
        setText("Sum="+String.valueOf(sum));
    }


}
