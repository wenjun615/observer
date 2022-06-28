/**
 * <p>
 * 测试
 * </p>
 *
 * @author wenjun
 * @since 2022-06-28
 */
public class ObserverTest {

    public static void main(String[] args) {
        // 创建一个观察目标
        JavaStackObservable javaStackObservable = new JavaStackObservable();
        // 添加观察者
        javaStackObservable.addObserver(new ReaderObserver("张三"));
        javaStackObservable.addObserver(new ReaderObserver("李四"));
        javaStackObservable.addObserver(new ReaderObserver("王五"));
        // 发表文章
        javaStackObservable.publish("什么是观察者模式？");
    }
}
