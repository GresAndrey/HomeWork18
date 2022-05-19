package learn.up;

public class Calculator {

    private DivideProcessor divideProcessor;
    private MultiplyProcessor multiplyProcessor;
    private SumProcessor sumProcessor;
    private SubtractProcessor subtractProcessor;

    public Calculator(DivideProcessor divideProcessor, MultiplyProcessor multiplyProcessor, SumProcessor sumProcessor, SubtractProcessor subtractProcessor) {
        this.divideProcessor = divideProcessor;
        this.multiplyProcessor = multiplyProcessor;
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
    }

    public int sum(int arg1, int arg2) {
        System.out.println(arg1 + " + " + arg2 + " = " + sumProcessor.process(arg1,arg2));
        return sumProcessor.process(arg1,arg2);
    }

    public int subtract(int arg1, int arg2) {
        System.out.println(arg1 + " - " + arg2 + " = " + subtractProcessor.process(arg1,arg2));
        return subtractProcessor.process(arg1,arg2);
    }

    public int multiply(int arg1, int arg2) {
        System.out.println(arg1 + " * " + arg2 + " = " + multiplyProcessor.process(arg1, arg2));
        return multiplyProcessor.process(arg1,arg2);
    }

    public int divide(int arg1, int arg2) {
        System.out.println(arg1 + " : " + arg2 + " = " + divideProcessor.process(arg1,arg2));
        return divideProcessor.process(arg1,arg2);
    }
}
