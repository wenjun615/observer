import java.util.Observable;

/**
 * <p>
 * 观察者目标类
 * </p>
 *
 * @author wenjun
 * @since 2022-06-28
 */
public class JavaStackObservable extends Observable {

    private String article;

    /**
     * 发表文章
     *
     * @param article 文章
     */
    public void publish(String article) {
        // 发表文章
        this.article = article;
        // 改变状态
        this.setChanged();
        // 通知所有观察者
        this.notifyObservers();
    }

    public String getArticle() {
        return article;
    }
}
