package Tests;

import Base.Base;
import Pages.PlayGround;
import org.testng.annotations.Test;

public class PlayGroundTest extends Base {


    @Test
    public void playgroundTensorflow() throws InterruptedException {

        homePage.printTestLoss();
        PlayGround playground = homePage.playGround();
        playground.ExclusiveOR();
        playground.SelectNoise();
        playground.FeatureSelect();
        playground.MinimizedNeurones();
        playground.selectLearningRate();
        playground.selectEpochValue();
    }
}
