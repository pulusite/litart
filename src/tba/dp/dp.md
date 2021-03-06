代理模式
装饰器模式
工厂模式
适配器模式
模板方法
迭代器模式
http://my.csdn.net/uploads/201205/28/1338213169_8415.jpg

六大原则：开闭，里氏替换，依赖倒置，接口隔离，迪米特法则（最少知道），合成复用
三类：创建型，结构型，行为型
创建型5种：工厂方法（类），抽象工厂，单例，建造者，原型
结构型7种：适配器（类），装饰器，代理，外观，桥接，组合，享元
行为型11种：策略，模板方法（类），观察者，迭代子模式，责任链，命令，备忘录，状态，访问者，中介者，解释器（类范围）

虚箭头线表示一个类实例化另一个类的对象，箭头指向被实例化的对象的类
竖线和三角表示子类关系
抽象类的类名以斜体表示，抽象操作也用斜体表示
普通的箭头表示相识，尾部带有星星的箭头线表示聚合

组合：对象组合是通过获得对其他对象的引用而在运行时刻动态定义的，
委托：委托是一种组合方法，使组合具有与继承同样的服用能力。在委托方式下，有两个对象参与处理一个请求，接受请求的对象将操作委托给它的代理者。委托是对象组合的特例
聚合：聚合意味着一个对象拥有另一个对象或对另一个对象负责。
相识：相识意味着一个对象仅仅知道另一个对象，比聚合要弱的关系

类图：https://design-patterns.readthedocs.io/zh_CN/latest/read_uml.html



面向对象设计的原则：针对接口编程，而不是针对实现编程
优先使用对象组合，而不是类继承

设计模式四个基本元素：1.名称2.问题3.解决方案4.效果

创建型模式
3.1 Abstract Factory 抽象工厂
提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类

3.2 Builder 生成器
将一个复杂对象的构建与他的表示分离，是的同样的构建过程可以创建不同的表示

3.3Factory Method工厂方法（类）
定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。

3.4 Prototype原型模式
用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

3.5 Singleton 单例
保证一个类仅有一个实例，并提供一个访问它的全局访问点

http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/
结构型模式
4.1 Adapter 适配器（类）
将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原来犹豫接口不兼容而不能在一起工作的那些类可以一起工作。

4.2 Bridge 桥接
将抽象部分与它的实现部分分离，使它们都可以独立地变化

4.3 Composite 组合
将对象组合树形以表示“部分-整体”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性。

4.4 Decorator 装饰
动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。

4.5 Facade 外观
为子系统的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

4.6 Flyweight 享元
运用共享技术有效地支持大量细粒度的对象


4.7 Proxy 代理
为其他对象提供一种代理以控制对这个对象的访问

行为模式

5.1 Chain of Responsibility 职责链
使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。


5.2 Command 命令
将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。

5.3 Interpreter 解释器（类）
给定一个语言，定义它的文法的一种标识，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

5.4 Iterator 迭代器
提供一种方法顺序访问一个聚合对象中的各个元素，而不需要暴露该对象的内部表示。


5.5 Mediator 中介者
用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。


5.6 Memento 备忘录
在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象回复到原先保存的状态。

5.7 Observer 观察者
定义对象间的一种一对多的依赖关系，当一个对象的状态发生变化是，所有依赖于它的对象都得到通知并被自动更新。

5.8 State 状态
允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。


5.9 Strategy 策略
定义一系列的算法，把它们一个个封装起来，并且使它们可相互更换。本模式使得算法可独立于使用它的客户而变化。


5.10 Template Method 模板方法（类）
定义一个操作中的算法的股价，而将一些步骤延迟到子类中。Template Method使得子类就可以不改变一个算法的结构即可重定义该算法的某些特定步骤。


5.11 Visitor 访问者
表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

