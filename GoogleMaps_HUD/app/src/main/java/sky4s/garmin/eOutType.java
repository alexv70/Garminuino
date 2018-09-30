package sky4s.garmin;

/**
 * Created by skyforce on 2018/8/13.
 */

public enum eOutType {
    Off(0x00),
    Lane(0x01),
    LongerLane(0x02),
    LeftRoundabout(0x04),
    RightRoundabout(0x08),


    RightFlag(0x40), //要搭配Straight,Right,Left
    ArrowOnly(0x80);

    final public int value;

    eOutType(int value) {
        this.value = value;
    }
}
