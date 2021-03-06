import java.util.Observable;
import java.util.Observer;

/**
 * <p>
 * 观察者类
 * </p>
 *
 * @author wenjun
 * @since 2022-06-28
 */
public class ReaderObserver implements Observer {

    private String name;

    private String article;

    public ReaderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 更新文章
        updateArticle(o);
    }

    private void updateArticle(Observable o) {
        JavaStackObservable javaStackObservable = (JavaStackObservable) o;
        this.article = javaStackObservable.getArticle();
        System.out.printf("我是读者：%s，文章已更新为：%s\n", this.name, this.article);
    }

}
