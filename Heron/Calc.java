public class Calc {
    static  Double calcP(Double a, Double b, Double c) {
        return (a + b + c) / 2.0;
    }
    static  Double calcA(Double p, Double a, Double b, Double c) {
        return Math.sqrt(p * (p - a) * (p -b) * (p - c));
    }
}
