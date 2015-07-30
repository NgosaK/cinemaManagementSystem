package ac.za.cput.services.impl;

import ac.za.cput.domain.ScreeningRoom;
import ac.za.cput.repository.ScreeningRoomRepository;
import ac.za.cput.services.ScreeningRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
@Service
public class ScreeningRoomServiceImpl implements ScreeningRoomService {


    @Autowired
    ScreeningRoomRepository repository;
    public List<ScreeningRoom> getScreeningRooms() {
        List<ScreeningRoom> allScreeningRooms= new ArrayList<ScreeningRoom>();
        Iterable<ScreeningRoom> screeningRooms= repository.findAll();

        for(ScreeningRoom screeningRoom: screeningRooms)
        {
            allScreeningRooms.add(screeningRoom);
        }


        return allScreeningRooms;
    }



}
