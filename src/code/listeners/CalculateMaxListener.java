package code.listeners;

import code.model.Matrix;

public class CalculateMaxListener extends AbstractTextMatrixListener{

    long max;
    @Override
    protected void initialization(Matrix matrix) {
        max=matrix.getValue(0, 0);
    }
    @Override
    protected void nextStep(Matrix matrix,int i,int j)
    {
        if(max<matrix.getValue(i,j)) {
            max=matrix.getValue(i,j);
        }
    }

    @Override
    protected void finalization(Matrix matrix) {
        setText("Max="+String.valueOf(max));
    }
}
