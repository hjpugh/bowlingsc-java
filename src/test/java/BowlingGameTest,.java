import main.java.BowlingGmae;

import org.junit.Before;
import org.junit.Test;
import com.sun.source.tree.AssertTree;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
  private BowlingGame bowlingGame;

  @Before
  public void setup() {
    bowlingGame = new BowlingGame();
  }

  @Test
  public void gutterGameThrowsException() {
    for (int i = 0; i <= 20; i++) {
      bowlingGame.roll(0);
    }
  }
}