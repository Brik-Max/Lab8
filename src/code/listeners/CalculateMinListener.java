package code.listeners;

import code.model.Matrix;

public class CalculateMinListener extends AbstractTextMatrixListener{

    long min;
    @Override
    protected void initialization(Matrix matrix) {
        min=matrix.getValue(0, 0);
    }
    @Override
    protected void nextStep(Matrix matrix,int i,int j)
    {
        if(min>matrix.getValue(i,j)) {
            min=matrix.getValue(i,j);
        }
    }

    @Override
    protected void finalization(Matrix matrix) {
        setText("Min="+String.valueOf(min));
    }
}
