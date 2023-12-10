package code;

import code.generators.*;
import code.listeners.*;

public class MatrixData {

    public static IGenerator[] generators = {
            new ZeroGen(),
            new IdentityGen(),
            new DiagonalGen(),
            new RandomGen(),
            new TriangleGen()

    };
    public static IMatrixListener[] listeners = {
            new CalculateMaxListener(),
            new CalculateSumListener(),
            new CalculateTraceListener(),
            new CalculateMinListener()
    };

}
