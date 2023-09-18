package com.ttk.interpreter;

/**
 * @Author TTK
 * @Description 测试解释器模式
 *      1）定义：
 *          - 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 *      2）解释器模式包含以下主要角色。
 *          - 抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主
 *            要包含解释方法 interpret()。
 *          - 终结符表达式（Terminal Expression）角色：是抽象表达式的子类，用来实现文法中与终结
 *            符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 *          - 非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法
 *            中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 *          - 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有
 *            解释器共享的数据，后面的解释器可以从这里获取这些值。
 *          - 客户端（Client）：主要任务是将需要分析的句子或表达式转换成使用解释器对象描述的抽象语
 *            法树，然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法。
 *      3）优点：
 *          - 易于改变和扩展文法。
 *              由于在解释器模式中使用类来表示语言的文法规则，因此可以通过继承等机制来改变或扩展文法。
 *              每一条文法规则都可以表示为一个类，因此可以方便地实现一个简单的语言。
 *          - 实现文法较为容易。
 *              在抽象语法树中每一个表达式节点类的实现方式都是相似的，这些类的代码编写都不会特别复杂。
 *          - 增加新的解释表达式较为方便。
 *              如果用户需要增加新的解释表达式只需要对应增加一个新的终结符表达式或非终结符表达式类，原
 *              有表达式类代码无须修改，符合 "开闭原则"。
 *      4）缺点：
 *          - 对于复杂文法难以维护。
 *              在解释器模式中，每一条规则至少需要定义一个类，因此如果一个语言包含太多文法规则，类的个
 *              数将会急剧增加，导致系统难以管理和维护。
 *          - 执行效率较低。
 *              由于在解释器模式中使用了大量的循环和递归调用，因此在解释较为复杂的句子时其速度很慢，而
 *              且代码的调试过程也比较麻烦。
 *      5）适用场景：
 *          - 当语言的文法较为简单，且执行效率不是关键问题时。
 *          - 当问题重复出现，且可以用一种简单的语言来进行表达时。
 *          - 当一个语言需要解释执行，并且语言中的句子可以表示为一个抽象语法树的时候。
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建环境对象
        Context context = new Context();

        //创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        //将变量存储到环境对象中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //获取抽象语法树
        AbstractExpression expression = new Minus(a,new Minus(new Plus(b,c),d));

        //解释（计算）
        int result = expression.interpret(context);

        System.out.println(expression + " = " + result);
    }
}
