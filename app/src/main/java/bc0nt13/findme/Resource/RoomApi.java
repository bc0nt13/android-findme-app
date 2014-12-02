package bc0nt13.findme.Resource;

import java.util.List;

import retrofit.Callback;

import bc0nt13.findme.Room;
import retrofit.http.*;

public interface RoomApi {
    @GET("/rooms")
    void list(Callback<List<Room>> callback);
}
