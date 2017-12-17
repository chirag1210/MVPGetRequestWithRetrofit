package example.com.mvpexample.main;

/**
 * Created by Chirag Chaudhari on 21,August,2017
 */
public class MainPresenterImpl implements MainPresenter {
    MainView mainView;

   public MainPresenterImpl(MainView mainView){
       this.mainView=mainView;
    }

    @Override
    public void processText() {
        mainView.showText("Chirag");
    }
}
