package ac.za.cput.conf.factory;


import ac.za.cput.domain.ScreeningRoom;

import java.util.Map;
/**
 * Created by User on 2015/05/01.
 */
public class ScreeningRoomFactory {

    public static ScreeningRoom createScreeningRoom(
            Map<String,String>values, int size,long id)
    {
        ScreeningRoom screeningRoom=new ScreeningRoom
                .Builder()
                .type(values.get("type"))
                .size(size)
                .numberID(Long.valueOf(id))
                .build();

        return screeningRoom;
    }
}
