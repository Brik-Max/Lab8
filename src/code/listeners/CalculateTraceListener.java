package code;

import code.model.Matrix;

public class CalculateTraceListener extends AbstractTextMatrixListener{
    long trace;
    @Override
    protected void initialization(Matrix matrix) {
        trace=0;
    }
    @Override
    protected void nextStep(Matrix matrix, int i, int j)
    {	if(i==j) {
        trace+=matrix.getValue(i, j);
    }
    }

    @Override
    protected void finalization(Matrix matrix) {
        setText("Trace="+String.valueOf(trace));
    }


}
