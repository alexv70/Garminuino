package sky4s.garmin;

/**
 * Created by skyforce on 2018/8/13.
 */

public enum eOutAngle {
    SharpRight(0x02),
    Right(0x04),
    EasyRight(0x08),
    Straight(0x10),
    EasyLeft(0x20),
    Left(0x40),
    SharpLeft(0x80),
    LeftDown(0x81),
    RightDown(0x82),
    AsDirection(0x00);

    final public int value;

    eOutAngle(int value) {
        this.value = value;
    }
}